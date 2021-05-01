/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;
import java.time.LocalDate;
public class MaquinaLlenadoyEnvasado extends Maquinas {
	public MaquinaLlenadoyEnvasado(LocalDate fechaAdquisicion, int costo, int botellasXmin,
			String mililitros) {
		super("Maquina de Lenado Y Envasado", fechaAdquisicion, costo, botellasXmin);
		this.mililitros = mililitros;
	}
	private String mililitros = "";
	public MaquinaLlenadoyEnvasado() {
		super();
	}
	public double costoLlyEn() {
		double costoLlyEn = ((0.25*this.getCosto())/100)/this.getBotellasXmin();
		return costoLlyEn;
	}
	public String getMililitros() {
		return this.mililitros;
	}
	public void setMililitros(String newMililitros) {
		this.mililitros = newMililitros;
	}
	@Override
	public String toString() {
		return "MaquinaLlenadoyEnvasado [mililitros=" + mililitros + ", Descripcion=" + getDescripcion()
				+ ", FechaAdquisicion=" + getFechaAdquisicion() + ", CostoMaquina=" + getCosto()
				+ ", BotellasLlenYemp=" + getBotellasXmin() + "]";
	}

}
