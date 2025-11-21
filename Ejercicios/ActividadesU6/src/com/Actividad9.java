package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Introduce una frase:");
		frase = sc.nextLine();
		
		if (frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len")) {
			frase = frase.replace("Javalín, javalón", "").trim();
			frase = frase.replace("javalén, len, len", "").trim();
			System.out.println("Frase en Javalandés; traducido:");
			System.out.println(frase);
		} else {
			System.out.println("La frase no está en javalandés.");
		}
	}

}
