package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 *
 *La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro es por el tiempo que ésta
 * dura, de tal forma que los primeros cinco minutos cuestan 1 euro por minuto, los siguientes tres, 80 céntimos por minuto
 * , los siguientes dos minutos, 70 céntimos por minuto, y a partir del décimo minuto, 50 céntimos por minuto.
 * 
 * Además, se carga un impuesto de 3% cuando es domingo, y si es otro día, en turno de mañana, 15%, y en turno de tarde,
 * 10%. Realice un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza una llamada.
 * 
 * Algoritmo:
 * 
 * 1º Preguntamos el tiempo que ha estado en llamada
 * 2º Le preguntamos al usuario si es domingo, si NO es domingo y tampoco es por la tarde el cargo del impuesto es de 0.15,
 * si no es domingo y es por la tarde el impuesto es de 0.1
 * 3º Si la llamada se ha realizado el domingo el cargo por minuto será 0.3
 * 4º Si el tiempo ha sido menos de 5 minutos, el precio de la llamada será el tiempo durado * 100
 * 5º Si no, el tiempo ha sido igual o menor de 8 minutos la llamada, el precio será el tiempo durado - 5 (porque lo que va
 * a costar mas sería los siguiente 3 min) * 80 y le sumamos a ese resultado 500 (que sería 5 min = 5€
 * 6º Si no, el tiempo ha sido igual o menor de 10 minutos la llamada, el precio será el tuempo durado - 8 (por que los
 * siguientes 2 min seran de 70 cent) y le sumariamos 740 del resto de los minutos
 * 7º Si no, el tiempo sería 10 min y por lo cual el ultimo min costaria 50 cent por lo que sería 880 + (tiempo-10) * 50
 * 
 */

public class Ejercicio16LlamadaTelefónica {

	public static void main(String[] args) {
		// Importamos el Scanner para nos inserte por teclado el usuario
	    Scanner s = new Scanner(System.in);
	    
	    //variables
	    
	    double coste; // centimos
	    String esDomingo;
	    int tiempo;
	    String turno="";

	    // Pedimos datos
	    System.out.print("¿Cuánto tiempo es la llamada?: ");
	    tiempo = s.nextInt(); s.nextLine(); // Metemos excepcionalmente dos instrucciones en la misma línea
	    
	    System.out.print("¿Es Domingo? (S/N): ");
	    esDomingo = s.nextLine();
	    
	    if (esDomingo.toUpperCase().equals("N")) {
	      System.out.print("¿Qué turno: Mañana o Tarde? (M/T)?: ");
	      turno = s.nextLine();
	    }

	    // Proceso
	    if (tiempo <= 5) {
	      coste = tiempo * 100;
	    } else if (tiempo <= 8) {
	      coste = (tiempo-5) * 80 + 500;
	    } else if (tiempo <= 10) {
	      coste = (tiempo-8) * 70 + 240+500;
	    } else {
	      coste = (tiempo-10) * 50 + 140+240+500;
	    }
	    // impuestos
	    if (esDomingo.toUpperCase().equals("S")) {
	      coste += coste * 0.03;
	    } else if (turno.toUpperCase().equals("M")) {
	      coste += coste * 0.15;
	    } else {
	      coste += coste*0.10;
	    }
	    System.out.println("El coste de la llamada: " + coste / 100 + " euros.");
	  }

	}
