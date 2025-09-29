package com;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int man, per;
		float bene;
		
		System.out.println("Introduzca los kg vendidos de Manzanas este semestre:");
		man = sc.nextInt();
		System.out.println("Introduzca los kg vendidos de Peras este semestre:");
		per = sc.nextInt();
		
		bene = (man * 2.35F + per * 1.95F) * 2;
		
		System.out.println("Benficio anual:\n" + bene + "€");
	}

}
