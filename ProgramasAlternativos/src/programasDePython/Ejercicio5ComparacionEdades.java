package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 * 
 * Crea un programa que lea la edad de dos personas y diga quién es más joven, la primera o la segunda. 
 * Ten en cuenta que ambas pueden tener la misma edad. En tal caso, hazlo saber con un mensaje adecuado.
 *
 *1º Crear las variables.
 *2º Crear un if que diga si la edad1 va a ser mayor que la edad2, o if edad2 > que la edad1 y si no pues ambas
 *   edades serían iguales.
 */

public class Ejercicio5ComparacionEdades {

	public static void main(String[] args) {
		//Scanner para pedir por teclado al usuario las edades
		Scanner s = new Scanner(System.in);
		
		//Creadas las variables de las edades
		System.out.println("Insertame la edad 1: ");
		int edad1 = s.nextInt();
		System.out.println("Insertame la edad 2: ");
		int edad2 = s.nextInt();
		
		//Relaciones de if para poder saber cual edad es mayor, menor o igual
		if (edad1 > edad2) {
			System.out.println("La edad " + edad1 + "es mas grande que la edad " + edad2);
		}else if (edad2 > edad1) {
			System.out.println("La edad " + edad2 + "es mas grande que la edad " + edad1);
		}else {
			System.out.println("Ambas edades son iguales");
		}

	}

}
