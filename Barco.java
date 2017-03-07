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
		boolean hay=true;;
		if(escudo==null){
			hay=false;
		}
		return hay;
	}

	public void colocarBarco() {
		int cont=0;
		coordInicio=pedirCoordenada();
		orientacion=pedirOrientacion();
		coordFin=calcCoordFinal();
		while (coordenadaOcupada(coordInicio)|| calcularFueraTab()|| comprobarSeparados()==false){
			System.out.println("vuelva a introducir coordenadas");
			coordInicio=pedirCoordenada();
			orientacion=pedirOrientacion();
			coordFin=calcCoordFinal();
		}
		ponerEscudo(escudo);
	}
	private boolean coordenadaOcupada(Coordenada coor){
		boolean ocupada=false;
		if(coor!=null){
			ocupada=true;
		}
		
		return ocupada;
	}

	private boolean comprobarSeparados() {
		int fila=coordInicio.getFila();
		int fila2= coordFin.getFila();
		int col=coordInicio.getFila();
		int col2= coordFin.getFila();
		int i= fila;
		int j= col;
		Coordenada coorActual = null;
		boolean separados=true;
		switch(orientacion){
		case 'U':
			i=i+1;
			while (i<=fila2||separados){
				coorActual.crearCoordenada(i, j);
				if(coordenadaOcupada(coorActual)){
					separados=false;
				}

			}
			break;
		case 'D':
			i=i-1;
			while (i>=fila2||separados){
				coorActual.crearCoordenada(i, j);
				if(coordenadaOcupada(coorActual)){
					separados=false;
				}

			}
			break;
		case 'L':
			j=j-1;
			while (j>=col2||separados){
				coorActual.crearCoordenada(i, j);
				if(coordenadaOcupada(coorActual)){
					separados=false;
				}

			}
			break;
		case 'R':
			j=j+1;
			while (i<=col2||separados){
				coorActual.crearCoordenada(i, j);
				if(coordenadaOcupada(coorActual)){
					separados=false;
				}

			}
			break;
			
		
		}
		
		return separados;
	}

	private Coordenada pedirCoordenada() {
		Coordenada coor=null;
		
		int f;
		int c;
		System.out.println("Introduzca Coordenadas");
		Scanner sc= new Scanner(System.in);
		f= sc.nextInt();
		c=sc.nextInt();		
		coor.crearCoordenada(f, c);
		return coor;
		
		
		
		
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
		int fila= coordFin.getFila();
		int col= coordFin.getCol();
		boolean fuera=false;
		if(fila>10||col>10){
			fuera=true;
		}
		return fuera;
		
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
		pEscudo= new Escudo("entero");
		
	}

}
