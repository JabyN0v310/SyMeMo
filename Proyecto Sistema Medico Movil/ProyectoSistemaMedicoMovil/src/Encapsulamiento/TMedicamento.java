package Encapsulamiento;

public class TMedicamento {

	private String codMedicamento;
	private String usuario;
	private String nombre;
	private float precioCompra;
	private float precioVenta;
	private String fechaVencimiento;
	private int cantidad;
	
	public TMedicamento(){
		
	}

	public TMedicamento(String codMedicamento, String usuario, String nombre,
			float precioCompra, float precioVenta, String fechaVencimiento,
			int cantidad) {
		super();
		this.codMedicamento = codMedicamento;
		this.usuario = usuario;
		this.nombre = nombre;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.fechaVencimiento = fechaVencimiento;
		this.cantidad = cantidad;
	}

	public String getCodMedicamento() {
		return codMedicamento;
	}

	public void setCodMedicamento(String codMedicamento) {
		this.codMedicamento = codMedicamento;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}

	public float getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
