package com.liceolapaz.des.xpp;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Escribir menú
		escribirMenu();
		pedirOpcion();
		int opcion = leerOpcion();
		escribrirMensaje(opcion);
		// Si la opción es 1,2,3 o 4
		if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
			// Pedir el primer operando
			pedirPrimerOperando();
			// Leer el primer operando y almacenarlo
			double primerOperando = leerOperando();
			// Pedir el segundo opereando
			pedirSegundoOperando();
			// Leer el segundo operando y almacenarlo
			double segundoOperando = leerOperando();
			// Escribir resultado
			escribirResultado(primerOperando, segundoOperando, opcion);
		}

	}

	private static void escribirResultado(double primerOperando, double segundoOperando, int opcion) {
		double resultado = 0;
		switch(opcion) {
			// Suma
			case 1:
				resultado = primerOperando + segundoOperando;
				break;
			// Resta
			case 2:
				resultado = primerOperando - segundoOperando;
				break;
			
			// Producto
			case 3:
				resultado = primerOperando / segundoOperando;
				break;
			
			// División
			case 4:
				resultado = primerOperando * segundoOperando;
				break;
		}
		System.out.println("El resultado de la operación es: " + resultado);
	}

	private static void pedirSegundoOperando() {
		System.out.println("Escriba el segundo operando: ");
	}

	private static double leerOperando() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void pedirPrimerOperando() {
		System.out.println("Escriba el primer operando: ");
	}

	private static void escribrirMensaje(int opcion) {
		String mensaje = "";
		int max = 0;
		switch (opcion) {
		case 0:
			System.exit(0);
			break;
		
		case 1:
			mensaje = "Opción 1 elegida.";
			break;
			
		case 2:
			mensaje = "Opción 2 elegida.";
			break;

		case 3:
			mensaje = "Opción 3 elegida.";
			break;

		case 4:
			mensaje = "Opción 4 elegida.";
			break;
			
		default:
			mensaje = "Opción no válida";
			break;
		}
		System.out.println(mensaje);
	}

	private static int leerOpcion() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una Opción: "); 
	}

	private static void escribirMenu() {
		System.out.println("\nCALCULADORA\n"
		+ "1. Suma\n"
		+ "2. Resta\n"
		+ "3. Producto\n"
		+ "4. División\n"
		+ "0. Salir"
		);
	}

}
