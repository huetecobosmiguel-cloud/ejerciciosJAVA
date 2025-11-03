package com;

import java.util.Arrays;

public class Actividad8 {

	public static void main(String[] args) {

		int[] tabla = {3, 6, 1, 10, 6, 7, 2, 2, 4};
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(sinRepetidos(tabla)));
	
	}
	public static int[] sinRepetidos(int[] t) {
		int[] res = {t[0]};
		
		for (int i = 1; i < t.length; i++) {
			boolean repetido = false;
			for (int j = 0; j < res.length; j++) {
				if (t[i] == res[j]) {
					repetido = true;
				}
			}
			
			if (!repetido) res = insertar(res, t[i]);
		}
		
		return res;
	}
	
	public static int[] insertar(int[] res, int valor) {
		res = Arrays.copyOf(res, res.length+1);
		res[res.length-1] = valor;
		return res;
	}

}
