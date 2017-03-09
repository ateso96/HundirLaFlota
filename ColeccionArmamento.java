package packModelo;
import java.util.Collection;
import java.util.Iterator;

public class ColeccionArmamento {

	private Collection<Armamento> col;

	public ColeccionArmamento() {
		for (int i = 1; i <= 25; i ++)
			col.add(FactoryArmamento.getFactoryArmamento().crearArma("Bomba"));
		for (int i = 1; i <= 3; i ++)
			col.add(FactoryArmamento.getFactoryArmamento().crearArma("Misil"));
		for (int i = 1; i <= 3; i ++)
			col.add(FactoryArmamento.getFactoryArmamento().crearArma("Escudo"));
	}

	private Iterator<Armamento> getIterador() {
		return col.iterator();
	}

	public void delArmas() {
	
	}

	public void addArmamento() {
		
	}

	public Escudo delEscudo() {
		Iterator<Armamento> itr= getIterador();
		while (itr.hasNext()){
			Armamento miArmamento= itr.next();
			if(miArmamento instanceof Escudo){
				itr.remove();
				return (Escudo) miArmamento;	
			}
		}
		return null;
	}

}
