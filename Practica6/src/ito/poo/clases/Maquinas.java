/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;
import java.time.LocalDate;

public class Maquinas {
	private String descripcion = "";

	private java.time.LocalDate fechaAdquisicion = null;

	private int costo = 0;

	private int botellasXmin = 0;

	public Maquinas(String descripcion, LocalDate fechaAdquisicion, int costo, int botellasXmin) {
		super();
		this.descripcion = descripcion;
		this.fechaAdquisicion = fechaAdquisicion;
		this.costo = costo;
		this.botellasXmin = botellasXmin;
	} 
	public Maquinas() {
		super();
		// End of user code
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	public void setDescripcion(String newDescripcion) {
		this.descripcion = newDescripcion;
	}
	public java.time.LocalDate getFechaAdquisicion() {
		return this.fechaAdquisicion;
	}
	public void setFechaAdquisicion(java.time.LocalDate newFechaAdquisicion) {
		this.fechaAdquisicion = newFechaAdquisicion;
	}
	public int getCosto() {
		return this.costo;
	}
	public void setCosto(int newCosto) {
		this.costo = newCosto;
	}
	public int getBotellasXmin() {
		return this.botellasXmin;
	}
	public void setBotellasXmin(int newBotellasXmin) {
		this.botellasXmin = newBotellasXmin;
	}
}
