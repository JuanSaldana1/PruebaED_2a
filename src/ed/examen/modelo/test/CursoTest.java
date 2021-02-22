package ed.examen.modelo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ed.examen.modelo.Curso;
import ed.examen.modelo.Persona;

public class CursoTest {

	Curso c = new Curso();

	@Test
	public void testEliminarAlumno() {
		// Clase valida, comprobar que no lanza la excepcion
		boolean lanzarExcepcion = false;
		try {
			c.eliminarAlumno("123456789");
		} catch (Exception e) {
			lanzarExcepcion = true;
		}
		assertFalse(lanzarExcepcion);

		// Clase invalida
		lanzarExcepcion = false;
		try {
			c.eliminarAlumno("1234567");
		} catch (Exception e) {
			lanzarExcepcion = true;
		}
		assertTrue(lanzarExcepcion);
	}

	@Test
	public void testAniadirAlumno() {
		Persona p = new Persona("12345678", "Juan", "Saldana");
		int sizeBefore = c.numeroAlumnos();
		c.numeroAlumnos();
		int sizeAfter = c.numeroAlumnos();

	}

	@Test
	public void testEstaRegistrado() {

		// Clase valida, comprobar que no lanza la excepcion
		boolean lanzarExcepcion = false;
		try {
			c.estaRegistrado("12345678");
		} catch (Exception e) {
			lanzarExcepcion = true;
		}
		assertFalse(lanzarExcepcion);

		// Clase invalida
		lanzarExcepcion = false;
		try {
			c.estaRegistrado("12345678");
		} catch (Exception e) {
			lanzarExcepcion = true;
		}
		assertTrue(lanzarExcepcion);
	}

	@Test
	public void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumeroAlumnos() {
		fail("Not yet implemented");
	}

}
