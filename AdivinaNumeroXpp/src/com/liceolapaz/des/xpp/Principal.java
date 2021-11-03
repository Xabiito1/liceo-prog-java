package com.liceolapaz.des.xpp;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		escribirMenu();
		pedirOpcion();
		int opcion = leerOpcion();
		escribirMensaje(opcion);
	
	}
	
	private static void adivinar(int numeroMaximo) {


		int numeroBuscar = leerEntero();

		if (numeroMaximo == 10) {
			int numero1 = generarNumeroAleatorio(1, numeroMaximo);
			int numero2 = generarNumeroAleatorio(1, numeroMaximo);
			int numero3 = generarNumeroAleatorio(1, numeroMaximo);

			if (numeroBuscar == numero1 || numeroBuscar == numero2 || numeroBuscar == numero3) {
				System.out.println("Los numeros generados fueron: " + numero1 + ", " + numero2 + ", " + numero3);
				System.out.println("¡Has acertado!"); 
			} else {
				System.out.println("Lo siento: ¡has perdido!." + " Los numeros eran: "  + numero1 + ", " + numero2 + ", " + numero3);
			}
		} else if (numeroMaximo == 50) {
			int numero1 = generarNumeroAleatorio(1, numeroMaximo);
			int numero2 = generarNumeroAleatorio(1, numeroMaximo);
			int numero3 = generarNumeroAleatorio(1, numeroMaximo);
			int numero4 = generarNumeroAleatorio(1, numeroMaximo);
			int numero5 = generarNumeroAleatorio(1, numeroMaximo);

			if (numeroBuscar == numero1 || numeroBuscar == numero2 || numeroBuscar == numero3 || numeroBuscar == numero4 || numeroBuscar == numero5) {
				System.out.println("Los numeros generados fueron: " + numero1 + ", " + numero2 + ", " + numero3 + ", " + numero4 + ", " + numero5 );
				System.out.println("¡Has acertado!"); 
			} else {
				System.out.println("Lo siento: ¡has perdido!." + " Los numeros eran: "  + numero1 + ", " + numero2 + ", " + numero3+ ", " + numero4 + ", " + numero5);
			}
		}
	}

	private static int leerEntero() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	private static void pedirNumeroBuscar(int max) {
		System.out.print("Escriba el Número a buscar (entre 1 y "+max+"): ");
	}

	private static void escribirMensaje(int opcion) {
		String mensaje = "";
		int max = 0;
		switch (opcion) {
		case 0:
			System.exit(0);
			break;
		
		case 1:
			mensaje = "Opción 1 elegida.";
			max = 10;
			break;
			
		case 2:
			mensaje = "Opción 2 elegida.";
			max = 50;
			break;
			
		default:
			mensaje = "Opción no válida";
			break;
		}
		System.out.println(mensaje);
		pedirNumeroBuscar(max);
		adivinar(max);
		
	}

	private static int leerOpcion() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una Opción: ");
		
	}

	private static void escribirMenu() {
		System.out.println("MENÚ PRINCIPAL\n"
				+ "1. Número (1-10)\n"
				+ "2. Número (1-50)\n"
				+ "0. Salir"
				);
		
	}

}
