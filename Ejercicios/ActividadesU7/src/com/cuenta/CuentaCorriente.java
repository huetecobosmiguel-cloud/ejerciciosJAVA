package com.cuenta;

public class CuentaCorriente {
	private double saldo;
	private int limiteDescubierto;
	public String name;
	protected String dni;
	public Banco banco;
	
	public CuentaCorriente(String name, String dni) {
		this.name = name;
		this.dni = dni;
		this.saldo = 0;
		this.limiteDescubierto = -50;
	}
	
	public CuentaCorriente(double saldo) {
		this.saldo = saldo;
		this.limiteDescubierto = 0;
	}
	
	public CuentaCorriente(double saldo, int limiteDescubierto, String dni) {
		this.dni = dni;
		this.saldo = saldo;
		this.limiteDescubierto = limiteDescubierto;
	}
	
	public void sacarDinero (double cantidad) {
		if ((this.saldo - cantidad) < limiteDescubierto) {
			System.out.println("No se ha podido retirar dinero.");
		} else {
			this.saldo -= cantidad;
		}
		
		System.out.println("\n" + this.name + ": ");
		System.out.println("Saldo actual: " + this.saldo + " €");
	}
	
	public void ingresarDinero (double cantidad) {
		this.saldo += cantidad;
		
		System.out.println("\n" + this.name + ": ");
		System.out.println("Saldo actual: " + this.saldo + " €");
	}
	
	public void mostrarInfo() {
	    System.out.println("\n--- Información de la Cuenta ---");
	    System.out.println("Titular: " + (name != null ? name : "No especificado"));
	    System.out.println("DNI: " + (dni != null ? dni : "No especificado"));
	    System.out.println("Saldo actual: " + saldo + " €");
	    System.out.println("Límite de descubierto: " + limiteDescubierto + " €");
	}
	
	//Bancos
	public void unirBanco (Banco nombre) {
		this.banco = nombre;
	}
	
	public void cambiarBanco (Banco nuevoBanco) {
		this.banco = nuevoBanco;
	}
	
}
