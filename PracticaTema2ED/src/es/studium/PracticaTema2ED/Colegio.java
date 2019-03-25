package es.studium.PracticaTema2ED;

public class Colegio {
	private String nombre;
	private String direccion;
	private int codColegio;
	
	public Colegio() {
		nombre = "";
		direccion = "";
		codColegio = 0;
	}
	public Colegio (String n, String d, int c) {
		nombre = n;
		direccion = d;
		codColegio = c;
	}
	
	public void setNombre (String n) {
		nombre = n;
	}
	public void setDireccion (String d) {
		direccion = d;
	}
	public void setCodColegio(int c) {
		codColegio = c;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getCodColegio() {
		return codColegio;
	}

}
