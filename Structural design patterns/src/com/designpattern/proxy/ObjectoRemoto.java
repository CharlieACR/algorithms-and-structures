package com.designpattern.proxy;

import java.util.ArrayList;

public class ObjectoRemoto implements IGuardar{

	@Override
	public void save(ArrayList datosAGuardar) {
		System.out.println("Guardando datos en el objeto remoto");
		
	}

}
