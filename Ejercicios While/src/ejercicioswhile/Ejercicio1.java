package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero, suma=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A continuación, inserte los números de uno en uno para ir sumandolos"
				+ " y para salir inserte un número negativo: ");
		numero = sc.nextInt();
		
		while(numero>=0) {
			suma = suma + numero;
			System.out.print("Inserte otro número: ");
			numero = sc.nextInt();
		}
		System.out.println("La suma total es "+suma);

	}

}
