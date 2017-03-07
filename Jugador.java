package packModelo;
import java.util.Scanner;

public class Jugador extends Usuario {

	private String nombre;
	private static Jugador miJugador;

	private Jugador() {
		
	}

	public static Jugador getJugador() {
		if (miJugador==null){
			miJugador=new Jugador();
		}
		return miJugador;
	}

	private String pedirNombre() {
		String nombre;
		Scanner sc= new Scanner(System.in); 
		System.out.println("Introduce tu nombre de usuario");
		nombre = sc.nextLine();
		return nombre;
	}

}