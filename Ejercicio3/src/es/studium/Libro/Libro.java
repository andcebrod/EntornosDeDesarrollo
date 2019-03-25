package es.studium.Libro;

public class Libro {
	
	private String titulo;
	private Autor autor;
	private int anyoDePublicacion;
	private String editorial;
	private int numeroDePaginas;
	
	public Libro() {
		titulo="";
		autor= new Autor();
		anyoDePublicacion=0;
		editorial="";
		numeroDePaginas=0;
	}
	
	public Libro(String t, Autor a, int an, String e, int np) {
		titulo=t;
		autor=a;
		anyoDePublicacion=an;
		editorial=e;
		numeroDePaginas=np;
	}
	
	public void setTitulo(String t) {
		titulo = t;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor (Autor a) {
		autor = a;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAnyoDePublicacion(int an) {
		anyoDePublicacion = an;
	}
	
	public int getAnyoDePublicacion() {
		return anyoDePublicacion;
	}
	
	public void setEditorial(String e) {
		editorial = e;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setNumeroDePaginas(int np) {
		numeroDePaginas = np;
	}
	
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

}
