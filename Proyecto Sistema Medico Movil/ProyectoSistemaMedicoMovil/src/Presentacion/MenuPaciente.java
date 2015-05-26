package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

public class MenuPaciente extends JFrame
{
	/* 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane pnlTabbed;
	private JMenuItem cmdPrintExpediente, cmdExpediente;
	private JMenu mnuArchivo, mnuVer;
	private JMenuBar barMenu;
	private JPanel pnlPrincipal,pnlSuperior,pnlSuperiorNort;
	private ptnDatosPersonales pnlDatosPersonales=new ptnDatosPersonales();
	private ptnFichaClinica pnlFichaClinica=new ptnFichaClinica();
	private ptnConsulta pnlConsulta=new ptnConsulta();
	private JButton btnBuscar;
	private JTextField txtBuscar;
	private JComboBox cmoboxBusqueda;
  public MenuPaciente()
  {
	 super("Menú Paciente");
	 init();
  }
  
  public void init()
  {
	 //ubicacion/tamaño(x,y,ancho,alto)
	  //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	  //(x,y,ancho,alto)
	  this.setBounds(250,150,700,600);
	  //setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPaciente.class.getResource("/Imagenes/icono-gran.ico")));
	 // this.setSize(700,500);
	 // this.setLocationRelativeTo(null);
        
	    pnlTabbed = new JTabbedPane();
		pnlPrincipal=new JPanel();
		pnlSuperior=new JPanel();
		pnlSuperiorNort=new JPanel();
		//Crear los JMenuItems, JMenu y JMenuBar
	      cmdPrintExpediente=new JMenuItem("Imprimir expediente");
	      cmdExpediente=new JMenuItem("Expediente");
	      mnuArchivo =new JMenu("Archivo");
	      mnuVer =new JMenu("Ver");
	      barMenu =new JMenuBar();
	      //Agregar comandos,menus y barra a la ventana
	      mnuArchivo.add(cmdPrintExpediente);
	      mnuVer.add(cmdExpediente);
	      barMenu.add(mnuArchivo);
	      barMenu.add(mnuVer);
	      this.setJMenuBar(barMenu);
		
	      //Agregar paneles a las tablas de panel
	      pnlTabbed.add(pnlDatosPersonales,"Datos personales");
	      pnlTabbed.add(pnlFichaClinica,"Ficha clinica");
	      pnlTabbed.add(pnlConsulta,"Consultas");
	      
	      
	      //Creacion de tabla que va en el panel superior
	      JTable table = new JTable();
		    table.setModel(new DefaultTableModel(
		    	new Object[][] {
		    		{null, null, null},
		    	},
		    	new String[] {
		    		"Paciente", "Ciudad", "CURP"
		    	}
		    ));
		    table.getColumnModel().getColumn(0).setPreferredWidth(140);
		    table.getColumnModel().getColumn(0).setMaxWidth(214748364);
		    table.getColumnModel().getColumn(1).setPreferredWidth(104);
		    table.getColumnModel().getColumn(1).setMinWidth(5);
		    table.getColumnModel().getColumn(1).setMaxWidth(2147483640);
		    table.getColumnModel().getColumn(2).setMaxWidth(2147483600);
		    JScrollPane scrollPane = new JScrollPane();
		    scrollPane.setEnabled(false);
		    scrollPane.setBounds(132, 155, 502, 311);
		    scrollPane.setViewportView(table);
	    //Creamos nuevo panel (que tiene grouplayout) que va en el centro del pnlSuperior ya que tiene un borderlayout
		    JPanel pnlTablaConsulta = new JPanel();
		    GroupLayout glpnlTablaConsulta = new GroupLayout(pnlTablaConsulta);
		    glpnlTablaConsulta.setHorizontalGroup(
		    	glpnlTablaConsulta.createParallelGroup(Alignment.LEADING)
		    		.addGroup(glpnlTablaConsulta.createSequentialGroup()
		    			.addGap(104)
		    			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
		    			.addGap(82))
		    );
		    glpnlTablaConsulta.setVerticalGroup(
		    	glpnlTablaConsulta.createParallelGroup(Alignment.LEADING)
		    		.addGroup(glpnlTablaConsulta.createSequentialGroup()
		    			.addContainerGap()
		    			.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
		    			.addContainerGap(26, Short.MAX_VALUE))
		    );
		    pnlTablaConsulta.setLayout(glpnlTablaConsulta);
	      
		    
		  //Agregar a panel superior y superior norte
		      pnlSuperior.setLayout(new BorderLayout());
		      txtBuscar = new JTextField();
			  pnlSuperiorNort.add(txtBuscar);
			  txtBuscar.setColumns(20);
			  btnBuscar = new JButton("Buscar");
			  pnlSuperiorNort.add(btnBuscar);
			  cmoboxBusqueda = new JComboBox();
			  cmoboxBusqueda.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Apellido", "Ciudad", "CURP"}));
			  pnlSuperiorNort.add(cmoboxBusqueda);
		      pnlSuperior.add(pnlSuperiorNort,BorderLayout.NORTH);
		      pnlSuperior.add(pnlTablaConsulta, BorderLayout.CENTER);
	      
	      //Agregar paneles al panel principal
	  pnlPrincipal.setLayout(new BorderLayout());
	  pnlPrincipal.add(pnlTabbed,BorderLayout.CENTER);
	  pnlPrincipal.add(pnlSuperior,BorderLayout.NORTH);
	  
	  
	  this.setContentPane(pnlPrincipal);
		//Hacer a la ventana visible
	  this.setVisible(true);
  }
  
  public static void main(String[] args) 
  {
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					new MenuPaciente();
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
}
