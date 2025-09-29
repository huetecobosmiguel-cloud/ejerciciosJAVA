package com;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, anno, max;

		System.out.println("Introduzca el día:");
		dia = sc.nextInt();
		System.out.println("Introduzca el mes:");
		mes = sc.nextInt();
		System.out.println("Introduzca el año:");
		anno = sc.nextInt();
		
		if (mes < 1 || mes > 12 || dia < 1) {
			System.out.println("Has introducido una fecha no válida.");
		} else {
			
			switch (mes) {
				case 1, 3, 5, 7, 8, 10, 12:
					max = 31;
					break;
				case 2:
					max = 28;
					break;
				default:
					max = 30;
					break;
			}
			
			if (max < dia) {
				System.out.println("Has introducido una fecha no válida.");
			} else {
				System.out.println("La fecha es correcta.");
			}
		}
	}

}
