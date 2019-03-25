package es.studium.Ejercicio4EsVocal;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class TestEsVocal {
	@Test
	void test() throws IOException {
		String resultadoEsperado = "No has introducido un �nico car�cter.";
		String resultadoReal = Ejercicio4EsVocal.esVocal("as");
		assertEquals(resultadoEsperado,resultadoReal);
	}

	@Test
	void test1() throws IOException {
		String resultadoEsperado = "El car�cter no es una letra.";
		String resultadoReal = Ejercicio4EsVocal.esVocal("2");
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test2() throws IOException {
		String resultadoEsperado = "El car�cter es una vocal.";
		String resultadoReal = Ejercicio4EsVocal.esVocal("a");
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test3() throws IOException {
		String resultadoEsperado = "El car�cter a veces es una vocal y a veces es una consonante.";
		String resultadoReal = Ejercicio4EsVocal.esVocal("y");
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test4() throws IOException {
		String resultadoEsperado = "El car�cter es una consonante.";
		String resultadoReal = Ejercicio4EsVocal.esVocal("p");
		assertEquals(resultadoEsperado,resultadoReal);
	}

}
