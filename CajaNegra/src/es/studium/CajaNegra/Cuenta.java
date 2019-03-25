package es.studium.CajaNegra;

public class Cuenta {
	private float saldo;

	public Cuenta() {
		saldo = 0;
	}

	public void ingresar (float cantidad) {
		if(cantidad<=0) {
			saldo=saldo;
		} else if (cantidad>0) {
			saldo += cantidad;
		} 
		
	}

	public void retirar (float cantidad) {
		saldo -= cantidad;
	}

	public void transferir (Cuenta destino, float cantidad) {
		destino.ingresar(cantidad);
		retirar(cantidad);
	}

	public float getSaldo() {
		return saldo;
	}
}