package packModelo;
public class Escudo extends Armamento {

	private String estado;
	private static int precio = 30;

	public Escudo() {
		super(precio);
		estado = "Ok";
	}
	
	public void danoRecibido() {
		// TODO - implement Escudo.dañoRecibido
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param pEstado
	 */
	public void actualizarEstado(String pEstado) {
		// TODO - implement Escudo.actualizarEstado
		throw new UnsupportedOperationException();
	}

}
