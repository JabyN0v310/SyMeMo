package Negocio;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import Conexion.ConexionDB;
import Datos.DatosTMedicamentos;
import Encapsulamiento.TMedicamento;

public class NegocioFrmRegistrarMedicamento extends ConexionDB {

    public static boolean InsertAll(TMedicamento tMedicamento)
    {
    	boolean estadoOrdenSql=false;
        Connection conexion=Conexion();
        try
        {
            conexion.setAutoCommit(false);
            
            DatosTMedicamentos.InsertAll(conexion, tMedicamento);
            estadoOrdenSql=true;
            
            conexion.commit();
        }
        catch(Exception ex)
        {
            conexion.rollback();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally
        {
            return estadoOrdenSql;
        }
    }
    
    public static TMedicamento GetByNombre(String nombre)
    {
    	 TMedicamento tMedicamento=null;
         Connection conexion=Conexion();
         
         try
         {
             conexion.setAutoCommit(false);
             
             tMedicamento=DatosTMedicamentos.GetByNombre(conexion, nombre);
             
             conexion.commit();
         }
         catch(Exception ex)
         {
             conexion.rollback();
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
         finally
         {
             return tMedicamento;
         }
    }
	
}
