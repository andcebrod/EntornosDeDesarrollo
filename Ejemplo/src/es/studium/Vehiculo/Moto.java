package es.studium.Vehiculo;

public class Moto extends Vehiculo{
	
	private int cilindrada;
	
	public Moto() {
		super();
		cilindrada = 0;
	}
	
	public Moto(String m, int nP, int c) {
		cilindrada = c;
	}
	
	public void setCilindrada (int c) {
		cilindrada = c;
	}
	
	public int getCilindrada () {
		return cilindrada;
	} 
}
