package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco Jos� G�mez Ruiz
 *
 * Programa que lea una cadena por teclado y compruebe si es una letra may�scula.
 * 
 * 1� Pedimos la variable de la cadena al usuario
 * 2� Hacemos un ciclo if para saber si la cadena insertada de un caracter por el usuario es una mayuscula o no
 * 3� Si lo es le sacaremos por pantalla --> Es una letra may�scula 
 * 4� Si no lo es le sacaremos por pantalla --> No es una letra may�scula
 * 
 */

public class Ejercicio6CadenaMayuscula {

	public static void main(String[] args) {
		//Ponemos el scanner para pedir por teclado al usuario las variables
		Scanner s = new Scanner(System.in);
		
		//Pedimos la variable al usuario de la cadena
		System.out.println("Pedimos una cadena de un solo caracter para saber si es mayuscula o no: ");
		String cadena = s.next();
		
		//Creamos un if para saber si la cadena insertada esta en mayuscula o no
		if (cadena == cadena.toUpperCase()) {
			System.out.println("El caracter insertado en la cadena es una letra may�scula.");
		}else {
			System.out.println("El caracter insertado en la cadena es una letra min�scula.");
		}

	}

}
