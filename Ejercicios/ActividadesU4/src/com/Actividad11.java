package com;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		int n;
		
		System.out.println("Introduce los números de la potencia:");
		System.out.print("Base: ");
		a = sc.nextDouble();
		System.out.print("Potencia: ");
		n = sc.nextInt();
		
		while (n < 0) {
			System.out.println("Valor no válido, debe ser positivo.");
			System.out.print("Potencia: ");
			n = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.println("Iterativa: " + potenciaIterativa (a, n));
		System.out.println("Recursiva: " + potenciaRecursiva (a ,n));

	}
	
	public static double potenciaIterativa (double a, int n) {
		int res = 1;
		
		for (int i = n; i > 0; i--) {
			res *= a;
		}
		
		return res;
	}
	
	public static double potenciaRecursiva (double a, int n) {
		if (n == 0) {
			return 1;
		} else {
			return a * potenciaRecursiva (a, n - 1);
		}
	}

}
