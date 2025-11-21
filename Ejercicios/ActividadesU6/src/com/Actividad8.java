package com;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;

		System.out.println("Introduce una frase:");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase().replace(" ", "");
		
		if (frase.equalsIgnoreCase(invertir(frase))) {
			System.out.println("La frase es palíndroma.");
		} else {
			System.out.println("La frase NO es palíndroma.");
		}
	}
	
	public static String invertir (String text) {
		String invertido = "";
		for (int i = text.length()-1; i >= 0; i--) {
			invertido += text.charAt(i);
		}
		return invertido;
	}

}
