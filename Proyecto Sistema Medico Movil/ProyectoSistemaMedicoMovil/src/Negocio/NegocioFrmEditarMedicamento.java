package Negocio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

import Conexion.ConexionDB;
import Datos.DatosTMedicamentos;
import Encapsulamiento.TMedicamento;

public class NegocioFrmEditarMedicamento extends ConexionDB{

	public static int UpdateAll(TMedicamento tMedicamento)
    {
        int filasAfectadas=0;
        Connection conexion=Conexion();
        
        try
        {
            conexion.setAutoCommit(false);
            
            filasAfectadas=DatosTMedicamentos.UpdateAll(conexion, tMedicamento);
            
            conexion.commit();
        }  catch(Exception ex){
            conexion.rollback();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        finally{
            return filasAfectadas;
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
        
        public static List<TMedicamento> GetByAll()
        {
            List<TMedicamento> listaTMedicamento=new ArrayList<TMedicamento>();
            Connection conexion=Conexion();
            
            try
            {
                conexion.setAutoCommit(false);
                
                listaTMedicamento=DatosTMedicamentos.GetAll(conexion);
                
                conexion.commit();
            }
            catch(Exception ex)
            {
                conexion.rollback();
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            finally
            {
                return listaTMedicamento;
            }
        
        }	
}
