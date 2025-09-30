package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, mes, anno, max;

		System.out.println("Introduzca una fecha en formato 31/12/2000 individualmente:");
		System.out.println("Día:");
		dia = sc.nextInt();
		System.out.println("Mes:");
		mes = sc.nextInt();
		System.out.println("Año:");
		anno = sc.nextInt();
		
		if (dia >= 32 || mes >= 13) {
			System.out.println("Has introducido una fecha no válida.");
		} else {
			System.out.print("Día actual: " + dia + "/" + mes + "/" + anno + " -> ");
		
			//Max de días del mes
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
			
			if (dia == max) {
				mes++;
				dia = 1;
				if (mes == 13) {
					anno++;
					mes = 1;
				}
			} else {
				dia++;
			}
			
			if (max < dia) {
				System.out.println("Has introducido una fecha no válida.");
			} else {
				System.out.println("Día actual + 1: " + dia + "/" + mes + "/" + anno);
			}
		
			
		}
		
	}

}
