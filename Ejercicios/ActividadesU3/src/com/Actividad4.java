package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Vamos a aprender a conta!");
		System.out.println("Introduce un número y contaremos hasta ahí:");
		num = sc.nextInt();
		
		String cuenta = String.valueOf(num);
		
		for (int i = num - 1; i >= 1; i--) {
			cuenta = i + ", " + cuenta;
		}
		
		System.out.println(cuenta);
	}

}
