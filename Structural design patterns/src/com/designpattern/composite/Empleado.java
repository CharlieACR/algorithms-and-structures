package com.designpattern.composite;

public class Empleado implements ISueldo{
	private String nombreCompleto, cargo;
	private double sueldo;
	
	public Empleado(String nombreCompleto, String cargo, double sueldo)
	{
		this.setCargo(cargo);
		this.setNombreCompleto(nombreCompleto);
		this.setSueldo(sueldo);
		
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
