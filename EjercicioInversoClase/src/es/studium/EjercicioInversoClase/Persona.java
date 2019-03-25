package es.studium.EjercicioInversoClase;

public class Persona {
	
	private String nombre;
	private String clase;
	private int salud;
	private Arma arma;
	
	public Persona() {
		nombre="";
		clase="";
		salud=100;
		arma=new Arma();
	}
	
	public Persona(String n, String c, int s, Arma ar) {
		nombre=n;
		clase=c;
		salud=s;
		arma=ar;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	public void setClase(String c) {
		clase=c;
	}
	public void setSalud(int s) {
		salud=s;
	}
	public void setArma(Arma ar) {
		arma=ar;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public String getClase() {
		return clase;
	}
	public int getSalud() {
		return salud;
	}
	public Arma getArma() {
		return arma;
	}
}
