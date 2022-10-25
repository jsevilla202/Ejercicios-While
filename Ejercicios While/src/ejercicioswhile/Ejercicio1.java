package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Nombramos a las variables "numero" y "suma" ( suma de los numeros y se inicializa a 0 para que no use valores anteriores)
		 * como números enteros
		 */
		int numero, suma=0;
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Indicamos la función del programa al usuario y le pedimos que nos introduzca el dato requerido
		System.out.print("A continuación, inserte los números de uno en uno para ir sumandolos"
				+ " y para salir inserte un número negativo: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
		numero = sc.nextInt();
		
		//Creamos un bucle, el cual hasta que el número pedido no sea negativo, no va a parar
		while(numero>=0) {
			//Vamos calculando la suma de los números en cada repetición del bucle
			suma = suma + numero;
			//Pedimos al usuario que nos inserte otro número
			System.out.print("Inserte otro número: ");
			//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
			numero = sc.nextInt();
		}
		//Una vez introducido un número negativo, el programa saldrá del bucle y mostrará la suma correspondiente
		System.out.println("La suma total es "+suma);
		//Cerramos el scanner
		sc.close();

	}

}
