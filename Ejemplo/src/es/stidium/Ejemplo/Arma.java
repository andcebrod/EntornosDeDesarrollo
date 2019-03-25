package es.stidium.Ejemplo;

public class Arma {
	private String nombre;
	private int poder;
	
	public Arma() {
		nombre = "";
		poder = 0;
	}
	
	public Arma(String n, int p) {
		nombre = n;
		poder = p;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setPoder(int p) {
		poder = p;
	}
	public int getPoder() {
		return poder;
	}
	
}
