package com;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		mostrar("Uno");
		mostrar(2);
		mostrar("Tres", 4);

	}
	
	public static void mostrar (String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void mostrar (int numero) {
		System.out.println(numero);
	}
	
	public static void mostrar (String texto, int veces) {
		for (int i = 1; i <= veces; i++) {
			System.out.println(texto);
		}
	}

}
