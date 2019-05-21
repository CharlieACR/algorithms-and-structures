package com.designpattern.proxy;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GuardarDatos implements IGuardar{
	
	public GuardarDatos()
	{
		ConnectionMannager.conectate();
	}

	@Override
	public void save(ArrayList datosAGuardar) throws InterruptedException {
		if(ConnectionMannager.hayConexion())
		{
			new ObjectoRemoto().save(datosAGuardar);
			TimeUnit.SECONDS.sleep(5);
			ConnectionMannager.desconectate();
		}
		else
		{
			new GuardarDiscoDuro().save(datosAGuardar);
			TimeUnit.SECONDS.sleep(5);
			ConnectionMannager.conectate();
		}
		
	}

}
