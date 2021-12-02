package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 * 
 * Programa que pida dos números e indique si el primero es mayor que el segundo o no.
 * 
 * 1º Pedimos ambos números 
 * 2º Si es mayor el numero 1 que el 2 sacamos por pantalla que el numero 1 es mayor
 * 3º Si no ocurre eso el numero 2 es mayor y lo sacamos por pantalla
 * 
 */

public class Ejercicio1ComparacionDosNumeros {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// Pedimos los número al usuario para poder comparlos
		System.out.println("Este sería el número 1: ");
		int num1 = s.nextInt();
		System.out.println("Este sería el número 2: ");
		int num2 = s.nextInt();
		
		// Creamos un bucle que nos permitirá saber si el número 1 es mayor que el número 2.
		if (num1 > num2) {
			System.out.println("El número 1 es mayor que el número 2.");
		}else {
			System.out.println("El número 1 no es mayor que el número 2.");
		}

	}

}
