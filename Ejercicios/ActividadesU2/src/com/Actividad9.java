package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, cif;

		System.out.println("Introduzca un número entero entre 0 y 99.999:");
		num = sc.nextInt();
		
		if (num < 10000) {
			if (num < 1000) {
				if (num < 100) {
					if (num < 10) {
						cif = 1;
					} else {
						cif = 2;
					}
				} else {
					cif = 3;
				}
			} else {
				cif = 4;
			}
		} else {
			cif = 5;
		}
		
		System.out.println(num + " tiene " + cif + " cifras");
	}
}