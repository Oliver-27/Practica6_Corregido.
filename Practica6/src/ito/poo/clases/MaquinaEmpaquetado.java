/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;
import java.time.LocalDate;
public class MaquinaEmpaquetado extends Maquinas {

	public MaquinaEmpaquetado(LocalDate fechaAdquisicion, int costo, int botellasXmin,
			String tipoEmpaque) {
		super("Maquina Empaquetado", fechaAdquisicion, costo, botellasXmin);
		this.tipoEmpaque = tipoEmpaque;
	}

	private String tipoEmpaque = "";
	public MaquinaEmpaquetado() {
		super();
	}
	public double costoEmpaquetado() {
		double costoEmpaquetado = ((0.06*this.getCosto())/100)/this.getBotellasXmin();
		return costoEmpaquetado;
	}
	public String getTipoEmpaque() {
		return this.tipoEmpaque;
	}
	public void setTipoEmpaque(String newTipoEmpaque) {
		this.tipoEmpaque = newTipoEmpaque;
	}
	@Override
	public String toString() {
		return "MaquinaEmpaquetado [tipoEmpaque=" + tipoEmpaque + ", Descripcion=" + getDescripcion()
				+ ", FechaAdquisicion=" + getFechaAdquisicion() + ", CostoMaquina=" + getCosto()
				+ ", BotellasEmpaquetadasXmin=" + getBotellasXmin() + "]";
	}
}
