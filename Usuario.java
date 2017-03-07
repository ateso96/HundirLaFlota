package packModelo;
import java.util.Collection;

public abstract class Usuario {

	private int dinero = 500;
	private ColeccionArmamento armamento;
	private ColeccionBarcos flota;
	private ColeccionBarcos flotaAdversario;
	private Collection<Coordenada> registroDisparos;
	private int reparaciones = 10;
	private int usosRadar = 3;

	public Usuario() {
		armamento = new ColeccionArmamento();
		flota = new ColeccionBarcos();
		flotaAdversario = flota;
		registroDisparos = new ArrayList<Coordenada>();

	public void ponerBarcos() {
		flota.colocar();
	}

	private void reducirArmamento() {
		// TODO - implement Usuario.reducirArmamento
		throw new UnsupportedOperationException();
	}

	public void ponerEscudo() {
		// TODO - implement Usuario.ponerEscudo
		throw new UnsupportedOperationException();
	}

	private Escudo delEscudo() {
		// TODO - implement Usuario.delEscudo
		throw new UnsupportedOperationException();
	}

}
