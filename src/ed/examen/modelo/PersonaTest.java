package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p=new Persona("18087364S", "Paco", "pico");


	@Test
	void testGetDni() {
		assertEquals("18087364S", p.getDni());
	}

	@Test
	void testSetDni() {
		try {
			p.setDni("12345678W");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("12345678W", p.getDni());
		
		//clase invalida
		boolean excepcionlanzada=false;
		try {
			p.setDni("12345678");
			
		}catch (Exception e) {
			excepcionlanzada=true;
		}
		assertTrue(excepcionlanzada);
	}

	@Test
	void testGetNombre() {
		assertEquals("Paco", p.getNombre() );
	}

	@Test
	void testSetNombre() {
		p.setNombre("Pedro");
		assertEquals("Pedro", p.getNombre() );
	}

	@Test
	void testGetApellido1() {
		assertEquals("pico", p.getApellido1() );
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("Navarro");
		assertEquals("Navarro", p.getApellido1());
	}


}
