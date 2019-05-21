package com.designpattern.observer;

public class Compras implements ILibroMalEstado{

	@Override
	public void update() {
		System.out.println("Aministracion: ");
		System.out.println("Solicito una nueva cotizacion...");
		
	}

}
