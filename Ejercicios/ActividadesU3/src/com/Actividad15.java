package com;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cant = 0;
		boolean primo = false;

		System.out.println("Introduce un número y te diré cuantos primos hay desde el 2:");
		num = sc.nextInt();
		System.out.println();
		
		for (int i = 2; i <= num; i++) {
			primo = true;
			cant++;
			for (int e = 2; e < i; e++) {
				if (i % e == 0) {
					primo = false;
					cant--;
					break;
				} 
			}
			
			System.out.println(i + " -> " + (primo ? "primo" : "no primo"));
		}
		
		System.out.println("\nHay " + cant + " primos.");
		
		sc.close();
	}

}
