package com;

import java.util.Scanner;

public class Actividad9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Introduzca un número y se le dirá si es par:");
		num = sc.nextInt();
		
		boolean par = num % 2 == 0;
		
		System.out.println(par);
	}

}
