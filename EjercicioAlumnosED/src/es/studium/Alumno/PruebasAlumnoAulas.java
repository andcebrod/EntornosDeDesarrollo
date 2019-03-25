package es.studium.Alumno;

public class PruebasAlumnoAulas {
	
	public static void main(String[] args) {
		
		Aula dam = new Aula("DAM", 34);
		Aula daw = new Aula("DAW", 30);
		Aula asir = new Aula("ASIR",22);
		Alumno maria = new Alumno();
		maria.setNombre("María");
		maria.setApellidos("Martinez");
		maria.setEdad(22);
		maria.setHaPagado(true);
		maria.setAula(daw);
		
		System.out.println("Maria estudia en un aula con capacidad "+ maria.getAula().getCapacidad());
		
	}
}
