package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import Controller.LimpiarComponentes;
import Encapsulamiento.TMedicamento;
import Negocio.NegocioFrmRegistrarMedicamento;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmRegistrarMedicamento extends JInternalFrame {
	private JTextField txtUsuario;
	private JTextField txtNombre;
	private JTextField txtPrecioCompra;
	private JTextField txtPrecioVenta;
	private JTextField txtFechaVencimiento;
	private JTextField txtCantidad;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRegistrarMedicamento frame = new frmRegistrarMedicamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public frmRegistrarMedicamento() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 491, 331);
		getContentPane().setLayout(null);
		
		final JPanel panelRegistrarDatos = new JPanel();
		panelRegistrarDatos.setBorder(new TitledBorder(null, "Registro", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelRegistrarDatos.setBounds(33, 24, 420, 202);
		getContentPane().add(panelRegistrarDatos);
		GridBagLayout gbl_panelRegistrarDatos = new GridBagLayout();
		gbl_panelRegistrarDatos.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelRegistrarDatos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelRegistrarDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelRegistrarDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelRegistrarDatos.setLayout(gbl_panelRegistrarDatos);
		
		JLabel lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		panelRegistrarDatos.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 4;
		gbc_txtUsuario.gridy = 1;
		panelRegistrarDatos.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 2;
		panelRegistrarDatos.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 2;
		panelRegistrarDatos.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblPreciocompra = new JLabel("PrecioCompra");
		GridBagConstraints gbc_lblPreciocompra = new GridBagConstraints();
		gbc_lblPreciocompra.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreciocompra.gridx = 2;
		gbc_lblPreciocompra.gridy = 3;
		panelRegistrarDatos.add(lblPreciocompra, gbc_lblPreciocompra);
		
		txtPrecioCompra = new JTextField();
		GridBagConstraints gbc_txtPrecioCompra = new GridBagConstraints();
		gbc_txtPrecioCompra.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrecioCompra.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioCompra.gridx = 4;
		gbc_txtPrecioCompra.gridy = 3;
		panelRegistrarDatos.add(txtPrecioCompra, gbc_txtPrecioCompra);
		txtPrecioCompra.setColumns(10);
		
		JLabel lblPrecioventa = new JLabel("PrecioVenta");
		GridBagConstraints gbc_lblPrecioventa = new GridBagConstraints();
		gbc_lblPrecioventa.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioventa.gridx = 2;
		gbc_lblPrecioventa.gridy = 4;
		panelRegistrarDatos.add(lblPrecioventa, gbc_lblPrecioventa);
		
		txtPrecioVenta = new JTextField();
		GridBagConstraints gbc_txtPrecioVenta = new GridBagConstraints();
		gbc_txtPrecioVenta.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrecioVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioVenta.gridx = 4;
		gbc_txtPrecioVenta.gridy = 4;
		panelRegistrarDatos.add(txtPrecioVenta, gbc_txtPrecioVenta);
		txtPrecioVenta.setColumns(10);
		
		JLabel lblFechavencimiento = new JLabel("FechaVencimiento");
		GridBagConstraints gbc_lblFechavencimiento = new GridBagConstraints();
		gbc_lblFechavencimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechavencimiento.gridx = 2;
		gbc_lblFechavencimiento.gridy = 5;
		panelRegistrarDatos.add(lblFechavencimiento, gbc_lblFechavencimiento);
		
		txtFechaVencimiento = new JTextField();
		GridBagConstraints gbc_txtFechaVencimiento = new GridBagConstraints();
		gbc_txtFechaVencimiento.insets = new Insets(0, 0, 5, 0);
		gbc_txtFechaVencimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaVencimiento.gridx = 4;
		gbc_txtFechaVencimiento.gridy = 5;
		panelRegistrarDatos.add(txtFechaVencimiento, gbc_txtFechaVencimiento);
		txtFechaVencimiento.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidad.gridx = 2;
		gbc_lblCantidad.gridy = 6;
		panelRegistrarDatos.add(lblCantidad, gbc_lblCantidad);
		
		txtCantidad = new JTextField();
		GridBagConstraints gbc_txtCantidad = new GridBagConstraints();
		gbc_txtCantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCantidad.gridx = 4;
		gbc_txtCantidad.gridy = 6;
		panelRegistrarDatos.add(txtCantidad, gbc_txtCantidad);
		txtCantidad.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				TMedicamento tMedicamento=new TMedicamento();
		        
				tMedicamento.setUsuario(txtUsuario.getText());
				tMedicamento.setNombre(txtNombre.getText());
				tMedicamento.setPrecioCompra(Float.parseFloat(txtPrecioCompra.getText()));
				tMedicamento.setPrecioVenta(Float.parseFloat(txtPrecioVenta.getText()));
				tMedicamento.setFechaVencimiento(txtFechaVencimiento.getText());
				tMedicamento.setCantidad(Integer.parseInt(txtCantidad.getText()));
		        
		        if(NegocioFrmRegistrarMedicamento.GetByNombre(tMedicamento.getNombre())!=null)
		        {
		            JOptionPane.showMessageDialog(null, "Producto Existente. No se puede registrar");
		            return;
		        }
		        
		        if(NegocioFrmRegistrarMedicamento.InsertAll(tMedicamento))
		        {
		            JOptionPane.showMessageDialog(null, "Producto Registrado Correctamente");
		            LimpiarComponentes.JTextField(panelRegistrarDatos);
		        }
			
		        //
			}
		});
		btnRegistrar.setBounds(99, 252, 89, 23);
		getContentPane().add(btnRegistrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(255, 252, 89, 23);
		getContentPane().add(btnSalir);

	}
}
