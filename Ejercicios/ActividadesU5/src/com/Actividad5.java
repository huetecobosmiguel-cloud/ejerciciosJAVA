package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fallos = 1;
		
		System.out.println("Introduce la longitud de la combinación:");
		int[] combinacion = new int[sc.nextInt()];
		
		for (int i = 0; i < combinacion.length; i++) {
			combinacion[i] = (int) (Math.random() * 5 + 1);
		}
		
		while (fallos != 0) {
			int num;
			fallos = 0;
			System.out.println("Adivine los valores correspondientes de la combinación, del 1 al 5:");
			for (int i = 1; i <= combinacion.length; i++) {
				System.out.print(i + ": ");
				num = sc.nextInt();
				
				if (num < combinacion[i - 1]) {
					System.out.println("Mayor");
					fallos++;
				} else if (num > combinacion[i - 1]) {
					System.out.println("Menor");
					fallos++;
				} else {
					System.out.println("Igual");
				}
			}
			
			if (fallos != 0) System.out.println("Tienes " + fallos + " fallos.");
		}
		
		System.out.println("Enhorabuena!");
		System.out.println("Combinación: " + Arrays.toString(combinacion));
	}

}
