package es.studium.Persona;

public class Pruebas {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		Perro pe1 = new Perro();
		Perro pe2 = new Perro();
		Perro pe3 = new Perro();
		
		p1.setNombre("Antonio");
		p1.setApellidos("Antxon Anton");
		p1.setDni("12345678A");
		p1.setDireccion("Calle Falsa 123");
		p1.setTelefono(612345789);
		
		p2.setNombre("Manolo");
		p2.setApellidos("Manolin Manolete");
		p2.setDni("87654321A");
		p2.setDireccion("Calle Falsa 124");
		p2.setTelefono(698754321);
		
		
		pe1.setNombre("Rex");
		pe1.setRaza("Labrador");
		pe1.setEdad(12);
		pe1.setDueno(p2);
		
		pe2.setNombre("Tod");
		pe2.setRaza("Dálmata");
		pe2.setEdad(15);
		pe2.setDueno(p1);
		
		pe3.setNombre("Paco");
		pe3.setRaza("Chihuahua");
		pe3.setEdad(6);
		pe3.setDueno(p1);
		
		System.out.println("El dueño de "+pe2.getNombre()+" es "+pe2.getDueno().getNombre());
	
	}

}
