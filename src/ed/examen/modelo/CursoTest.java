package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	Curso pepe=new Curso();
	Persona alex=new Persona("18087364A", "alex", "merino");
	
	@Test
	void testEliminarAlumno() {
		fail("Not yet implemented");
	}

	@Test
	void testAniadirAlumno() {
		int inicial=pepe.numeroAlumnos();
		pepe.aniadirAlumno(alex);
		int ultimo=pepe.numeroAlumnos();
		assertEquals(inicial, ultimo-1);
	}

	@Test
	void testEstaRegistrado() {
		fail("Not yet implemented");
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}
}
