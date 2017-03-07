package packModelo;
public class Ordenador extends Usuario {

	private static Ordenador miOrdenador;

	private Ordenador() {
		super();
	}

	public static Ordenador getOrdenador() {
		if(miOrdenador==null){
			miOrdenador= new Ordenador();
		}
		return miOrdenador;
	}
	public void ponerEscudo() {
		Escudo miEscudo = delEscudo();
	}
	private Escudo delEscudo() {
		return null;
	}
}
