package es.studium.OrdenDeCompra;

public class Vendedor {
	
	private int codVendedor;
	private String nombre;
	private String direccion;
	private String localidad;
	private int codPostal;
	
	public Vendedor() {
		codVendedor = 0;
		nombre = "";
		direccion = "";
		localidad = "";
		codPostal = 0;
	}
	
	public Vendedor(int cv, String n, String d, String l, int cp) {
		codVendedor = cv;
		nombre = n;
		direccion = d;
		localidad = l;
		codPostal = cp;
	}
	public void setCodVendedor(int cv) {
		codVendedor = cv;
	}

	public void setNombre(String n) {
		nombre = n;
	}
	
	public void setDireccion(String d) {
		direccion = d;
	}

	public void setLocalidad(String l) {
		localidad = l;
	}
	
	public void setCodPostal(int cp) {
		codPostal = cp;
	}
	
	public int getCodVendedor() {
		return codVendedor;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public int getCodPostal() {
		return codPostal;
	}

}
