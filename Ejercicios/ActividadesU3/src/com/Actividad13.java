package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Variables
		int susp = 0, apro = 0, cond = 0;
		float nota = 0;
		
		System.out.println("Introduce las 6 notas:");
		
		for (int i = 1; i <= 6; i++) {
			System.out.print(i + ": ");
			nota = sc.nextFloat();
			
			while (nota > 10 || nota < 0) {
				System.out.println("Nota no válida.");
				System.out.print(i + ": ");
				nota = sc.nextFloat();
			}
			
			System.out.println("----");
			
			if (nota < 4) {
				susp++;
			} else if (nota < 5) {
				cond++;
			} else {
				apro++;
			}
		}
		
		System.out.println("Hay:");
		System.out.println(apro + " aprobado" + (apro == 1 ? "" : "s"));
		System.out.println(cond + " condicionado" + (cond == 1 ? "" : "s"));
		System.out.println(susp + " suspenso" + (susp == 1 ? "" : "s"));

	}

}
