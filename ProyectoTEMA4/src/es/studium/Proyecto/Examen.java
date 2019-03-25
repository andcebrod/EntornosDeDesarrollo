package es.studium.Proyecto;
public class Examen {
	 
	public static String mensaje (int edad) {
		switch (edad) {
			case 18:
				return "Ya eres mayor de edad";
				
			case 67:
				return "Ya puedes jubilarte";
				
			default:
				return "No pasa nada";
				
		}
	}
 
	public static boolean validar (String dni) {
		if (dni.length() > 9) {
			return true;
		} else {
			return false;
		}
	}
}