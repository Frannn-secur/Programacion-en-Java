package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco José Gómez Ruiz
 * 
 * El director de una escuela está organizando un viaje de estudios, y requiere determinar cuánto debe cobrar a cada alumno
 * y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o
 * más, el costo por cada alumno es de 65 euros; de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros, y
 * si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. Realiza un
 * programa que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.
 *
 * Algoritmo:
 * 1º Lo primero que haríamos sería pedir el numero de Alumnos, y ahora hacemos lo siguiente
 * 2º Si el número de alumnos que nos han dado fuese mayor o igual a 100 sacamos por pantalla --> El pago a la agencia es
 * de (multiplicamos el numero de alumnos por 65 porque es lo que paga cada alumno)
 * 3º Si no, el numero de alumnos es de 99 a 50 nos sacará por pantalla --> El pago a la agencia es de (multiplicamos el
 * numero de alumnos por 70 euros porque sería lo que pagaría cada uno)
 * 4º Si no, el número de los alumnos es de 49 a 30  sacamos por pantalla --> El pago a la agencia es de (multiplicamos el
 * numero de alumnos por 95 porque es lo que pagaría cada alumno)
 * 5º Si no, el número sacamos por pantalla --> Como el numero de alumnos es menor de 30 costará el pago de la agencia
 * 4000/numeroalumnos
 * 
 */

public class Ejercicio15ViajeEscuela {

	public static void main(String[] args) {
		//Sacamos Scanner para pedirle al usuario por pantalla
		Scanner s = new Scanner(System.in);
		
	    int costeAutobus;
	    double costePorAlumno = 0;
	    int numAlumnos;

	    // Pedimos datos
	    System.out.print("¿Cuántos alumnos participan en la actividad?: ");
	    numAlumnos = s.nextInt();

	    // Proceso
	    if (numAlumnos >= 100) {
	      costePorAlumno = 65;
	    }
	    else if (numAlumnos >= 50) {
	      costePorAlumno = 70;
	    }
	    else if (numAlumnos >= 30) {
	      costePorAlumno = 95;
	    }
	    else if (numAlumnos > 0) {
	      costePorAlumno = 4000.0 / numAlumnos;
	    }
	    if (numAlumnos > 0) {
	      costeAutobus = (int) (numAlumnos * costePorAlumno);
	      System.out.println("El coste por alumno es " + costePorAlumno + " euros.");
	      System.out.println("El coste del autobús es " + costeAutobus + " euros.");
	    } else {
	      System.out.println("El número de alumnos debe ser un valor positivo.");
	    }
	  }


	}
