package es.studium.Termometro;

public class ClasePrincipal {
	public static void main(String[] args) {
		ClaseVista termometro = new ClaseVista();
		ClaseModelo modelo = new ClaseModelo();
		new ClaseControlador(termometro,modelo);
	}
}
