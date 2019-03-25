package es.studium.Vehiculo;

public class Vehiculo {
	String matricula;
	int numPasajeros;
	
	public Vehiculo() {
		matricula = " ";
		numPasajeros = 0;
	}
	
	public Vehiculo(String m, int nP) {
		matricula = m;
		numPasajeros = nP;
	}
	
	public void setMatricula(String m) {
		matricula = m;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public void setNumPasajeros(int nP) {
		numPasajeros = nP;
	}
	public int getNumPasajeros() {
		return numPasajeros;
	}
}
