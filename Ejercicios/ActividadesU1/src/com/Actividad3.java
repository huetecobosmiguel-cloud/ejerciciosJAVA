package com;
import java.util.Scanner;

public class Actividad3 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad:");
		int age = sc.nextInt();
		age++;
		System.out.println("El año que viene tendrías " + age + " años.");
	}
}
