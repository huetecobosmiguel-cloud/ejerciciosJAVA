package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, anno;

		System.out.println("Introduzca una fecha:");
		System.out.println("Horas:");
		dia = sc.nextInt();
		System.out.println("Min:");
		mes = sc.nextInt();
		System.out.println("Seg:");
		anno = sc.nextInt();
		
		if (dia >= 32 || mes >= 13) {
			System.out.println("Has introducido una hora no válida.");
		} else {
			System.out.print("hora actual: [" + hora + ":" + min + ":" + seg + "] -> ");
		
			seg++;
		
			if (seg == 60) {
				min++;
				seg = 0;
				if (min == 60) {
					hora++;
					min = 0;
					if (hora == 24) {
						hora = 0;
					}
				}
			}
		
			System.out.print(" hora actual + 1 segundo [" + hora + ":" + min + ":" + seg + "]");
		}
		
	}

}
