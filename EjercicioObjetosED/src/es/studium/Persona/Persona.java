package es.studium.Persona;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private int telefono;
	
	
	public Persona() {
		nombre = "";
		apellidos="";
		dni="";
		direccion="";
		telefono=0;		
		
	}
	
	public Persona(String n, String a, String d, String dir, int t) {
		nombre = n;
		apellidos=a;
		dni=d;
		direccion=dir;
		telefono=t;		
		
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos (String a) {
		apellidos = a;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public void setDni (String d) {
		dni = d;
	}
	public String getDni() {
		return dni;
	}
	
	public void setDireccion(String dir) {
		direccion=dir;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public void setTelefono(int t) {
		telefono = t;
	}
	public int getTelefono() {
		return telefono;
	}
}
