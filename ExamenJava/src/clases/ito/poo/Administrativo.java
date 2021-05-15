/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;
public class Administrativo extends Empleado {
	public Administrativo(String nombre, String apellido, String email, int celular, int noEmpleado, String nss,
			float sueldo, String puesto, String depto) {
		super(nombre, apellido, email, celular, noEmpleado, nss, sueldo, puesto);
		this.depto = depto;
	}

	private String depto = "";

	public Administrativo() {
		// Start of user code constructor for Administrativo)
		super();
		// End of user code
	}

	/**
	 * Description of the method cambiaDepto.
	 * @param newDepto 
	 */
	public void cambiaDepto(String newDepto) {
		// Start of user code for method cambiaDepto
		// End of user code
	}

	public String getDepto() {
		return this.depto;
	}

	public void setDepto(String newDepto) {
		this.depto = newDepto;
	}

	@Override
	public String toString() {
		return "Administrativo [depto=" + depto + ", getNoEmpleado()=" + getNoEmpleado() + ", getNss()=" + getNss()
				+ ", getSueldo()=" + getSueldo() + ", getPuesto()=" + getPuesto() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEmail()=" + getEmail() + ", getCelular()=" + getCelular()
				+ "]";
	}

}
