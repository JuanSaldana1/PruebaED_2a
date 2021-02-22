package ed.examen.modelo;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/**
	 * Constructor que recibe como parametros: {dni, nombre y apellido1} y los
	 * inicializa.
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido1
	 * 
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Metodo que devuelve el DNI
	 * 
	 * @return
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo para aadir un DNI, éste pasará por una verificacion la cual lanzará
	 * una excepción si el ultimo caracter escrito no es una letra.
	 * 
	 * @param dni
	 * @throws Exception
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length() - 1))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @param nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el apellido.
	 * 
	 * @return
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Establece apellido.
	 * 
	 * @param apellido1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
