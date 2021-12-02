package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco Jos� G�mez Ruiz
 * 
 * Dise�a un programa que lea un car�cter de teclado y muestre por pantalla el mensaje �Es signo de puntuaci�n� 
 * solo si el car�cter le�do es un signo de puntuaci�n, �Es una letra� si es una letra (da igual que sea 
 * may�scula, min�scula o acentuada), �Es un d�gito� si es un d�gito, �Es otro car�cter� si no es ninguno de 
 * los anteriores y �No es un car�cter� si el usuario ha introducido m�s de un car�cter.
 *
 *1� Creamos las constantes de las PUNTUACIONES y NUMEROS
 *2� Pedimos al usuario la cadena
 *3� Hacemos un bucle en el que miramos si dentro de las PUNTUACIONES es igual al valor de la cadena si es asi lo sacamos por pantalla
 *4� Si dentro de los NUMEROS es igual al valor de la cadena lo sacamos por pantalla
 *5� Y si no ser� una letra y los sacamos por pantalla 
 */

public class Ejercicio9CaracterPorTeclado {
	
	//Creamos 3 constantes en las que almacenaremos tanto los signos de puntuaci�n, los n�meros y todas las letras
	static String PUNTUACIONES = "\'\"\\!#$%&()*+, -./:;<=>?@[]^_`{|}~";
	static String NUMEROS = "1234567890";
	
	public static void main(String[] args) {
		//Importamos Scanner para pedirle al usuario las variables
		Scanner s = new Scanner(System.in);
		
		//Pedimos la variable al usuario
		System.out.println("Insertame una cadena para decirte si es una puntuacion, un n�mero o una letra (da igual si eres min�scula o may�scula): ");
		String cadena = s.next();
		
		//Creo un bucle en que comprobare si la cadena es una PUNTUACION, un NUMERO o una LETRA.
		if ( cadena.length() == 1) {
			if (PUNTUACIONES.contains(cadena)) {
				System.out.println("Eso que me has insertado es una puntuacion");
			}else if (NUMEROS.contains(cadena)) {
				System.out.println("Eso que me has insertado es un numero");
			}else {
				System.out.println("Eso que me has insertado es una letra");
			}
		}
		
		

	}

}
