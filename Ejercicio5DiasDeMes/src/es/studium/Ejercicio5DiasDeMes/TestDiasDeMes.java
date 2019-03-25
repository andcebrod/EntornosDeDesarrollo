package es.studium.Ejercicio5DiasDeMes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDiasDeMes {

	@Test
	void test() {
		String resultadoEsperado = "Enero tiene: 31 d�as";
		String resultadoReal = Ejercicio5DiasDeMes.diasDeMes("Enero");
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test1() {
		String resultadoEsperado = "Abril tiene: 30 d�as";
		String resultadoReal = Ejercicio5DiasDeMes.diasDeMes("Abril");
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test2() {
		String resultadoEsperado = "Febrero tiene: 28 d�as o 29 d�as (en a�o bisiesto)";
		String resultadoReal = Ejercicio5DiasDeMes.diasDeMes("Febrero");
		assertEquals(resultadoEsperado,resultadoReal);
	}
	@Test
	void test3() {
		String resultadoEsperado = "No has especificado un mes v�lido";
		String resultadoReal = Ejercicio5DiasDeMes.diasDeMes("Domingo");
		assertEquals(resultadoEsperado,resultadoReal);
	}

}
