package es.studium.Ejercicio4EsVocal;

import java.io.IOException;

public class Ejercicio4EsVocal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(esVocal("as"));
	}
	public static String esVocal(String entrada) throws IOException{
		if(entrada.length() != 1) {
			return "No has introducido un único carácter.";
		} else {
			char letra = entrada.charAt(0);
			if(!Character.isLetter(letra)) {
				return "El carácter no es una letra.";
			} else if("aeiouAEIOUáéíóúÁÉÍÓÚ".indexOf(Character.toString(letra)) >= 0) {
				return "El carácter es una vocal.";
			} else if(letra == 'y') {
				return "El carácter a veces es una vocal y a veces es una consonante.";
			} else {
				return "El carácter es una consonante.";
			}
		}
	}
}
