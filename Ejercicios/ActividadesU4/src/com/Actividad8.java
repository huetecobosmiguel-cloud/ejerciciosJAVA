package com;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num, div;

		System.out.println("Introduce un número entero:");
		num = sc.nextLong();
		
		//Asegurarse que "num" es válido
		while (num < 0) {
			System.out.println("Número no valido, prueba otra vez:");
			num = sc.nextLong();
		}
		
		div = divisores(num);
		System.out.println(num + " tiene " + div + (div == 1 ? " divisor primo." : " divisores primos."));
		
	}
	
	public static long divisores (long num) {
		long cant = 0;
		boolean primo;
		
		for (long i = 2; i <= num; i++) {
			primo = true;
			for (long e = 2; e < i; e++) {
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
