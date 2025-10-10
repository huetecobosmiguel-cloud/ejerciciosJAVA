package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, alt = 0, max = 0;

		System.out.println("Introduce la altura de los árboles en centímetros:");
		System.out.println("\"-1\" para terminar.");
		
		for (int i = 1; num != -1; i++) {
			System.out.print(i + ": ");
			
			num = sc.nextInt();
			System.out.println("----");
			
			if (num > alt) {
				max = i;
				alt = num;
			}
		}
		
		System.out.println("El árbol mas alto es el nº " + max + ": " + alt + " cm.");
	}
}