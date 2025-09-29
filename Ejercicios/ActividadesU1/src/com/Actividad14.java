package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num;

		System.out.println("Introduzca un número decimal:");
		num = sc.nextFloat();
		
		System.out.println("Número redondeado: " + Math.round(num));
	}

}
