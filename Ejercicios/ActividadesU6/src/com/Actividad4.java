package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		int spaces = 0;

		System.out.println("Introduce una frase:");
		frase = sc.nextLine();
		
		for (int i : frase.toCharArray()) {
			if (frase.charAt(i) == ' ') {
				spaces++;
			}
		}
		
		System.out.println("Hay " + spaces + " espacios.");
	}

}
