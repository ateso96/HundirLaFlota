package packModelo;
import java.util.Collection;

public class Almacen {

	private Collection<Armamento> existencias;

	public Almacen() {
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
	
	private Iterator<Armamento> getIterador() {
		return existencias.iterator();
	}

	public Armamento comprar(String pArma) {
		
	}
	
	private void reducirExistencias(Armamento pArmamento) {
	}

}
