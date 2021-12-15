package programasDePython;

import java.util.Scanner;

/**
 * 
 * @author Francisco José Gómez Ruiz
 * 
 * Escribir un programa que lea un año indicar si es bisiesto.
 * 
 * Nota: un año es bisiesto si es un número divisible por 4, pero no si es divisible por 100, excepto que también sea
 * divisible por 400.
 *
 * Algoritmo: 
 * 
 * 1º Pedimos el anno al usuario
 * 2º Hacemos un ciclo para saber si el año puede ser divisible por 4 y que no lo sea por 100 y que tambien lo sea por 400
 * 3º Si ninguna de las anteriores se cumple no lo es
 * 
 */

public class Ejercicio12Bisiesto {

	public static void main(String[] args) {
		// Sacamos el Scanner para pedirle al usuario el número del anno
		
		Scanner s = new Scanner(System.in);

		//Pedimos el anno
		System.out.println("Dame el numero del anno que quieres saber si es bisiesto o no: ");
		int anno = s.nextInt();
		
		// Si el anno es divisible por 4 no entre 100 y tambien que sea divisible por 400
		if ((anno % 4 == 0 && !(anno % 100 == 0)) || anno % 400 == 0) {
			System.out.println("Es un anno bisiesto: " + anno);
		}else {
			System.out.println("No es un anno bisiesto: " + anno );
		}
	}

}
