package es.studium.Cuenta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCuenta {

	@Test
	void IngresarTest() {
		Cuenta c = new Cuenta();
		float resultadoEsperado = c.getSaldo();
		c.ingresar((float)-10.0);
		float resultadoReal = c.getSaldo();
		assertEquals(resultadoEsperado,resultadoReal);
		
	}

	@Test
	void IngresarTest2() {
		Cuenta c = new Cuenta();
		float resultadoEsperado = 10;
		c.ingresar((float)10.0);
		float resultadoReal = c.getSaldo();
		assertEquals(resultadoEsperado,resultadoReal);
		
	}
	@Test
	void testIngresarMaximo() {
		Cuenta c = new Cuenta();
		float resultadoEsperado = 10;
		c.ingresar((float)10.0);
		float resultadoReal = c.getSaldo();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void RetirarTest() {
		Cuenta c = new Cuenta();
		float resultadoEsperado = -10;
		c.retirar((float)10.0);
		float resultadoReal = c.getSaldo();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void RetirarTest2() {
		Cuenta c = new Cuenta();
		float resultadoEsperado = -10;
		c.retirar((float)-10.0);
		float resultadoReal = c.getSaldo();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void TransferirTest() {
		
		
	}

}
