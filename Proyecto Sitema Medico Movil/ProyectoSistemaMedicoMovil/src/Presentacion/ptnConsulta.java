package Presentacion;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ptnConsulta extends JPanel 
{

	private JPanel pnlHerramientas,pnlSuperior,pnlCentralDiagno;
	private JTabbedPane pnlTabbed;
	private JButton btnGuardar,btnEditar,btnActualizar;
	private JPanel pnlDiagnostico,pnlTratamiento,pnlQuirurgico,pnlAnalisis,pnlEvolucion,pnlExploracion;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	private JButton btnNegrita1;
	private JButton btnSubrayado1;
	private JComboBox comboBoxEstilo1;
	private JButton btnImprimirDiagnostico;
	
	
    public ptnConsulta()
    {
       pnlSuperior=new JPanel();
       pnlTabbed=new JTabbedPane();
	    //Paneles para la tabbed
	    pnlDiagnostico=new JPanel();
	    pnlTratamiento=new JPanel();
	    pnlQuirurgico=new JPanel();
	    pnlAnalisis=new JPanel();
	    pnlEvolucion=new JPanel();
	    pnlExploracion=new JPanel();
	    
	   
	    
	    
	    
	    //Agregar Paneles al panel Tabbed
	    pnlTabbed.add(pnlDiagnostico,"Diagnostico");
	    pnlTabbed.add(pnlTratamiento,"Tratamiento");
	    pnlTabbed.add(pnlQuirurgico,"Plan quirurgico");
	    pnlTabbed.add(pnlAnalisis,"Analisis");
	    pnlTabbed.add(pnlEvolucion,"Evolucion");
	    pnlTabbed.add(pnlExploracion,"Exploracion");
	    //Creacion de barra de herramientas laterales para la tabla
	    pnlHerramientas=new JPanel();
	    pnlHerramientas.setLayout(new GridBagLayout());
	    btnGuardar=new JButton();//Boton agregar
	    btnGuardar.setText("Guardar");
	    GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
	    gbc_btnGuardar.insets = new Insets(20, 5, 5, 5);
	    gbc_btnGuardar.gridx = 0;
	    gbc_btnGuardar.gridy = 0;
	    pnlHerramientas.add(btnGuardar, gbc_btnGuardar);
	    btnEditar=new JButton();//Boton eliminar
	    btnEditar.setText("Editar");
	    GridBagConstraints gbc_btnEditar = new GridBagConstraints();
	    gbc_btnEditar.insets = new Insets(5, 5, 5, 5);
	    gbc_btnEditar.gridx = 0;
	    gbc_btnEditar.gridy = 1;
	    pnlHerramientas.add(btnEditar, gbc_btnEditar);
	    btnActualizar=new JButton();//Boton actualizar
	    btnActualizar.setText("Actualizar");
	    GridBagConstraints gbc_btnActualizar = new GridBagConstraints();
	    gbc_btnActualizar.insets = new Insets(5, 5, 20, 5);
	    gbc_btnActualizar.gridx = 0;
	    gbc_btnActualizar.gridy = 2;
	    pnlHerramientas.add(btnActualizar, gbc_btnActualizar);
	    
	    //Crear Tabla de Consulta
	   
	    
	    
	    //Agregar el BridBag y Tabla al pnlSuperior
	    pnlSuperior.setLayout(new BorderLayout());
	    pnlSuperior.add(pnlHerramientas,BorderLayout.WEST);
	    //pnlSuperior.add(scrollConsulta,BorderLayout.CENTER);
	    //Agregar al panel principal
	    this.setLayout(new BorderLayout());
	    this.add(pnlSuperior,BorderLayout.NORTH);
	    this.add(pnlTabbed,BorderLayout.CENTER);
	    
	    
	    
	    
	    /******/
	  //Panel Tabbed pnlDiagnostico
	    pnlCentralDiagno=new JPanel();
	    pnlCentralDiagno = new JPanel();
	    pnlDiagnostico.setLayout(new BorderLayout(0, 0));
	    pnlDiagnostico.add(pnlCentralDiagno, BorderLayout.NORTH);
	    btnImprimirDiagnostico = new JButton("Imprimir Diagnostico");
	    pnlCentralDiagno.add(btnImprimirDiagnostico);
	    btnNegrita1 = new JButton("Negrita");
	    pnlCentralDiagno.add(btnNegrita1);
	    btnSubrayado1 = new JButton("Subrayado");
	    pnlCentralDiagno.add(btnSubrayado1);
	    comboBoxEstilo1 = new JComboBox();
	    comboBoxEstilo1.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Travel", "Metal"}));
	    pnlCentralDiagno.add(comboBoxEstilo1);
	    scrollPane1= new JScrollPane();
	    pnlDiagnostico.add(scrollPane1, BorderLayout.CENTER);
	    textArea1 = new JTextArea();
	    scrollPane1.setViewportView(textArea1);
	    
    }

}
