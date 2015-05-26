package Presentaciones;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

public class ptnFichaClinica extends JTabbedPane
{
	private JPanel pnlHerramientas,pnlHerramientas2,pnlHerramientas3;
	private JButton btnAgregar,btnEliminar,btnActualizar;
	private JPanel pnlAntPatologico,pnlAntNoPatologico,pnlAntHeredoFamili,pnlAntTrauma,pnlEsqInmuno,pnlTipoSangre,pnlIntervenciones,pnlIMC,pnlGineco;
	private JPanel pnlGridAntPato,pnlGridAntNoPato,pnlGridAntHereFami,pnlGridTrauma;
	private JCheckBox chckbxFuma,chckbxToma,chckbxBCG,chckbxRotavirus,chckbxDobleViral,chckbxTripleViral,chckbxPentavalente,chckbxApliHIB,chckbxHepatitisA,chckbxHepatitisB,chckbxNeumo,chckbxInfluenza,chckbxDPT,chckbxVHP;
	private JCheckBox chckbxConsumeDrogas;
	private JLabel lblTipoSanguineo,lblActiviDepor,lblHobbies,lblEnferPadre,lblEnferMadre,lblEnferAbue,lblObserva;
	private JLabel lblAlergiasDetec,lblMedicamentos,lblAlimentos,lblMedioAmbiente,lblOtros;
	private JComboBox cmoTipoSanguinio;
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
	 
	  //Panel de herramientas 2
	  		pnlHerramientas2=new JPanel();
	  		
	  		pnlHerramientas2.setLayout(new GridBagLayout());
	  		btnAgregar=new JButton();//Boton agregar
	  		btnAgregar.setText("Agregar");
	  		GridBagConstraints gbc_btnAgregar1 = new GridBagConstraints();
	  		gbc_btnAgregar1.insets = new Insets(20, 5, 5, 5);
	  		gbc_btnAgregar1.gridx = 0;
	  		gbc_btnAgregar1.gridy = 0;
	  		pnlHerramientas2.add(btnAgregar, gbc_btnAgregar1);
	  		btnEliminar=new JButton();//Boton eliminar
	  		btnEliminar.setText("Eliminar");
	  	    GridBagConstraints gbc_btnEliminar1 = new GridBagConstraints();
	  	    gbc_btnEliminar1.insets = new Insets(5, 5, 5, 5);
	  	    gbc_btnEliminar1.gridx = 0;
	  	    gbc_btnEliminar1.gridy = 1;
	  	    pnlHerramientas2.add(btnEliminar, gbc_btnEliminar1);
	  	    btnActualizar=new JButton();//Boton actualizar
	  	    btnActualizar.setText("Actualizar");
	  	    GridBagConstraints gbc_btnActualizar1 = new GridBagConstraints();
	  	    gbc_btnActualizar1.insets = new Insets(5, 5, 20, 5);
	  	    gbc_btnActualizar1.gridx = 0;
	  	    gbc_btnActualizar1.gridy = 2;
	  	    pnlHerramientas2.add(btnActualizar, gbc_btnActualizar1);
	  	
	  	    //Panel de herramientas 3
	  		pnlHerramientas3=new JPanel();
	  		
	  		pnlHerramientas3.setLayout(new GridBagLayout());
	  		btnAgregar=new JButton();//Boton agregar
	  		btnAgregar.setText("Agregar");
	  		GridBagConstraints gbc_btnAgregar11 = new GridBagConstraints();
	  		gbc_btnAgregar11.insets = new Insets(20, 5, 5, 5);
	  		gbc_btnAgregar11.gridx = 0;
	  		gbc_btnAgregar11.gridy = 0;
	  		pnlHerramientas3.add(btnAgregar, gbc_btnAgregar11);
	  		btnEliminar=new JButton();//Boton eliminar
	  		btnEliminar.setText("Eliminar");
	  	    GridBagConstraints gbc_btnEliminar11 = new GridBagConstraints();
	  	    gbc_btnEliminar11.insets = new Insets(5, 5, 5, 5);
	  	    gbc_btnEliminar11.gridx = 0;
	  	    gbc_btnEliminar11.gridy = 1;
	  	    pnlHerramientas3.add(btnEliminar, gbc_btnEliminar11);
	  	    btnActualizar=new JButton();//Boton actualizar
	  	    btnActualizar.setText("Actualizar");
	  	    GridBagConstraints gbc_btnActualizar11 = new GridBagConstraints();
	  	    gbc_btnActualizar11.insets = new Insets(5, 5, 20, 5);
	  	    gbc_btnActualizar11.gridx = 0;
	  	    gbc_btnActualizar11.gridy = 2;
	  	    pnlHerramientas3.add(btnActualizar, gbc_btnActualizar11);
	  	    
