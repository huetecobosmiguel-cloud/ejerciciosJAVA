package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] notas = new int[5][3];

		System.out.println("Introduzca las notas de los 5 alumnos:");
		for (int alumno = 0; alumno < 5; alumno++) {
			System.out.println(alumno + 1 + "º alumno: ");
			for (int trimestre = 0; trimestre < 3; trimestre++) {
				System.out.print(trimestre + 1 + "º Tri: ");
				notas[alumno][trimestre] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Nota media grupal: ");
		for (int trimestre = 0; trimestre < 3; trimestre++) {
			double media = 0;
			for (int alumno = 0; alumno < 5; alumno++) {
				media += notas[alumno][trimestre];
			}
			System.out.println(trimestre + 1 + "º Trim: " + media/5);
		}
		
		System.out.println("Introduzca la posición del alumno (0-4) para saber su media; -1 para salir:");
		int pos = sc.nextInt();
		while (pos >= 0 && pos < 5) {
			float media = 0;
			for (int trim = 0; trim < 3; trim++) {
				media += notas[pos][trim];
			}
			System.out.println("Media: " + media/3);
			pos = sc.nextInt();
		}
		
		sc.close();
	}

}
