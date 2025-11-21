package com;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.println("Introduce tu nombre y apellidos:");
		name = sc.nextLine();
		
		name = name.replaceAll("[aAáÁeEéÉiIíÍoOóÓuUúÚ]", "");
		
		System.out.println(name);
	}

}
