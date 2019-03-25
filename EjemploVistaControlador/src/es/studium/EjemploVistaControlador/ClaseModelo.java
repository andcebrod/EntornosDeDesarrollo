package es.studium.EjemploVistaControlador;
public class ClaseModelo {
	public String devolverPalabra(int numero) {
		if(numero==1){
			return "Programación";
		} else if (numero == 2) {
			return "Perro";
		} else if (numero == 3) {
			return "Insignia";
		} else if (numero == 4) {
			return "Numerable";
		} else if (numero == 5) {
			return "Automóvil";
		} else if (numero == 6) {
			return "ACL";
		} else if (numero == 7) {
			return "Decronomicon";
		} else {
			return "Error";
		}
	} 
	public String devolverNumero(String palabra) {
		if (palabra.equals("Programación")) {
			return "1";
		} else if(palabra.equals("Perro")) {
			return "2";
		} else if(palabra.equals("Insignia")) {
			return "3";
		}else if(palabra.equals("Numerable")) {
			return "4";
		} else if(palabra.equals("Automovil")) {
			return "5";
		} else if(palabra.equals("ACL")) {
			return "6";
		} else if(palabra.equals("Decronomicon")) {
			return "7";
		} else {
			return "0";
		}
	} 
}
