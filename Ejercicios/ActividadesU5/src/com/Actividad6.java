package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] puntos = new int[5];

		System.out.println("Introduce la nota de los 5 programadores:");
		for (int i = 0; i < puntos.length; i++) {
			System.out.print(i + 1 + ": ");
			puntos[i] = sc.nextInt();
		}
		
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
		
		System.out.println("Puntuaciones de exhibición, \"-1\" para terminar:");
		for (int i = 1; i <= 3; i++) {
			System.out.print(i + ": ");
			int punt = sc.nextInt();
			if (punt != -1) {
				puntos = Arrays.copyOf(puntos, puntos.length+1);
				puntos[puntos.length-1] = punt;
			} else {
				break;
			}
		}
		
		Arrays.sort(puntos);
		System.out.println(Arrays.toString(puntos));
	}

}
