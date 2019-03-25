package es.studium.Futbolista;

public class TestLiga {
	
	public static void main(String[] args) 
	{
		
		
		Equipo e1 = new Equipo();
		Equipo e2 = new Equipo();
		
		Futbolista f1 = new Futbolista();
		Futbolista f2 = new Futbolista ();
		Futbolista f3 = new Futbolista();
		Futbolista f4 = new Futbolista();
		
		e1.setNombre("Sevilla Fútbol Club");
		e1.setAnyoDeFundacion(1890);
		e1.setNumeroDeSocios(40000);
		
		e2.setNombre("Real Betis Balompie");
		e2.setAnyoDeFundacion(1907);
		e2.setNumeroDeSocios(45000);
		
		f1.setNombre("Jesús");
		f1.setApellido("Navas");
		f1.setComunitario(false);
		f1.setEquipo(e1);
		
		f2.setNombre("Cristian");
		f2.setApellido("Tello");
		f2.setComunitario(false);
		f2.setEquipo(e2);
		
		f3.setNombre("Andrés");
		f3.setApellido("Guardado");
		f3.setComunitario(true);
		f3.setEquipo(e2);
		
		f4.setNombre("Éver");
		f4.setApellido("Banega");
		f4.setComunitario(true);
		f4.setEquipo(e1);
		
		System.out.println(f1.getNombre()+" "+f1.getApellido()+" juega en "+f1.getEquipo().getNombre());
		System.out.println(f2.getNombre()+" "+f2.getApellido()+" juega en "+f2.getEquipo().getNombre());
		System.out.println(f3.getNombre()+" "+f3.getApellido()+" juega en "+f3.getEquipo().getNombre());
		System.out.println(f4.getNombre()+" "+f4.getApellido()+" juega en "+f4.getEquipo().getNombre());
	}

}
