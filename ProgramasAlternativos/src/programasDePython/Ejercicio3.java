/**
 * 
 */
package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco Jos� G�mez Ruiz
 * 
 * Escribe un programa que lea un n�mero e indique si es par o impar.
 *
 * 1� Pedimos el n�mero al usuario
 * 2� Calculamos para saber si es impar o no
 * 3� Sacamos por pantalla si el n�mero insertado es impar o par
 * 
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Pedimos el n�mero y creamos una variable resto para saber si al hacer la division entre 2 su resto 
		//es igual a 0 o no
		int numero = s.nextInt();
		int resto = numero % 2;
		
		//Creamos un bucle en el que sabremos dependiendo del resto si el n�mero es par o impar
		if (resto == 0) {
			System.out.println("El n�mero que me has insertado es par.");
		}else {
			System.out.println("El n�mero que me has insertado es impar.");
		}

	}

}
