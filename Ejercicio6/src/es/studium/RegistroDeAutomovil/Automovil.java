package es.studium.RegistroDeAutomovil;

public class Automovil {
	
	private String modelo;
	private String placa;
	private String color;
	


	public Automovil() 
	{
	
		modelo = "";
		placa ="";
		color = "";
	
	}

	public Automovil (String m, String p, String c) 
	{
		modelo = m;
		placa = p;
		color = c;
	}
	
	public void setModelo (String m) {
		modelo = m;
	}
	
	public void setPlaca (String p) {
		placa = p;
	}
	
	public void setColor (String c) {
		color = c;
	}
	
	public String getModelo() {
		return modelo;
		
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getColor() {
		return color;
	}



}