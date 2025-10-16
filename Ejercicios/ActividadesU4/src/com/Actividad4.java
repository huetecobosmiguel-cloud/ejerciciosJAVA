package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Introduce un número:");
		num1 = sc.nextInt();
		System.out.println("Introduce otro número:");
		num2 = sc.nextInt();
		
		System.out.println("El mayor es: " + mayor(num1, num2));
	}
	
	public static int mayor (int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
	}

}
