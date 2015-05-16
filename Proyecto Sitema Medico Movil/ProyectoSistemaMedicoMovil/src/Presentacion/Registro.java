package Presentacion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;


public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtDireccion;
	private JTextField txtUsuario;
	private JTextField txtContrasea;
	private JTextField txtCorreo;

	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/

	public Registro() {
		setTitle("Registro");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(500, 200, 450, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		contentPane.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 1;
		contentPane.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad");
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 1;
		gbc_lblEdad.gridy = 3;
		contentPane.add(lblEdad, gbc_lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setText("");
		GridBagConstraints gbc_txtEdad = new GridBagConstraints();
		gbc_txtEdad.insets = new Insets(0, 0, 5, 0);
		gbc_txtEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEdad.gridx = 3;
		gbc_txtEdad.gridy = 3;
		contentPane.add(txtEdad, gbc_txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblCedula = new JLabel("Cedula");
		GridBagConstraints gbc_lblCedula = new GridBagConstraints();
		gbc_lblCedula.insets = new Insets(0, 0, 5, 5);
		gbc_lblCedula.gridx = 1;
		gbc_lblCedula.gridy = 5;
		contentPane.add(lblCedula, gbc_lblCedula);
		
		txtCedula = new JTextField();
		txtCedula.setText("");
		GridBagConstraints gbc_txtCedula = new GridBagConstraints();
		gbc_txtCedula.insets = new Insets(0, 0, 5, 0);
		gbc_txtCedula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCedula.gridx = 3;
		gbc_txtCedula.gridy = 5;
		contentPane.add(txtCedula, gbc_txtCedula);
		txtCedula.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 7;
		contentPane.add(lblTelefono, gbc_lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setText("");
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 3;
		gbc_txtTelefono.gridy = 7;
		contentPane.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 1;
		gbc_lblDireccion.gridy = 9;
		contentPane.add(lblDireccion, gbc_lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setText("");
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccion.gridx = 3;
		gbc_txtDireccion.gridy = 9;
		contentPane.add(txtDireccion, gbc_txtDireccion);
		txtDireccion.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 11;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("");
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 3;
		gbc_txtUsuario.gridy = 11;
		contentPane.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 13;
		contentPane.add(lblContrasea, gbc_lblContrasea);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("");
		GridBagConstraints gbc_txtContrasea = new GridBagConstraints();
		gbc_txtContrasea.insets = new Insets(0, 0, 5, 0);
		gbc_txtContrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContrasea.gridx = 3;
		gbc_txtContrasea.gridy = 13;
		contentPane.add(txtContrasea, gbc_txtContrasea);
		txtContrasea.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo");
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 1;
		gbc_lblCorreo.gridy = 15;
		contentPane.add(lblCorreo, gbc_lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("");
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 0);
		gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreo.gridx = 3;
		gbc_txtCorreo.gridy = 15;
		contentPane.add(txtCorreo, gbc_txtCorreo);
		txtCorreo.setColumns(10);
		
		JButton btnRegistrarme = new JButton("Registrarme");
		GridBagConstraints gbc_btnRegistrarme = new GridBagConstraints();
		gbc_btnRegistrarme.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegistrarme.gridx = 1;
		gbc_btnRegistrarme.gridy = 17;
		contentPane.add(btnRegistrarme, gbc_btnRegistrarme);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.gridx = 3;
		gbc_btnCancelar.gridy = 17;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		setVisible(true);
	}

}
