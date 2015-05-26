package Presentacion;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class ptnFichaClinica extends JTabbedPane
{
	private JPanel pnlHerramientas;
	private JButton btnAgregar,btnEliminar,btnActualizar;
	private JPanel pnlAntPatologico,pnlAntNoPatologico,pnlAntHeredofamili,pnlAntTrauma,pnlEsqInmuno,pnlTipoSangre,pnlIntervenciones,pnlIMC,pnlGineco;
	private JPanel pnlGridAntPato,pnlGridAntNoPato,pnlGridAntHereFami,pnlGridTrauma;
	private JCheckBox chckbxFuma;
	private JCheckBox chckbxToma;
	private JCheckBox chckbxConsumeDrogas;
	private JLabel lblActiviDepor;
	private JLabel lblHobbies;
	
	public ptnFichaClinica() 
	{
		//Panel de herramientas 
		pnlHerramientas=new JPanel();
		
		pnlHerramientas.setLayout(new GridBagLayout());
		btnAgregar=new JButton();//Boton agregar
		btnAgregar.setText("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(20, 5, 5, 5);
		gbc_btnAgregar.gridx = 0;
		gbc_btnAgregar.gridy = 0;
		pnlHerramientas.add(btnAgregar, gbc_btnAgregar);
		btnEliminar=new JButton();//Boton eliminar
		btnEliminar.setText("Eliminar");
	    GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
	    gbc_btnEliminar.insets = new Insets(5, 5, 5, 5);
	    gbc_btnEliminar.gridx = 0;
	    gbc_btnEliminar.gridy = 1;
	    pnlHerramientas.add(btnEliminar, gbc_btnEliminar);
	    btnActualizar=new JButton();//Boton actualizar
	    btnActualizar.setText("Actualizar");
	    GridBagConstraints gbc_btnActualizar = new GridBagConstraints();
	    gbc_btnActualizar.insets = new Insets(5, 5, 20, 5);
	    gbc_btnActualizar.gridx = 0;
	    gbc_btnActualizar.gridy = 2;
	    pnlHerramientas.add(btnActualizar, gbc_btnActualizar);
	 
		//Paneles BorderLayout
		pnlAntPatologico=new JPanel();
		pnlAntNoPatologico=new JPanel();
		pnlAntHeredofamili=new JPanel();
		pnlAntTrauma=new JPanel();
		pnlEsqInmuno=new JPanel();
		pnlTipoSangre=new JPanel();
		pnlIntervenciones=new JPanel();
		pnlIMC=new JPanel();
		pnlGineco=new JPanel();
		
		//Paneles GridBagLayout
		pnlGridAntNoPato=new JPanel();
		pnlGridAntHereFami=new JPanel();
		pnlGridTrauma=new JPanel();
		
		//Agregar Paneles al panel Tabbed
	    this.add(pnlAntPatologico,"Ant. patologicos");
	    this.add(pnlAntNoPatologico,"Ant. no patologicos");
	    this.add(pnlAntHeredofamili,"Ant. heredofamiliares");
	    this.add(pnlAntTrauma,"Ant. traumaticos");
	    this.add(pnlEsqInmuno,"Esquema inmunologico");
	    this.add(pnlTipoSangre,"Tipo de sangre/Alergias");
	    this.add(pnlIntervenciones,"Intervenciones");
	    
	    
	    /********/
	    //PESTAÑA 1-ANTECEDENTES PATOLOGICOS 
	    pnlAntPatologico.setLayout(new BorderLayout());
	    pnlAntPatologico.add(pnlHerramientas,BorderLayout.WEST);
	    
	    JTable tableAntPato = new JTable();
	    tableAntPato.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Enfermedad", "Fecha"
	    	}
	    ) {
	    	/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
	    		String.class, Object.class
	    	};
	    	public Class getColumnClass(int columnIndex) {
	    		return columnTypes[columnIndex];
	    	}
	    	boolean[] columnEditables = new boolean[] {
	    		false, true
	    	};
	    	public boolean isCellEditable(int row, int column) {
	    		return columnEditables[column];
	    	}
	    });
	    JScrollPane scrollTableAntPato=new JScrollPane(tableAntPato);
	    pnlAntPatologico.add(scrollTableAntPato, BorderLayout.CENTER);
	    
	    
	    /********/
	    //PESTAÑA 2-ANTECEDENTES NO PATOLOGICOS
        GridBagLayout gbl_pnlGridAntNoPato = new GridBagLayout();
        gbl_pnlGridAntNoPato.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        gbl_pnlGridAntNoPato.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0};
        gbl_pnlGridAntNoPato.columnWidths = new int[]{0, 0, 0, 0, 85, 38};
        gbl_pnlGridAntNoPato.rowHeights = new int[]{45, 22, 41, 0, 42, 0};
        pnlGridAntNoPato.setLayout(gbl_pnlGridAntNoPato);
	    pnlAntNoPatologico.setLayout(new BorderLayout());
	    pnlAntNoPatologico.add(pnlGridAntNoPato,BorderLayout.CENTER);
	      
	      chckbxFuma = new JCheckBox("Fuma");
	      GridBagConstraints gbc_chckbxFuma = new GridBagConstraints();
	      gbc_chckbxFuma.fill = GridBagConstraints.BOTH;
	      gbc_chckbxFuma.insets = new Insets(0, 0, 5, 5);
	      gbc_chckbxFuma.gridx = 1;
	      gbc_chckbxFuma.gridy = 0;
	      pnlGridAntNoPato.add(chckbxFuma, gbc_chckbxFuma);
	      
	      chckbxToma = new JCheckBox("Toma");
	      GridBagConstraints gbc_chckbxToma = new GridBagConstraints();
	      gbc_chckbxToma.fill = GridBagConstraints.BOTH;
	      gbc_chckbxToma.insets = new Insets(0, 0, 5, 5);
	      gbc_chckbxToma.gridx = 2;
	      gbc_chckbxToma.gridy = 0;
	      pnlGridAntNoPato.add(chckbxToma, gbc_chckbxToma);
	      
	      chckbxConsumeDrogas = new JCheckBox("Consume drogas");
	      GridBagConstraints gbc_chckbxConsumeDrogas = new GridBagConstraints();
	      gbc_chckbxConsumeDrogas.fill = GridBagConstraints.BOTH;
	      gbc_chckbxConsumeDrogas.insets = new Insets(0, 0, 5, 5);
	      gbc_chckbxConsumeDrogas.gridx = 3;
	      gbc_chckbxConsumeDrogas.gridy = 0;
	      pnlGridAntNoPato.add(chckbxConsumeDrogas, gbc_chckbxConsumeDrogas);
	    //TextArea drogas
	       JTextArea txtAreaDrogas=new JTextArea();
	      JScrollPane scrollDrogas=new JScrollPane(txtAreaDrogas);
	      GridBagConstraints gbc_scrollDrogas = new GridBagConstraints();
	      gbc_scrollDrogas.fill = GridBagConstraints.BOTH;
	      gbc_scrollDrogas.insets = new Insets(0, 0, 5, 5);
	      gbc_scrollDrogas.gridx = 4;
	      gbc_scrollDrogas.gridy = 0;
	      gbc_scrollDrogas.gridwidth=1;
	      gbc_scrollDrogas.gridheight=1;
	      pnlGridAntNoPato.add(scrollDrogas, gbc_scrollDrogas);
	    
	    //Label Actividades deportivas
	    lblActiviDepor = new JLabel("Actividades deportivas");
	    GridBagConstraints gbc_lblActiviDepor = new GridBagConstraints();
	    gbc_lblActiviDepor.insets = new Insets(0, 0, 5, 5);
	    gbc_lblActiviDepor.gridx = 2;
	    gbc_lblActiviDepor.gridy = 1;
	    pnlGridAntNoPato.add(lblActiviDepor, gbc_lblActiviDepor);
	    //TextField Actividades deportivas
	       JTextArea txtAreaActiviDepor=new JTextArea();
	       JScrollPane scrollActiviDepor=new JScrollPane(txtAreaActiviDepor);
	       GridBagConstraints gbc_scrolltActiviDepor = new GridBagConstraints();
	       gbc_scrolltActiviDepor.gridheight = 1;
	       gbc_scrolltActiviDepor.fill = GridBagConstraints.BOTH;
	       gbc_scrolltActiviDepor.insets = new Insets(0, 0, 5, 5);
	       gbc_scrolltActiviDepor.gridx = 2;
	       gbc_scrolltActiviDepor.gridy = 2;
	       gbc_scrolltActiviDepor.gridwidth=1;
	       pnlGridAntNoPato.add(scrollActiviDepor, gbc_scrolltActiviDepor);
	       
	       
	       
	       //Label Hobbies
	       lblHobbies = new JLabel("Hobbies u otras actividades");
	       GridBagConstraints gbc_lblHobbies = new GridBagConstraints();
	       gbc_lblHobbies.insets = new Insets(0, 0, 5, 5);
	       gbc_lblHobbies.gridx = 2;
	       gbc_lblHobbies.gridy = 3;
	       pnlGridAntNoPato.add(lblHobbies, gbc_lblHobbies);
	     //TextField Hobbies y otras actividades
	                JTextArea txtAreaHobbies=new JTextArea();
	                JScrollPane scrollHobbies=new JScrollPane(txtAreaHobbies);
	                GridBagConstraints gbc_scrollHobbies = new GridBagConstraints();
	                gbc_scrollHobbies.fill = GridBagConstraints.BOTH;
	                gbc_scrollHobbies.insets = new Insets(0, 5, 5, 5);
	                gbc_scrollHobbies.gridx = 2;
	                gbc_scrollHobbies.gridy = 4;
	                gbc_scrollHobbies.gridwidth=1;
	                gbc_scrollHobbies.gridheight=1;
	                pnlGridAntNoPato.add(scrollHobbies,gbc_scrollHobbies);
	                
	   
	   
	    
	    /********/
	    //PESTAÑA 3-ANTECEDENTES HEREDOFAMILIARES
	    
	    
	}
	
	
}
