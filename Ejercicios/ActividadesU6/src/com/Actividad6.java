package com;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;

		System.out.println("Introduce un frase:");
		text = sc.nextLine();
		
		System.out.println(invertir(text));
	}
	
	public static String invertir (String text) {
		String invertido = "";
		for (int i = text.length()-1; i >= 0; i--) {
			invertido += text.charAt(i);
		}
		return invertido;
	}

}
