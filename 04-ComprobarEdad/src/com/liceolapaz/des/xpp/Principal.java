package com.liceolapaz.des.xpp;

import java.util.Scanner;

public class Principal {
	private static final int ANHO_ACTUAL = 2021;
	
	public static void main(String[] args) {
		// Pedir a�o de nacimiento
		pedirAnho();
		// Leer a�o y almacenarlo
		int anho = leerAnho();
		// Escribir mensaje
		escribirMensaje(anho);
	}

	private static void escribirMensaje(int anho) {
		// Crear una variable para almacenar el mensaje 
	    String mensaje = "";
		// Comprobar anho y almacenar mensaje en la variable
	    if  (anho > ANHO_ACTUAL) {
	    	mensaje = "Ese a�o est� en el futuro";
	    } else if (ANHO_ACTUAL - anho > 150) {
	    	mensaje = "Tendr�as que estar muerto";
	    } else if (ANHO_ACTUAL - anho >= 18) {
	    	mensaje = "Puedes pasar";
	    } else {
	    	mensaje = "No puedes pasar";
	    }
		// Escribir mensaje por pantalla
		System.out.println(mensaje);
	}

	private static int leerAnho() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirAnho() {
		System.out.print("Escriba su a�o de nacimiento: ");
		
	}

}
