package com;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos;
		int[] tabla = {5, 2, 8, 25, 67, 69, 17, 11, 6, 666, 777, 7, 73, 101, 64, 100};
		
		System.out.println("Introduce la posición a eliminar de la tabla, \"<0\" para terminar.");
		
		do {
			//Comprobar que quedan datos en la tabla.
			if (tabla.length != 0) {
				System.out.println(Arrays.toString(tabla));
				pos = sc.nextInt();
			} else {
				break;
			}
			
			//Asegurarse de ser pos válido.
			if (pos >= tabla.length) {
				System.out.println("Valor no válido.");
				continue;
			}
			
			//Borrar elemento y decir cuantos quedan.
			tabla = borrarElemento(tabla, pos);
			System.out.println(", " + ((tabla.length == 1) ? "queda " + tabla.length + " elemento." : "quedan " + tabla.length + " elementos."));
			
		} while (pos >= 0);
		
	}
	
	public static int[] borrarElemento (int[] t, int pos) {
		System.out.print("Se ha borrado el " + t[pos]);
		t[pos] = t[t.length - 1];
		return Arrays.copyOf(t, t.length-1);
	}

}
