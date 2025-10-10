package com;

import java.util.Scanner;

public class Actividad8{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, prod = 1;

		System.out.println("Introduzca un número y calculo su factorial:");
		num = sc.nextInt();
		
		for (int i = num; i > 0; i--) {
			prod *= i; 
		}
		
		System.out.println(num + "! = " + prod);
	}

}
