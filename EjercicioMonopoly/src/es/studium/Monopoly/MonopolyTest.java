package es.studium.Monopoly;

public class MonopolyTest {
	public static void main(String[] args) 
	{
		Jugador banca = new Jugador();
		Jugador j1 = new Jugador();
		Calle c1 = new Calle();
		Calle c2 = new Calle();
		
		
		j1.setNombre("Jugador 1");
		j1.setDineroActual(10000);
		j1.setPosicion(c2);
		
		banca.setNombre("Banca");
		banca.setDineroActual(1000000);
		banca.setPosicion(c1);
		
		c1.setNombre("");
		c1.setTipo("");
		
		
	}
}
