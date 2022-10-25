package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Nombramos a las variables "numero" e "i" ( el encargado de contar la cantidad de números introducidos ) 
		 * como números enteros
		 */
		int numero, i =0;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Indicamos la función del programa al usuario y le pedimos que nos introduzca el dato requerido
		System.out.print("A continuación, inserte los números de uno en uno para ir contandolos"
				+ " y para salir inserte un número negativo: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		
		//Creamos un bucle, el cual hasta que el número pedido no sea negativo, no va a parar
		while(numero>=0) {
			//Sumamos 1 a la variable "i"
			i++;
			//Pedimos al usuario que inserte otro número
			System.out.print("Inserte otro número: ");
			//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
			numero = sc.nextInt();
		}
		//Una vez introducido un número negativo, el programa saldrá del bucle y mostrará un resultado u otro dependiendo 
		System.out.println(i==1?"Ha insertado "+i+" número":"Ha insertado "+i+" números");
		//Cerramos el scanner
		sc.close();

	}

}
