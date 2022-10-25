package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserte números y el programa comprobará si son pares o impares");
		System.out.print("Inserte el primer número, por favor: ");
		numero = sc.nextInt();
		
		while(numero!=0) {
			System.out.println(numero%2==0?"El número introducido es par":"El número introducido es impar");
			System.out.print("Inserte otro número, por favor: ");
			numero = sc.nextInt();
		}

	}

}
