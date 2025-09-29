package com;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;

		System.out.println("Introduzca un número decimal:");
		num = sc.nextDouble();
		
		if ((int) num == 0 && num != 0) {
			System.out.println(num + " es un número casi-cero");
		} else {
			System.out.println(num + " NO es un número casi-cero");
		}
	}

}
