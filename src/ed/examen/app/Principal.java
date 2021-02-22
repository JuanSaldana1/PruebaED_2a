package ed.examen.app;

import java.util.*;

import ed.examen.modelo.*;

public class Principal {

	static Curso c;

	public static void main(String[] args) {
		c = new Curso();
		Integer opcion = mostrarMenuYRecogerOpcion();
		while (opcion != 0) {
			procesarOpcion(opcion);
			opcion = mostrarMenuYRecogerOpcion();
		}
	}

	private static Integer mostrarMenuYRecogerOpcion() {
		Scanner s = new Scanner(System.in);
		System.out.println("\n0 - Salir");
		System.out.println("1 - Aniadir persona");
		System.out.println("2 - Eliminar persona por DNI");
		System.out.println("3 - Numero de alumnos en el curso");
		System.out.println("4 - Mostrar todos los alumnos");
		System.out.print("Introducir opcion: ");
		Integer opcion = s.nextInt();
		return opcion;
	}

	public static void procesarOpcion(Integer opcion) {
		Scanner s = new Scanner(System.in);
		if (opcion == 1) {// add
			System.out.print("Introducir dni: ");
			String inDNI = s.nextLine();
			System.out.print("Introducir nombre: ");
			String inNombre = s.nextLine();
			System.out.print("Introducir apellido1: ");
			String inApellido1 = s.nextLine();

			c.aniadirAlumno(new Persona(inDNI, inNombre, inApellido1));

		} else if (opcion == 2) {// eliminar
			System.out.println("Introducir dni de usuario a eliminar: ");
			String inDNI = s.nextLine().trim();
			try {
				c.eliminarAlumno(inDNI);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (opcion == 3) {// contar
			System.out.println(c.numeroAlumnos());
		} else if (opcion == 4) {// todos
			c.mostrarTodos();
		}
	}
}
