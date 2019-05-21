package com.designpattern.proxy;

import java.util.ArrayList;

public class GuardarDiscoDuro implements IGuardar{

	@Override
	public void save(ArrayList datosAGuardar) {
		System.out.println("Guardando Datos en el HD...");
		
	}

}
