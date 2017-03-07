package packModelo;
import java.util.Collection;
import java.util.Iterator;

public class ColeccionBarcos {

	private Collection<Barco> col;

	public ColeccionBarcos() {
		// TODO - implement ColeccionBarcos.ColeccionBarcos
		throw new UnsupportedOperationException();
	}

		private Iterator<Barco> getIterador() {
		return col.iterator();
	}

	public void delBarco() {
		// TODO - implement ColeccionBarcos.delBarco
		throw new UnsupportedOperationException();
	}

	public void colocar() {
		Iterator<Barco> itr = getIterador();
		while (itr.hasNext()) {
			Barco unBarco = itr.next();
			unBarco.colocarBarco();
		}
	}

	private Barco getBarco() {
		// TODO - implement ColeccionBarcos.getBarco
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pEscudo
	 */
	public void ponerEscudo(Escudo pEscudo) {
		// TODO - implement ColeccionBarcos.ponerEscudo
		throw new UnsupportedOperationException();
	}

}
