package es.studium.OrdenDeCompra;

public class OrdenDeCompra {
	
	private int numOrden;
	private String fechaOrden;
	private int impuestoOrden;
	
	public OrdenDeCompra() {
		
		numOrden = 0;
		fechaOrden = "";
		impuestoOrden = 0;
		
	}
	
	public OrdenDeCompra(int n, String f, int i) {
	
		numOrden = n;
		fechaOrden = f;
		impuestoOrden = i;
		
	}
	
	
}
