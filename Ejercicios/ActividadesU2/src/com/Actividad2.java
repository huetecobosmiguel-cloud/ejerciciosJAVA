package com;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		
		System.out.println("Introduzca un primer número:");
		num1 = sc.nextInt();
		System.out.println("Introduzca un segundo número:");
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println("Los número son iguales.");
		} else {
			System.out.println("Los número son distintos.");
		}
	}
}