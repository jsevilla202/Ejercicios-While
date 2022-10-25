package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Nombramos a las variables "numero" como números enteros
		 */
		int numero;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		//Presentamos la funcion del programa al usuario
		System.out.print("Inserte números y el programa comprobará si son pares o impares, para finalizar inserte 0");
		//Pedimos al usuario que inserte el primer número
		System.out.print("Inserte el primer número, por favor: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		
		//Creamos un bucle, el cual hasta que el número pedido no sea 0, no va a parar
		while(numero!=0) {
			//Dependiendo si el número es par o impar, se mostrara un resultado u otro por consola
			System.out.println(numero%2==0?"El número introducido es par":"El número introducido es impar");
			//Pedimos al usuario que nos inserte otro número
			System.out.print("Inserte otro número, por favor: ");
			//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
			numero = sc.nextInt();
		}
		//Cerramos el scanner
		sc.close();

	}

}
