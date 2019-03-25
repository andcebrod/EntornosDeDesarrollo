package es.studium.Persona;

public class Perro {
	
	private String nombre;
	private String raza;
	private int edad;
	private Persona dueno;
	
	public Perro() {
		nombre = "";
		raza ="";
		edad=0;
		dueno = new Persona();
	}
	
	public Perro(String n, String r, int e, Persona d) {
		nombre = n;
		raza =r;
		edad=e;
		dueno = d;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String r) {
		raza = r;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int e) {
		edad = e;
	}
	
	public Persona getDueno() {
		return dueno;
	}
	public void setDueno(Persona d) {
		dueno = d;
	}
	
}
