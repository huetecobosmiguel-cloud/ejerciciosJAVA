package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 2 palabras:");
		System.out.print("1: ");
		String tex1 = sc.next();
		System.out.print("2: ");
		String tex2 = sc.next();
		
		if (esAnagrama(tex1, tex2)) {
			System.out.println(tex1 + " y " + tex2 + " son Anagramas.");
		} else {
			System.out.println(tex1 + " y " + tex2 + " NO son Anagramas.");
		}
	}
	
	public static boolean esAnagrama (String tex1, String tex2) {
		char[] tex1c = tex1.toLowerCase().toCharArray();
		char[] tex2c = tex2.toLowerCase().toCharArray();
		Arrays.sort(tex1c);
		Arrays.sort(tex2c);
		
		return Arrays.equals(tex1c, tex2c);
	}

}
