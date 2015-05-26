package Negocio;

import javax.swing.JOptionPane;

import Conexion.ConexionDB;
import Datos.DatosTUsuario;
import Encapsulamiento.TUsuario;

import com.mysql.jdbc.Connection;

public class NegocioFrmLogin {

	public static boolean Login(String usuario,String contrasenia){
		boolean existeUsuario=false;
		Connection conexion = ConexionDB.Conexion();
		
		try{
			conexion.setAutoCommit(false);
			TUsuario tUsuario =DatosTUsuario.GetByUsuarioContrasenia(conexion, usuario, contrasenia);
			
			if(tUsuario!=null){
				existeUsuario=true;
			}
			conexion.commit();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			conexion.rollback();
		}finally{
			
			return existeUsuario;
		
		}
	}
}
