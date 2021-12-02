package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 * 
 * Diseña un programa que lea un carácter de teclado y muestre por pantalla el mensaje «Es signo de puntuación» 
 * solo si el carácter leído es un signo de puntuación, «Es una letra» si es una letra (da igual que sea 
 * mayúscula, minúscula o acentuada), «Es un dígito» si es un dígito, «Es otro carácter» si no es ninguno de 
 * los anteriores y «No es un carácter» si el usuario ha introducido más de un carácter.
 *
 *1º Creamos las constantes de las PUNTUACIONES y NUMEROS
 *2º Pedimos al usuario la cadena
 *3º Hacemos un bucle en el que miramos si dentro de las PUNTUACIONES es igual al valor de la cadena si es asi lo sacamos por pantalla
 *4º Si dentro de los NUMEROS es igual al valor de la cadena lo sacamos por pantalla
 *5º Y si no será una letra y los sacamos por pantalla 
 */

public class Ejercicio9CaracterPorTeclado {
	
	//Creamos 3 constantes en las que almacenaremos tanto los signos de puntuación, los números y todas las letras
	static String PUNTUACIONES = "\'\"\\!#$%&()*+, -./:;<=>?@[]^_`{|}~";
	static String NUMEROS = "1234567890";
	
	public static void main(String[] args) {
		//Importamos Scanner para pedirle al usuario las variables
		Scanner s = new Scanner(System.in);
		
		//Pedimos la variable al usuario
		System.out.println("Insertame una cadena para decirte si es una puntuacion, un número o una letra (da igual si eres minúscula o mayúscula): ");
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
