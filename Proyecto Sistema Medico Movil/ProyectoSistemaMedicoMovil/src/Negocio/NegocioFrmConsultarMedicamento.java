package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import Conexion.ConexionDB;
import Datos.DatosTMedicamentos;
import Encapsulamiento.TMedicamento;

public class NegocioFrmConsultarMedicamento extends ConexionDB {
	
	 public static List<TMedicamento> GetByAll()
	    {
		 List<TMedicamento> listaTProducto=new ArrayList<TMedicamento>();
	        Connection conexion=Conexion();
	        
	        try
	        {
	            conexion.setAutoCommit(false);
	            
	            listaTProducto=DatosTMedicamentos.GetAll(conexion);
	            
	            conexion.commit();
	        }
	        catch(Exception ex)
	        {
	            conexion.rollback();
	            JOptionPane.showMessageDialog(null, ex.getMessage());
	        }
	        finally
	        {
	            return listaTProducto;
	        }
	    }
}
