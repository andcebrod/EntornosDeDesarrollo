package es.stidium.Ejemplo;

public class Zombie {
	
	private int salud;
	String nombre;
	
	public Zombie() {
		salud=0;
		nombre = " ";
	}
	public Zombie(int s,String n) {
		salud = s;
		nombre = n;
	}
	
	public void setSalud(int s) {
		salud = s;
	}
	public int getSalud() {
		return salud;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	public String getNombre() {
		return nombre;
	}

}
