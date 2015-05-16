package Encapsulamiento;

public class TDatosPersonales 
{
	//atributos
	
	String apellidoPaterno,apellidoMaterno,nombre,rfc,curp,fechaNacimiento,edad,estatura,peso,sexo;
	String ocupacion,estadoCivil,telParticular,telOficina,celular,email,calleNumero,colonia,ciudad,estado,pais,codigoPostal;
	//constructor
	public TDatosPersonales()
	{
		apellidoMaterno = "materno";
		apellidoPaterno = "paterno";
		nombre = "nombre alternativo";
		rfc="12345";
		curp="ASDJ1233CJSHS04";
		fechaNacimiento="dd/mm/aaaa";
		edad="00";
		estatura="0.00";
		peso="00.00";
		sexo="";
		ocupacion="algo";
		estadoCivil="";
		telParticular="00000000000";
		telOficina="0000000000";
		celular = "9876543210";
		email = "correo@algo.com";
		calleNumero = "direccion";
		colonia = "colonia";
		ciudad="";
		estado="";
		pais="";
		codigoPostal = "00000";
		
		
	}
	public TDatosPersonales(String ap, String am, String nombre)
	{
		this.apellidoPaterno = ( ap=="")?"llenar campo" : ap;
		this.apellidoMaterno = ( am=="")?"llenar campo" : am;
		this.nombre = ( nombre=="")?"llenar campo" : nombre;

	}
	
	//metodos
	public void setApellidoPaterno(String ap)
	{
		apellidoPaterno = ap;	
	}
	public String getApellidoPaterno()
	{
		return apellidoPaterno;	
	}
	
	public void setApellidoMaterno(String am)
	{
		this.apellidoMaterno = am;	
	}
	public String getApellidoMaterno()
	{
		return this.apellidoMaterno;	
	}
	
	public void setNombre(String nombre)
	{
		this.nombre= nombre;	
	}
	public String getNombre()
	{
		return this.nombre;	
	}
	
	public void setRfc(String rfc)
	{
		this.rfc= rfc;	
	}
	public String getRfc()
	{
		return this.rfc;	
	}
	
	public void setCurp(String curp)
	{
		this.curp= curp;	
	}
	public String getCurp()
	{
		return this.curp;	
	}
	
	public void setFechaNacimiento(String fn)
	{
		this.fechaNacimiento= fn;	
	}
	public String getFechaNacimiento()
	{
		return this.fechaNacimiento;	
	}
	
	public void setEdad(String edad)
	{
		this.edad= edad;	
	}
	public String getEdad()
	{
		return this.edad;	
	}
	
	public void setEstatura(String estatura)
	{
		this.estatura= estatura;	
	}
	public String getEstatura()
	{
		return this.estatura;	
	}
	
	public void setPeso(String peso)
	{
		this.peso= peso;	
	}
	public String getPeso()
	{
		return this.peso;	
	}
	
	public void setSexo(String sexo)
	{
		this.sexo= sexo;	
	}
	public String getSexo()
	{
		return this.sexo;	
	}
	
	public void setOcupacion(String ocupacion)
	{
		this.ocupacion= ocupacion;	
	}
	public String getOcupacion()
	{
		return this.ocupacion;	
	}
	
	public void setEstadoCivil(String ec)
	{
		this.estadoCivil= ec;	
	}
	public String getEstadoCivil()
	{
		return this.estadoCivil;	
	}
	
	public void setTelParticular(String tp)
	{
		this.telParticular= tp;	
	}
	public String getTelParticular()
	{
		return this.telParticular;	
	}
	
	public void setTelOficina(String to)
	{
		this.telOficina= to;	
	}
	public String getTelOficina()
	{
		return this.telOficina;	
	}
	
	public void setCelular(String celular)
	{
		this.celular= celular;	
	}
	public String getCelular()
	{
		return this.celular;	
	}
	
	public void setEmail(String email)
	{
		this.email= email;	
	}
	public String getEmail()
	{
		return this.email;	
	}
	
	public void setCalleNumero(String cn)
	{
		this.calleNumero= cn;	
	}
	public String getCalleNumero()
	{
		return this.calleNumero;	
	}
	
	public void setColonia(String colonia)
	{
		this.colonia= colonia;	
	}
	public String getColonia()
	{
		return this.colonia;	
	}
	
	public void setCiudad(String ciudad)
	{
		this.ciudad= ciudad;	
	}
	public String getCiudad()
	{
		return this.ciudad;	
	}
	
	public void setEstado(String estado)
	{
		this.estado= estado;	
	}
	public String getEstado()
	{
		return this.estado;	
	}
	
	public void setPais(String pais)
	{
		this.pais= pais;	
	}
	public String getPais()
	{
		return this.calleNumero;	
	}
	
	public void setCodigoPostal(String cp)
	{
		this.codigoPostal= cp;	
	}
	public String getCodigoPostal()
	{
		return this.codigoPostal;	
	}
}
