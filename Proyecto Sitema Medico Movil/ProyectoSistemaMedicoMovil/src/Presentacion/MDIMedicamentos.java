package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MDIMedicamentos {

	private JFrame frame;
	JDesktopPane desktopPane;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDIMedicamentos window = new MDIMedicamentos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/


	public MDIMedicamentos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
		desktopPane = new JDesktopPane();
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Inicio");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmRegistrar = new JMenuItem("Registrar");
		mntmRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frmRegistrarMedicamento venReg = new frmRegistrarMedicamento();
			desktopPane.add(venReg);
				venReg.show();
			}
		});
		mnArchivo.add(mntmRegistrar);
		
		JMenuItem mntmEditar = new JMenuItem("Editar");
		mntmEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmEditarMedicamento venEdi=new frmEditarMedicamento();
				desktopPane.add(venEdi);
				venEdi.show();
			}
		});
		mnArchivo.add(mntmEditar);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			frmConsultarMedicamento venCon=new frmConsultarMedicamento();
			desktopPane.add(venCon);
			venCon.show();
						}
		});
		mnArchivo.add(mntmConsultar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mnArchivo.add(mntmSalir);
		frame.setVisible(true);
	}
}
