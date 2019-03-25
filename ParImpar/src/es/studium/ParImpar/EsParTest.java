package es.studium.ParImpar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsParTest {

	@Test
	void test1() {
		boolean resultadoEsperado = true;
		boolean resultadoReal = ParImpar.esPar(2);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void test2() {
		boolean resultadoEsperado = false;
		boolean resultadoReal = ParImpar.esPar(1);
		assertEquals(resultadoEsperado,resultadoReal);
	}

}
