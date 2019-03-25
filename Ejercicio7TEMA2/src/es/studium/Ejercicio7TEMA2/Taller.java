package es.studium.Ejercicio7TEMA2;

public class Taller {
	private int idTaller;
	private String nombreTaller;
	
	Taller()
	{
		idTaller = 0;
		nombreTaller = "";
	}
	
	Taller (int id, String n){
		idTaller = id;
		nombreTaller = n;
	}
	
	public void setIdTaller(int id) {
		idTaller = id;
	}
	
	public void setNombreTaller(String n) {
		nombreTaller = n;
	}
	
	
	

}
