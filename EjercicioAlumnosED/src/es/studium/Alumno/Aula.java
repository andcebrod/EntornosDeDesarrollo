package es.studium.Alumno;

public class Aula {
	
	private String nombre;
	private int capacidad;
	
	public Aula(){
		nombre = "";
		capacidad = 0;
	}
	public Aula(String n, int c){
		nombre = n;
		capacidad = c;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setCapacidad(int c) {
		capacidad = c;
	}
	public int getCapacidad() {
		return capacidad;
	}
}
