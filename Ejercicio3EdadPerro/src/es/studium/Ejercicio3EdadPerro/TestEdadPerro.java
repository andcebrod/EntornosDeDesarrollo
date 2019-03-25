package es.studium.Ejercicio3EdadPerro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEdadPerro {

	@Test
	void test1() {
		String resultadoEsperado = "La edad es 53.0";
		String resultadoReal = Ejercicio3EdadPerro.edadPerro(10);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test2() {
		String resultadoEsperado = "La edad debe ser un número positivo.";
		String resultadoReal = Ejercicio3EdadPerro.edadPerro(-1);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test3() {
		String resultadoEsperado = "La edad es10.5";
		String resultadoReal = Ejercicio3EdadPerro.edadPerro(1);
		assertEquals(resultadoEsperado,resultadoReal);
	}
}
