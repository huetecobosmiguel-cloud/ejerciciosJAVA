package com;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		int[] t = new int[10];

		System.out.println(rellenaPares(t));
	}
	
	private static int rellenaPares (int[] tabla) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		
		for (int i = 0; i < tabla.length;) {
			tabla[i] = sc.nextInt();
			
			if (tabla[i] % 2 == 0) i++;
			else contador++;
		}
		
		return contador;
	}

}
