package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Introduce un número entero mayor que 1:");
		num = sc.nextInt();
		
		//Asegurarse que "num" es válido
		while (num < 2) {
			System.out.println("Número no valido, prueba otra vez:");
			num = sc.nextInt();
		}
		
		if (esPrimo(num)) {
			System.out.println(num + " es primo");
		} else {
			System.out.println(num + " NO es primo");
		}
	}
	
	public static boolean esPrimo (int num) {
		boolean primo = true;
		//Compruebo si es primo comparando el resto
		for (int i = 2; i < num/2; i++) {
			if (num % i == 0) {
				primo = false;
			} 
		}
		
		return primo;
		
	}

}
