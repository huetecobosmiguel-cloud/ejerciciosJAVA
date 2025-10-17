package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Introduce un número entero:");
		n = sc.nextInt();
		
		while (n < 0) {
			System.out.println("Debe ser positivo, prueba otra vez:");
			n = sc.nextInt();
		}
		
		System.out.println(n + "! = " + factorial(n));
	}
	
	public static long factorial (int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
