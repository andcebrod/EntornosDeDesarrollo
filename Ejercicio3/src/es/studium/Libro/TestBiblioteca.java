package es.studium.Libro;

public class TestBiblioteca {

	public static void main(String[] args) {
		
		Autor a1 = new Autor();
		Autor a2 = new Autor();
		Autor a3 = new Autor();
		
		Libro l1 = new Libro();
		Libro l2 = new Libro();
		Libro l3 = new Libro();
		
		a1.setNombre("Dan");
		a1.setApellidos("Brown");
		a1.setNacionalidad("Norteamericana");
		
		a2.setNombre("JK");
		a2.setApellidos("Rowling");
		a2.setNacionalidad("Inglesa");
		
		a3.setNombre("Nacho");
		a3.setApellidos("Carretero");
		a3.setNacionalidad("Española");
		
		l1.setTitulo("Angeles y demonios");
		l1.setAutor(a1);
		l1.setAnyoDePublicacion(2012);
		l1.setEditorial("Anaya");
		l1.setNumeroDePaginas(500);
		
		l2.setTitulo("HP y la piedra Filosofal");
		l2.setAutor(a2);
		l2.setAnyoDePublicacion(1997);
		l2.setEditorial("Santillana");
		l2.setNumeroDePaginas(200);
		
		l3.setTitulo("Fariña");
		l3.setAutor(a3);
		l3.setAnyoDePublicacion(2017);
		l3.setEditorial("Circulo de Lectores");
		l3.setNumeroDePaginas(512);
		
		System.out.println(l1.getTitulo()+" tiene "+l1.getNumeroDePaginas()+" páginas." );
		System.out.println(l2.getTitulo()+" tiene "+l2.getNumeroDePaginas()+" páginas." );
		System.out.println(l3.getTitulo()+" tiene "+l3.getNumeroDePaginas()+" páginas." );

	}
	
	

}
