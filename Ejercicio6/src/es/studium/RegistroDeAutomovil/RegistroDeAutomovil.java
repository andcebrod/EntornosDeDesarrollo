package es.studium.RegistroDeAutomovil;

public class RegistroDeAutomovil {

	public static void main(String[] args) {
		
		Automovil a1 = new Automovil("Seat León","8972 FCV","Blanco");
		Automovil a2 = new Automovil("Seat Ibiza","2342 KCP","Negro");
		
		TarjetaDeCirculacion t1 = new TarjetaDeCirculacion("Antonio Pérez", 0001, "Cupé",a1);
		TarjetaDeCirculacion t2 = new TarjetaDeCirculacion("Ibai Gomez", 0021, "Cupé",a2);

	}

}
