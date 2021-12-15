package programasDePython;

import java.util.Scanner;

/**
 * @author Francisco Jos� G�mez Ruiz
 *
 *Programa que lea 3 datos de entrada A, B y C. Estos corresponden a las dimensiones de los lados de un tri�ngulo. 
 * El programa debe determinar que tipo de triangulo es, teniendo en cuenta los siguiente:
 *		Si se cumple Pit�goras entonces es tri�ngulo rect�ngulo
 * 		Si s�lo dos lados del tri�ngulo son iguales entonces es is�sceles.
 * 		Si los 3 lados son iguales entonces es equil�tero.
 * 		Si no se cumple ninguna de las condiciones anteriores, es escaleno.
 * 
 * 1� Pedimos los tres lados del triangulo
 * 2� Si vemos que se cumple Pit�goras sacamos por pantalla --> Es un Tri�ngulo Rectangulo
 * 3� Si vemos que los billetes_200 lados del tri�ngulo son iguales entonces sacamos por pantalla --> Es un Tri�ngulo Is�sceles
 * 4� Si vemos que los billetes_100 lados del tri�ngulo son iguales sacamos por pantalla --> Es un Tri�ngulo Equil�tero
 * 5� Si vemos que no se cumple ninguna de las condiciones anteriores, es decir, no tiene ningun lado igual y tampoco
 * cumple Pit�goras entonces sacamos por pantalla --> Es un Triangulo Escaleno
 * 
 */

public class Ejercicio11Triangulos {

	public static void main(String[] args) {
		// Sacamos el Scanner para pedir por pantalla al usuario los 3 lados
		Scanner s = new Scanner(System.in);
		
		//Pedimos los 3 lados del triangulo
		System.out.println("Pedimos el lado A del triangulo: ");
		double ladoA = s.nextDouble();
		System.out.println("Pedimos el lado B del triangulo: ");
		double ladoB = s.nextDouble();
		System.out.println("Pedimos el lado C del triangulo: ");
		double ladoC = s.nextDouble();
		
		//Creamos el ciclo anteriormente dicho en los comentarios para saber como es el triangulo creado segun esos 3 lados.
		if (Math.pow(ladoA,2) + Math.pow(ladoB,2) == Math.pow(ladoC, 2) || Math.pow(ladoB, 2) + Math.pow(ladoC, 2) == Math.pow(ladoA, 2) || Math.pow(ladoC, 2) + Math.pow(ladoA, 2) == Math.pow(ladoB, 2)) {
			System.out.println("Esto ser�a un tri�ngulo Rect�ngulo, debido a que se cumple el Teorema de Pit�goras");
		}
		if ((ladoA  == ladoB && ladoA != ladoC) || (ladoB  == ladoC  && ladoB != ladoA) || (ladoA == ladoC && ladoC != ladoB)) {
			System.out.println("Este ser�a un triangulo Isosceles puesto que tiene dos lados iguales y uno desigual");
		}else {
			if (ladoA == ladoB  && ladoA == ladoC) {
				System.out.println("Esto ser�a un triangulo Equil�tero, puesto que todos los lados del triangulo son iguales");
			}else {
				System.out.println("Esto ser�a un triangulo Escaleno, puesto que todos los lados son diferentes, y no se cumple el Teorema de Pit�goras.");
			}
		}
		

	}

}
