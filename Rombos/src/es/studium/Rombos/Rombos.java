package es.studium.Rombos;

public class Rombos {

	public static void main(String[] args) 

	{
		int filas = 4;
		for(int i = 1; i < filas; i++) {
			for(int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			for(int k = 1; i < filas; k++) 
			{

			}
			System.out.println("");
		}
		for (int i=1;i<=filas;i++) 
		{
			System.out.print("*");
		}
		System.out.println("");

		for(int i = 1; i < filas; i++) {
			for(int j = filas; j > i; j--) 
			{
				System.out.print("*");
			}
			for(int k = filas; k > i; k--) 
			{

			}
			System.out.println("");
		}
	}

}
