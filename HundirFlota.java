package packModelo;
public class HundirFlota {

	private static HundirFlota miHundirFlota;

	private HundirFlota() {
		
	}

	public static HundirFlota getHundirFlota() {
		if (miHundirFlota == null)
			miHundirFlota = new HundirFlota();
		return miHundirFlota;
	}

	public void iniciarJuego() {
		Jugador.getJugador().ponerBarcos();
		Ordenador.getOrdenador().ponerBarcos();
	}

	private void inicializarArsenales() {
		// TODO - implement HundirFlota.inicializarArsenales
		throw new UnsupportedOperationException();
	}

	private void inicializarFlotas() {
		// TODO - implement HundirFlota.inicializarFlotas
		throw new UnsupportedOperationException();
	}

	private void finJuego() {
		// TODO - implement HundirFlota.finJuego
		throw new UnsupportedOperationException();
	}

}
