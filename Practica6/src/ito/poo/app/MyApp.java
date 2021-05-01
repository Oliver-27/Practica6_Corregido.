//DelaCruzBautista
package ito.poo.app;
import java.time.LocalDate;
import ito.poo.clases.MaquinaLavado;
import ito.poo.clases.MaquinaLlenadoyEnvasado;
import ito.poo.clases.MaquinaEmpaquetado;
public class MyApp {

	static void run() {
		MaquinaLavado x;
		
		x = new MaquinaLavado(LocalDate.of(2021, 04, 27), 15000, 3, 4500);
		System.out.println(x);
		System.out.println("Costo lavado:"+x.costoLavado());

		MaquinaLlenadoyEnvasado y;
		y = new MaquinaLlenadoyEnvasado(LocalDate.of(2021, 04, 28), 5000, 15, "13,14,16");
		System.out.println(y);
		System.out.println("Costo llenado y envasado:"+y.costoLlyEn());

		MaquinaEmpaquetado z;
		z = new MaquinaEmpaquetado(LocalDate.of(2021, 04, 27), 8500, 27, "Carton de 6");
		System.out.println(z);
		System.out.println("Costo empaquetado:"+z.costoEmpaquetado());
	}
	
	public static void main(String[] args) {
		run();
	}
}
