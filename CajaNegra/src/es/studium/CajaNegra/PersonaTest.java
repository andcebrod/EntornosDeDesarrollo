package es.studium.CajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testSetFallecimiento() {
		Persona p1 = new Persona(10);
		p1.setFallecimiento(60);
		int resultadoEsperado = 60;
		int resultadoReal = p1.getAnyoFallecimiento();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	
	@Test
	void testSetSexo() {
		Persona p1 = new Persona(10);
		p1.setSexo("Hombre");
		String resultadoEsperado="H";
		String resultadoReal=p1.getSexo();
		assertEquals(resultadoEsperado,resultadoReal);
	}
	

}
