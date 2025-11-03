package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cuantos números va a introducir:");
		int[] tabla = new int[sc.nextInt()];
		System.out.println("Introduzca los números:");
		for (int n = 0; n < tabla.length; n++) {
			System.out.print(n + 1 + ": ");
			tabla[n] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(tabla));
		
		int[] valoresPares = new int[cuentaPares(tabla)];
		int[] valoresImpares = new int[tabla.length - cuentaPares(tabla)];
		
		int ip = 0, inp = 0;
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] % 2 == 0 || inp >= valoresImpares.length) {
				valoresPares[ip] = tabla[i];
				ip++;
			} else {
				valoresImpares[inp] = tabla[i];
				inp++;
			}
		}
		
		System.out.println("Pares: " + Arrays.toString(valoresPares));
		System.out.println("Impares: " + Arrays.toString(valoresImpares));
	}
	
	public static int cuentaPares (int[] t) {
		int total = 0;
		for (int p = 0; p < t.length; p++) {
			if (t[p] % 2 == 0) total++;
		}
		return total;
	}

}
