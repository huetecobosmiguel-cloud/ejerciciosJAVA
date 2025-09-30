package com;

import java.util.Scanner;

public class Actividad16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String dec = null, uni = null, tex;

		System.out.println("Introduzca un número entre 1 y 99.");
		num = sc.nextInt();
		
		if (num < 1 || num > 99) {
			System.out.println("Número no válido (1-99).");
		} else {
			if (num < 16) {
				tex = switch (num) {
					case 1 -> "Uno";
					case 2 -> "Dos";
					case 3 -> "Tres";
					case 4 -> "Cuatro";
					case 5 -> "Cinco";
					case 6 -> "Seis";
					case 7 -> "Siete";
					case 8 -> "Ocho";
					case 9 -> "Nueve";
					case 10 -> "Diez";
					case 11 -> "Once";
					case 12 -> "Doce";
					case 13 -> "Trece";
					case 14 -> "Catorce";
					case 15 -> "Quince";
					default -> "Error";
				};
				
			} else {
				if (num < 30) {
				
					dec = switch (num / 10) {
						case 1 -> "Diec";
						case 2 -> "Veint";
						default -> "Error";
					};
					
					uni = switch (num % 10) {
						case 1 -> "iuno";
						case 2 -> "idos";
						case 3 -> "itres";
						case 4 -> "icuatro";
						case 5 -> "icinco";
						case 6 -> "iseis";
						case 7 -> "isiete";
						case 8 -> "iocho";
						case 9 -> "inueve";
						default -> "e";
					};
				
				} else {
				
					dec = switch (num / 10) {
						case 3 -> "Treinta";
						case 4 -> "Cuarenta";
						case 5 -> "Cincuenta";
						case 6 -> "Sesenta";
						case 7 -> "Setenta";
						case 8 -> "Ochenta";
						case 9 -> "Noventa";
						default -> "Error";
					};
					
					uni = switch (num % 10) {
						case 1 -> " y uno";
						case 2 -> " y dos";
						case 3 -> " y tres";
						case 4 -> " y cuatro";
						case 5 -> " y cinco";
						case 6 -> " y seis";
						case 7 -> " y siete";
						case 8 -> " y ocho";
						case 9 -> " y nueve";
						default -> "";
					};
				}
				
				tex = dec + uni;
				
			}
			
			System.out.println(tex);
			
		}
	}
}