package com;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int susp = 0;
		float nota = 0;
		
		System.out.println("Introduce las 5 notas:");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + ": ");
			nota = sc.nextFloat();
			
			while (nota > 10 || nota < 0) {
				System.out.println("Nota no válida.");
				System.out.print(i + ": ");
				nota = sc.nextFloat();
			}
			
			System.out.println("----");
			
			if (nota < 5) {
				susp++;
			}
		}
		
		System.out.println("Hay " + susp + " suspenso" + (susp == 1 ? "." : "s."));
	}

}
