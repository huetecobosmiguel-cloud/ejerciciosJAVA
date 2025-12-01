package com.cuenta;

public class Banco {
	public final String nombre;
	public String direccion;
	public int capital;
	
	public Banco (String nombre, String direccion, int capital) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.capital = capital;
	}
	public Banco (String nombre, String direccion) {
		this(nombre, direccion, 5200000);
	}
}
