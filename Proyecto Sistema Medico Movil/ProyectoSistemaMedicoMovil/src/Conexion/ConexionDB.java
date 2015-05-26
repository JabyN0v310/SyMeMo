package Conexion;

import java.sql.DriverManager;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;

public class ConexionDB {

	public static Connection Conexion(){
		Connection conexion = null;
		
		try{
			//Controlador
			Class.forName("com.mysql.jdbc.Driver");
			String servidor="jdbc:mysql://localhost/dbconsultorio";
			String usuario="root";
			String contrasenia="root";
			conexion = (Connection) DriverManager.getConnection(servidor,usuario,contrasenia);
		}catch(ClassNotFoundException e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
			catch(MySQLDataException e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally{
			return conexion;
		}
	}
}
