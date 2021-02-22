package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	Curso c1=new Curso();
	Persona alex=new Persona("18087364A", "alex", "merino");
	Persona pepe=new Persona("18087", "pepe", "dfh");
	
	
	@Test
	void testEliminarAlumno() {
		c1.aniadirAlumno(alex);
			int inicial=c1.numeroAlumnos();
			try {
				c1.eliminarAlumno(alex.getDni());
			} catch (Exception e) {
				
			}
			int ultimo=c1.numeroAlumnos();
			assertEquals(inicial, ultimo+1);
			
		//clase invalida	
			c1.aniadirAlumno(pepe);
			int antes=c1.numeroAlumnos();
			try {
				c1.eliminarAlumno(pepe.getDni());
			} catch (Exception e) {
				
			}
			int despues=c1.numeroAlumnos();
			assertEquals(antes, despues+1);
	}

	@Test
	void testAniadirAlumno() {
		
		int inicial=c1.numeroAlumnos();
		c1.aniadirAlumno(alex);
		int ultimo=c1.numeroAlumnos();
		assertEquals(inicial, ultimo-1);
	}

	@Test
	void testEstaRegistrado() {
		c1.estaRegistrado(alex.getDni());
	}

	@Test
	void testCurso() {
		
	}

	@Test
	void testNumeroAlumnos() {
		int longitud=c1.numeroAlumnos();
		assertEquals(longitud, 0);
	}
}
