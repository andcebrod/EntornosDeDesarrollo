package es.studium.RegistroDeAutomovil;

public class TarjetaDeCirculacion {
	
	private String propietario;
	private int numSerie;
	private String tipo;
	private Automovil auto;

	
	public TarjetaDeCirculacion() {
		propietario = "";
		numSerie = 0;
		tipo = "";
		auto = new Automovil();
	}
	
	public TarjetaDeCirculacion(String p, int num, String t, Automovil a) {
		propietario = p;
		numSerie = num;
		tipo = t;
		auto = a;
	}
	
	public void setPropietario(String p) {
		propietario = p;
	}
	public void setNumSerie(int n){
		numSerie= n;
	}
	public void setTipo(String t) {
		tipo = t;
	}
	public void setAuto(Automovil a) {
		auto = a;
	}
	
	public String getPropietario () {
		return propietario;
	}
	
	public int getNumSerie () {
		return numSerie;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public Automovil getAutomovil() {	
		return auto;
	}



}
