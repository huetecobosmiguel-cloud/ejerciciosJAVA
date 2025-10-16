package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, lado = 0;

		System.out.println("Introduce un número:");
		num = sc.nextInt();
		
		while (num < 1) {
			System.out.println("Valor no válido, debe ser mayor que 0:");
			num = sc.nextInt();
		}
		for (int i = num; i > 0; i--) {
			for (int e = 1; e <= i; e++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
