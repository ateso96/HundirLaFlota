package packModelo;
import java.util.Collection;
import java.util.Iterator;

public class ColeccionBarcos {

	private Collection<Barco> col;

		public ColeccionBarcos() {
		for (int i = 1; i <= 4; i ++)
			col.add(FactoryBarcos.getFactoryBarcos().crearBarco("Fragata"));
		for (int i = 1; i <= 3; i ++)
			col.add(FactoryBarcos.getFactoryBarcos().crearBarco("Destructor"));
		for (int i = 1; i <= 2; i ++)
			col.add(FactoryBarcos.getFactoryBarcos().crearBarco("Submarino"));
		for (int i = 1; i <= 1; i ++)
			col.add(FactoryBarcos.getFactoryBarcos().crearBarco("Portaaviones"));
	}

	private Iterator<Barco> getIterador() {
		return col.iterator();
	}

	public void delBarco() {
		// TODO - implement ColeccionBarcos.delBarco
		throw new UnsupportedOperationException();
	}

	public void colocarJugador() {
		Iterator<Barco> itr = getIterador();
		while (itr.hasNext()) {
			Barco unBarco = itr.next();
			unBarco.colocarBarcoJugador();
		}
	}
	
	public void colocarOrdenador() {
		Iterator<Barco> itr = getIterador();
		while (itr.hasNext()) {
			Barco unBarco = itr.next();
			unBarco.colocarBarcoOrdenador();
		}
	}

	private Barco getBarco() {
		// TODO - implement ColeccionBarcos.getBarco
		throw new UnsupportedOperationException();
	}

	public void ponerEscudoJugador(Escudo pEscudo) {
		Barco miBarco=null;//deberá contener el barco seleccionado
		Iterator<Barco> itr = getIterador();
		while (itr.hasNext()) {
			Barco unBarco = itr.next();
			if(unBarco.equals(miBarco) ){
				if (!miBarco.hayEscudo())
					miBarco.ponerEscudo(pEscudo);	
			}
		}
	}
	
	public void ponerEscudoOrdenador(Escudo pEscudo) {
		Iterator<Barco> itr = getIterador();
		while (itr.hasNext()) {
			Barco unBarco = itr.next();
			if (!unBarco.hayEscudo())
				unBarco.ponerEscudo(pEscudo);
			
		
	}

}
