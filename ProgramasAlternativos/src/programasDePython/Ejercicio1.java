/**
 * 
 */
package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco Jos� G�mez Ruiz
 * 
 * Programa que pida dos n�meros e indique si el primero es mayor que el segundo o no.
 * 
 * 1� Pedimos ambos n�meros 
 * 2� Comprobamos si son mayores o no
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Pedimos los n�mero al usuario para poder comparlos
		System.out.println("Este ser�a el n�mero 1: ");
		int num1 = s.nextInt();
		System.out.println("Este ser�a el n�mero 2: ");
		int num2 = s.nextInt();
		
		// Creamos un bucle que nos permitir� saber si el n�mero 1 es mayor que el n�mero 2.
		if (num1 > num2) {
			System.out.println("El n�mero 1 es mayor que el n�mero 2.");
		}else {
			System.out.println("El n�mero 1 no es mayor que el n�mero 2.");
		}

	}

}
