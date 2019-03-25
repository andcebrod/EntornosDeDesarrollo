package es.studium.CajaNegra;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;
 
class CuentaTest {
 
	@Test
	void testIngresar1() {
		Cuenta c = new Cuenta();
		c.ingresar(10.0f);
		float saldoDespues = c.getSaldo();		
		assertEquals(10.0f, saldoDespues);
	}
	
	@Test
	void testIngresar2() {
		Cuenta c = new Cuenta();
		c.ingresar(10.0f);
		c.ingresar(Float.MAX_VALUE);
		float saldoDespues = c.getSaldo();		
		assertEquals(10.0f, saldoDespues);
	}
	
	@Test
	void testIngresar3() {
		Cuenta c = new Cuenta();
		c.ingresar(-10.0f);
		float saldoDespues = c.getSaldo();		
		assertEquals(0.0f, saldoDespues);
	}
	
	@Test
	void testRetirar1() {
		Cuenta c = new Cuenta();
		c.ingresar(20.0f);
		c.retirar(10.0f);
		float saldoDespues = c.getSaldo();		
		assertEquals(10.0f, saldoDespues);
	}
	
	@Test
	void testRetirar2() {
		Cuenta c = new Cuenta();
		c.ingresar(10.0f);
		c.retirar(20.0f);
		float saldoDespues = c.getSaldo();		
		assertEquals(10.0f, saldoDespues);
	}
	
	@Test
	void testRetirar3() {
		Cuenta c = new Cuenta();
		c.retirar(-10.0f);
		float saldoDespues = c.getSaldo();		
		assertEquals(0.0f, saldoDespues);
	}
	
	@Test
	void testTransferir1() {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.ingresar(10.0f);
		c1.transferir(c2, 5.0f);
		float[] resultadoEsperado = {5.0f, 5.0f};
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};		
		assertArrayEquals(resultadoReal,  resultadoEsperado);
	}
	
	@Test
	void testTransferir2() {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.ingresar(10.0f);
		c1.transferir(c2, 20.0f);
		float[] resultadoEsperado = {10.0f, 0.0f};
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};		
		assertArrayEquals(resultadoReal,  resultadoEsperado);
	}
	
	@Test
	void testTransferir3() {
		Cuenta c1 = new Cuenta();
		Cuenta c2 = new Cuenta();
		c1.transferir(c2, 5.0f);
		float[] resultadoEsperado = {0.0f, 0.0f};
		float[] resultadoReal = {c1.getSaldo(), c2.getSaldo()};		
		assertArrayEquals(resultadoReal,  resultadoEsperado);
	}
 
}