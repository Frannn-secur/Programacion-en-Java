/**
 * 
 */
package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 * 
 * Escribe un programa que lea un número e indique si es par o impar.
 *
 * 1º Pedimos el número al usuario
 * 2º Calculamos para saber si es impar o no
 * 3º Sacamos por pantalla si el número insertado es impar o par
 * 
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Pedimos el número y creamos una variable resto para saber si al hacer la division entre 2 su resto 
		//es igual a 0 o no
		int numero = s.nextInt();
		int resto = numero % 2;
		
		//Creamos un bucle en el que sabremos dependiendo del resto si el número es par o impar
		if (resto == 0) {
			System.out.println("El número que me has insertado es par.");
		}else {
			System.out.println("El número que me has insertado es impar.");
		}

	}

}
