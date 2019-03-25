package es.studium.EDT3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EDT3E2 {
	public static void main(String[] args) throws IOException {
		int numero;
		double resultado;
		BufferedReader lectura = new BufferedReader(new
				InputStreamReader(System.in));
		System.out.println("Dame un número:");
		numero= Integer.parseInt(lectura.readLine());
		resultado = funcionMagica(numero);
		System.out.println("El resultado obtenido es " +
				resultado);
	}
	public static double funcionMagica(int a) {
		double r;
		r = a/(((((((a*2.0)*5.0)*3.0)/2.0)/5.0)/3.0));
		return r;
	}
}
