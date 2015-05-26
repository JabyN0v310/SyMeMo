package Presentacion;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
//import javax.swing.border.TitledBorder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.awt.GridBagLayout;
//import java.awt.GridBagConstraints;
//import java.awt.Insets;


import javax.swing.JPasswordField;

//import com.sun.awt.AWTUtilities;


import Negocio.NegocioFrmLogin;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


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
		//quitar el boton de maximizar/minimizar
		setResizable(false);
		
		//Pero aqui le quitamos los botones de la ventana >:D
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Con esto dejamos transparente el panel de jframe :D
		setBackground(new Color(0,0,0,0));
				
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(183, 165, 49, 15);
		contentPane.add(lblUsuario);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(237, 163, 161, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setBounds(158, 190, 74, 15);
		contentPane.add(lblContrasenia);
		lblContrasenia.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtContrasenia = new JPasswordField();

		txtContrasenia.setBounds(237, 188, 161, 20);
		contentPane.add(txtContrasenia);
		
		final JButton btnAceptar = new JButton("Ingresar");
		btnAceptar.setBounds(136, 228, 82, 23);
		contentPane.add(btnAceptar);
		
		JButton btnRegistarse = new JButton("Registarse");
		btnRegistarse.setBounds(228, 228, 101, 23);
		contentPane.add(btnRegistarse);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(339, 228, 89, 23);
		contentPane.add(btnSalir);
		
		
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		btnRegistarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			new Registro();
			//hide();
			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				String usuario=txtUsuario.getText();
				String contrasenia = txtContrasenia.getText();
				
				//Comparacion de prueba Sin conexion a la base de datos
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
			/*	if(NegocioFrmLogin.Login(txtUsuario.getText(), txtContrasenia.getText())){
					JOptionPane.showMessageDialog(null, "Bienvenido");
					 mp = new MenuPrincipal();
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecto");
				}*/
				
			}
			
			
			
			
			
			
		});
		txtContrasenia.addKeyListener(new KeyAdapter() {
		//Action para cuando se oprima enter desde el txtcontrasenia accionando el boton
			public void keyPressed(KeyEvent e) {
				 if  ( e . getKeyCode ()== KeyEvent . VK_ENTER ){ 
				        System.out.println( "Oprimistes Enter :O" ); 
				        SwingUtilities.getRootPane(btnAceptar).setDefaultButton(btnAceptar);
				       // rootPane.setDefaultButton(btnAceptar);  
				 } 
			}
		});
		
		//Imagen de fondo :p
		JLabel label = new JLabel("");
		label.setBounds(0, 5, 449, 269);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Login.class.getResource("/img/Login3.png")));
	}
	/*Metodo Para hacer el JFrame Transparente
	 * public static void transparencia(JFrame frm){
		AWTUtilities.setWindowOpaque(frm, false);
		
	}*/
}
