package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables:
		 * - altura: Altura de los árboles en cm
		 * - alto: La altura más grande
		 */
		int altura = 0, alto=0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos al usuario el programa
		System.out.println("A continuación introduzca las alturas de los árboles y el programa le devolverá el más alto."+
				"\nPara salir del programa introduzca -1");
		
		//Pedimos al usuario que inserte la altura de un árbol
		System.out.print("Introduzca la altura del árbol en cm: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "altura"
		altura = sc.nextInt();
		
		//Comprobamos que la altura sea positiva
		if(altura>=0) {
		/*
		 * Mientras que la altura no sea -1 comprobamos:
		 * - Si la altura introducida es mayor a la más grande ya introducida
		 * - Si la altura introducida es menor a la más grande ya introducida
		 * - Si la altura es negativa pero no -1
		 * En ambas volvemos a pedir al usuario la altura de otro número
		 */
			while(altura!=-1) {
				if(altura>alto) {
					alto = altura;
				}
				else if(altura<0) {
					System.out.println("La altura no puede ser negativa");
					}
				System.out.print("Introduzca la altura de otro árbol en cm: ");
				altura = sc.nextInt();
				}
			}
		
		//Si la altura introducida es -1, salimos del programa
		else if(altura==-1) {
				System.out.println("Saliendo del programa");
			}
		//En otro caso la altura será negativa y se lo decimos al usuario por consola
			else {
				System.out.println("ERROR: La altura no puede ser negativa");
			}
			//Mostramos por pantalla la altura más alta introducida
			System.out.println("El árbol más alto es el que mide "+alto+" cm");
		//cerramos el scanner
		sc.close();

	}

}
