package Controller;

public class DatosLogin {
    public static String usuario;
    
    public void SetUsuario(String nombreUsuario)
    {
        usuario=nombreUsuario;
    }
    
    public String GetUsuario()
    {
        return usuario;
    }
}
