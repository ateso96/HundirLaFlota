package packModelo;
import java.util.Scanner;

public abstract class Barco {

	private String estado;
	private Escudo escudo;
	private Coordenada coordInicio;
	private Coordenada coordFin;
	private int longitud;
	private static int precioReparacion = 30;
	private char orientacion;

	/**
	 * 
	 * @param pEstado
	 */
	public Barco(String pEstado, char pOrientacion,Escudo pEscudo, Coordenada pCoordInicio,
			Coordenada pCoordFin, int pLongitud) {
		estado=pEstado;
		orientacion=pOrientacion;
		escudo=pEscudo ;
		coordInicio=pCoordInicio;
		coordFin= pCoordFin;
		longitud=pLongitud;
		
		
	}

	private boolean hayEscudo() {
		// TODO - implement Barco.hayEscudo
		throw new UnsupportedOperationException();
	}

	public void colocarBarco() {
		// TODO - implement Barco.colocarBarco
		throw new UnsupportedOperationException();
	}

	private boolean comprobarSeparados() {
		// TODO - implement Barco.comprobarSeparados
		throw new UnsupportedOperationException();
	}

	private char pedirOrientacion() {
		orientacion=(Character) null;
		while (orientacion !='U' || orientacion !='D'|| orientacion !='L'||orientacion !='R' ){
		System.out.println("Introduzca Orientacion del tipo U(up), D(Down), L(Left), R(Right)");
		Scanner sc= new Scanner(System.in);
		orientacion=sc.next().charAt(0);
		}
		return orientacion;
		
	}

	private boolean calcularFueraTab() {
		// TODO - implement Barco.calcularFueraTab
		throw new UnsupportedOperationException();
	}

	private Coordenada calcCoordFinal() {
		int fila=coordFin.getFila();
		int col=coordFin.getCol();
		
		switch(orientacion){
		case 'U':
			fila=coordInicio.getFila()-longitud;
			col=coordInicio.getCol();
			break;
		case 'D':
			fila=coordInicio.getFila()+longitud;
			col=coordInicio.getCol();
			break;
		case 'L':
			fila= coordInicio.getFila();
			col= coordInicio.getCol()-longitud;
			break;
		case 'R':
			fila= coordInicio.getFila();
			col= coordInicio.getCol()+longitud;
			break;
			
			
		}
		 coordFin.crearCoordenada(fila, col);
		 return coordFin;
		
		
	}

	/**
	 * 
	 * @param pEscudo
	 */
	public void ponerEscudo(Escudo pEscudo) {
		// TODO - implement Barco.ponerEscudo
		throw new UnsupportedOperationException();
	}

}
