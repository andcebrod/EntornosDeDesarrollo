package es.studium.Ejercicio6TEMA2;

public class Cliente {
	private String dni;
	private String nombre;
	private String direccion;
	
	public Cliente() 
	{
		dni = " ";
		nombre = " ";
		direccion = " ";
	}
	
	public Cliente(String d, String n, String di) 
	{
		dni = d;
		nombre = n;
		direccion = di;
	}
	
	public void setDni (String d) {
		dni = d;
	}
	
	public void setNombre (String n) {
		nombre = n;
	}
	public void setDireccion (String d) {
		direccion = d;
	}
	
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	
	

}
