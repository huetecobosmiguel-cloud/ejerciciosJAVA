package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, div;

		System.out.println("Introduce un número entero:");
		num = sc.nextInt();
		
		//Asegurarse que "num" es válido
		while (num < 0) {
			System.out.println("Número no valido, prueba otra vez:");
			num = sc.nextInt();
		}
		
		divisoresPrimos(num);
		
	}
	
	public static void divisoresPrimos (int num) {
		boolean primo;
		
		System.out.println("Divisores:");
		
		for (int i = 2; i <= num; i++) {
			primo = true;
			for (int e = 2; e < i; e++) {
				if (i % e == 0) {
					primo = false;
					break;
				}
			}
			if (primo && num % i == 0) {
				System.out.println(i);
			}
		}
	}
}