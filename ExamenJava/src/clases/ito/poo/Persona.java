/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

public class Persona {
	public Persona(String nombre, String apellido, String email, int celular) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.celular = celular;
	}

	private String nombre = "";
	
	/**
	 * Description of the property apellido.
	 */
	private String apellido = "";
	
	/**
	 * Description of the property email.
	 */
	private String email = "";
	
	/**
	 * Description of the property celular.
	 */
	private int celular = 0;

	public Persona() {
		// Start of user code constructor for Persona)
		super();
		// End of user code
	}

	public String getNombre() {
		return this.nombre;
	}
	
	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
	    this.nombre = newNombre;
	}

	/**
	 * Returns apellido.
	 * @return apellido 
	 */
	public String getApellido() {
		return this.apellido;
	}
	
	/**
	 * Sets a value to attribute apellido. 
	 * @param newApellido 
	 */
	public void setApellido(String newApellido) {
	    this.apellido = newApellido;
	}

	/**
	 * Returns email.
	 * @return email 
	 */
	public String getEmail() {
		return this.email;
	}
	
	/**
	 * Sets a value to attribute email. 
	 * @param newEmail 
	 */
	public void setEmail(String newEmail) {
	    this.email = newEmail;
	}

	/**
	 * Returns celular.
	 * @return celular 
	 */
	public int getCelular() {
		return this.celular;
	}
	
	/**
	 * Sets a value to attribute celular. 
	 * @param newCelular 
	 */
	public void setCelular(int newCelular) {
	    this.celular = newCelular;
	}



}
