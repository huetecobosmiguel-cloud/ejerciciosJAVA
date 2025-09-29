package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora, min, seg;

		System.out.println("Introduzca la hora actual:");
		System.out.println("Horas:");
		hora = sc.nextInt();
		System.out.println("Min:");
		min = sc.nextInt();
		System.out.println("Seg:");
		seg = sc.nextInt();
		
		if (hora >= 24 || min >= 60 || seg >= 60) {
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
