package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo, rad, alt;

		System.out.println("¿Qué quieres calcular?\n(1) Área	(2) Volumen");
		tipo = sc.nextInt();
		System.out.println("Introduzca:");
		System.out.print("Radio: ");
		rad = sc.nextInt();
		System.out.print("Altura: ");
		alt = sc.nextInt();
		System.out.println();
		
		cilindro(tipo, rad, alt);
	}
	
	public static void cilindro (int tipo, int rad, int alt) {
		switch (tipo) {
		case 1: 
			System.out.println("El área es: " + 2 * Math.PI * rad * (alt + rad));
			break;
		case 2:
			System.out.println("El volumen es : " + Math.PI * Math.pow(rad, 2) * alt);
			break;
		}
	}

}
