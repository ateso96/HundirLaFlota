package packModelo;
public abstract class Arma extends Armamento {

	private char danoZona;

	public Arma(int pPrecio, char pZona) {
		super(pPrecio);
		danoZona = pZona;
	}
}
