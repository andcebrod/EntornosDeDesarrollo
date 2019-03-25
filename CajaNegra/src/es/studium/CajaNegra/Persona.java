package es.studium.CajaNegra;

public class Persona {
	private int anyoNacimiento;
	private int anyoFallecimiento;
	private String sexo;
 
	
	public Persona (int anyoNac) {
		anyoNacimiento = anyoNac;
		anyoFallecimiento = 0;
		sexo = "";
	}
 
	public void setFallecimiento (int anyo) {
		//...
	}
 
	public void setSexo (String sexo) {
		//...
	}

	public int getAnyoNacimiento() {
		return anyoFallecimiento;
		//...
	}
 
	public int getAnyoFallecimiento() {
		return anyoFallecimiento;
		//...
	}
 
	public String getSexo() {
		return sexo;
		//...
	}
}
