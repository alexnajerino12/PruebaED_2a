package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	Curso c1=new Curso();
	Persona alex=new Persona("18087364A", "alex", "merino");
	Persona pepe=new Persona("18087", "pepe", "dfh");
	
	
	@Test
	void testEliminarAlumno() {
		boolean excepcion=false;
		try {
			c1.eliminarAlumno("123456789");
		}catch (Exception e) {
			excepcion= true;
		}
		assertFalse(excepcion);
			
		//clase invalida	
			excepcion= false;
			try {
				c1.eliminarAlumno("123456");
			}catch (Exception e) {
				excepcion = true;
			}
			assertTrue(excepcion);
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
