package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero, usuario;
		
		numero = (int) (Math.random()*100);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Te presento el juego del número oculto. \nUn número aleatorio entre 0 y 100 se ha escondido y tienes que"
				+ " encontrarlo. \nEl propio programa te avisara si es mayor o menor que el número oculto. te puedes rendir introduciendo -1");
		System.out.print("¿Listo? Empecemos!! Introduzca el primer número: ");
		usuario = sc.nextInt();
		
		if(usuario>=0&&usuario<=100) {
		while(numero!=usuario) {
			if(numero>usuario&&usuario>0) {
				System.out.println("El número oculto es mayor");
				System.out.print("Sigue intentándolo!!: ");
				usuario = sc.nextInt();
			}
			else if(usuario<0) {
				if(usuario==-1) {
					System.out.println("¿Te rindes? :C");
					break;
				}
				else {
					System.out.println("El número es negativo y no está dentro del rango!!");
					System.out.print("Sigue intentándolo!!: ");
					usuario = sc.nextInt();
				}
				}
			else if(numero<usuario&&usuario>0) {
				System.out.println("El número oculto es menor");
				System.out.print("Sigue intentándolo!!: ");
				usuario = sc.nextInt();
			}
		}
		if(numero==usuario) {
			System.out.println("BINGO!!! Lo has descubierto!!");
		}
		}
		else {
			System.out.println(usuario!=-1?"Te tienes que asegurar que esté dentro de los valores establecidos":
				"¿Ya te rindes? :C");
		}
		sc.close();

	}

}
