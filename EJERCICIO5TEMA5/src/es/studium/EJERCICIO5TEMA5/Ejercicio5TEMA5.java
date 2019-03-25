package es.studium.EJERCICIO5TEMA5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio5TEMA5 {
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		String mes;
		System.out.println("Introduce mes: ");
		mes = lectura.readLine();
		diasDeMes(mes);
	}
	private static void diasDeMes(String nombreMes) {
		if(nombreMes.equals("Enero")) 
		{
			System.out.println(nombreMes+" "+"Tiene 31 días.");
		} 
		else if (nombreMes.equals("Febrero")) {
			System.out.println(nombreMes+" "+"Tiene 28 días.");
		}
		else if (nombreMes.equals("Marzo")) {
			System.out.println(nombreMes+" "+"Tiene 31 días.");
		}
		else if (nombreMes.equals("Abril")) {
			System.out.println(nombreMes+" "+"Tiene 30 días.");
		}
		else if (nombreMes.equals("Mayo")) {
			System.out.println(nombreMes+" "+"Tiene 31 días.");
		}
		else if (nombreMes.equals("Junio")) {
			System.out.println(nombreMes+" "+"Tiene 30 días.");
		}
		else if (nombreMes.equals("Julio")) {
			System.out.println(nombreMes+" "+"Tiene 31 días.");
		}
		else if (nombreMes.equals("Agosto")) {
			System.out.println(nombreMes+" "+"Tiene 31 días.");
		}
		else if (nombreMes.equals("Septiembre")) {
			System.out.println(nombreMes+" "+"Tiene 30 días.");
		}
		else if (nombreMes.equals("Octubre")) {
			System.out.println(nombreMes+" "+"Tiene 31 días.");
		}
		else if (nombreMes.equals("Noviembre")) {
			System.out.println(nombreMes+" "+"Tiene 30 días.");
		}
		else if (nombreMes.equals("Diciembre")) {
			System.out.println(nombreMes+" "+"Tiene 31 días.");
		}
		else 
		{
			System.out.println("Error");
		}
	}
}