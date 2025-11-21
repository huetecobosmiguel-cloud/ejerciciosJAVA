package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		char[] conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		String texto, cod = "";
		
		System.out.println("Introduce el texto a codificar:");
		texto = sc.nextLine();
		
		for (int i = 0; i < texto.length(); i++) {
			cod += codifica(conjunto1, conjunto2, texto.toLowerCase().charAt(i));
		}
		
		System.out.println("Texto codificado:");
		System.out.println(cod);
	}
	
	public static char codifica(char conjunto1[],char conjunto2[], char c) {
		for (int i = 0; i < conjunto1.length; i++) {
			if (c == conjunto1[i]) {
				return conjunto2[i];
			}
		}
		
		return c;
	}

}
