package com;

import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3, sol1, sol2;

		System.out.println("Introduzca respectivamente los valores de la ecuación: ax² + bx + c");
		System.out.println("a:");
		num1 = sc.nextDouble();
		System.out.println("b:");
		num2 = sc.nextDouble();
		System.out.println("c:");
		num3 = sc.nextDouble();
		
		if (num1 == 0) {
			//Comprobar que ha introducido valores válidos
			System.out.println("No has introducido coeficientes de una ecuación de 2º grado.");
		} else if (Math.pow(num2, 2) - 4 * num1 * num3 <= 0) {
			//Comprobar si tiene es real
			System.out.println("x no tiene un valor real");
		} else {
			//Cálculo
			sol1 = (-num2 + Math.sqrt(Math.pow(num2, 2) - 4 * num1 * num3) / 2 * num1);
			sol2 = (-num2 - Math.sqrt(Math.pow(num2, 2) - 4 * num1 * num3) / 2 * num1);
			System.out.println("Soluciones:");
			if (sol1 != sol2) {
				System.out.println("x1: " + sol1);
			}
			System.out.println("x2: " + sol2);
		}
	}
}