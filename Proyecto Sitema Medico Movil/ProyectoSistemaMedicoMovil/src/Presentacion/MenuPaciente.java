package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class MenuPaciente extends JFrame
{
	/* 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane pnlTabbed;
	private JMenuItem cmdPrintExpediente, cmdExpediente;
	private JMenu mnuArchivo, mnuVer;
	private JMenuBar barMenu;
	private JPanel pnlPrincipal,pnlSuperior;
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
	  this.setBounds(250,150,700,500);
	  setIconImage(Toolkit.getDefaultToolkit().getImage(MenuPaciente.class.getResource("/img/icono.png")));
	  setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
	 // this.setSize(700,500);
	 // this.setLocationRelativeTo(null);
        
	    pnlTabbed = new JTabbedPane();
		pnlPrincipal=new JPanel();
		pnlSuperior=new JPanel();
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
	      
	      //Agregar a panel superior
	      
	  
	  pnlPrincipal.setLayout(new BorderLayout());
	  pnlPrincipal.add(pnlTabbed,BorderLayout.CENTER);
	  pnlPrincipal.add(pnlSuperior,BorderLayout.NORTH);
	  
	  txtBuscar = new JTextField();
	  pnlSuperior.add(txtBuscar);
	  txtBuscar.setColumns(10);
	  
	  btnBuscar = new JButton("Buscar");
	  pnlSuperior.add(btnBuscar);
	  
	  cmoboxBusqueda = new JComboBox();
	  cmoboxBusqueda.setModel(new DefaultComboBoxModel(new String[] {"Nombre", "Apellido", "Ciudad", "CURP"}));
	  pnlSuperior.add(cmoboxBusqueda);
	  this.setContentPane(pnlPrincipal);
		//Hacer a la ventana visible
	  this.setVisible(true);
  }
  
  /*public static void main(String[] args) 
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
	}*/
}
