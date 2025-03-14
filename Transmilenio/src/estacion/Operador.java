package estacion;

public class Operador extends Persona{
	
	private int salario;
	private Transmilenio trasmi;
	
	public Operador(int id, int edad, String nombre, String telefono,int salario, Transmilenio trasmi) {
		super(id,edad,nombre,telefono);
		this.salario = salario;		
		this.trasmi = trasmi;
	}
}
