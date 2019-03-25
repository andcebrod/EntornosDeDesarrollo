package es.stidium.Ejemplo;

public class ArmaConMunicion extends Arma {
	
	private int municion;
	
	
	public ArmaConMunicion() {
	
		super();
		municion = 0;
	}
	
	public ArmaConMunicion(String n, int m, int p) {
		super(n,p);
		municion = m;
	
	}
	
	public void setMunicion(int m) {
		municion = m;
	}
	
	public int getMunicion() {
		return municion;
	}
	

}
