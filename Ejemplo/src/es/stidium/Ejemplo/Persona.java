package es.stidium.Ejemplo;

public class Persona {
	
	private String nombre;
	private int edad;
	private Arma arma;
	
	public Persona() {
		nombre = " ";
		edad =0;
	}
	
	public Persona(String n, int e) {
		nombre=n;
		edad=e;
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad (int e) {
		edad=e;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void saludar() {
		
		System.out.println("Hola soy "+getNombre()+" y tengo "+getEdad()+" años");
		
	}
	
	public void atacar(Zombie z) {
		System.out.println(getNombre()+" le pega un puñetazo a "+z.getNombre()+" y quita 10 puntos de vida.");
		
		if(z.getSalud()>0) 
		{
			z.setSalud(z.getSalud()-10);
			System.out.println(z.getNombre()+" tiene ahora "+z.getSalud()+" puntos de vida");
		} 
		
		if(z.getSalud()<=0) 
		{
			System.out.println(z.getNombre()+" ha sido eliminado");
		}
		
		
		
	}
}


