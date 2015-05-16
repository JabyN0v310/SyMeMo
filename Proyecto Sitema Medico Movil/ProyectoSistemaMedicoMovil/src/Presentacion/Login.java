package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JPasswordField;

import Negocio.NegocioFrmLogin;

import java.awt.Font;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasenia;
	MenuPrincipal mp;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.ORANGE);
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{76, 48, 73, 89, 0};
		gbl_panel.rowHeights = new int[]{63, 0, 20, 20, 69, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.EAST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 2;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 2;
		panel.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblContrasenia = new GridBagConstraints();
		gbc_lblContrasenia.anchor = GridBagConstraints.EAST;
		gbc_lblContrasenia.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasenia.gridx = 0;
		gbc_lblContrasenia.gridy = 3;
		panel.add(lblContrasenia, gbc_lblContrasenia);
		
		JButton btnAceptar = new JButton("Ingresar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String usuario=txtUsuario.getText();
				String contrasenia = txtContrasenia.getText();
				
				if(usuario.isEmpty() || contrasenia.isEmpty()){
					JOptionPane.showMessageDialog(null, "Algun campo esta vacio");

				}else{
					
					if(usuario.equalsIgnoreCase("HOUSE28") && contrasenia.equals("SARCASMO")){
						JOptionPane.showMessageDialog(null, "Bienvenido");
						 mp = new MenuPrincipal();
						dispose();
						
					}else{
						JOptionPane.showMessageDialog(null, "Datos Incorrectos");
					}
				}
				
			//Prueba Base de datos Usuario
				/*if(NegocioFrmLogin.Login(txtUsuario.getText(), txtContrasenia.getText())){
					
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecto");
				}*/
				
			}
			
			
			
			
			
			
		});
		
		txtContrasenia = new JPasswordField();
		GridBagConstraints gbc_txtContrasenia = new GridBagConstraints();
		gbc_txtContrasenia.insets = new Insets(0, 0, 5, 5);
		gbc_txtContrasenia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContrasenia.gridx = 1;
		gbc_txtContrasenia.gridy = 3;
		panel.add(txtContrasenia, gbc_txtContrasenia);
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridwidth = 2;
		gbc_btnAceptar.gridx = 0;
		gbc_btnAceptar.gridy = 5;
		panel.add(btnAceptar, gbc_btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		
		JButton btnRegistarse = new JButton("Registarse");
		btnRegistarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			new Registro();
			//hide();
			}
		});
		GridBagConstraints gbc_btnRegistarse = new GridBagConstraints();
		gbc_btnRegistarse.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegistarse.gridx = 2;
		gbc_btnRegistarse.gridy = 5;
		panel.add(btnRegistarse, gbc_btnRegistarse);
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.anchor = GridBagConstraints.NORTH;
		gbc_btnSalir.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalir.gridx = 3;
		gbc_btnSalir.gridy = 5;
		panel.add(btnSalir, gbc_btnSalir);
	}
}
