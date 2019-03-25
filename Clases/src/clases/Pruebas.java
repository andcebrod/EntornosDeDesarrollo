package clases;


public class Pruebas {

	public static void main(String[] args) {
		Alumno pepe = new Alumno("Pepe", "Paco", 30, true);
		Alumno jose = new Alumno("José", "Pérez", 24, false);
		Aula dam = new Aula("Desarrollo de Aplicaciones Multiplataforma", 20);
		Aula daw = new Aula("Desarrollo de Aplicaciones Web", 30);
		
		
		System.out.println(daw.capacidad);
	}

}
