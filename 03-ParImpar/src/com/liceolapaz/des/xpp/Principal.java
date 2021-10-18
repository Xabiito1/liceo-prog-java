package com.liceolapaz.des.xpp;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedir n�mero al usuario
		pedirNumero();
		// Leer el n�mero y guardarlo
		int numeroUsuario = leerNumero();
		// Escribir si el n�mero es par o impar
		escribirMensaje(numeroUsuario);
	}

	private static void escribirMensaje(int numeroUsuario) {
		// Almacenar mensaje en una variable
		String mensaje = 
				(numeroUsuario == 0) ?
					"El n�mero no es par ni impar" :
						(numeroUsuario % 2 == 0) ?
					"El n�mero introducido es par" :
						"El n�mero introducido es impar";
		// Escribir por pantalla el mensaje
		System.out.println(mensaje);
	}

	private static int leerNumero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirNumero() {
		System.out.print("Escriba un n�mero entero: ");
	}

}
