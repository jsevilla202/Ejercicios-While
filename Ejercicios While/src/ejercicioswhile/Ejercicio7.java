package ejercicioswhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Nombramos a las variables:
		 * - numero: Número aleatorio entre el 0 y 100
		 * - usuario: Número introducido por el usuario
		 */
		int numero, usuario;
		
		//Multipiplicamos por 100 y truncamos el número aleatorio haciendo casting a int
		numero = (int) (Math.random()*100);
		
		//Creamos el scanner y lo nombramos "sc"
		Scanner sc = new Scanner(System.in);
		
		//Presentamos el programa al usuario con un mensaje por consola
		System.out.println("Te presento el juego del número oculto. \nUn número aleatorio entre 0 y 100 se ha escondido y tienes que"
				+ " encontrarlo. \nEl propio programa te avisara si es mayor o menor que el número oculto. te puedes rendir introduciendo -1");
		//pedimos al usuario que inserte un número para empezar
		System.out.print("¿Listo? Empecemos!! Introduzca el primer número: ");
		//Capturamos lo que ha introducido el usuario y lo guardamos en la variable "usuario"
		usuario = sc.nextInt();
		
		//Comprobamos que el usuario haya introducido un número que esté entre los valores establecidos
		if(usuario>=0&&usuario<=100) {
		/*
		 * Creamos un blucle que mientras que el número no sea el mismo que el aleatorio comprobamos:
		 * - Si el número introducido por el usuario es mayor que el aleatorio
		 * - Si el número introducido por el usuario es menor que el aleatorio
		 * - Si se quiere rendir
		 * - Si el número no está dentro de los parámetros
		 * - Pedimos en cada caso que inserte otro número ( excepto cuando se rinde ) y volvemos a comprobar
		 */
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
		//Si el número del usuario es el mismo que el aleatorio felicitamos al usuario
		if(numero==usuario) {
			System.out.println("BINGO!!! Lo has descubierto!!");
		}
		}
		//Si el valor no estaba dentro de los parámetros, comprobamos que sea -1 y dependiendo si es o no, saldra un mensaje diferente por consola
		else {
			System.out.println(usuario!=-1?"Te tienes que asegurar que esté dentro de los valores establecidos":
				"¿Ya te rindes? :C");
		}
		//cerramos el scanner
		sc.close();

	}

}
