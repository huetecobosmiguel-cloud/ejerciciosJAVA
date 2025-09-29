package com;

import java.util.Scanner;

public class Actividad13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// Notas Trimestrales
		int pri, seg, ter;
		float nota;

		//Leer notas
		System.out.println("Introduzca su nota del 1º Trimestre:");
		pri = sc.nextInt();
		System.out.println("Introduzca su nota del 2º Trimestre:");
		seg = sc.nextInt();
		System.out.println("Introduzca su nota del 3º Trimestre:");
		ter = sc.nextInt();

		//Calculo de la nota final
		nota = (float) (pri + seg + ter) / 3;
		
		System.out.println("Nota en el boletín: " + (int) nota );
		System.out.println("Nota en el expediente: " + nota);
	}
}

