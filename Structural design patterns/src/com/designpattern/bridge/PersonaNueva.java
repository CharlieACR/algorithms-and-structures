package com.designpattern.bridge;

public class PersonaNueva implements IPersonaNueva{
	
	private String nombre;
	private int edad;
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
