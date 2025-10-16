package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
				
		System.out.println("Dime un número entre el 1-10:");
		num = sc.nextInt();
							
		while (num > 10 || num < 1) {
			System.out.println("Has introducido un valor no válido (1-10), prueba otra vez:");
			num = sc.nextInt();
		}
		
		System.out.println("Tabla del " + num + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}
}