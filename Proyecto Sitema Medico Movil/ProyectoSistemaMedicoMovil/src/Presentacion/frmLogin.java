package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;

import javax.swing.JPasswordField;
import javax.swing.JButton;

import Conexion.ConexionDB;
import Negocio.NegocioFrmLogin;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasenia;
	MDIMedicamentos n;


	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/


	
	public frmLogin() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 2;
		contentPane.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 4;
		gbc_txtUsuario.gridy = 2;
		contentPane.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a");
		GridBagConstraints gbc_lblContrasenia = new GridBagConstraints();
		gbc_lblContrasenia.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasenia.gridx = 2;
		gbc_lblContrasenia.gridy = 4;
		contentPane.add(lblContrasenia, gbc_lblContrasenia);
		
		txtContrasenia = new JPasswordField();
		GridBagConstraints gbc_txtContrasenia = new GridBagConstraints();
		gbc_txtContrasenia.insets = new Insets(0, 0, 5, 0);
		gbc_txtContrasenia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContrasenia.gridx = 4;
		gbc_txtContrasenia.gridy = 4;
		contentPane.add(txtContrasenia, gbc_txtContrasenia);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
			if(NegocioFrmLogin.Login(txtUsuario.getText(), txtContrasenia.getText())){
				 n = new MDIMedicamentos();
				dispose();
			}else{
				JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecto");
			}
			
			}
		});
		GridBagConstraints gbc_btnIngresar = new GridBagConstraints();
		gbc_btnIngresar.insets = new Insets(0, 0, 0, 5);
		gbc_btnIngresar.gridx = 2;
		gbc_btnIngresar.gridy = 7;
		contentPane.add(btnIngresar, gbc_btnIngresar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.gridx = 4;
		gbc_btnSalir.gridy = 7;
		contentPane.add(btnSalir, gbc_btnSalir);
	}
}
