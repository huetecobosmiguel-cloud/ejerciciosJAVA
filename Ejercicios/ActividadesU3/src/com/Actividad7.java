package com;

public class Actividad7 {

	public static void main(String[] args) {
		int prod = 1, imp = 1, cuenta = 0;
		
		System.out.println("Producto de los 10 primeros números impares:");
		
		while (imp <= 10) {
			if (cuenta % 2 == 1) {
				prod *= cuenta;
				imp++;
			}
			
			cuenta++;
		}
		
		System.out.println(prod);
		
	}

}
