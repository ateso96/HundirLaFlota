package packModelo;
public class FactoryArmamento {

	private static FactoryArmamento miFactoryArmamento;

	private FactoryArmamento() {

	}

		private FactoryArmamento() {

	}

	public static FactoryArmamento getFactoryArmamento() {
		if (miFactoryArmamento == null)
			miFactoryArmamento = new FactoryArmamento();
		return miFactoryArmamento;
	}

	/**
	 * 
	 * @param pTipo
	 */
	public Armamento crearArma(String pTipo) {
		Armamento unArma = null;
		if (pTipo.equals("Bomba"))
			unArma = new Bomba();
		else if (pTipo.equals("Misil"))
			unArma = new Misil();
		else if (pTipo.equals("MisilNS"))
			unArma = new MisilNS();
		else if (pTipo.equals("MisilEO"))
			unArma = new MisilEO();
		else if (pTipo.equals("MisilBOOM"))
			unArma = new MisilBOOM();
		else
			unArma = new Escudo();
		return unArma;
	}

}
