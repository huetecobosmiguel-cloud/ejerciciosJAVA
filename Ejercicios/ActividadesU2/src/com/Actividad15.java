package com;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Introduzca un día de la semana en formato número (1-7):");
		num = sc.nextInt();
		
		String dia = switch (num) {
		case 1 -> "Lunes";
		case 2 -> "Martes";
		case 3 -> "Miércoles";
		case 4 -> "Jueves";
		case 5 -> "Viernes";
		case 6 -> "Sábado";
		case 7 -> "Domingo";
		default -> "Día no válido";
		};
		
		System.out.println(dia);
	}

}
