package estacion;

import java.math.BigInteger;

public class Tarjeta {
	
	private static BigInteger contador = new BigInteger("1010000000000000");
	private boolean debePagar;
	private boolean personalizada;
	private BigInteger id;
	private int saldo;
	/**
	 * @param personalizada
	 * @param saldo
	 */
	public Tarjeta(boolean personalizada, int saldo) {
		this.personalizada = personalizada;
		this.saldo = saldo;
		contador = contador.add(BigInteger.ONE);
		this.id = contador;
	}
	
	
	
	
	
	
}
