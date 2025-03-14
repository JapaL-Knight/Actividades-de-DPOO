package estacion;

public class Usuario extends Persona{
	
	private Tarjeta tarjeta;
	
	public Usuario(int id, int edad, String nombre, String telefono,int saldo, boolean personalizada) {
		super(id,edad,nombre,telefono);
		this.tarjeta = new Tarjeta(telefono, saldo, personalizada); 
	}
}
