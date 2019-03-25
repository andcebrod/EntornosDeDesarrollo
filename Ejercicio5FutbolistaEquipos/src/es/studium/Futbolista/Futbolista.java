package es.studium.Futbolista;

public class Futbolista {
	
	private String nombre;
	private String apellido;
	private boolean comunitario;
	private Equipo equipo;
	
	public Futbolista() 
	{
		nombre="";
		apellido="";
		comunitario=false;
		equipo= new Equipo();
	}
	
	public Futbolista(String n,String a, boolean c, Equipo e) 
	{
		nombre=n;
		apellido=a;
		comunitario=c;
		equipo=e;
	}
	
	public void setNombre(String n) 
	{
		nombre = n;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	public void setApellido(String a) 
	{
		apellido = a;
	}
	
	public String getApellido()
	{
		return apellido;
	}
	
	public void setComunitario(boolean c) 
	{
		comunitario = c;
	}
	
	public boolean getComunitario()
	{
		return comunitario;
	}
	
	public void setEquipo(Equipo eq) 
	{
		equipo=eq;
	}
	
	public Equipo getEquipo()
	{
		return equipo;
	}
	

}
