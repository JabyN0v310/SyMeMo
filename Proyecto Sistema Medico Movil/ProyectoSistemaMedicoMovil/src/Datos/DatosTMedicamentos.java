package Datos;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;

import Encapsulamiento.TMedicamento;

public class DatosTMedicamentos {

	//Insertar
    public static void InsertAll(Connection conexion, TMedicamento tMedicamento) throws Exception
    {
    	
        try
        {
        	//Preparamos la sentecia del procedimiento almacenado sprInsertMedicamento que es para insertar medicamento en la base de datos
            CallableStatement statement=(CallableStatement) conexion.prepareCall("{call sprInsertTMedicamento(?,?,?,?,?,?)}");
        // le asignamos el parametro al procedimiento almacenado
            statement.setString("inUsuario", tMedicamento.getUsuario());
            statement.setString("inNombre", tMedicamento.getNombre());
            statement.setFloat("inPrecioCompra", tMedicamento.getPrecioCompra());
            statement.setFloat("inPrecioVenta", tMedicamento.getPrecioVenta());
            statement.setString("inFechaVencimiento", tMedicamento.getFechaVencimiento());
            statement.setInt("inCantidad", tMedicamento.getCantidad());
            //sentencia que esta ejecuta la consulta
            statement.execute();
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
    	
   
    } 
	
    //actualizar
    public static int UpdateAll (Connection conexion, TMedicamento tMedicamento) throws Exception
    {
        int filasAfectadas=0;
       
        try
        {
        CallableStatement statement=(CallableStatement) conexion.prepareCall("{call sprUpdateAllTMedicamento(?,?,?,?,?,?,?)}");
        
        statement.setString("inCodMedicamento", tMedicamento.getCodMedicamento());
        statement.setString("inUsuario", tMedicamento.getUsuario());
        statement.setString("inNombre", tMedicamento.getNombre());
        statement.setFloat("inPrecioCompra", tMedicamento.getPrecioCompra());
        statement.setFloat("inPrecioVenta", tMedicamento.getPrecioVenta());
        statement.setString("inFechaVencimiento", tMedicamento.getFechaVencimiento());
        statement.setInt("inCantidad", tMedicamento.getCantidad());

        filasAfectadas=statement.executeUpdate();
        } catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
        finally
        {
            return filasAfectadas;
        }
    	
    }

    //leer
    //retona una lista <TProducto
    public static List<TMedicamento> GetAll(Connection conexion) throws Exception
    {
        List<TMedicamento> listaTMedicamento=new ArrayList<TMedicamento>();
        
        try
        {
            CallableStatement statement=(CallableStatement) conexion.prepareCall("{call sprGetAllTMedicamento()}");
            
            ResultSet resultSet=statement.executeQuery();
            //mientras exista un registro va a entrar al bucle para intentar recuperar el ResultSet
            while(resultSet.next())
            {
                TMedicamento tMedicamento=new TMedicamento
                        (
                        resultSet.getString("CodMedicamento"), 
                        resultSet.getString("Usuario"), 
                        resultSet.getString("Nombre"), 
                        resultSet.getFloat("PrecioCompra"), 
                        resultSet.getFloat("PrecioVenta"), 
                        resultSet.getString("FechaVencimiento"), 
                        resultSet.getInt("Cantidad")
                        );
            //se van agregando a una lista    
                listaTMedicamento.add(tMedicamento);
            
            }
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
        finally
        {
            return listaTMedicamento;
        }
    }
    
    //
    public static TMedicamento GetByNombre(Connection conexion, String nombre) throws Exception
    {
        TMedicamento tMedicamento=null;
        
        try
        {
            CallableStatement statement=(CallableStatement) conexion.prepareCall("{call sprGetByNombre(?)}");
            
            statement.setString("inNombre", nombre);
            
            ResultSet resultSet=statement.executeQuery();
            
            //el nombre es unico y va retornar un registro
            if(resultSet.next())
            {
                tMedicamento=new TMedicamento
                        (
                        resultSet.getString("CodMedicamento"), 
                        resultSet.getString("Usuario"), 
                        resultSet.getString("Nombre"), 
                        resultSet.getFloat("PrecioCompra"), 
                        resultSet.getFloat("PrecioVenta"), 
                        resultSet.getString("FechaVencimiento"), 
                        resultSet.getInt("Cantidad")
                        );
            }
        }
        catch(Exception ex)
        {
            throw new Exception(ex.getMessage());
        }
        finally
        {
            return tMedicamento;
        }
    }
    
}
