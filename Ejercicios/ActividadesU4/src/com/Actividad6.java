package com;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra;

		System.out.println("Introduce un carácter:");
		letra = sc.next().charAt(0);
		
		if (vocal(letra)) {
			System.out.println(letra + " es vocal.");
		} else {
			System.out.println(letra + " NO es vocal.");
		}
		
	}
	
	public static boolean vocal (char c) {
		c = Character.toLowerCase(c);
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}

}
