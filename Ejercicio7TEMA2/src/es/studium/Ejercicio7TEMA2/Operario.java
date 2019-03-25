package es.studium.Ejercicio7TEMA2;

public class Operario {
	
	private int codOperario;
	private String nombreOperario;
	
	public Operario()
	{
		codOperario = 0;
		nombreOperario = "";
	}
	public Operario(int c,  String n) {
		nombreOperario = n;
		codOperario = c;
	}

}
