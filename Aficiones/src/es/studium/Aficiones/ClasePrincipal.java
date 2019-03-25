package es.studium.Aficiones;

public class ClasePrincipal {
	public static void main(String[] args) {
		aficiones aficiones = new aficiones();
		modelo modelo = new modelo();
		
		new controlador(aficiones, modelo);
	}
}
