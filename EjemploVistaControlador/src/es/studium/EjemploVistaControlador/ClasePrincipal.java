package es.studium.EjemploVistaControlador;
public class ClasePrincipal 
{
	public static void main(String[] args) 
	{
		ClaseVista Ejemplo = new ClaseVista();
		ClaseModelo Modelo = new ClaseModelo();
		new ClaseControlador(Ejemplo,Modelo);
	}
}
