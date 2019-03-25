package es.studium.OrdenDeCompra;

public class Productos {
	
	private int codProducto;
	private int precio;
	private String descripcionProducto;
	
	public Productos() {
		codProducto = 0;
		precio = 0;
		descripcionProducto="";
	}
	
	public Productos(int cProd, int pr, String dp) {
		codProducto = cProd;
		precio = pr;
		descripcionProducto=dp;
	}
	
	public void setCodProducto(int cProd) {
		codProducto = cProd;
	}
	
	public void setPrecio (int p) {
		precio = p;
	}
	
	public void setDescripcionProducto(String dp) {
		descripcionProducto = dp;
	}
	
	public int getCodProducto() {
		return codProducto;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public String getDescripcionProducto() {
		return descripcionProducto;
	}

}
