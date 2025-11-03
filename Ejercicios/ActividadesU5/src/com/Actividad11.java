package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		
		int[][] m = new int[4][4];
		leerMatriz(m);
		
		System.out.println("Matriz: ");
		for (int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
		
		int suma = sumaFila(m, 0);
		boolean magica = true;
		for (int f = 0; f < 4; f++) {
			if (suma != sumaFila(m, f)) {
				magica = false;
				break;
			}
		}
		for (int c = 0; c < 4; c++) {
			if (suma != sumaColumna(m, c)) {
				magica = false;
				break;
			}
		}
		
		System.out.println();
		if (magica) {
			System.out.println("¡La matriz es Mágica!");
		} else {
			System.out.println("La matriz NO es mágica.");
		}

	}
	
	public static void leerMatriz (int[][] m) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca los valores de la matriz 4x4: ");
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 4; c++) {
				for (int i = 0; i < 4; i++) {
					System.out.println(Arrays.toString(m[i]));
				}
				System.out.print(c + 1 + f * 4 + ": ");
				m[f][c] = sc.nextInt();
				System.out.println();
			}
		}
		
	}
	
	public static int sumaFila (int[][] m, int fil) {
		int total = 0;
		for (int i = 0; i < 4; i++) {
			total += m[fil][i];
		}
		return total;
	}
	
	public static int sumaColumna (int[][] m, int col) {
		int total = 0;
		for (int i = 0; i < 4; i++) {
			total += m[i][col];
		}
		return total;
	}

}
