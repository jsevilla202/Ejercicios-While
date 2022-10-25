package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int numero, i =0, suma = 0, nceros = 0, suman = 0, nnegativo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A continuación, inserte 10 número, pueden ser positivos o negativos, y al finalizar se mostrara:"
				+ "\nLa suma de los números positivos\nLa media de los números negativos"
				+ "\nEl número de ceros que ha introducido");
		System.out.print("Inserte el primer número, por favor: ");
		numero = sc.nextInt();
		
		while(i==10) {
			if(numero>0) {
				suma = suma+numero;
			}
			if(numero<0) {
				suman = suman+numero;
				nnegativo++;
			}
			if(numero==0) {
				nceros++;
			}
			i++;
			System.out.print("Inserte otro número: ");
			numero = sc.nextInt();
		}
		System.out.println("La media total es "+suma/i);

	}

}
