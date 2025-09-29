package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, unidades, decenas, centenas, millares;
		
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		if (num < 0 || num > 9999) {
			System.out.println("Has introducido un número NO válido (0-9999).");
		} else if (num < 10) {
			System.out.println("No es capicúa");
		} else if (num < 100) {
			if (num % 11 == 0) {
				System.out.println(num + " es capicúa");
			} else {
				System.out.println(num + " No es capicúa");
			}
		} else if (num < 1000) {
			unidades = num % 10;
			centenas = num / 100;
						
			if (unidades == centenas) {
				System.out.println(num + " es capicúa");
			} else {
				System.out.println(num + " No es capicúa");
			}
		} else {
			millares = num / 1000;
			centenas = num /100 - millares * 10;
			decenas = num /10 - centenas * 10 - millares * 100;
			unidades = num % 10;
			
			if (unidades == millares && decenas == centenas) {
				System.out.println(num + " es capicúa");
			} else {
				System.out.println(num + " No es capicúa");
			}
		}
	}
		
}
