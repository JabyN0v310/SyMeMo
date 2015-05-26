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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class ptnConsulta extends JPanel 
{

	private JPanel pnlHerramientas,pnlSuperior,pnlCentralDiagno,pnlCentralTrata,pnlCentralQuirur,pnlCentralAnali,pnlCentralEvol,pnlCentralExplo;
	private JTabbedPane pnlTabbed;
	private JButton btnGuardar,btnEditar,btnActualizar;
	private JPanel pnlDiagnostico,pnlTratamiento,pnlQuirurgico,pnlAnalisis,pnlEvolucion,pnlExploracion;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	private JButton btnNegrita1;
	private JButton btnSubrayado1;
	private JComboBox comboBoxEstilo1;
	private JButton btnImprimirDiagnostico,btnImprimirTratamiento,btnImprimirQuirurgico,btnImprimirAnalisis,btnImprimirEvolucion,btnImprimirExploracion;
	private JPanel pnlTablaConsulta;
	private JScrollPane scrollPane;
	private JTable table;
	
	
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
	    
	    //Agregar el BridBag al pnlSuperior
	    pnlSuperior.setLayout(new BorderLayout());
	    pnlSuperior.add(pnlHerramientas,BorderLayout.WEST);
	  
	    //Creamos tabla que va en el pnlTablaConsulta
	    table = new JTable();
	    table.setModel(new DefaultTableModel(
	    	new Object[][] {
	    		},
	    	new String[] {
	    		"Razon", "Fecha"
	    	}
	    ) {
	    	/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
	    		String.class, String.class
	    	};
	    	public Class getColumnClass(int columnIndex) {
	    		return columnTypes[columnIndex];
	    	}
	    });
	    table.getColumnModel().getColumn(0).setPreferredWidth(140);
	    table.getColumnModel().getColumn(0).setMaxWidth(214748364);
	    table.getColumnModel().getColumn(1).setPreferredWidth(15);
	    table.getColumnModel().getColumn(1).setMinWidth(5);
	    table.getColumnModel().getColumn(1).setMaxWidth(100000000);
	    scrollPane = new JScrollPane();
	    scrollPane.setEnabled(false);
	    scrollPane.setBounds(132, 155, 502, 311);
	    scrollPane.setViewportView(table);
	  
	    
	    //Creamos nuevo panel (que tiene grouplayout) que va en el centro del pnlSuperior ya que tiene un borderlayout
	    pnlTablaConsulta = new JPanel();
	    pnlSuperior.add(pnlTablaConsulta, BorderLayout.CENTER);
	    
	    GroupLayout glpnlTablaConsulta = new GroupLayout(pnlTablaConsulta);
	    glpnlTablaConsulta.setHorizontalGroup(
	    	glpnlTablaConsulta.createParallelGroup(Alignment.LEADING)
	    		.addGroup(glpnlTablaConsulta.createSequentialGroup()
	    			.addGap(34)
	    			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
	    			.addGap(152))
	    );
	    glpnlTablaConsulta.setVerticalGroup(
	    	glpnlTablaConsulta.createParallelGroup(Alignment.LEADING)
	    		.addGroup(glpnlTablaConsulta.createSequentialGroup()
	    			.addContainerGap()
	    			.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
	    			.addContainerGap())
	    );
	    pnlTablaConsulta.setLayout(glpnlTablaConsulta);
	    
	    
	    //Agregar al panel principal
	    this.setLayout(new BorderLayout());
	    this.add(pnlSuperior,BorderLayout.NORTH);
	    this.add(pnlTabbed,BorderLayout.CENTER);
	    
	    
	    
	    
	    /******/
	  //Panel Tabbed pnlDiagnostico
	    pnlCentralDiagno=new JPanel();
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
	    
	    /******/
	    //Panel Tabbed pnlTratamiento
	    pnlCentralTrata=new JPanel();
	    pnlTratamiento.setLayout(new BorderLayout(0, 0));
	    pnlTratamiento.add(pnlCentralTrata, BorderLayout.NORTH);
	    btnImprimirTratamiento = new JButton("Imprimir Tratamiento");
	    pnlCentralTrata.add(btnImprimirTratamiento);
	    btnNegrita1 = new JButton("Negrita");
	    pnlCentralTrata.add(btnNegrita1);
	    btnSubrayado1 = new JButton("Subrayado");
	    pnlCentralTrata.add(btnSubrayado1);
	    comboBoxEstilo1 = new JComboBox();
	    comboBoxEstilo1.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Travel", "Metal"}));
	    pnlCentralTrata.add(comboBoxEstilo1);
	    scrollPane1= new JScrollPane();
	    pnlTratamiento.add(scrollPane1, BorderLayout.CENTER);
	    textArea1 = new JTextArea();
	    scrollPane1.setViewportView(textArea1);
	    
	    /******/
	    //Panel Tabbed pnlQuirurgico
	    pnlCentralQuirur=new JPanel();
	    pnlQuirurgico.setLayout(new BorderLayout(0, 0));
	    pnlQuirurgico.add(pnlCentralQuirur, BorderLayout.NORTH);
	    btnImprimirQuirurgico = new JButton("Imprimir Plan Quirurgico");
	    pnlCentralQuirur.add(btnImprimirQuirurgico);
	    btnNegrita1 = new JButton("Negrita");
	    pnlCentralQuirur.add(btnNegrita1);
	    btnSubrayado1 = new JButton("Subrayado");
	    pnlCentralQuirur.add(btnSubrayado1);
	    comboBoxEstilo1 = new JComboBox();
	    comboBoxEstilo1.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Travel", "Metal"}));
	    pnlCentralQuirur.add(comboBoxEstilo1);
	    scrollPane1= new JScrollPane();
	    pnlQuirurgico.add(scrollPane1, BorderLayout.CENTER);
	    textArea1 = new JTextArea();
	    scrollPane1.setViewportView(textArea1);
	    
	    /******/
	    //Panel Tabbed pnlAnalisis
	    pnlCentralAnali=new JPanel();
	    pnlAnalisis.setLayout(new BorderLayout(0, 0));
	    pnlAnalisis.add(pnlCentralAnali, BorderLayout.NORTH);
	    btnImprimirAnalisis = new JButton("Imprimir Analisis");
	    pnlCentralAnali.add(btnImprimirAnalisis);
	    btnNegrita1 = new JButton("Negrita");
	    pnlCentralAnali.add(btnNegrita1);
	    btnSubrayado1 = new JButton("Subrayado");
	    pnlCentralAnali.add(btnSubrayado1);
	    comboBoxEstilo1 = new JComboBox();
	    comboBoxEstilo1.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Travel", "Metal"}));
	    pnlCentralAnali.add(comboBoxEstilo1);
	    scrollPane1= new JScrollPane();
	    pnlAnalisis.add(scrollPane1, BorderLayout.CENTER);
	    textArea1 = new JTextArea();
	    scrollPane1.setViewportView(textArea1);
	    
	    /******/
	    //Panel Tabbed pnlEvolucion
	    pnlCentralEvol=new JPanel();
	    pnlEvolucion.setLayout(new BorderLayout(0, 0));
	    pnlEvolucion.add(pnlCentralEvol, BorderLayout.NORTH);
	    btnImprimirEvolucion = new JButton("Imprimir Evolucion");
	    pnlCentralEvol.add(btnImprimirEvolucion);
	    btnNegrita1 = new JButton("Negrita");
	    pnlCentralEvol.add(btnNegrita1);
	    btnSubrayado1 = new JButton("Subrayado");
	    pnlCentralEvol.add(btnSubrayado1);
	    comboBoxEstilo1 = new JComboBox();
	    comboBoxEstilo1.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Travel", "Metal"}));
	    pnlCentralEvol.add(comboBoxEstilo1);
	    scrollPane1= new JScrollPane();
	    pnlEvolucion.add(scrollPane1, BorderLayout.CENTER);
	    textArea1 = new JTextArea();
	    scrollPane1.setViewportView(textArea1);
	    
	    /******/
	    
	    //Panel Tabbed pnlExploracion
	    pnlCentralExplo=new JPanel();
	    pnlExploracion.setLayout(new BorderLayout(0, 0));
	    pnlExploracion.add(pnlCentralExplo, BorderLayout.NORTH);
	    btnImprimirExploracion = new JButton("Imprimir Exploracion");
	    pnlCentralExplo.add(btnImprimirExploracion);
	    btnNegrita1 = new JButton("Negrita");
	    pnlCentralExplo.add(btnNegrita1);
	    btnSubrayado1 = new JButton("Subrayado");
	    pnlCentralExplo.add(btnSubrayado1);
	    comboBoxEstilo1 = new JComboBox();
	    comboBoxEstilo1.setModel(new DefaultComboBoxModel(new String[] {"Arial", "Travel", "Metal"}));
	    pnlCentralExplo.add(comboBoxEstilo1);
	    scrollPane1= new JScrollPane();
	    pnlExploracion.add(scrollPane1, BorderLayout.CENTER);
	    textArea1 = new JTextArea();
	    scrollPane1.setViewportView(textArea1);
    }
}
