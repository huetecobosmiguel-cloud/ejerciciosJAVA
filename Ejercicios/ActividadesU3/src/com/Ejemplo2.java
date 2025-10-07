package com;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Dime un número");
		num = sc.nextInt();
		
		System.out.println("Tabla del " + num + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

	}

}
