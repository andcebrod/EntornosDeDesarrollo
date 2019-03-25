package es.studium.Ejercicio2TEMA3;

public class Ejercicio2TEMA3 {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		int c = 8;
		int d, e;
		d = suma(a, b);
		e = multiplicar(b, c);
		for(int i = 0; i < 500; i++) 
		{
			a = i * 2 - e;
		}	
	}
	private static int multiplicar(int operador1, int operador2) 
	{
		int resultado = 0;
		for(int i = 0; i < operador2; i++) 
		{
			resultado = suma(resultado, operador1);
		}	
		return resultado;
	}
	private static int suma(int sumando1, int sumando2) 
	{
		int resultado = sumando1 + sumando2;
		return resultado;
	}
}
