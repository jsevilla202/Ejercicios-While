package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int nalumnos = 0, mayoredad = 0, edad, edadtotal = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación se le pedirá la edad de los alumnos, para salir del programa use un número negativo");
		System.out.print("Por favor, introduzca la edad: ");
		edad = sc.nextInt();
		if(edad==-1) {
			System.out.println("Se ha cerrado el programa");
		}
		else {
		while(edad>=1) {
			nalumnos++;
			edadtotal = edadtotal + edad;
			if(edad>=18) {
				mayoredad++;
			}
			System.out.println("Por favor, introduzca la edad: ");
			edad = sc.nextInt();
		}
		System.out.println("La suma total de las edades es de: "+edadtotal+"\nLa media de las edades es: "+(double)(edadtotal/nalumnos)+
				"\nEl número de alumnos es: "+nalumnos+"\nHay un total de "+mayoredad+" alumnos mayores de edad");
		}

	}

}
