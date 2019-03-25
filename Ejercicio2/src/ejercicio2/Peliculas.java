package ejercicio2;

public class Peliculas {
	
	private String titulo;
	private int duracion;
	private int anyo;
	
	public Peliculas() {
		titulo = "";
		duracion = 0;
		anyo = 0;
	}
	
	public Peliculas(String t, int d, int a) {
		titulo = t;
		duracion = d;
		anyo = a;
	}
	
	public String getTitulo() { // Para devolver el titulo cuando es private, se usan los metodos
		return titulo;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public int getAnyo() {
		return anyo;
	}
	
	public void setDuracion(int d) {
		duracion = d;
	}
	
	public void setTitulo(String t) {
		titulo = t;
	}
	public void setAnyo(int a) {
		anyo = a;
	}
}
