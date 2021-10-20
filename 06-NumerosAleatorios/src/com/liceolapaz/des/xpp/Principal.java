package com.liceolapaz.des.xpp;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//  Pedimos al usuario el n�mero a buscar. 
		pedirNumeroBuscar();
		//  Leemos el n�mero a buscar y lo almacenamos.
		int numeroBuscar = leerEntero();
		//  Pedimos al usuario el n�mero m�ximo de intentos.
		pedirMaximoIntentos();
		//  Leemos el n�mero m�ximo de intentos y lo almacenamos.
		int maximoIntentos = leerEntero();
		//  Almacenar n�mero intentos.
		int numeroIntentos = 0;
	while(numeroIntentos < maximoIntentos) {
		//  Generar n�mero aleatorio.
		int numeroAleatorio = generarNumeroAleatorio(1,10);
		//  Imprimir n�mero generado.
		System.out.println("El n�mero generado fue: " + numeroAleatorio);
		//  Sumar 1 a los intentos.
		numeroIntentos++;
		//  Comprobar si el n�mero generado es igual al n�mero a buscar.
		comprobarNumero(numeroBuscar, numeroAleatorio, numeroIntentos, maximoIntentos);
		if (numeroAleatorio == numeroBuscar) {
			break;
		}	
	}
}

	private static void comprobarNumero(int numeroBuscar, int numeroAleatorio, int numeroIntentos, int maximoIntentos) {
		// Si son iguales, imprimir mensaje.
		if  (numeroBuscar == numeroAleatorio) {
			System.out.println("N�mero encontrado en " + numeroIntentos +  " intento(s)");
		}
		// Si no lo son y hay m�s intentos, repetir.
		else if (numeroIntentos < maximoIntentos) {
			return;
		}
		// Si no hay m�s intentos, escribir mensaje.
		else {
			System.out.println("No se ha podido encontrar el n�mero en " + maximoIntentos + " intento(s)");
		}
	}

	private static int generarNumeroAleatorio(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min) + min;
	}

	private static int leerEntero() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextInt();
	}

	private static void pedirMaximoIntentos() {
		System.out.print("Escriba el n�mero m�ximo de intentos: ");
	}

	private static void pedirNumeroBuscar() {
		System.out.print("Escriba el n�mero a buscar (entre 1 y 10): ");
	}

}
