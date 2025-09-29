package com;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;

		System.out.println("Introduzca un primer número:");
		num1 = sc.nextDouble();
		System.out.println("Introduzca un segundo número:");
		num2 = sc.nextDouble();
		
		if (num1 < num2) {
			System.out.println(num2 + ", " + num1);
		} else {
			System.out.println(num1 + ", " + num2);
		}
	}
}