package com;

public class Actividad11 {

	public static void main(String[] args) {
				
		System.out.println("Tablas de multiplicar del 1 al 10:");
		
		for (int a = 1; a <= 10; a++) {
			
			System.out.println("\nTabla del " + a + ":");
			
			for (int b = 1; b <= 10; b++) {
				System.out.println(a + " x " + b + " = " + a * b);
			}
		}
		
	}
}