package com;

import java.util.Scanner;

public class Actividad2 {
	static Scanner sc = new Scanner(System.in);
	static String password, intento;

	public static void main(String[] args) {
		int vers;

		System.out.println("Elige que versión quieres jugar introduciendo su número:");
		System.out.println("1) Normal	2) Fácil");
		vers = sc.nextInt();
		
		while (vers < 1 || vers > 2) {
			System.out.println("Versión no existente, elija entre las opciones:");
			System.out.println("1) Normal	2) Fácil");

			vers = sc.nextInt();
		}
		
		System.out.println("Primer jugador, introduce la contraseña:");
		password = sc.next();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		
		switch (vers) {
		case 1:
			normal();
			break;
		case 2:
			facil();
			break;
		}
		
		System.out.println("Felicidades!, la contrseña era \"" + password + "\".");
		
	}
	
	public static void normal() {
		System.out.println("Pistas de la contraseña:");
		System.out.println("Longitud: " + password.length());
		System.out.println("Primer carácter: " + password.charAt(0));
		System.out.println("Último carácter: " + password.charAt(password.length() - 1));
		System.out.println("\nIntentos:");
		intento = sc.next();
		
		while (!intento.equals(password)) {
			System.out.println("Fallo, prueba otra vez:");
			intento = sc.next();
		}
	}
	
	public static void facil() {
		System.out.println("Pistas de la contraseña: ");
		System.out.println("Se te dirá alfabéticamente si es mayor o menor.");
		System.out.println("\nIntentos:");
		intento = sc.next();
		
		while (!intento.equals(password)) {
			System.out.println("Fallo, la contraseña es " + ((intento.compareTo(password) > 0) ? "MAYOR" : "MENOR"));
			intento = sc.next();
		}
	}

}
