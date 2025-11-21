package com;

import java.util.Arrays;

public class Actividad12 {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				matriz[f][c] = f + c;
			}
		}
		
		mostrarMatriz(matriz);

	}
	
	public static void mostrarMatriz (int[][] matriz) {
		for (int f = 0; f < matriz.length; f++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.print(matriz[f][c] + " ");
			}
			System.out.println();
		}
	}

}
