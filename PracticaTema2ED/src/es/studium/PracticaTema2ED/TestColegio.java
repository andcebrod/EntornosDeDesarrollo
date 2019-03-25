package es.studium.PracticaTema2ED;

public class TestColegio {

	public static void main(String[] args) {
		
		Colegio c1 = new Colegio ("Escuela de Ingl�s", "Reyes Cat�licos, 14", 1);
		Colegio c2 = new Colegio ("Escuela de franc�s ","Crist�bal Col�n, 92", 2);
		
		Asignatura ib1 = new Asignatura ("Ingl�s B1", 1, 5);
		Asignatura ib2 = new Asignatura ("Ingl�s B2",2, 4);
		Asignatura fa2 = new Asignatura ("Franc�s A2",3, 3);
		Asignatura fb1 = new Asignatura ("FRANC�S B1",4, 5);
		
		Persona p1 = new Persona ("Ana Abel","Paseo de Am�rica, 15", c1);
		Persona p2 = new Persona ("Benito Bueno","Reyes Cat�licos, 16", c1);
		Persona p3 = new Persona ("Carmen Cano","Reyes Cat�licos, 2", c1);
		Persona p4 = new Persona ("Esteban Escalera","Isabel la Cat�lica, 28", c2);
		Persona p5 = new Persona ("Francisco Farf�n","Crist�bal Col�n, s/n", c2);
		
		Matricula m1 = new Matricula (p1,ib1, 1,7);
		Matricula m2 = new Matricula (p2, ib2, 2, 6);
		Matricula m3 = new Matricula (p3, ib1, 3, 5);
		Matricula m4 = new Matricula (p4, fb1,4,9);
		Matricula m5 = new Matricula (p5, fa2,5,8.5);
		
		// Mostrar por pantalla las direcciones de todos los centros;
		System.out.println(c1.getDireccion());
		System.out.println(c2.getDireccion());
		
		// Mostrar por pantalla la direcci�n del centro en el que est� matriculada Carmen
		System.out.println(p3.getColegio().getDireccion());
		
		// Mostrar por pantalla la nota que Benito ha sacado en el B2.
		
		System.out.println(m2.getNota());


	}

}
