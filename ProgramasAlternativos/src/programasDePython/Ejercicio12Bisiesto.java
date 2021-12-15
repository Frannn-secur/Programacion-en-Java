package programasDePython;

import java.util.Scanner;

/**
 * 
 * @author Francisco Jos� G�mez Ruiz
 * 
 * Escribir un programa que lea un a�o indicar si es bisiesto.
 * 
 * Nota: un a�o es bisiesto si es un n�mero divisible por 4, pero no si es divisible por 100, excepto que tambi�n sea
 * divisible por 400.
 *
 * Algoritmo: 
 * 
 * 1� Pedimos el anno al usuario
 * 2� Hacemos un ciclo para saber si el a�o puede ser divisible por 4 y que no lo sea por 100 y que tambien lo sea por 400
 * 3� Si ninguna de las anteriores se cumple no lo es
 * 
 */

public class Ejercicio12Bisiesto {

	public static void main(String[] args) {
		// Sacamos el Scanner para pedirle al usuario el n�mero del anno
		
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
