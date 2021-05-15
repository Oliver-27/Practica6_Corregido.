/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

public class Cliente  extends Persona {
	public Cliente(String nombre, String apellido, String email, int celular, int noCliente, float creditoDisponible) {
		super(nombre, apellido, email, celular);
		this.noCliente = noCliente;
		this.creditoDisponible = creditoDisponible;
	}

	/**
	 * Description of the property noCliente.
	 */
	private int noCliente = 0;
	
	/**
	 * Description of the property creditoDisponible.
	 */
	private float creditoDisponible = 0F;
	
	// Start of user code (user defined attributes for Cliente )
	
	// End of user code
	
	/**
	 * The constructor.
	 */
	public Cliente () {
		// Start of user code constructor for Cliente )
		super();
		// End of user code
	}
	
	// Start of user code (user defined methods for Cliente )
	
	// End of user code
	/**
	 * Returns noCliente.
	 * @return noCliente 
	 */
	public int getNoCliente() {
		return this.noCliente;
	}
	
	/**
	 * Sets a value to attribute noCliente. 
	 * @param newNoCliente 
	 */
	public void setNoCliente(int newNoCliente) {
	    this.noCliente = newNoCliente;
	}

	/**
	 * Returns creditoDisponible.
	 * @return creditoDisponible 
	 */
	public float getCreditoDisponible() {
		return this.creditoDisponible;
	}
	
	/**
	 * Sets a value to attribute creditoDisponible. 
	 * @param newCreditoDisponible 
	 */
	public void setCreditoDisponible(float newCreditoDisponible) {
	    this.creditoDisponible = newCreditoDisponible;
	}

	@Override
	public String toString() {
		return "Cliente [noCliente=" + noCliente + ", creditoDisponible=" + creditoDisponible + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEmail()=" + getEmail() + ", getCelular()="
				+ getCelular() + "]";
	}



}
