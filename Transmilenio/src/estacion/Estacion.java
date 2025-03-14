package estacion;

import java.util.ArrayList;

public class Estacion {
	private ArrayList<Bus> recibe;
	private String direccion;
	private String nombre;
	
	/**
	 * @param vagones
	 * @param direccion
	 * @param nombre
	 */
	
	public Estacion(Bus tipo, String direccion, String nombre) {
		
		this.recibe = new ArrayList<tipo>;
		this.direccion = direccion;
		this.nombre = nombre;
	}
	/**
	 * @param vagones the vagones to set
	 */
	
	public void setVagones(ArrayList<Vagon> vagones) {
		this.vagones = vagones;
	}
	/**
	 * @param direccion the direccion to set
	 */
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
