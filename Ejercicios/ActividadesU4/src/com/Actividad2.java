package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min, num;
		
		//Introducción de valores
		System.out.println("Introduce un rango de valores:");
		System.out.print("Max: ");
		max = sc.nextInt();
		System.out.print("Min: ");
		min = sc.nextInt();
		System.out.println();
		
		if (min > max) {
			int aux = max;
			max = min;
			min = aux;
			System.out.println("Se han invertido los valores al estar al revés.\nMax: " + max + ", Min: " + min + "\n");
		}
		
		rango(max, min);

	}
	
	public static void rango (int max, int min) {
		for (int i = min; i <= max; i++) {
			System.out.println(i);
		}
	}

}
