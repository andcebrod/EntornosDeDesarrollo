package es.studium.Vehiculo;

public class CocheElectrico extends Coche {
	
	private int autonomia;
	
	public CocheElectrico() {
		super();
		autonomia = 0;
	}
	
	public CocheElectrico (int a, String m, int nP, boolean eD) {
		super(m,nP,eD);
		autonomia = a;
	}
	
	public void setCocheElectico (int a) {
		autonomia = a;
	}
	
	public int getCocheElectrico () {
		return autonomia;
	}

}
