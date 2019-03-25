package es.studium.PracticaTema2ED;

public class Persona {
	private String nombre;
	private String direccion;
	private Colegio colegio;	
	
	public Persona() {
		nombre = "";
		direccion = "";
		colegio = new Colegio();
	}
	public Persona(String n, String d, Colegio c) {
		nombre = n;
		direccion = d;
		colegio = c;

	}
	
	public void setNombre (String n) {
		nombre = n;
	}
	public void setDireccion (String d) {
		direccion = d;
	}
	public void setColegio (Colegio c) {
		colegio = c;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public Colegio getColegio() {
		return colegio;
	}

	
}
