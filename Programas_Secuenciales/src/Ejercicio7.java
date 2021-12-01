
/**
 * @author Francisco José Gómez Ruiz
 * Escribe un programa que declare variables de tipo char y de tipo String. Intenta
 * mostrarlas por pantalla todas juntas en la misma línea y con una sola sentencia
 * de Java (con un solo println) ¿es posible?
 * 
 * 1º Creamos ambas variables y le añadimos su respectiva información
 * 2º Y lo ponemos en un mismo print con el operador +.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		
		char caracter ='a';
		String cadena = "hola";
		
		System.out.println("Esta sería la cadena: " + cadena + " y este sería la vocal añadida: "+ caracter);
		
				
	}

}