		//Paneles BorderLayout
		pnlAntPatologico=new JPanel();
		pnlAntNoPatologico=new JPanel();
		pnlAntHeredoFamili=new JPanel();
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
	    this.add(pnlAntHeredoFamili,"Ant. heredofamiliares");
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
	    ));
	    JScrollPane scrollTableAntPato=new JScrollPane(tableAntPato);
	    pnlAntPatologico.add(scrollTableAntPato, BorderLayout.CENTER);
	    
	    
	    /********/
	    //PESTAÑA 2-ANTECEDENTES NO PATOLOGICOS
	    //Creacion de panel principal para "apartado de antecedentes no patologicos"
	    pnlAntNoPatologico.setLayout(new BorderLayout());
	    //Creacion de paneles secundarios que iran en el panel principal para ant. no patologicos
	    JPanel pnlSuperiorAntNoPato=new JPanel();
	    pnlAntNoPatologico.add(pnlSuperiorAntNoPato,BorderLayout.NORTH);
	    JPanel pnlCentralAntNoPato=new JPanel();
	    pnlCentralAntNoPato.setLayout(new GridLayout(4,3));
	    pnlAntNoPatologico.add(pnlCentralAntNoPato,BorderLayout.CENTER);
	    //Creacion y Agregacion de componentes al pnlSuperiorAntNoPato
	    chckbxFuma = new JCheckBox("Fuma");
	    chckbxToma = new JCheckBox("Toma");
	    chckbxConsumeDrogas = new JCheckBox("Consume drogas");
	    JTextArea txtAreaDrogas=new JTextArea();
	    JScrollPane scrollDrogas=new JScrollPane(txtAreaDrogas);
	    pnlSuperiorAntNoPato.setLayout(new GridLayout(0, 6, 0, 0));
	    pnlSuperiorAntNoPato.add(new JLabel(""));
	    pnlSuperiorAntNoPato.add(chckbxFuma);
	    pnlSuperiorAntNoPato.add(chckbxToma);
	    pnlSuperiorAntNoPato.add(chckbxConsumeDrogas);
	    pnlSuperiorAntNoPato.add(scrollDrogas);
	    pnlSuperiorAntNoPato.add(new JLabel(""));
	   //Creacion y Agregacion de componentes al pnlCentralNorteAntNoPato
	    pnlCentralAntNoPato.add(new JLabel(""));
	    lblActiviDepor = new JLabel("Actividades deportivas");
	    pnlCentralAntNoPato.add(lblActiviDepor);
	    pnlCentralAntNoPato.add(new JLabel(""));
	    pnlCentralAntNoPato.add(new JLabel(""));
	    JTextArea txtAreaActiviDepor=new JTextArea();
	    JScrollPane scrollActiviDepor=new JScrollPane(txtAreaActiviDepor);
	    pnlCentralAntNoPato.add(scrollActiviDepor);
	    pnlCentralAntNoPato.add(new JLabel(""));
	  //Creacion y Agregacion de componentes al pnlCentralSurAntNoPato
	    pnlCentralAntNoPato.add(new JLabel(""));
	    lblHobbies = new JLabel("Hobbies u otras actividades");
	    pnlCentralAntNoPato.add(lblHobbies);
	    pnlCentralAntNoPato.add(new JLabel(""));
	    pnlCentralAntNoPato.add(new JLabel(""));
	    JTextArea txtAreaHobbies=new JTextArea();
        JScrollPane scrollHobbies=new JScrollPane(txtAreaHobbies);
        pnlCentralAntNoPato.add(scrollHobbies);
        pnlCentralAntNoPato.add(new JLabel(""));
	    
	    
	    /********/
	    //PESTAÑA 3-ANTECEDENTES HEREDOFAMILIARES
	    pnlAntHeredoFamili.setLayout(new GridLayout(7,3,0,1));
	    //Creacion y agregacion de componentes al pnlAntHeredoFamili
	    pnlAntHeredoFamili.add(new JLabel(""));
	    lblEnferPadre=new JLabel("Enfermedades del Padre");
	    lblEnferPadre.setVerticalAlignment(SwingConstants.BOTTOM);
	    pnlAntHeredoFamili.add(lblEnferPadre);
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    JTextArea txtAreaEnferPadre=new JTextArea();
	    JScrollPane scrollEnferPadre=new JScrollPane(txtAreaEnferPadre);
	    pnlAntHeredoFamili.add(scrollEnferPadre);
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    lblEnferMadre=new JLabel("Enfermedades de la Madre");
	    lblEnferMadre.setVerticalAlignment(SwingConstants.BOTTOM);
	    pnlAntHeredoFamili.add(lblEnferMadre);
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    JTextArea txtAreaEnferMadre=new JTextArea();
	    JScrollPane scrollEnferMadre=new JScrollPane(txtAreaEnferMadre);
	    pnlAntHeredoFamili.add(scrollEnferMadre);
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    lblEnferAbue=new JLabel("Enfermedades de los abuelos y/o hermanos");
	    lblEnferAbue.setVerticalAlignment(SwingConstants.BOTTOM);
	    pnlAntHeredoFamili.add(lblEnferAbue);
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    JTextArea txtAreaEnferAbue=new JTextArea();
	    JScrollPane scrollEnferAbue=new JScrollPane(txtAreaEnferAbue);
	    pnlAntHeredoFamili.add(scrollEnferAbue);
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    pnlAntHeredoFamili.add(new JLabel(""));
	    
	    /********/
	    //PESTAÑA 4-ANTECEDENTES TRAUMATICOS
	    pnlAntTrauma.setLayout(new BorderLayout());
	    pnlAntTrauma.add(pnlHerramientas2,BorderLayout.WEST);
	    
	    JTable tableAntTrauma = new JTable();
	    tableAntTrauma.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Traumas", "Fecha"
	    	}
	    ));
	    JScrollPane scrollTableAntTrauma=new JScrollPane(tableAntTrauma);
	    pnlAntTrauma.add(scrollTableAntTrauma, BorderLayout.CENTER);
	    
	    /********/
	    //PESTAÑA 5-ESQUEMA INMUNOLOGICO
	    pnlEsqInmuno.setLayout(new BorderLayout());
	    JPanel pnlSuperiorEsqInmuno=new JPanel();
	    JPanel pnlCentralEsqInmuno=new JPanel();
	    //Creacion y agregacion de componentes al pnlSuperiorEsqInmuno
	    chckbxBCG = new JCheckBox("BCG");
	    chckbxRotavirus = new JCheckBox("Rotavirus");
	    chckbxDobleViral = new JCheckBox("Doble Viral");
	    chckbxTripleViral = new JCheckBox("Triple Viral");
	    chckbxPentavalente = new JCheckBox("Pentavalente");
	    chckbxApliHIB = new JCheckBox("ApliHIB");
	    chckbxHepatitisA = new JCheckBox("Hepatitis A");
	    chckbxHepatitisB = new JCheckBox("Hepatitis B");
	    chckbxNeumo = new JCheckBox("Neumocócina");
	    chckbxInfluenza = new JCheckBox("Influenza");
	    chckbxDPT = new JCheckBox("DPT");
	    chckbxVHP = new JCheckBox("VHP");
	    pnlSuperiorEsqInmuno.setLayout(new GridLayout(6, 6));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    
	    pnlSuperiorEsqInmuno.add(chckbxBCG);
	    pnlSuperiorEsqInmuno.add(chckbxRotavirus);
	    pnlSuperiorEsqInmuno.add(chckbxDobleViral);
	    pnlSuperiorEsqInmuno.add(chckbxTripleViral);
	    
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    
	    pnlSuperiorEsqInmuno.add(chckbxPentavalente);
	    pnlSuperiorEsqInmuno.add(chckbxApliHIB);
	    pnlSuperiorEsqInmuno.add(chckbxHepatitisA);
	    pnlSuperiorEsqInmuno.add(chckbxHepatitisB);
	    
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    pnlSuperiorEsqInmuno.add(new JLabel(""));
	    
	    pnlSuperiorEsqInmuno.add(chckbxNeumo);
	    pnlSuperiorEsqInmuno.add(chckbxInfluenza);
	    pnlSuperiorEsqInmuno.add(chckbxDPT);
	    pnlSuperiorEsqInmuno.add(chckbxVHP);
	    
	    //Creacion y agregacion de componentes al pnlCentralEsqInmuno
	    pnlCentralEsqInmuno.setLayout(new GridLayout(3,3));
	    pnlCentralEsqInmuno.add(new JLabel(""));
	    lblObserva = new JLabel("Otras/Observaciones");
	    pnlCentralEsqInmuno.add(lblObserva);
	    lblObserva.setVerticalAlignment(SwingConstants.BOTTOM);
	    pnlCentralEsqInmuno.add(new JLabel(""));
	    pnlCentralEsqInmuno.add(new JLabel(""));
	    JTextArea txtAreaObserva=new JTextArea();
        JScrollPane scrollObserva=new JScrollPane(txtAreaObserva);
        pnlCentralEsqInmuno.add(scrollObserva);
        pnlCentralEsqInmuno.add(new JLabel(""));
        pnlCentralEsqInmuno.add(new JLabel(""));
        pnlCentralEsqInmuno.add(new JLabel(""));
	    //Agregamos pnlsuperior y central al panel principal de esquema inmunologico
	    pnlEsqInmuno.add(pnlSuperiorEsqInmuno,BorderLayout.NORTH);
	    pnlEsqInmuno.add(pnlCentralEsqInmuno,BorderLayout.CENTER);
	    
	    /********/
	    //PESTAÑA 6-TIPO DE SANGRE/ALERGIAS
	    pnlTipoSangre.setLayout(new BorderLayout());
	    JPanel pnlSuperiorSangre=new JPanel();
	    JPanel pnlCentralSangre=new JPanel();
	    //Creacion y agregacion de componentes en el pnlSuperiorSangre
	    pnlSuperiorSangre.setLayout(new GridLayout(2,4));
	    lblTipoSanguineo=new JLabel("Tipo Sanguineo");
	    cmoTipoSanguinio = new JComboBox();
	    cmoTipoSanguinio.setModel(new DefaultComboBoxModel(new String[] {"O+", "O-"}));
	    pnlSuperiorSangre.add(new JLabel(""));
	    pnlSuperiorSangre.add(lblTipoSanguineo);
	    pnlSuperiorSangre.add(new JLabel(""));
	    pnlSuperiorSangre.add(new JLabel(""));
	    pnlSuperiorSangre.add(cmoTipoSanguinio);
	    pnlSuperiorSangre.add(new JLabel(""));
	    //Creacion y agregacion de componentes en el pnlSuperiorSangre
	    pnlCentralSangre.setLayout(new GridLayout(6,5));
	    lblAlergiasDetec=new JLabel("Alergias Detectadas");
	    lblAlergiasDetec.setVerticalAlignment(SwingConstants.BOTTOM);
	    lblMedicamentos=new JLabel("Medicamentos");
	    lblMedicamentos.setVerticalAlignment(SwingConstants.BOTTOM);
	    lblAlimentos=new JLabel("Alimentos");
	    lblAlimentos.setVerticalAlignment(SwingConstants.BOTTOM);
	    lblMedioAmbiente=new JLabel("Medio Ambiente");
	    lblMedioAmbiente.setVerticalAlignment(SwingConstants.BOTTOM);
	    lblOtros=new JLabel("Otros");
	    lblOtros.setVerticalAlignment(SwingConstants.BOTTOM);
	    JTextArea txtAreaMedicamentos=new JTextArea();
        JScrollPane scrollMedicamentos=new JScrollPane(txtAreaMedicamentos);
        JTextArea txtAreaAlimentos=new JTextArea();
        JScrollPane scrollAlimentos=new JScrollPane(txtAreaAlimentos);
        JTextArea txtAreaMedioAmbiente=new JTextArea();
        JScrollPane scrollMedioAmbiente=new JScrollPane(txtAreaMedioAmbiente);
        JTextArea txtAreaOtros=new JTextArea();
        JScrollPane scrollOtros=new JScrollPane(txtAreaOtros);
        
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(lblAlergiasDetec);
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(new JLabel(""));
	    
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(lblMedicamentos);
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(lblAlimentos);
	    pnlCentralSangre.add(new JLabel(""));
	    
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(scrollMedicamentos);
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(scrollAlimentos);
	    pnlCentralSangre.add(new JLabel(""));
	    
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(lblMedioAmbiente);
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(lblOtros);
	    pnlCentralSangre.add(new JLabel(""));
	    
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(scrollMedioAmbiente);
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(scrollOtros);
	    pnlCentralSangre.add(new JLabel(""));
	    
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(new JLabel(""));
	    pnlCentralSangre.add(new JLabel(""));
	    
	    //Agregacion de pnl´s al pnlTipoSangre
	    pnlTipoSangre.add(pnlSuperiorSangre,BorderLayout.NORTH);
	    pnlTipoSangre.add(pnlCentralSangre,BorderLayout.CENTER);
	
	  //PESTAÑA 7-INTERVENCIONES
	    pnlIntervenciones.setLayout(new BorderLayout());
	    pnlIntervenciones.add(pnlHerramientas3,BorderLayout.WEST);
	    
	    JTable tableIntervenciones = new JTable();
	    tableIntervenciones.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		"Razón", "Fecha"
	    	}
	    ));
	    JScrollPane scrollIntervenciones=new JScrollPane(tableIntervenciones);
	    pnlIntervenciones.add(scrollIntervenciones, BorderLayout.CENTER);
	    
	}
}
