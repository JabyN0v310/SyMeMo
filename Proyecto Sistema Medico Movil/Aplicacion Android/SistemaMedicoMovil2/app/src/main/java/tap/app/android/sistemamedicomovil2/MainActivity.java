package tap.app.android.sistemamedicomovil2;

import android.content.res.Configuration;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private String[] opciones;
    private DrawerLayout drawerlayout;
    private ListView listview;

    private CharSequence titulosec;
    private CharSequence tituloapp;
    private ActionBarDrawerToggle drawertoggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    opciones=new String[]{"Pacientes","Agenda","Medicina","Registrar Paciente","Perfil"};
    drawerlayout=(DrawerLayout)findViewById(R.id.contenedorPrincipal);
    listview=(ListView)findViewById(R.id.menuIzq);

        listview.setAdapter(new ArrayAdapter<String>(getSupportActionBar().getThemedContext(), android.R.layout.simple_list_item_1,opciones));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        fragment = new Pacientes();
                        break;
                    case 1:
                        fragment = new Agenda();
                        break;
                    case 2:
                        fragment = new Medicina();
                        break;
                    case 3:
                        fragment = new RegistrarPaciente();
                        break;
                    case 4:
                        fragment = new Perfil();
                        break;
                }

                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.contenedorFrame, fragment)
                        .commit();
                listview.setItemChecked(position, true);
                titulosec = opciones[position];
                getSupportActionBar().setTitle(titulosec);
                drawerlayout.closeDrawer(listview);

            }
        });
        titulosec= getTitle();
        tituloapp= getTitle();
        drawertoggle=new ActionBarDrawerToggle(this,drawerlayout,R.drawable.ic_action_action_reorder,
                R.string.abierto,
                R.string.cerrado)
        {
            @Override
            public void onDrawerOpened(View drawerView)
            {
                super.onDrawerOpened(drawerView);
                ActivityCompat.invalidateOptionsMenu(MainActivity.this);
            }

            @Override
            public void onDrawerClosed(View drawerView)
            {
                super.onDrawerClosed(drawerView);
                ActivityCompat.invalidateOptionsMenu(MainActivity.this);
            }
        };
        drawerlayout.setDrawerListener(drawertoggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setHomeButtonEnabled(true);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(drawertoggle.onOptionsItemSelected(item))
        {
            return true;
        }
        int id = item.getItemId();


        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    protected void onPostCreate(Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        drawertoggle.syncState();
    }

    public void onConfigurationChanged(Configuration newConfig)
    {
      super.onConfigurationChanged(newConfig);
        drawertoggle.onConfigurationChanged(newConfig);
    }
}
