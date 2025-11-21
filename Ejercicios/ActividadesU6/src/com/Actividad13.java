package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();
		
		System.out.println("Frase: " + frase);
		contarLetras(frase.toLowerCase());
	}
	
	public static void contarLetras (String text) {
		int[] contador = new int[27];
		for (char c : text.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				contador[c - 'a']++;
			}
		}
		
		for (int i = 0; i < 27; i++) {
			if (contador[i] > 0) {
				char letra = (char) ('a' + i);
				System.out.println(letra + ": " + contador[i]
						+ ((contador[i] == 1) ? " vez." : " veces."));
			}
		}
	}

}
