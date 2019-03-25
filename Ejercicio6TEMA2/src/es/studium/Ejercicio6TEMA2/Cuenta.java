package es.studium.Ejercicio6TEMA2;

public class Cuenta {
	private int noCuenta;
	private String tipo;
	private int saldo;
	
	public Cuenta() 
	{
		noCuenta = 0;
		tipo = " ";
		saldo = 0;
	}
	
	public Cuenta (int n, String t, int s) 
	{
		noCuenta = n;
		tipo =t;
		saldo = s;
	}
	
	public void setNoCuenta(int n) {
		noCuenta = n;
	}
	
	public void setTipo (String t) 
	{
		tipo = t;
	}
	
	public void setSaldo (int s) {
		saldo = s;
	}
	public int getNoCuenta() {
		return noCuenta;
	}
	public String getTipo() {
		return tipo;
	}
	public int getSaldo() {
		return saldo;
	}
	
	
	
	

}
