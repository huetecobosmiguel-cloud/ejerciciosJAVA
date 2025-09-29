package com;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el año en el que estamos:");
		int year = sc.nextInt();
		
		System.out.println("Dime el año en el que naciste:");
		int birth = sc.nextInt();
		
		int age = year - birth;
		System.out.println("Deberías tener " + age + " años.");

	}

}
