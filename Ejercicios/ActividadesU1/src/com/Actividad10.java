package com;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean lluvia, tareas, biblio, salir;
		
		System.out.println("¿Está lloviendo?");
		lluvia = sc.nextBoolean();

		System.out.println("¿Has terminado tus tareas?");
		tareas = sc.nextBoolean();
		
		System.out.println("¿Necesitas ir a la biblioteca?");
		biblio = sc.nextBoolean();
		
		salir = biblio || (!lluvia && tareas);
		
		System.out.println("¿Se puede salir?\n" + salir);

	}
}
