package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int n = sc.nextInt();

		eco(n);
		
	}
	
	public static void eco (int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("Eco...");
		}
	}

}
