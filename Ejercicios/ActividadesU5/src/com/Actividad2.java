package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		System.out.println("¿Cúantos números desea introducir?");
		int tabla[] = new int[sc.nextInt()];
		
		for (int i = 0; i < tabla.length; i++) {
			System.out.print(i + 1 + ": ");
			tabla[i] = sc.nextInt();
		}
		
		for (int i = tabla.length - 1; i >= 0; i--) {
			System.out.print(tabla[i]);
			if (i != 0) {
				System.out.print(", ");
			}
		}
	}

}
