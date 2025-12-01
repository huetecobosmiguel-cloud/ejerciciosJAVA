package com.sintetizador;

import java.util.Scanner;

public class Sintetizador {
	static Scanner sc = new Scanner(System.in);
	static int frecuencia = 80, frecMax = 108, frecMin = 80;
	
	public static void main() {
		System.out.println("Bienvenido al sintonizador.");
		int opcion = 0;
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				display();
				break;
			case 2:
				subirFrecuencia();
				break;
			case 3:
				bajarFrecuencia();
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			}
		} while (opcion != 4);
	}
	
	private static void mostrarMenu() {
		System.out.println("\nMenú:");
		System.out.println("Seleccione una opción:");
		System.out.println("1) Display      2) Subir     3) Bajar	4)Salir");
	}
	
	private static void display() {
		System.out.println("Frecuencia: " + frecuencia + " MHz.");
	}
	
	private static void subirFrecuencia() {
		frecuencia += 5;
		if (frecuencia > frecMax) frecuencia = frecMin;
	}
	
	private static void bajarFrecuencia() {
		frecuencia -= 5;
		if (frecuencia < frecMin) frecuencia = frecMax;
	}

}
