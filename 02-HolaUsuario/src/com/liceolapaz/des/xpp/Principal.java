package com.liceolapaz.des.xpp;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedirle nombre al usuario
		pedirNombre();
		// Recibir el nombre y almacenarlo
		String nombreUsuario = leerNombre();
		// Escribir el saludo por pantalla
		escribirSaludo(nombreUsuario);
	}

	private static void escribirSaludo(String nombreUsuario) {
		System.out.println("¡Hola " + nombreUsuario + "!" );
	}

	private static String leerNombre() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextLine();
	}

	private static void pedirNombre() {
		System.out.print("Escriba su nombre: ");
		
	}

}
