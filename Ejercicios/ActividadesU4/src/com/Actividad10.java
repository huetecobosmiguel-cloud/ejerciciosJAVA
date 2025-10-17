package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Introduce 2 números y te diré si son amigos:");
		System.out.print("1: ");
		num1 = sc.nextInt();
		System.out.print("2: ");
		num2 = sc.nextInt();
		System.out.println();

		if (sonAmigos(num1, num2)) {
			System.out.println(num1 + " y " + num2 + " son números amigos.");
		} else {
			System.out.println(num1 + " y " + num2 + " NO son números amigos.");
		}
	}
	
	public static boolean sonAmigos (int num1, int num2) {
		int sum1 = 0, sum2 = 0;
		
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum1 += i;
			}
		}
		
		for (int j = 1; j < num2; j++) {
			if (num2 % j == 0) {
				sum2 += j;
			}
		}
		
		if (num1 == sum2 && num2 == sum1) {
			return true;
		} else {
			return false;
		}
	}
}
