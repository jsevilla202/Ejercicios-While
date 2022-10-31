package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Nombramos las variables como números enteros:
		 * - nalumnos: Número de alumnos
		 * - mayoredad: Número de alumnos mayores de edad
		 * - edad: Edad introducida por el usuario
		 * - edadtotal: Suma de las edades
		 */
		int nalumnos = 0, mayoredad = 0, edad, edadtotal = 0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos al usuario el programa y como salir de este
		System.out.println("A continuación se le pedirá la edad de los alumnos, para salir del programa use un número negativo");
		//Pedimos al usuario que inserte una edad
		System.out.print("Por favor, introduzca la edad: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "edad"
		edad = sc.nextInt();
		//Comprobamos que la edad no sea negativa (inferior a -1)
		if(edad<-1) {
			//Si lo es, avisamos con un mensaje de error
			System.out.println("ERROR: Ingrese una edad válida");
		}
		//Si el número no es -1
		else if(edad!=-1) {
			/*
			 * Creamos un búcle que:
			 * - Comprueba que la edad sea mayor o igual a 1
			 * - Suma 1 a la variable "nalumnos" por cada edad introducida
			 * - Calcula la edad total
			 * - Si es mayor o igual a 18 años, suma 1 a la variable "mayoredad"
			 */
		while(edad>=1) {
			nalumnos++;
			edadtotal = edadtotal + edad;
			if(edad>=18) {
				mayoredad++;
			}
			//Vuelve a pedir al usuario una edad
			System.out.println("Por favor, introduzca la edad: ");
			//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "edad"
			edad = sc.nextInt();
		}
		/*
		 * Muestra por consola:
		 * - La edad total de los alumnos
		 * - La media de edades
		 * - El número de alumnos
		 * - El número de alumnos mayores de edad
		 */
		
		System.out.println("La suma total de las edades es de: "+edadtotal+"\nLa media de las edades es: "+(double)(edadtotal/nalumnos)+
				"\nEl número de alumnos es: "+nalumnos+"\nHay un total de "+mayoredad+" alumnos mayores de edad");
		}
		//Si no es nada de lo anterior, la edad inroducida es -1 por lo que se cierra el programa
		else {
			System.out.println("Se ha cerrado el programa");
		}
		//Cerramos el scanner
		sc.close();

	}

}
