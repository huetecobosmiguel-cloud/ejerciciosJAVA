package com;

import java.util.Scanner;

public class Actividad8 {

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
		
		div = divisores(num);
		System.out.println(num + " tiene " + div + (div == 1 ? " divisor primo." : " divisores primos."));
		
	}
	
	public static int divisores (int num) {
		int cant = 0;
		boolean primo;
		
		for (int i = 2; i <= num; i++) {
			primo = true;
			for (int e = 2; e < i/2; e++) {
				if (i % e == 0) {
					primo = false;
					break;
				}
			}
			if (primo && num % i == 0) {
				cant++;
			}
		}
		
		return cant;

	}

}
