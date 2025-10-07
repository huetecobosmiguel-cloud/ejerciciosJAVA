package com;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, intento;

		num = (int) (Math.random() * 100) + 1;
		
		System.out.println("Estoy pensando en un número entre 1-100:");
		System.out.println("Introduzca -1 para rendirse.");
		intento = sc.nextInt();
		
		while (intento != -1) {
			
			if (intento > num) {
				System.out.println("Menor");
			} else if (intento < num){
				System.out.println("Mayor");
			} else {
				System.out.println("Enhorabuena!");
				break;
			}
			
			intento = sc.nextInt();
		}
		
		System.out.println("El número secreto era: " + num);
		
	}

}
