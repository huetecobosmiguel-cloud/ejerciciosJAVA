package com.texto;

public class Texto {
	public String texto;
	private static int limite = 20;
	
	public Texto(String texto) {
		if (texto.length() > limite) {
			System.out.println("Texto demasiado largo.");
		} else {
			this.texto = texto;
		}
	}
	
	public void addCharPrincipio (char character) {
		if (this.texto.length() == limite) {
			System.out.println("Ya se alcanzó el tamaño máximo.");
		} else {
			this.texto = character + this.texto;
		}
	}
	
	public void addCharFinal (char character) {
		if (this.texto.length() == limite) {
			System.out.println("Ya se alcanzó el tamaño máximo.");
		} else {
			this.texto += character;
		}
	}
	
	public void addStringPrincipio (String cadena) {
		if (this.texto.length() + cadena.length() > limite) {
			System.out.println("Operación cancelada, se supera el tamaño máximo.");
		} else {
			this.texto = cadena + this.texto;
		}
	}

	public void addStringFinal (String cadena) {
		if (this.texto.length() + cadena.length() > limite) {
			System.out.println("Operación cancelada, se supera el tamaño máximo.");
		} else {
			this.texto += cadena;
		}
	}
	
	public int contarVocales() {
		int cant = 0;
		String vocales = "aeiou";
		for (int i = 0; i < this.texto.length(); i++) {
			if (vocales.indexOf(this.texto.toLowerCase().charAt(i)) != -1) {
				cant++;
			}
		}
		
		return cant;
	}
	
}
