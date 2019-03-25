package es.studium.Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExamenTest {

	@Test
	void testMensaje1() {
		String resultadoEsperado = "Ya eres mayor de edad";
		String resultadoReal = Examen.mensaje(18);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testMensaje2() {
		String resultadoEsperado = "Ya puedes jubilarte";
		String resultadoReal = Examen.mensaje(67);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testMensaje3() {
		String resultadoEsperado = "No pasa nada";
		String resultadoReal = Examen.mensaje(54);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testValidar1() {
		boolean resultadoEsperado = true;
		boolean resultadoReal = Examen.validar("UHYSGBDJU8");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	void testValidar2() {
		boolean resultadoEsperado = false;
		boolean resultadoReal = Examen.validar("Hola");
		assertEquals(resultadoEsperado, resultadoReal);
	}


}
