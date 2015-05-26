package Presentacion;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JList;

import java.awt.GridBagConstraints;

import javax.swing.AbstractListModel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MenuPrincipal extends JFrame {

	private JPanel contentPane;
	JList list;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MenuPrincipal() {
		setTitle("Menu_Opciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 409, 318);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		list = new JList();
		list.setToolTipText("Opciones");
		list.setBackground(new Color(255, 255, 255));
		list.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		list.setBounds(147, 61, 127, 166);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Pacientes", "Agenda", "Medicina","Registrar paciente"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(list.getSelectedIndex()==0){
					System.out.println("Seleccionastes Pacientes");
					
					list.clearSelection();
					 new MenuPaciente();
				}
				else if(list.getSelectedIndex()==1){
					System.out.println("Seleccionastes Agenda");
					
					
					list.clearSelection();
				}
				else if(list.getSelectedIndex()==2){
					System.out.println("Seleccionastes Medicinas");
					new MDIMedicamentos();
					list.clearSelection();
				}
				else if(list.getSelectedIndex()==3){
					System.out.println("Seleccionastes Registrar paciente");
					new ptnRegistroPaciente();
					list.clearSelection();
				}
				else{
					JOptionPane.showMessageDialog(null, "Selecciona un elemento de la lista","Alerta",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAceptar.setBounds(162, 256, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Login().setVisible(true);
				dispose();
			}
		});
		
		
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSalir.setBounds(260, 256, 89, 23);
		contentPane.add(btnSalir);
		
		
		JLabel lblBienvenidoDoctor = new JLabel("");
		lblBienvenidoDoctor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBienvenidoDoctor.setBounds(99, 0, 200, 50);
		contentPane.add(lblBienvenidoDoctor);
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 409, 319);
		contentPane.add(label);
		label.setIcon(new ImageIcon(Login.class.getResource("/img/Menu_Principal.png")));	
	setVisible(true);
	}
}
