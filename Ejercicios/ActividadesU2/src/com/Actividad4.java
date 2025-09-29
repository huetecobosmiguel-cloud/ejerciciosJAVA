package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		
		System.out.println("Introduzca un primer número:");
		num1 = sc.nextInt();
		System.out.println("Introduzca un segundo número distinto al primero:");
		num2 = sc.nextInt();

		if (num1 < num2) {
			System.out.println(num2 + " es mayor que " + num1);
		} else if (num2 < num1) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			System.out.println("Son iguales");
		}
	}
}