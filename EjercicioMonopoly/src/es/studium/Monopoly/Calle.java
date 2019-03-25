package es.studium.Monopoly;

public class Calle {
	
	private String nombre;
	private int renta;
	private String tipo;
	private Jugador jugador;
	private int casas;
	private int hotel;
	private int precioCasa;
	private int precioHotel;
	private int rentaCasa1;
	private int rentaCasa2;
	private int rentaCasa3;
	private int rentaCasa4;
	private int rentaHotel;
	
	
	public Calle() {
		nombre = "";
		renta = 0;
		tipo="";
		jugador = new Jugador();
		casas = 0;
		hotel = 0;
		precioCasa = 0;
		precioHotel = 0;
		rentaCasa1 = 0;
		rentaCasa2 = 0;
		rentaCasa3 = 0;
		rentaCasa4 = 0;
		rentaHotel = 0;
		
	}
	
	public Calle (String n, int r,String t, Jugador j, int c, int h, int pC, int pH, int rC1, int rC2, int rC3, int rC4, int rH) {
		nombre = n;
		renta = r;
		tipo = t;
		jugador = j;
		casas = c;
		hotel = h;
		precioCasa = pC;
		precioHotel = pH;
		rentaCasa1 = rC1;
		rentaCasa2 = rC2;
		rentaCasa3 = rC3;
		rentaCasa4 = rC4;
		rentaHotel = rH;
	}
		
		public void setNombre(String n) {
			nombre = n;
		}
		public void setRenta(int r) {
			renta = r;
		}
		public void setTipo(String t) {
			tipo = t;
		}
		public void setJugador(Jugador j) {
			jugador = j;
		}
		public void setCasas(int c) {
			casas = c;
		}
		public void setHotel(int h) {
			hotel = h;
		}
		public void setprecioCasa(int pc) {
			precioCasa = pc;
		}
		public void setprecioHotel(int ph) {
			precioCasa = ph;
		}
		public void setRentaCasa1(int rc1) {
			rentaCasa1 = rc1;
		}
		public void setRentaCasa2(int rc2) {
			rentaCasa2 = rc2;
		}
		public void setRentaCasa3(int rc3) {
			rentaCasa3 = rc3;
		}
		public void setRentaCasa4(int rc4) {
			rentaCasa4 = rc4;
		}
		public void setRentaHotel(int rH) {
			rentaHotel = rH;
		}
		
		public String getNombre() {
			return nombre;
		}
		public int getRenta() {
			return renta;
		}
		public String getTipo() {
			return tipo;
		}
		
		public Jugador getJugador() {
			return jugador;
		}
		public int getCasas() {
			return casas;
		}
		public int getHotel() {
			return hotel;
		}
		public int getPrecioHotel() {
			return precioHotel;
		}
		public int getPrecioCasa() {
			return precioCasa;
		}
		public int getRentaCasa1() {
			return rentaCasa1;
		}
		public int getRentaCasa2() {
			return rentaCasa2;
		}
		public int getRentaCasa3() {
			return rentaCasa3;
		}
		public int getRentaCasa4() {
			return rentaCasa4;
		}
		public int getRentaHotel() {
			return rentaHotel;
		}
	
	
	
}
