package com.designpattern.observer;

import java.util.ArrayList;

public class AlarmaLibro implements ISubject{
	private static ArrayList<ILibroMalEstado> observadores;
	
	public AlarmaLibro()
	{
		observadores = new ArrayList<ILibroMalEstado>();
	}

	@Override
	public void attach(ILibroMalEstado observador) {
		observadores.add(observador);
		
	}

	@Override
	public void dettach(ILibroMalEstado observador) {
		observadores.remove(observador);
		
	}

	@Override
	public void notifyObservers() {
		for(int con=0;con<observadores.size();con++)
		{
			observadores.get(con).update();
		}
		
	}

}
