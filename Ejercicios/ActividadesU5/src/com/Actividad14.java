package com;

import java.util.Arrays;

public class Actividad14 {

	public static void main(String[] args) {
		int[] apuesta = {9, 1, 4, 13, 5, 3};
		int[] ganadora = {2, 1, 4, 4, 5, 7};
		
		System.out.println("Apuesta: " + Arrays.toString(apuesta));
		System.out.println("Apuesta: " + Arrays.toString(ganadora));

		System.out.println("Aciertos: " + cuentaAciertos(apuesta, ganadora));
	}
	
	private static int cuentaAciertos (int[] apuesta, int[] ganadora) {
		int aciertos = 0;
		for (int i = 0; i < 6; i++) {
			if (apuesta[i] == ganadora[i]) aciertos++;
		}
		return aciertos;
	}

}
