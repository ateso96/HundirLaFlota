package packModelo;
public abstract class FactoryBarcos {

	private static FactoryBarcos miFactoryBarcos;

		private FactoryBarcos() {
		
	}

	public static FactoryBarcos getFactoryBarcos() {
		if (miFactoryBarcos == null) 
			miFactoryBarcos = new FactoryBarcos();
		return miFactoryBarcos;
	}

	/**
	 * 
	 * @param pTipo
	 */
	public Barco crearBarco(String pTipo) {
		Barco unBarco = null;
		if (pTipo.equals("Fragata"))
			unBarco = new Fragata();
		else if (pTipo.equals("Destructor"))
			unBarco = new Destructor();
		else if (pTipo.equals("Submarino"))
			unBarco = new Submarino();
		else 
			unBarco = new Portaaviones();
		return unBarco;
	}

}
