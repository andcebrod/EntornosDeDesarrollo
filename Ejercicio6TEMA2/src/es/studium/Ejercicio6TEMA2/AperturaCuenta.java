package es.studium.Ejercicio6TEMA2;

public class AperturaCuenta {
	private Cuenta cuenta;
	private Cliente cliente;
	private String fecha;
	
	public AperturaCuenta() 
	{
		cuenta = new Cuenta();
		cliente = new Cliente();
		fecha = "";
	}
	public AperturaCuenta(Cuenta c, Cliente cl,String f) 
	{
		cuenta = c;
		cliente = cl;
		fecha = f;
	}
	
	public void setCliente(Cliente cl) 
	{
		cliente = cl;
	}
	public void setCuenta (Cuenta c) 
	{
		cuenta = c;
	}
	public void setFecha (String f) 
	{
		fecha = f;
	}
	
	public Cliente getCliente() 
	{
		return cliente;
	}
	public Cuenta getCuenta() 
	{
		return cuenta;
	}
	public String getFecha() 
	{
		return fecha;
	}
	

}
