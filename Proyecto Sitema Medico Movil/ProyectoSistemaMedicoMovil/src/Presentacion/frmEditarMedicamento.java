package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Color;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import Controller.DatosLogin;
import Encapsulamiento.TMedicamento;
import Negocio.NegocioFrmEditarMedicamento;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmEditarMedicamento extends JInternalFrame {
	private JTextField txtUsuario;
	private JTextField txtNombre;
	private JTextField txtPrecioCompra;
	private JTextField txtPrecioVenta;
	private JTextField txtFechaVencimiento;
	private JTextField txtCantidad;
	private JTable tablaDatos;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEditarMedicamento frame = new frmEditarMedicamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public frmEditarMedicamento() {
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameOpened(InternalFrameEvent evt) {
				formInternalFrameOpened(evt);
			}
		});
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 520, 523);
		getContentPane().setLayout(null);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDatos.setBounds(41, 11, 420, 202);
		getContentPane().add(panelDatos);
		GridBagLayout gbl_panelDatos = new GridBagLayout();
		gbl_panelDatos.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelDatos.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDatos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelDatos.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDatos.setLayout(gbl_panelDatos);
		
		JLabel lblUsuario = new JLabel("Usuario");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		panelDatos.add(lblUsuario, gbc_lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.gridx = 4;
		gbc_txtUsuario.gridy = 1;
		panelDatos.add(txtUsuario, gbc_txtUsuario);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 2;
		panelDatos.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.gridx = 4;
		gbc_txtNombre.gridy = 2;
		panelDatos.add(txtNombre, gbc_txtNombre);
		
		JLabel lblPrecioCompra = new JLabel("PrecioCompra");
		GridBagConstraints gbc_lblPrecioCompra = new GridBagConstraints();
		gbc_lblPrecioCompra.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioCompra.gridx = 2;
		gbc_lblPrecioCompra.gridy = 3;
		panelDatos.add(lblPrecioCompra, gbc_lblPrecioCompra);
		
		txtPrecioCompra = new JTextField();
		txtPrecioCompra.setColumns(10);
		GridBagConstraints gbc_txtPrecioCompra = new GridBagConstraints();
		gbc_txtPrecioCompra.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioCompra.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrecioCompra.gridx = 4;
		gbc_txtPrecioCompra.gridy = 3;
		panelDatos.add(txtPrecioCompra, gbc_txtPrecioCompra);
		
		JLabel lblPrecioVenta = new JLabel("PrecioVenta");
		GridBagConstraints gbc_lblPrecioVenta = new GridBagConstraints();
		gbc_lblPrecioVenta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioVenta.gridx = 2;
		gbc_lblPrecioVenta.gridy = 4;
		panelDatos.add(lblPrecioVenta, gbc_lblPrecioVenta);
		
		txtPrecioVenta = new JTextField();
		txtPrecioVenta.setColumns(10);
		GridBagConstraints gbc_txtPrecioVenta = new GridBagConstraints();
		gbc_txtPrecioVenta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPrecioVenta.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrecioVenta.gridx = 4;
		gbc_txtPrecioVenta.gridy = 4;
		panelDatos.add(txtPrecioVenta, gbc_txtPrecioVenta);
		
		JLabel lblFechaVencimiento = new JLabel("FechaVencimiento");
		GridBagConstraints gbc_lblFechaVencimiento = new GridBagConstraints();
		gbc_lblFechaVencimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaVencimiento.gridx = 2;
		gbc_lblFechaVencimiento.gridy = 5;
		panelDatos.add(lblFechaVencimiento, gbc_lblFechaVencimiento);
		
		txtFechaVencimiento = new JTextField();
		txtFechaVencimiento.setColumns(10);
		GridBagConstraints gbc_txtFechaVencimiento = new GridBagConstraints();
		gbc_txtFechaVencimiento.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFechaVencimiento.insets = new Insets(0, 0, 5, 0);
		gbc_txtFechaVencimiento.gridx = 4;
		gbc_txtFechaVencimiento.gridy = 5;
		panelDatos.add(txtFechaVencimiento, gbc_txtFechaVencimiento);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		GridBagConstraints gbc_lblCantidad = new GridBagConstraints();
		gbc_lblCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lblCantidad.gridx = 2;
		gbc_lblCantidad.gridy = 6;
		panelDatos.add(lblCantidad, gbc_lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		GridBagConstraints gbc_txtCantidad = new GridBagConstraints();
		gbc_txtCantidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCantidad.gridx = 4;
		gbc_txtCantidad.gridy = 6;
		panelDatos.add(txtCantidad, gbc_txtCantidad);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnEditarActionPerformed(evt);
			}
		});
		btnEditar.setBounds(145, 240, 89, 23);
		getContentPane().add(btnEditar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
                btnSalirActionPerformed(evt);
			}
		});
		btnSalir.setBounds(257, 240, 89, 23);
		getContentPane().add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 274, 440, 193);
		getContentPane().add(scrollPane);
		
		tablaDatos = new JTable();
		tablaDatos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"CodMedicamento", "Usuario", "Nombre", "PrecioCompra", "PrecioVenta", "Fecha Vencimiento", "Cantidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tablaDatos);

	}
	
	private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
        txtUsuario.setText(new DatosLogin().GetUsuario());
        
        List<TMedicamento> listaTMedicamento=NegocioFrmEditarMedicamento.GetByAll();
        
        DefaultTableModel modeloTabla=(DefaultTableModel)tablaDatos.getModel();
        
        for (TMedicamento tMedicamento : listaTMedicamento) 
        {
            Object[] datosFila=
            {
            		tMedicamento.getCodMedicamento(),
            		tMedicamento.getUsuario(),
            		tMedicamento.getNombre(),
            		tMedicamento.getPrecioCompra(),
            		tMedicamento.getPrecioVenta(),
            		tMedicamento.getFechaVencimiento(),
            		tMedicamento.getCantidad()
            };
            
            modeloTabla.addRow(datosFila);
        }
        
        tablaDatos.setModel(modeloTabla);
    }
	
	   private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
	        dispose();
	    }
	
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {
        if(tablaDatos.getSelectedRowCount()==0)
        {
            JOptionPane.showMessageDialog(this, "Seleccione registro en la tabla");
            return;
        }
        TMedicamento tMedicamento=new TMedicamento();
        
        tMedicamento.setCodMedicamento(tablaDatos.getValueAt(tablaDatos.getSelectedRow(), 0).toString());
        tMedicamento.setUsuario(txtUsuario.getText());
        tMedicamento.setNombre(txtNombre.getText());
        tMedicamento.setPrecioCompra(Float.parseFloat(txtPrecioCompra.getText()));
        tMedicamento.setPrecioVenta(Float.parseFloat(txtPrecioVenta.getText()));
        tMedicamento.setFechaVencimiento(txtFechaVencimiento.getText());
        tMedicamento.setCantidad(Integer.parseInt(txtCantidad.getText()));
        
        if(NegocioFrmEditarMedicamento.GetByNombre(tMedicamento.getNombre())!=null)
        {
            JOptionPane.showMessageDialog(this, "Producto Existente. Cambie el nombre");
            return;
        }
        
        if(NegocioFrmEditarMedicamento.UpdateAll(tMedicamento)>0)
        {
            JOptionPane.showMessageDialog(this, "Producto Modificado Correctamente");
        }
	
    }
}