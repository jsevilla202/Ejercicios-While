package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables:
		 * - numero: Número introducido por el usuario
		 * - i: Se inicializa a 1. Es el encargado de contra las veces que se repite el bucle
		 * - suma: Se inicializa a 0. Es la suma de los números pares
		 * - nceros: Se inicializa a 0. Es el número total de veces que el usuario ha introducido 0
		 * - suman: Se inicializa a 0. Es la suma de los número negativos
		 * - nnegativos: Se incializa a 0. Es el número total de veces que el usuario ha introducido un número negativo
		 */
		int numero, i = 0, suma = 0, nceros = 0, suman = 0, nnegativo = 0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos la funcion del programa al usuario
		System.out.print("A continuación, inserte 10 número, pueden ser positivos o negativos, y al finalizar se mostrara:"
				+ "\nLa suma de los números positivos\nLa media de los números negativos"
				+ "\nEl número de ceros que ha introducido\n");
		
		//Creamos un bucle que se repita 10 veces, el cual contiene
		while(i!=10) {
			//Pedimos al usuario que inserte un número
			System.out.print("Inserte un número, por favor: ");
			//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "numero"
			numero = sc.nextInt();
			//Comprueba si el número es positivo
			if(numero>0) {
				//Si lo es, suma el número con el anterior y lo almacena en la misma variable
				suma = suma+numero;
			}
			//Comprueba si el número es negativo
			else if(numero<0) {
				//Si lo es, suma el número con el anterior y lo almacena en la misma variable
				suman = suman+numero;
				//Suma uno a la cantidad de números negativos
				nnegativo++;
			}
			//Si no es nada de lo anterior, el número es 0
			else {
				//Suma uno a la cantidad de 0 introducidos
				nceros++;
			}
			//Suma 1 al contador de vueltas
			i++;
		}
		//Por ultimo mostramos por consola:
		//La suma total de los números positivos
		System.out.println("La suma total de los números positivos es: "+ suma);
		//La media total de los números negativos
		System.out.println(nnegativo==0?"No se puede hacer media de los número negativos porque no se ha introducido ninguno"
				:"La media total de los numero negativos es: "+(float)suman/nnegativo);
		//La cantidd de 0 introducidos
		System.out.println("El número total de 0 es: "+nceros);
		//Cerramos el scanner
		sc.close();
	}

}
