package com;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op, a, b;

		System.out.println("Introduce tu operación: \n1) Suma		2) Resta	3) Multiplicación	4) División");
		op = sc.nextInt();
		
		while (op < 1 || op > 4) {
			System.out.println("Valor no válido, introduce un valor válido:");
			System.out.println("1) Suma		2) Resta	3) Multiplicación	4) División");
			op = sc.nextInt();
		}
		
		System.out.print("1º operando: ");
		a = sc.nextInt();
		System.out.print("2º operando: ");
		b = sc.nextInt();
		
		System.out.println("Resultado: " + calculadora(a, b, op));
	}
	
	public static double calculadora (int a, int b, int op) {
		switch (op) {
		case 1: 
			return a + b;
		case 2:
			return a - b;
		case 3:
			return a * b;
		case 4:
			return a / b;
		}
		return 67;
	}
}
