package ed.examen.modelo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ed.examen.modelo.Persona;

public class PersonaTest {

	Persona p = new Persona("12345678", "Juan", "Saldana");

	@Test
	public void testPersonaStringStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDni() {
		assertEquals("12345678", p.getDni());
	}

	@Test
	public void testSetDni() {
		// Clase valida
		try {
			p.setDni("12345678Q");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("12345678Q", p.getDni());

		// clase invalida
		boolean exceptionLanzada = false;
		try {
			p.setDni("12345678");
		} catch (Exception e) {
			exceptionLanzada = true;
		}
		assertTrue(exceptionLanzada);
	}

	@Test
	public void testGetNombre() {
		assertEquals("Juan", p.getNombre());
	}

	@Test
	public void testSetNombre() {
		p.setNombre("Alan");
		assertEquals("Alan", p.getNombre());
	}

	@Test
	public void testGetApellido1() {
		assertEquals("Saldana", p.getApellido1());
	}

	@Test
	public void testSetApellido1() {
		p.setApellido1("Ruiz");
		assertEquals("Ruiz", p.getApellido1());
	}

}
