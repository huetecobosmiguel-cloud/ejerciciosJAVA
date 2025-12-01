package com;

import com.cuenta.CuentaCorriente;
import com.sintetizador.Sintetizador;
import com.texto.Texto;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente miguel = new CuentaCorriente("Miguel", "99999999R");
		miguel.mostrarInfo();
		miguel.ingresarDinero(2000);
		miguel.sacarDinero(400);
		
		CuentaCorriente pedro = new CuentaCorriente(5000);
		pedro.mostrarInfo();
		
		CuentaCorriente ruben = new CuentaCorriente(600, 0, "99999999G");
		ruben.mostrarInfo();
		ruben.sacarDinero(500);
		
		
		Texto nombre = new Texto("Miguel");
		System.out.println(nombre.contarVocales());
		
		Sintetizador.main();

	}

}
