package com;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Introduce tres números:");
		System.out.print("1: ");
		num1 = sc.nextInt();
		System.out.print("2: ");
		num2 = sc.nextInt();
		System.out.print("3: ");
		num3 = sc.nextInt();
		
		System.out.println("El mayor es: " + mayor(num1, num2, num3));
	}
	
	public static int mayor (int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
            
        } else if (num2 >= num1 && num2 >= num3) {
        	return num2;
            
        } else {
        	return num3;
        }

	}

}
