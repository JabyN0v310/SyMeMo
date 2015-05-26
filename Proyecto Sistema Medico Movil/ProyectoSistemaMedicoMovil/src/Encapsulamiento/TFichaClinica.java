package Encapsulamiento;
//Falta terminas clases
public class TFichaClinica 
{
   public TFichaClinica()
   {	   
   }
   
   public void antPatologicos()
   {
	 AntPatologicos antpatologicos=new AntPatologicos();
   }
   public void antNoPatologicos()
   {
	   AntNoPatologicos antnopatologicos=new AntNoPatologicos();
   }
   public void antHeredoFamiliares()
   {
   }
   public void antTraumaticos()
   {
   }
   public void esquemaInmunologico()
   {
   }
   public void tipoSangre()
   {
   }
   public void Intervenciones()
   {
   }

}


class AntPatologicos
{
	String enfermedad,fecha;
 	public void setEnfermedad(String enfermedad)
 	{
 		this.enfermedad=enfermedad;
 	}
 	public String getEnfermedad()
 	{
 		return this.enfermedad;
 	}
}

class AntNoPatologicos
{
	String drogas,activiDeportivas,hobbies;
	boolean fuma,toma,consumeDrogas;
    public void setFuma(boolean fuma)
    {
    	this.fuma=fuma;
    }
    public boolean getFuma()
    {
    	return this.fuma;
    }
    public void setToma(boolean toma)
    {
    	this.toma=toma;
    }
    public boolean getToma()
    {
    	return this.toma;
    }
    public void setConsumaDrogas(boolean consumeDrogas)
    {
    	this.consumeDrogas=consumeDrogas;
    }
    public boolean getConsumeDrogas()
    {
    	return this.consumeDrogas;
    }
    
    public void setActiviDeportivas(String activiDeportivas)
    {
    	this.activiDeportivas=activiDeportivas;
    }
    public String getActiviDeportivas()
    {
    	return this.activiDeportivas;
    }
    public void setHobbies(String hobbies)
    {
    	this.hobbies=hobbies;
    }
    public String getHobbies()
    {
    	return this.hobbies;
    }
    public void setDrogas(String drogas)
    {
    	this.drogas=drogas;
    }
    public String getDrogas()
    {
    	return this.drogas;
    }
}

class AntHeredoFamiliares 
{
	
}



