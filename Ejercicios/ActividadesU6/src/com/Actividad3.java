package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = "", palabra;

		System.out.println("Escribe una frase palabra a palabra:");
		palabra = sc.next();
		
		while (!palabra.equalsIgnoreCase("fin")) {
			frase += palabra + " ";
			System.out.println(frase);
			palabra = sc.next();
		}
		
		System.out.println("\nFrase final:");
		System.out.println(frase);
	}

}
