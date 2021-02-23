package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	private List<Persona> listaAlumnos;

	
	/**
	 * @author AlexMerino
	 * @param dni
	 * @throws Exception
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	
	/**
	 * @author AlexMerino
	 * @param p
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	

	/**
	 * @author AlexMerino
	 * @param dni
	 * @return true or false. Te devuelve verdadero si esta registrado y falso si no lo está.
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	

	/**
	 * @author AlexMerino
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	
	/**
	 * @author AlexMerino
	 * @return listaalumnos. Te devuelve la lista de alumnos. El numero de alumnos que hay
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	/**
	 * @author AlexMerino
	 */
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
