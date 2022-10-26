package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		int altura = 0, alto=0;
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación introduzca las alturas de los árboles y el programa le devolverá el más alto."+
				"\nPara salir del programa introduzca -1");
		
			while(altura!=-1) {
				System.out.print("Introduzca la altura del árbol en cm: ");
				altura = sc.nextInt();
				
				if(altura>alto&&altura>0) {
					alto = altura;
					System.out.print("Introduzca la altura de otro árbol en cm: ");
					altura = sc.nextInt();
				}
				
				else if(altura<0&&altura!=-1) {
					System.out.print("La altura no puede ser negativa: ");
					altura = sc.nextInt();
					}
				
				else{
				System.out.print("Introduzca la altura de otro árbol en cm: ");
				altura = sc.nextInt();
				}
			}
		System.out.println("El árbol más alto es el que mide "+alto+" cm");
		sc.close();

	}

}
