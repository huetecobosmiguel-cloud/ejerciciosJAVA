package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double rad, per, area;

		System.out.println("Introduzca el radio de la circunferencia:");
		rad = sc.nextFloat();
		
		per = 2 * Math.PI * rad;
		area = Math.PI * rad * rad;

		System.out.println("El perímetro es: " + per);
		System.out.println("El área es: " + area);
	}

}
