package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int edad, total = 0, cantidad = 0, mayor = 0;
		
		System.out.println("Introduzca las edades del alumnado:");
		edad = sc.nextInt();

		while (edad >= 0) {
			cantidad++;
			total += edad;
			
			if (edad >= 18) {
				mayor++;
			}
			
			edad = sc.nextInt();
		}
		
		System.out.println("Estadísticas:");
		System.out.println("Total: " + total);
		System.out.println("Media: " + (float) total / cantidad);
		System.out.println("Alumnos: " + cantidad);
		System.out.println("Mayores de edad: " + mayor);
	}

}
