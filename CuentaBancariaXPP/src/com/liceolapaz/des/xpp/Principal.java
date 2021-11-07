package com.liceolapaz.des.xpp;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Menú	
		escribirMenu();
		pedirOpcion();
		int opcion = leerOpcion();
	}

	private static int leerOpcion() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	private static void pedirOpcion() {
		System.out.print("Escoja una opción: ");
	}

	private static void escribirMenu() {
		System.out.println("\nBANCO\n" + "1. Crear Cuenta\n" + "2. Ingresar Dinero\n" + "3. Retirar dinero\n"
		+ "4. Consultar saldo\n" + "0. Salir");
	}

}
