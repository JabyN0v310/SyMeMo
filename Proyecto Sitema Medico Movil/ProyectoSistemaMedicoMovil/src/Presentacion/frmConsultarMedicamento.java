package Presentacion;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Encapsulamiento.TMedicamento;
import Negocio.NegocioFrmConsultarMedicamento;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class frmConsultarMedicamento extends JInternalFrame {
	private JTable tablaDatos;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmConsultarMedicamento frame = new frmConsultarMedicamento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frmConsultarMedicamento() {
		addInternalFrameListener(new InternalFrameAdapter() {
			@Override
			public void internalFrameOpened(InternalFrameEvent evt) {
				formInternalFrameOpened(evt);
			}
		});
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 613, 342);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 11, 567, 227);
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
				"CodMedicamento", "Usuario", "Nombre", "PrecioCompra", "PrecioVenta", "FechaVencimiento", "Cantidad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(tablaDatos);

	}
	
	 private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
	        List<TMedicamento> listaTMedicamento=NegocioFrmConsultarMedicamento.GetByAll();
	        
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
	
}
