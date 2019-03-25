package es.studium.Adivinador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Adivinador {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		boolean acertado = false;
		int tamanio;
		int mitad;
		int grande;
		int chico;
		String respuesta;
		System.out.println("Puedo adivinar el número que estás pensando. Dime cúal es el número más grande posible: ");
		tamanio = Integer.parseInt(lectura.readLine());
		grande = tamanio;
		mitad = tamanio/2;
		chico = 0;
		System.out.println("¿Es el número "+mitad+"?");
		respuesta = lectura.readLine();
		if (respuesta.equals("Sí"))
		{
			acertado = true;
		} else 
		{
			
			while (acertado == false) 
			{
				System.out.println("¿Es mayor que "+mitad+"?");
				respuesta = lectura.readLine();
				if(respuesta.equals("Sí")) 
				{
					chico = mitad;
					mitad = (chico+grande)/2;
					System.out.println("¿Es "+mitad+" tu número?");
					respuesta = lectura.readLine();
					if (respuesta.equals("Sí")) {
						acertado = true;
					} else {
						acertado = false;
					}
				} else {
					grande = mitad;
					mitad = (chico+grande)/2;
					System.out.println("¿Es "+mitad+" tu número?");
					respuesta = lectura.readLine();
					if (respuesta.equals("Sí")) {
						acertado = true;
					} else {
						acertado = false;
					}
				}
			}
		}
		
	}

}
