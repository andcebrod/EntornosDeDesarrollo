package equipoE.ConcursoED;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestConcursoED {

	//MULTIPLO DE 4: NO
	@Test
	void test() {
		Boolean resultadoEsperado = false;
		Boolean resultadoReal = ConcursoED.esBisiesto(5);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	//DIVISIBLE POR 100: NO
	@Test
	void test1() {
		Boolean resultadoEsperado = true;
		Boolean resultadoReal = ConcursoED.esBisiesto(2004);
		assertEquals(resultadoEsperado,resultadoReal);
	}
	//DIVISIBLE POR 100: SI,DIVISIBLE POR 400: NO
	@Test
	void test2() {
		Boolean resultadoEsperado = false;
		Boolean resultadoReal = ConcursoED.esBisiesto(200);
		assertEquals(resultadoEsperado,resultadoReal);
	}

	//DIVISIBLE POR 100: SI,DIVISIBLE POR 400: SÍ
	@Test
	void test3() {
		Boolean resultadoEsperado = true;
		Boolean resultadoReal = ConcursoED.esBisiesto(400);
		assertEquals(resultadoEsperado,resultadoReal);
	}

}
