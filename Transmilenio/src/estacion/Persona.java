package estacion;

public abstract class Persona {
	protected int numeroDeIdentidad;
	protected int edad;
	protected String nombre;
	protected String telefono;
	public Persona(int id, int edad, String nombre, String telefono) {
		this.edad = edad;
		this.nombre = nombre;
		this.numeroDeIdentidad = id;
		this.telefono = telefono;
	}
}
