package com;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número:");
		double num = sc.nextDouble();
		
		System.out.println("Su número en valor absoluto es: " + Math.abs(num));
	}

}
