import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 *
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 * 
 * 1º Pedimos la base imponible y la almecamos en una variable
 * 2º Luego a la factura le multiplicamos el IVA para poder saber el total de la factura
 * 3º Lo sacamos por pantalla
 * 
 */

public class Ejercicio6BaseImponible {

	public static void main(String[] args) {
		// Hacemos un Scanner para pedrime al usuario la base imponible
		Scanner s = new Scanner(System.in);
		System.out.println("Dame la base imponible para calcular la factura de tu compra + el IVA: ");
		
		// Pedimos la base imponible al usuario y lo guardamos en la variable
		int baseImponible = s.nextInt();
		
		// Guardo en una variable el IVA y el cálculo del total de la factura
		double IVA = 1.21;
		double total = baseImponible * IVA;
		
		// Lo sacamos por pantalla el resultado
		System.out.println("Este sería el total de la factura + el IVA: " + total);

	}

}
