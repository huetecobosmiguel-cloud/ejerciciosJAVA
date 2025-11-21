package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Jugador 1:");
		System.out.println("Introduce una frase/palabra:");
		String text1 = sc.nextLine().trim();
		
		while (text1.isEmpty()) {
			System.out.println("No has introducido nada, prueba otra vez:");
			text1 = sc.nextLine().trim();
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		System.out.println("Jugador 2:");
		System.out.println("¿Cual es la frase/palabra original?");
		System.out.println(convertirAnagrama(text1));
		String text2 = sc.nextLine().trim();
		
		while (!text2.equalsIgnoreCase(text1)) {
			System.out.println("Incorrecto, prueba otra vez:");
			text2 = sc.nextLine().trim();
		}
		
		System.out.println("\nFelicidades!, la frase/palabra era:");
		System.out.println(text1);
	}

	public static String convertirAnagrama (String text) {
		String[] frase = text.split(" ");
		String anagrama = "";
		
		for (int k = 0; k < frase.length; k++) {
			char[] letras = frase[k].toLowerCase().toCharArray();

	        for (int i = 0; i < frase[k].length(); i++) {
	        	
	        	int j = (int) (Math.random() * (i + 1));

	            char temp = letras[i];
	            letras[i] = letras[j];
	            letras[j] = temp;
	        }
	        
	        String palabra = "";
	        for (int i = 0; i < letras.length; i++) {
	        	palabra += letras[i];
	        }
	        
	        anagrama += palabra + " ";
		}
		
		

        return anagrama;
	}
	
}
