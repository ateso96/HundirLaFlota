package packModelo;
import java.util.Collection;

public class Almacen {
//honion
	private Collection<Armamento> existencias;
	private static Almacen miAlmacen;

private Almacen() {
		for (int i = 1; i <= 20; i ++)
			existencias.add(FactoryArmamento.getFactoryArmamento().crearArma("Bomba"));
		for (int i = 1; i <= 6; i ++)
			existencias.add(FactoryArmamento.getFactoryArmamento().crearArma("Misil"));
		for (int i = 1; i <= 4; i ++)
			existencias.add(FactoryArmamento.getFactoryArmamento().crearArma("MisilNS"));
		for (int i = 1; i <= 4; i ++)
			existencias.add(FactoryArmamento.getFactoryArmamento().crearArma("MisilEO"));
		for (int i = 1; i <= 2; i ++)
			existencias.add(FactoryArmamento.getFactoryArmamento().crearArma("MisilBOOM"));
		for (int i = 1; i <= 2; i ++)
			existencias.add(FactoryArmamento.getFactoryArmamento().crearArma("Escudo"));
	}

	public static Almacen getAlmacen() {
		if (miAlmacen == null)
			miAlmacen = new Almacen();
		return miAlmacen;
	}

	public Armamento comprar() {
	}
	
	private void reducirExistencias(Armamento pArmamento) {
	}

	public void inicializarAlmacen() {
	}

}
