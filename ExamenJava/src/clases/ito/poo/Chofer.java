/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.util.HashSet;

public class Chofer extends Empleado {
	public Chofer(String nombre, String apellido, String email, int celular, int noEmpleado, String nss, float sueldo,
			String puesto, HashSet<String> rutas, int noAutobus) {
		super(nombre, apellido, email, celular, noEmpleado, nss, sueldo, puesto);
		this.rutas = rutas;
		this.noAutobus = noAutobus;
	}

	/**
	 * Description of the property rutas.
	 */
	private HashSet<String> rutas = new HashSet<String>();

	/**
	 * Description of the property noAutobus.
	 */
	private int noAutobus = 0;

	// Start of user code (user defined attributes for Chofer)

	// End of user code

	/**
	 * The constructor.
	 */
	public Chofer() {
		// Start of user code constructor for Chofer)
		super();
		// End of user code
	}

	/**
	 * Description of the method agregarRuta.
	 * @param ruta 
	 */
	public void agregarRuta(String ruta) {
		// Start of user code for method agregarRuta
		// End of user code
	}

	/**
	 * Description of the method eliminarRuta.
	 * @param ruta 
	 * @return 
	 */
	public Boolean eliminarRuta(String ruta) {
		// Start of user code for method eliminarRuta
		Boolean eliminarRuta = Boolean.FALSE;
		return eliminarRuta;
		// End of user code
	}

	// Start of user code (user defined methods for Chofer)

	// End of user code
	/**
	 * Returns rutas.
	 * @return rutas 
	 */
	public HashSet<String> getRutas() {
		return this.rutas;
	}

	/**
	 * Returns noAutobus.
	 * @return noAutobus 
	 */
	public int getNoAutobus() {
		return this.noAutobus;
	}

	/**
	 * Sets a value to attribute noAutobus. 
	 * @param newNoAutobus 
	 */
	public void setNoAutobus(int newNoAutobus) {
		this.noAutobus = newNoAutobus;
	}

	@Override
	public String toString() {
		return "Chofer [rutas=" + rutas + ", noAutobus=" + noAutobus + ", getNoEmpleado()=" + getNoEmpleado()
				+ ", getNss()=" + getNss() + ", getSueldo()=" + getSueldo() + ", getPuesto()=" + getPuesto()
				+ ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido() + ", getEmail()=" + getEmail()
				+ ", getCelular()=" + getCelular() + "]";
	}

}
