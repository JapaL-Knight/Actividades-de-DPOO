package estacion;

public abstract class Bus {
	protected String nombre;
	protected String matricula;
	protected int capacidad;
	protected Operador operador;
	
	
	public Bus(String matricula, int capacidad,Operador operador, String nombre) {
		
		this.capacidad = capacidad;
		this.nombre = nombre;
		this.matricula = matricula;
		this.operador = operador;
}
