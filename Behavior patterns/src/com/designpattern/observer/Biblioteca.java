package com.designpattern.observer;

public class Biblioteca {
	AlarmaLibro alarma;
	
	public Biblioteca()
	{
		
	}
	
	public Biblioteca(AlarmaLibro alarma)
	{
		this.alarma = alarma;
	}
	
	public void decuelveLibro(Libro libro)
	{
		if(libro.getEstado().equals("MALO"))
		{
			alarma.notifyObservers();
		}
	}

}
