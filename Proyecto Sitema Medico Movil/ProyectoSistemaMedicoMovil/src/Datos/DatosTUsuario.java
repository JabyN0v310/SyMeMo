package Datos;

import java.sql.ResultSet;

import Encapsulamiento.TUsuario;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;

public class DatosTUsuario {
	static TUsuario tUsuario;
	public static TUsuario GetByUsuarioContrasenia(Connection conexion,String usuario,String contrasenia) throws Exception{
		 tUsuario =null;
		try{
			
			CallableStatement statement =(CallableStatement) conexion.prepareCall("{call sprGetUsuarioContrasenia(?,?)}");
			statement.setString("inUsuario",usuario);
			statement.setString("inContrasenia",contrasenia);
			
			ResultSet resultSet=statement.executeQuery();
			if(resultSet.next()){
				tUsuario =new TUsuario(resultSet.getString("Usuario"),
						resultSet.getString("Contrasenia"), resultSet.getString("Nombre"), 
						resultSet.getString("ApellidoPaterno"), resultSet.getString("ApellidoMaterno"),
						resultSet.getString("FechaNacimiento"));
			
			}
		}catch(Exception e){
			throw new Exception(e.getMessage());
		}finally{
			return tUsuario;
		}
		
	}
	
}
