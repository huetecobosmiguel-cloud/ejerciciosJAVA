package com;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su edad:");
		int age = sc.nextInt();
		
		boolean old = age >= 18;
		
		System.out.println("¿Mayor de edad? " + old);
		
		sc.close();
	}

}
