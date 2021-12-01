import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 *
 * 1º Pedimos al usuario los euros que queires cambiar a pesetas
 * 2º Guardamos los euros pedidos en una variable
 * 3º Lo convertimos a pesetas multiplicando por 166.386 que es lo que valdría un euro y lo sacamos por pantalla
 * 
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// Hacemos un scanner para pedirle al usuario los euros que quiere convertir a pesetas
		Scanner s = new Scanner(System.in);
		
		System.out.println("Dame la cantidad de euros para pasartelo a pesetas: ");
		// Guardamos en un variable los euros que nos ha insertado el usuario
		
		double euros = s.nextDouble();
		long pesetas = (long) (euros * 166.386);
		
		// Lo sacamos por pantalla 
		System.out.println("La cantidad de euros insertados sería: " + pesetas + " pesetas");
		

	}

}
