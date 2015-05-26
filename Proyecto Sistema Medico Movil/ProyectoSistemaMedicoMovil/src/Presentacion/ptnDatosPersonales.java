package Presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ptnDatosPersonales extends JPanel {

	/**
	 * Create the panel.
	 */
	private JButton btn1,btn2;
	private JPanel pnlGridBag;
	private JTextField txtApellidoPaterno,txtApellidoMaterno,txtNombre,txtRFC,txtCURP,txtFechaNacimiento,txtEdad,txtEstatura,txtPeso,txtOcupacion,txtEstadoCivil,txtTelParticular,txtTelOficina,txtCelular,txtEmail,txtCalleNumero,txtColonia,txtCiudad,txtEstado,txtPais,txtCodigoPostal;
	private JLabel lblApellidoMaterno,lblApellidoPaterno,lblNombre,lblFoto,lblRFC,lblCURP,lblFechaNacimiento,lblEdad,lblEstatura,lblPeso,lblSexo,lblOcupacion,lblEstadoCivil,lblTelParticular,lblTelOficina,lblCelular,lblEmail,lblCalleNumero,lblColonia,lblCiudad,lblEstado,lblPais,lblCodigoPostal;
	private JComboBox cmoSexo;
	
	public ptnDatosPersonales() 
	{
		btn1=new JButton();
		btn2=new JButton();
		pnlGridBag=new JPanel();
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		gridBagLayout.columnWidths = new int[]{-40, 37, 60, 20, 33, 24, 30, 59, 60, 86, 41};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		pnlGridBag.setLayout(gridBagLayout);
		this.setLayout(new BorderLayout());
	    this.add(pnlGridBag,BorderLayout.CENTER);
	    //this.add(btn1,BorderLayout.SOUTH);
	    //this.add(btn2,BorderLayout.EAST);
	    
	    lblApellidoPaterno = new JLabel("Apellido paterno");
	    GridBagConstraints gbc_lblApellidoPaterno = new GridBagConstraints();
	    gbc_lblApellidoPaterno.fill = GridBagConstraints.BOTH;
	    gbc_lblApellidoPaterno.insets = new Insets(0, 0, 5, 5);
	    gbc_lblApellidoPaterno.gridx = 4;
	    gbc_lblApellidoPaterno.gridy = 0;
	    gbc_lblApellidoPaterno.gridheight = 1;
	    gbc_lblApellidoPaterno.weightx=1.0;
	    gbc_lblApellidoPaterno.anchor = GridBagConstraints.CENTER;
	    pnlGridBag.add(lblApellidoPaterno, gbc_lblApellidoPaterno);
	    
	    txtApellidoPaterno = new JTextField();
	    GridBagConstraints gbc_txtApellidoPaterno = new GridBagConstraints();
	    gbc_txtApellidoPaterno.gridwidth = 2;
	    gbc_txtApellidoPaterno.insets = new Insets(0, 0, 5, 5);
	    gbc_txtApellidoPaterno.fill = GridBagConstraints.BOTH;
	    gbc_txtApellidoPaterno.gridx = 4;
	    gbc_txtApellidoPaterno.gridy = 1;
	    gbc_lblApellidoPaterno.gridheight = 1;
	    gbc_lblApellidoPaterno.weightx=1.0;
	    pnlGridBag.add(txtApellidoPaterno, gbc_txtApellidoPaterno);
	    txtApellidoPaterno.setColumns(10);
	    
	    lblApellidoMaterno = new JLabel("Apellido materno");
	    GridBagConstraints gbc_lblApellidoMaterno = new GridBagConstraints();
	    gbc_lblApellidoMaterno.fill = GridBagConstraints.BOTH;
	    gbc_lblApellidoMaterno.insets = new Insets(0, 0, 5, 5);
	    gbc_lblApellidoMaterno.gridx = 4;
	    gbc_lblApellidoMaterno.gridy = 2;
	    pnlGridBag.add(lblApellidoMaterno, gbc_lblApellidoMaterno);
	    
	    txtApellidoMaterno = new JTextField();
	    GridBagConstraints gbc_txtApellidoMaterno = new GridBagConstraints();
	    gbc_txtApellidoMaterno.gridwidth = 2;
	    gbc_txtApellidoMaterno.insets = new Insets(0, 0, 5, 5);
	    gbc_txtApellidoMaterno.fill = GridBagConstraints.BOTH;
	    gbc_txtApellidoMaterno.gridx = 4;
	    gbc_txtApellidoMaterno.gridy = 3;
	    pnlGridBag.add(txtApellidoMaterno, gbc_txtApellidoMaterno);
	    txtApellidoMaterno.setColumns(10);
	    
	    lblFoto = new JLabel("Foto");
	    GridBagConstraints gbc_lblFoto = new GridBagConstraints();
	    gbc_lblFoto.fill = GridBagConstraints.BOTH;
	    gbc_lblFoto.gridwidth = 4;
	    gbc_lblFoto.gridheight = 6;
	    gbc_lblFoto.insets = new Insets(0, 50, 5, 40);
	    gbc_lblFoto.gridx = 0;
	    gbc_lblFoto.gridy = 0;
	    gbc_lblApellidoPaterno.weightx=1.0;
	    pnlGridBag.add(lblFoto, gbc_lblFoto);
	    
	    lblNombre = new JLabel("Nombre");
	    GridBagConstraints gbc_lblNombre = new GridBagConstraints();
	    gbc_lblNombre.fill = GridBagConstraints.HORIZONTAL;
	    gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
	    gbc_lblNombre.gridx = 4;
	    gbc_lblNombre.gridy = 4;
	    pnlGridBag.add(lblNombre, gbc_lblNombre);
	    
	    txtNombre = new JTextField();
	    GridBagConstraints gbc_txtNombre = new GridBagConstraints();
	    gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
	    gbc_txtNombre.gridwidth = 2;
	    gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtNombre.gridx = 4;
	    gbc_txtNombre.gridy = 5;
	    pnlGridBag.add(txtNombre, gbc_txtNombre);
	    txtNombre.setColumns(10);
	    
	    lblRFC = new JLabel("R.F.C");
	    GridBagConstraints gbc_lblRFC = new GridBagConstraints();
	    gbc_lblRFC.insets = new Insets(0, 0, 5, 5);
	    gbc_lblRFC.gridx = 2;
	    gbc_lblRFC.gridy = 6;
	    pnlGridBag.add(lblRFC, gbc_lblRFC);
	    
	    lblCURP = new JLabel("C.U.R.P");
	    GridBagConstraints gbc_lblCURP = new GridBagConstraints();
	    gbc_lblCURP.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCURP.gridx = 4;
	    gbc_lblCURP.gridy = 6;
	    pnlGridBag.add(lblCURP, gbc_lblCURP);
	    
	    lblFechaNacimiento = new JLabel("Fecha nacimiento");
	    GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
	    gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
	    gbc_lblFechaNacimiento.gridx = 6;
	    gbc_lblFechaNacimiento.gridy = 6;
	    pnlGridBag.add(lblFechaNacimiento, gbc_lblFechaNacimiento);
	    
	    lblEdad = new JLabel("Edad");
	    GridBagConstraints gbc_lblEdad = new GridBagConstraints();
	    gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
	    gbc_lblEdad.gridx = 7;
	    gbc_lblEdad.gridy = 6;
	    pnlGridBag.add(lblEdad, gbc_lblEdad);
	    
	    lblEstatura = new JLabel("Estatura");
	    GridBagConstraints gbc_lblEstatura = new GridBagConstraints();
	    gbc_lblEstatura.insets = new Insets(0, 0, 5, 5);
	    gbc_lblEstatura.gridx = 8;
	    gbc_lblEstatura.gridy = 6;
	    pnlGridBag.add(lblEstatura, gbc_lblEstatura);
	    
	    lblPeso = new JLabel("Peso");
	    GridBagConstraints gbc_lblPeso = new GridBagConstraints();
	    gbc_lblPeso.insets = new Insets(0, 0, 5, 5);
	    gbc_lblPeso.gridx = 9;
	    gbc_lblPeso.gridy = 6;
	    pnlGridBag.add(lblPeso, gbc_lblPeso);
	    
	    lblSexo = new JLabel("Sexo");
	    GridBagConstraints gbc_lblSexo = new GridBagConstraints();
	    gbc_lblSexo.insets = new Insets(0, 0, 5, 50);
	    gbc_lblSexo.gridx = 10;
	    gbc_lblSexo.gridy = 6;
	    pnlGridBag.add(lblSexo, gbc_lblSexo);
	    
	    txtRFC = new JTextField();
	    GridBagConstraints gbc_txtRFC = new GridBagConstraints();
	    gbc_txtRFC.gridwidth = 2;
	    gbc_txtRFC.insets = new Insets(0, 0, 5, 5);
	    gbc_txtRFC.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtRFC.gridx = 2;
	    gbc_txtRFC.gridy = 7;
	    pnlGridBag.add(txtRFC, gbc_txtRFC);
	    txtRFC.setColumns(10);
	    
	    txtCURP = new JTextField();
	    GridBagConstraints gbc_txtCURP = new GridBagConstraints();
	    gbc_txtCURP.gridwidth = 2;
	    gbc_txtCURP.anchor = GridBagConstraints.NORTH;
	    gbc_txtCURP.insets = new Insets(0, 0, 5, 5);
	    gbc_txtCURP.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtCURP.gridx = 4;
	    gbc_txtCURP.gridy = 7;
	    pnlGridBag.add(txtCURP, gbc_txtCURP);
	    txtCURP.setColumns(10);
	    
	    txtFechaNacimiento = new JTextField();
	    GridBagConstraints gbc_txtFechaNacimiento = new GridBagConstraints();
	    gbc_txtFechaNacimiento.anchor = GridBagConstraints.NORTH;
	    gbc_txtFechaNacimiento.insets = new Insets(0, 0, 5, 5);
	    gbc_txtFechaNacimiento.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtFechaNacimiento.gridx = 6;
	    gbc_txtFechaNacimiento.gridy = 7;
	    pnlGridBag.add(txtFechaNacimiento, gbc_txtFechaNacimiento);
	    txtFechaNacimiento.setColumns(10);
	    
	    txtEdad = new JTextField();
	    GridBagConstraints gbc_txtEdad = new GridBagConstraints();
	    gbc_txtEdad.insets = new Insets(0, 0, 5, 5);
	    gbc_txtEdad.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtEdad.gridx = 7;
	    gbc_txtEdad.gridy = 7;
	    pnlGridBag.add(txtEdad, gbc_txtEdad);
	    txtEdad.setColumns(10);
	    
	    txtEstatura = new JTextField();
	    GridBagConstraints gbc_txtEstatura = new GridBagConstraints();
	    gbc_txtEstatura.insets = new Insets(0, 0, 5, 5);
	    gbc_txtEstatura.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtEstatura.gridx = 8;
	    gbc_txtEstatura.gridy = 7;
	    pnlGridBag.add(txtEstatura, gbc_txtEstatura);
	    txtEstatura.setColumns(10);
	    
	    txtPeso = new JTextField();
	    GridBagConstraints gbc_txtPeso = new GridBagConstraints();
	    gbc_txtPeso.insets = new Insets(0, 0, 5, 5);
	    gbc_txtPeso.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtPeso.gridx = 9;
	    gbc_txtPeso.gridy = 7;
	    pnlGridBag.add(txtPeso, gbc_txtPeso);
	    txtPeso.setColumns(10);
	    
	    cmoSexo = new JComboBox();
	    cmoSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
	    GridBagConstraints gbc_cmoSexo = new GridBagConstraints();
	    gbc_cmoSexo.insets = new Insets(0, 0, 5, 50);
	    gbc_cmoSexo.fill = GridBagConstraints.HORIZONTAL;
	    gbc_cmoSexo.gridx = 10;
	    gbc_cmoSexo.gridy = 7;
	    pnlGridBag.add(cmoSexo, gbc_cmoSexo);
	    
	    lblOcupacion = new JLabel("Ocupacion");
	    GridBagConstraints gbc_lblOcupacion = new GridBagConstraints();
	    gbc_lblOcupacion.insets = new Insets(0, 0, 5, 5);
	    gbc_lblOcupacion.gridx = 2;
	    gbc_lblOcupacion.gridy = 8;
	    gbc_lblOcupacion.weighty=.5;//cuanto estirar
	    gbc_lblOcupacion.anchor=GridBagConstraints.SOUTH;//hacia donde acomodar
	    pnlGridBag.add(lblOcupacion, gbc_lblOcupacion);
	    
	    lblEstadoCivil = new JLabel("Estado civil");
	    GridBagConstraints gbc_lblEstadoCivil = new GridBagConstraints();
	    gbc_lblEstadoCivil.insets = new Insets(0, 0, 5, 5);
	    gbc_lblEstadoCivil.gridx = 6;
	    gbc_lblEstadoCivil.gridy = 8;
	    gbc_lblEstadoCivil.weighty=.5;//cuanto estirar
	    gbc_lblEstadoCivil.anchor=GridBagConstraints.SOUTH;//hacia donde acomodar
	    pnlGridBag.add(lblEstadoCivil, gbc_lblEstadoCivil);
	    
	    txtOcupacion = new JTextField();
	    GridBagConstraints gbc_txtOcupacion = new GridBagConstraints();
	    gbc_txtOcupacion.gridwidth = 3;
	    gbc_txtOcupacion.insets = new Insets(0, 0, 5, 5);
	    gbc_txtOcupacion.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtOcupacion.gridx = 2;
	    gbc_txtOcupacion.gridy = 9;
	    gbc_txtOcupacion.weighty=.5;//cuanto estirar
	    gbc_txtOcupacion.anchor=GridBagConstraints.NORTH;//hacia donde acomodar
	    pnlGridBag.add(txtOcupacion, gbc_txtOcupacion);
	    txtOcupacion.setColumns(10);
	    
	    txtEstadoCivil = new JTextField();
	    GridBagConstraints gbc_txtEstadoCivil = new GridBagConstraints();
	    gbc_txtEstadoCivil.anchor = GridBagConstraints.NORTH;
	    gbc_txtEstadoCivil.insets = new Insets(0, 0, 5, 5);
	    gbc_txtEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtEstadoCivil.gridx = 6;
	    gbc_txtEstadoCivil.gridy = 9;
	    gbc_txtEstadoCivil.weighty=.5;//cuanto estirar
	    gbc_txtEstadoCivil.anchor=GridBagConstraints.NORTH;//hacia donde acomodar
	    pnlGridBag.add(txtEstadoCivil, gbc_txtEstadoCivil);
	    txtEstadoCivil.setColumns(10);
	    
	    lblTelParticular = new JLabel("Tel. particular");
	    GridBagConstraints gbc_lblTelParticular = new GridBagConstraints();
	    gbc_lblTelParticular.insets = new Insets(0, 0, 5, 5);
	    gbc_lblTelParticular.gridx = 2;
	    gbc_lblTelParticular.gridy = 10;
	    pnlGridBag.add(lblTelParticular, gbc_lblTelParticular);
	    
	    lblTelOficina = new JLabel("Tel. Oficina");
	    GridBagConstraints gbc_lblTelOficina = new GridBagConstraints();
	    gbc_lblTelOficina.insets = new Insets(0, 0, 5, 5);
	    gbc_lblTelOficina.gridx = 4;
	    gbc_lblTelOficina.gridy = 10;
	    pnlGridBag.add(lblTelOficina, gbc_lblTelOficina);
	    
	    lblCelular = new JLabel("Celular");
	    GridBagConstraints gbc_lblCelular = new GridBagConstraints();
	    gbc_lblCelular.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCelular.gridx = 6;
	    gbc_lblCelular.gridy = 10;
	    pnlGridBag.add(lblCelular, gbc_lblCelular);
	    
	    lblEmail = new JLabel("Email");
	    GridBagConstraints gbc_lblEmail = new GridBagConstraints();
	    gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
	    gbc_lblEmail.gridx = 8;
	    gbc_lblEmail.gridy = 10;
	    pnlGridBag.add(lblEmail, gbc_lblEmail);
	    
	    txtTelParticular = new JTextField();
	    GridBagConstraints gbc_txtTelParticular = new GridBagConstraints();
	    gbc_txtTelParticular.insets = new Insets(0, 0, 5, 5);
	    gbc_txtTelParticular.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtTelParticular.gridx = 2;
	    gbc_txtTelParticular.gridy = 11;
	    //gbc_lblCalleNumero.weightx=0;
	    //gbc_txtTelParticular.weighty=1;
	    pnlGridBag.add(txtTelParticular, gbc_txtTelParticular);
	    txtTelParticular.setColumns(10);
	    
	    txtTelOficina = new JTextField();
	    GridBagConstraints gbc_txtTelOficina = new GridBagConstraints();
	    gbc_txtTelOficina.insets = new Insets(0, 0, 5, 5);
	    gbc_txtTelOficina.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtTelOficina.gridx = 4;
	    gbc_txtTelOficina.gridy = 11;
	    pnlGridBag.add(txtTelOficina, gbc_txtTelOficina);
	    txtTelOficina.setColumns(10);
	    
	    txtCelular = new JTextField();
	    GridBagConstraints gbc_txtCelular = new GridBagConstraints();
	    gbc_txtCelular.insets = new Insets(0, 0, 5, 5);
	    gbc_txtCelular.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtCelular.gridx = 6;
	    gbc_txtCelular.gridy = 11;
	    pnlGridBag.add(txtCelular, gbc_txtCelular);
	    txtCelular.setColumns(10);
	    
	    txtEmail = new JTextField();
	    GridBagConstraints gbc_txtEmail = new GridBagConstraints();
	    gbc_txtEmail.gridwidth = 2;
	    gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
	    gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtEmail.gridx = 8;
	    gbc_txtEmail.gridy = 11;
	    pnlGridBag.add(txtEmail, gbc_txtEmail);
	    txtEmail.setColumns(10);
	    
	    lblCalleNumero = new JLabel("Calle y n\u00FAmero");
	    GridBagConstraints gbc_lblCalleNumero = new GridBagConstraints();
	    gbc_lblCalleNumero.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCalleNumero.gridx = 2;
	    gbc_lblCalleNumero.gridy = 12;
	    //gbc_lblCalleNumero.weightx=0;
	    gbc_lblCalleNumero.weighty=.5;
	    gbc_lblCalleNumero.anchor=GridBagConstraints.SOUTH;
	    pnlGridBag.add(lblCalleNumero, gbc_lblCalleNumero);
	    
	    lblColonia = new JLabel("Colonia");
	    GridBagConstraints gbc_lblColonia = new GridBagConstraints();
	    gbc_lblColonia.insets = new Insets(0, 0, 5, 5);
	    gbc_lblColonia.gridx = 3;
	    gbc_lblColonia.gridy = 12;
	    gbc_lblColonia.weighty=.5;
	    gbc_lblColonia.anchor=GridBagConstraints.SOUTH;
	    pnlGridBag.add(lblColonia, gbc_lblColonia);
	    
	    lblCiudad = new JLabel("Ciudad");
	    GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
	    gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCiudad.gridx = 5;
	    gbc_lblCiudad.gridy = 12;
	    gbc_lblCiudad.weighty=.5;
	    gbc_lblCiudad.anchor=GridBagConstraints.SOUTH;
	    pnlGridBag.add(lblCiudad, gbc_lblCiudad);
	    
	    lblEstado = new JLabel("Estado");
	    GridBagConstraints gbc_lblEstado = new GridBagConstraints();
	    gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
	    gbc_lblEstado.gridx = 6;
	    gbc_lblEstado.gridy = 12;
	    gbc_lblEstado.weighty=.5;
	    gbc_lblEstado.anchor=GridBagConstraints.SOUTH;
	    pnlGridBag.add(lblEstado, gbc_lblEstado);
	    
	    lblPais = new JLabel("Pais");
	    GridBagConstraints gbc_lblPais = new GridBagConstraints();
	    gbc_lblPais.insets = new Insets(0, 0, 5, 5);
	    gbc_lblPais.gridx = 7;
	    gbc_lblPais.gridy = 12;
	    gbc_lblPais.weighty=.5;
	    gbc_lblPais.anchor=GridBagConstraints.SOUTH;
	    pnlGridBag.add(lblPais, gbc_lblPais);
	    
	    lblCodigoPostal = new JLabel("Codio postal");
	    GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
	    gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 5);
	    gbc_lblCodigoPostal.gridx = 8;
	    gbc_lblCodigoPostal.gridy = 12;
	    gbc_lblCodigoPostal.weighty=.5;
	    gbc_lblCodigoPostal.anchor=GridBagConstraints.SOUTH;
	    pnlGridBag.add(lblCodigoPostal, gbc_lblCodigoPostal);
	    
	    txtCalleNumero = new JTextField();
	    GridBagConstraints gbc_txtCalleNumero = new GridBagConstraints();
	    gbc_txtCalleNumero.insets = new Insets(0, 0, 0, 5);
	    gbc_txtCalleNumero.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtCalleNumero.gridx = 2;
	    gbc_txtCalleNumero.gridy = 13;
	    //gbc_txtCalleNumero.weightx= 0;
	    gbc_txtCalleNumero.weighty=.5;
	    gbc_txtCalleNumero.anchor=GridBagConstraints.NORTH;
	    pnlGridBag.add(txtCalleNumero, gbc_txtCalleNumero);
	    txtCalleNumero.setColumns(10);
	    
	    txtColonia = new JTextField();
	    GridBagConstraints gbc_txtColonia = new GridBagConstraints();
	    gbc_txtColonia.insets = new Insets(0, 0, 0, 5);
	    gbc_txtColonia.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtColonia.gridx = 3;
	    gbc_txtColonia.gridy = 13;
	    gbc_txtColonia.weighty=.5;
	    gbc_txtColonia.anchor=GridBagConstraints.NORTH;
	    pnlGridBag.add(txtColonia, gbc_txtColonia);
	    txtColonia.setColumns(10);
	    
	    txtCiudad = new JTextField();
	    GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
	    gbc_txtCiudad.insets = new Insets(0, 0, 0, 5);
	    gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtCiudad.gridx = 5;
	    gbc_txtCiudad.gridy = 13;
	    gbc_txtCiudad.weighty=.5;
	    gbc_txtCiudad.anchor=GridBagConstraints.NORTH;
	    pnlGridBag.add(txtCiudad, gbc_txtCiudad);
	    txtCiudad.setColumns(10);
	    
	    txtEstado = new JTextField();
	    GridBagConstraints gbc_txtEstado = new GridBagConstraints();
	    gbc_txtEstado.insets = new Insets(0, 0, 0, 5);
	    gbc_txtEstado.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtEstado.gridx = 6;
	    gbc_txtEstado.gridy = 13;
	    gbc_txtEstado.weighty=.5;
	    gbc_txtEstado.anchor=GridBagConstraints.NORTH;
	    pnlGridBag.add(txtEstado, gbc_txtEstado);
	    txtEstado.setColumns(10);
	    
	    txtPais = new JTextField();
	    GridBagConstraints gbc_txtPais = new GridBagConstraints();
	    gbc_txtPais.insets = new Insets(0, 0, 0, 5);
	    gbc_txtPais.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtPais.gridx = 7;
	    gbc_txtPais.gridy = 13;
	    gbc_txtPais.weighty=.5;
	    gbc_txtPais.anchor=GridBagConstraints.NORTH;
	    pnlGridBag.add(txtPais, gbc_txtPais);
	    txtPais.setColumns(10);
	    
	    txtCodigoPostal = new JTextField();
	    GridBagConstraints gbc_txtCodigoPostal = new GridBagConstraints();
	    gbc_txtCodigoPostal.insets = new Insets(0, 0, 0, 5);
	    gbc_txtCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
	    gbc_txtCodigoPostal.gridx = 8;
	    gbc_txtCodigoPostal.gridy = 13;
	    gbc_txtCodigoPostal.weighty=.5;
	    gbc_txtCodigoPostal.anchor=GridBagConstraints.NORTH;
	    pnlGridBag.add(txtCodigoPostal, gbc_txtCodigoPostal);
	    txtCodigoPostal.setColumns(10);
	    
	}
}
