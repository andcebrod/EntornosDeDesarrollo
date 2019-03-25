package es.studium.EdEjercicio3;
public class EdEjercicio3 {
	public static void main(String[] args) {
		String mensaje = "El bucle se ha ejecutado: ";
		int contador = 1;
		while (contador < 100) 
		{
			contador++;
			System.out.println(mensaje + contador + " veces");
		}
	}
}
