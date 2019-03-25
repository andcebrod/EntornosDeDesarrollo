package es.studium.Vehiculo;

public class Coche extends Vehiculo{
	boolean esDescapotable;
	
	public Coche(){
		super();
		esDescapotable = false;
	}
	
	public Coche(String m, int nP, boolean eD) {
		super (m,nP);
		esDescapotable = eD;
	}
	
	public void setEsDescapotable(boolean eD) {
		esDescapotable = eD;
	}
	
	public boolean getEsDescapotable() {
		return esDescapotable;
	}
	
	

}
