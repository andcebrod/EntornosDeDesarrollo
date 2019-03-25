package es.studium.Alumno;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean haPagado;
	private Aula aula;
	
	public Alumno() {
		
		nombre="";
		apellidos="";
		edad = 0;
		haPagado=false;
		aula= new Aula();
		
	}
	
public Alumno(String n, String a, int e, boolean h, Aula au) {
		
		nombre=n;
		apellidos=a;
		edad = e;
		haPagado=h;
		aula = au;
		
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
	
	public void setEdad (int e) {
		edad = e;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setHaPagado(boolean h) {
		haPagado = h;
	}
	public boolean getHaPagado() {
		return haPagado;
	}
	
	public void setAula(Aula a) {
		aula = a;
	}
	
	public Aula getAula() {
		return aula;
	}
}


