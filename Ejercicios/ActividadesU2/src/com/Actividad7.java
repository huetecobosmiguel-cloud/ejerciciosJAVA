package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;

		System.out.println("Introduzca un primer número:");
		num1 = sc.nextDouble();
		System.out.println("Introduzca un segundo número:");
		num2 = sc.nextDouble();
		System.out.println("Introduzca un tercer número:");
		num3 = sc.nextDouble();
		
		if (num1 >= num2 && num1 >= num3) {
			//num1 mayor
            if (num2 >= num3) {
                System.out.println(num1 + " > " + num2 + " > " + num3);
            } else {
                System.out.println(num1 + " > " + num3 + " > " + num2);
            }
            
        } else if (num2 >= num1 && num2 >= num3) {
        	//num2 mayor
            if (num1 >= num3) {
                System.out.println(num2 + " > " + num1 + " > " + num3);
            } else {
                System.out.println(num2 + " > " + num3 + " > " + num1);
            }
            
        } else {
        	//num3 mayor
            if (num1 >= num2) {
                System.out.println(num3 + " > " + num1 + " > " + num2);
            } else {
                System.out.println(num3 + " > " + num2 + " > " + num1);
            }
        }
	}
}