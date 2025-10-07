package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número:");
		int num = sc.nextInt();

		while (num != 0) {
			
			if (num % 2 == 0) {
				System.out.println(num + " es par");
			} else {
				System.out.println(num + " NO es par");
			}
			
			if (num >= 0) {
				System.out.println(num + " es positivo");
			} else {
				System.out.println(num + " NO es positivo");
			}
			
			System.out.println(num + " al cuadrado: " + Math.pow(num, 2));
			
			
			num = sc.nextInt();
		}
	}

}
