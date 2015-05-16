package Encapsulamiento;

public class TUsuario {
	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String fechaNacimiento;
	
	public TUsuario(){
		
	}
	public TUsuario(String usuario,String contrasenia,String nombre,String apellidoPaterno,String apellidoMaterno,String fechaNacimiento){
		this.usuario =usuario;
		this.contrasenia=contrasenia;
		this.nombre=nombre;
		this.apellidoPaterno=apellidoPaterno;
		this.apellidoMaterno=apellidoMaterno;
		this.fechaNacimiento=fechaNacimiento;
	}
	public void setUsuario(String usuario){
		this.usuario=usuario;
	}
	public String getUsuario(){
		return usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
