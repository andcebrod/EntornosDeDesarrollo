package es.studium.Monopoly;

public class Jugador {
	private String nombre;
	private int dineroActual;
	private Calle posicion;
	
	public Jugador() {
		nombre = "";
		dineroActual = 0;
		posicion = new Calle();
	}
	
	public Jugador(String n, int d, Calle p) {
		nombre = n;
		dineroActual = d;
		posicion = p;
	}
	public void setNombre(String n) {
		nombre = n;
	}
	public void setDineroActual(int da) {
		dineroActual = da;
	}
	public void setPosicion(Calle p) {
		posicion = p;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getDineroActual() {
		return dineroActual;
	}
	public Calle getPosicion() {
		return posicion;
	}

}
