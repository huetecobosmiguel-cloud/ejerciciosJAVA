package com;

import java.util.Arrays;

public class Actividad13 {

	public static void main(String[] args) {
		int[] tabla = {-56, 7, 864946, 0, -743917, -8, 26};
		
		System.out.println(Arrays.toString(tabla));
		System.out.println("Máximo: " + maximo(tabla));

	}
	
	public static int maximo (int[] t) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < t.length; i++) {
			if (t[i] > max) max = t[i];
		}
		return max;
	}

}
