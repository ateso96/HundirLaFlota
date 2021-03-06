package packModelo;
import java.util.Scanner;

public class Jugador extends Usuario {

	private String nombre;
	private static Jugador miJugador;

	private Jugador() {
		super();
		nombre = pedirNombre();
	}

	public static Jugador getJugador() {
		if (miJugador==null){
			miJugador=new Jugador();
		}
		return miJugador;
	}
	
	public void ponerBarcos() {
		getFlota().colocarJugador();
	}

	private String pedirNombre() {
		String nombre;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce tu nombre de usuario");
		nombre = sc.nextLine();
		return nombre;
	}
	
	public Coordenada pedirCoordenada() {
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
}
