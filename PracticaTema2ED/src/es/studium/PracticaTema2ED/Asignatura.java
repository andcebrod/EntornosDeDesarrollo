package es.studium.PracticaTema2ED;

public class Asignatura {
	private String nombre;
	private int codAsignatura;
	private int horas;
	
	public Asignatura() {
		nombre = "";
		codAsignatura = 0;
		horas = 0;
	}
	public Asignatura(String n, int c, int h) {
		nombre = n;
		codAsignatura = c;
		horas = h;
	}
	
	public void setNombre (String n) {
		nombre = n;
	}
	public void setDireccion (int c) {
		codAsignatura = c;
	}
	public void setHoras (int h) {
		horas = h;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getCodAsignatura() {
		return codAsignatura;
	}
	public int getHoras() {
		return horas;
	}
	

}
