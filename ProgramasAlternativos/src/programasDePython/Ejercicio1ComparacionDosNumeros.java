package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco Jos� G�mez Ruiz
 * 
 * Programa que pida dos n�meros e indique si el primero es mayor que el segundo o no.
 * 
 * 1� Pedimos ambos n�meros 
 * 2� Si es mayor el numero 1 que el 2 sacamos por pantalla que el numero 1 es mayor
 * 3� Si no ocurre eso el numero 2 es mayor y lo sacamos por pantalla
 * 
 */

public class Ejercicio1ComparacionDosNumeros {

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
