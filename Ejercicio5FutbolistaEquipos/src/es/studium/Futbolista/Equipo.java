package es.studium.Futbolista;

public class Equipo 
{
	
	private String nombre;
	private int anyoDeFundacion;
	private int numeroDeSocios;
	
	public Equipo() 
	{
		nombre=" ";
		anyoDeFundacion=0;
		numeroDeSocios=0;
	}
	
	public Equipo(String n, int a, int nu) 
	{
		nombre=n;
		anyoDeFundacion=a;
		numeroDeSocios=nu;
	}
	
	public void setNombre(String n) 
	{
		nombre=n;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setAnyoDeFundacion(int a) 
	{
		anyoDeFundacion=a;
	}
	
	public int getAnyoDeFundacion() 
	{
		return anyoDeFundacion;
	}
	
	public void setNumeroDeSocios(int n) 
	{
		numeroDeSocios=n;
	}
	
	public int getNumeroDeSocios() 
	{
		return numeroDeSocios;
	}


}
