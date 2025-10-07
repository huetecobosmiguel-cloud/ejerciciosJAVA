package com;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min, num;
		
		System.out.println("Introduce un rango de valores:");
		System.out.print("Max: ");
		max = sc.nextInt();
		System.out.print("Min: ");
		min = sc.nextInt();
		System.out.println("");
		
		System.out.println("Ahora, introduce un valor dentro del rango:");
		num = sc.nextInt();
		
		while (num > max || min > num) {
			System.out.println("\nNo está dentro del rango, prueba otra vez:");
			num = sc.nextInt();
		}
		
		System.out.println("\n" + num + " está dentro del rango.");

	}

}
