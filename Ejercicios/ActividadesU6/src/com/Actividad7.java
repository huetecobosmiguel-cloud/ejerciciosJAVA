package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, palabra;
		int cant = 0, index = 0;

		System.out.println("Introduce una frase:");
		frase = sc.nextLine();
		System.out.println("Introduce una palabra:");
		palabra = sc.nextLine();
		
		frase = frase.toLowerCase();
		palabra = palabra.toLowerCase();
		
		while ((index = frase.indexOf(palabra, index)) != -1) {
            cant++;
            index += palabra.length();
        }
		
		System.out.println("La palabra \"" + palabra + "\" aparece " + cant + " veces.");
	}

}
