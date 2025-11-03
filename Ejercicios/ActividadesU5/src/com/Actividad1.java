package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		double[] t = new double[5];

		System.out.println("Introduce 5 números decimales:");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + ": ");
			t[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.print(t[i]);
			if (i != 5) {
				System.out.print(", ");
			}
		}
	
	}

}
