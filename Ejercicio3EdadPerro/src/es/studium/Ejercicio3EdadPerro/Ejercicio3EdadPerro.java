package es.studium.Ejercicio3EdadPerro;

public class Ejercicio3EdadPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(edadPerro(1));
	}


	public static String edadPerro(int e) {
		double edad = 0;
		if(e < 0) {
			return "La edad debe ser un n�mero positivo.";
		} else if (e <= 2) {
			edad = e * 10.5;
			return "La edad es" + edad;
		} else {
			edad = 21 + (e - 2) * 4;
			return "La edad es " + edad;
		}
	}
}