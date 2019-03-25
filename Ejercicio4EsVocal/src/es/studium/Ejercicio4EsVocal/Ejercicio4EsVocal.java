package es.studium.Ejercicio4EsVocal;

import java.io.IOException;

public class Ejercicio4EsVocal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(esVocal("as"));
	}
	public static String esVocal(String entrada) throws IOException{
		if(entrada.length() != 1) {
			return "No has introducido un �nico car�cter.";
		} else {
			char letra = entrada.charAt(0);
			if(!Character.isLetter(letra)) {
				return "El car�cter no es una letra.";
			} else if("aeiouAEIOU����������".indexOf(Character.toString(letra)) >= 0) {
				return "El car�cter es una vocal.";
			} else if(letra == 'y') {
				return "El car�cter a veces es una vocal y a veces es una consonante.";
			} else {
				return "El car�cter es una consonante.";
			}
		}
	}
}
