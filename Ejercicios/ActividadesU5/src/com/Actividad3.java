package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cúantos números desea introducir?");
		int tabla[] = new int[sc.nextInt()];
		
		System.out.println("Introduce los números:");
		for (int i = 0; i <= tabla.length - 1; i++) {
			System.out.print(i + 1 + ": ");
			tabla[i] = sc.nextInt();
		}
		
		System.out.println("Media positivos: " + mediaPositivos(tabla));
		System.out.println("Media negativos: " + mediaNegativos(tabla));
		System.out.println("Ceros: " + cuentaCeros(tabla));
		
	}
	
	public static double mediaPositivos (int[] t) {
		int pos = 0, total = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] > 0) {
				total += t[i];
				pos++;
			}
		}
		
		return total / pos;
	}
	
	public static double mediaNegativos (int[] t) {
		int neg = 0, total = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] < 0) {
				total += t[i];
				neg++;
			}
		}
		
		return total / neg;
	}
	
	public static int cuentaCeros (int[] t) {
		int ceros = 0;
		for (int i = 0; i < t.length; i++) {
			if (t[i] == 0) {
				ceros++;
			}
		}
		
		return ceros;
	}

}
