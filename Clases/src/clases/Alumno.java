package clases;

public class Alumno {
	
	String nombre;
	String apellido;
	int edad;
	boolean haPagado;
	
	public Alumno(){
		nombre = "";
		apellido = "";
		edad = 0;
		haPagado = true;
	}
	public Alumno(String n, String a, int e, boolean h){
		nombre = n;
		apellido = a;
		edad = e;
		haPagado = h;
	}
}
