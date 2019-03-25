package es.studium.Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void testSetIva1() {
		Producto p = new Producto();
		p.setIVA(21);
		int resultadoEsperado =21;
		int resultadoReal = p.getIVA();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testSetIva2() {
		Producto p = new Producto();
		p.setIVA(10);
		int resultadoEsperado =10;
		int resultadoReal = p.getIVA();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testSetIva3() {
		Producto p = new Producto();
		p.setIVA(4);
		int resultadoEsperado =4;
		int resultadoReal = p.getIVA();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testSetIva4() {
		Producto p = new Producto();
		p.setIVA(3);
		int resultadoEsperado =0;
		int resultadoReal = p.getIVA();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testSetPrecio1() {
		Producto p = new Producto();
		p.setPrecio(80);
		double resultadoEsperado =80;
		double resultadoReal = p.getPrecio();
		assertEquals(resultadoEsperado,resultadoReal);
	}

	@Test
	void testSetPrecio2() {
		Producto p = new Producto();
		p.setPrecio(-35);
		double resultadoEsperado =0;
		double resultadoReal = p.getPrecio();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testAplicarDescuento1() {
		Producto p = new Producto();
		p.setPrecio(25);
		p.aplicarDescuento(10);
		double resultadoEsperado = 22.5;
		double resultadoReal = p.getPrecio();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testAplicarDescuento2() {
		Producto p = new Producto();
		p.setPrecio(25);
		p.aplicarDescuento(-20);
		double resultadoEsperado =25;
		double resultadoReal = p.getPrecio();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void testAplicarDescuento3() {
		Producto p = new Producto();
		p.setPrecio(25);
		p.aplicarDescuento(120);
		double resultadoEsperado =25;
		double resultadoReal = p.getPrecio();
		assertEquals(resultadoEsperado,resultadoReal);
	}

}
