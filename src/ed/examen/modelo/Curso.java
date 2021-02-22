package ed.examen.modelo;

import java.util.*;
/**
 * Clase Curso, que almacenará un ArrayList de Personas, en este caso alumnos
 * @author juan
 * @version 1.0
 *
 */

public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Metodo que lanza una excepcion. Este metodo llamado eliminarAlumno no hace
	 * mas que lo que su nombre indica; hace esta operacion mediante la comprobacion
	 * de la entrada que recibe, en este caso, el String DNI.<br>
	 * Lanza la excepcion que es como un error cuando el DNI <b>NO</b> cumple con
	 * los requisitos previamente impuestos. En nuestro caso, que el DNI tenga una
	 * longitud de 9 caracteres.
	 * 
	 * @param dni
	 * @throws Exception
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Funcion que añade un alumno al arrayList, el cual se guarda en memoria.
	 * 
	 * @param p
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Funcion booleana que comprueba si un alumno está o no registrado; esto lo
	 * averigua de la siguiente forma:
	 * <ul>
	 * <li>En caso de que el dni introducido (ya que es el parametro que tiene por
	 * defecto a introducir este método) coincida con alguno del ArrayList de
	 * alumnos, devuelve true, es decir, está registrado. Para ello, recorre toda la
	 * lista de alumnos.</li>
	 * <li>En caso contrario, devolverá false, ya que ningun DNI coincide.</li>
	 * </ul>
	 * Personalmente lo llamaría <code>busquedaPorDNI</code>
	 * 
	 * @param dni
	 * @return
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Constructor Curso, "crea" un curso a partir de la lista de Personas.
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Función de caracter publico que devuelve un Integer(entero) del total de
	 * alumnos en el ArrayList.
	 * 
	 * @return
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
