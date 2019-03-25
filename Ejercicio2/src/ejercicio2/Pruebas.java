package ejercicio2;

public class Pruebas {

	public static void main(String[] args) {
		
		Peliculas p1 = new Peliculas ("Venom",2018,90);
		Peliculas p2 = new Peliculas ("El Renacido",2014,120);
		Peliculas p3 = new Peliculas ("Spiderman 3",2012,130);
		p3.setTitulo("Spiderman 1");
		System.out.println(p3.getTitulo());
		
	}

}
