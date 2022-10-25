package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero, i =0, suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A continuación, inserte los números de uno en uno para ir contandolos"
				+ " y para salir inserte un número negativo: ");
		numero = sc.nextInt();
		
		while(numero>=0) {
			suma = suma + numero;
			i++;
			System.out.println("Ha insertado "+i+" números");
			System.out.print("Inserte otro número: ");
			numero = sc.nextInt();
		}
		System.out.println("La media total es "+suma/i);

	}

}
