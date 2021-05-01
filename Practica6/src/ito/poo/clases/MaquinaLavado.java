/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;
import java.time.LocalDate;

public class MaquinaLavado extends Maquinas {

	private int capacidadL = 0;
	public MaquinaLavado(LocalDate fechaAdquisicion, int costo, int botellasXmin, int capacidadL) {
		super("Maquina de Lavado", fechaAdquisicion, costo, botellasXmin);
		this.capacidadL = capacidadL;
	}
	public MaquinaLavado() {
		super();
	}
	public double costoLavado() {
		double costoLavado = ((0.5*this.getCosto())/100)/this.getBotellasXmin();
		return costoLavado;
	}
	public int getCapacidadL() {
		return this.capacidadL;
	}

	public void setCapacidadL(int newCapacidadL) {
		this.capacidadL = newCapacidadL;
	}

	@Override
	public String toString() {
		return "MaquinaLavado [capacidadL=" + capacidadL + ", Descripcion=" + getDescripcion()
				+ ", FechaAdquisicion=" + getFechaAdquisicion() + ", CostoMaquina=" + getCosto()
				+ ", BotellasLavadasXmin=" + getBotellasXmin() + "]";
	}

}
