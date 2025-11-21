package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tex1, tex2;

		System.out.println("Introduce dos palabras: ");
		System.out.print("1: ");
		tex1 = sc.next();
		System.out.print("2: ");
		tex2 = sc.next();
		
		if (tex1.length() < tex2.length()) {
			System.out.println("\"" + tex1 + "\" es la palabra más corta.");
		} else {
			System.out.println("\"" + tex2 + "\" es la palabra más corta.");
		}
	}

}
