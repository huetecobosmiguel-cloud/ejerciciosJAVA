package com;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la primera nota:");
		float first = sc.nextFloat();
		
		System.out.println("Introduzca la segunda nota:");
		float second = sc.nextFloat();
		
		float nota = (first + second) / 2;

		System.out.println("Tu nota media es: " + nota);
	}

}
