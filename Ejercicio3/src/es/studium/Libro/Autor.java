package es.studium.Libro;

public class Autor {
	
	private String nombre;
	private String apellidos;
	private String nacionalidad;
	

	public Autor() {
		nombre = "";
		apellidos="";
		nacionalidad="";
	}

	public Autor(String n, String a, String na) {
		nombre = n;
		apellidos=a;
		nacionalidad=na;
	}

	public void setNombre(String n) {
		nombre = n;
	}
	public String getNombre() {
		return nombre;
	}

	public void setApellidos (String a) {
		apellidos = a;
	}
	public String getApellidos() {
		return apellidos;
	}

	public void setNacionalidad (String na) {
		nacionalidad = na;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}

} 
