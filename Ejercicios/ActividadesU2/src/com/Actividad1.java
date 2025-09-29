package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número entero:");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El número es par.");
		} else {
			System.out.println("El número es impar");
		}
	}
}
