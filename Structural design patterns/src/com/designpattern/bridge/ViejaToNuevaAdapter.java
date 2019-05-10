package com.designpattern.bridge;

import java.util.GregorianCalendar;

public class ViejaToNuevaAdapter implements IPersonaNueva{

	private IPersonaVieja vieja;
	
	public ViejaToNuevaAdapter(IPersonaVieja vieja)
	{
		this.vieja = vieja;
	}
	
	@Override
	public String getNombre() {
		return vieja.getNombre() + " " + vieja.getApellido();
	}

	@Override
	public void setNombre(String nombreCompleto) {
		String[] name = nombreCompleto.split(" ");
		String firstName = name[0];
		String lastname = name[1];
		vieja.setNombre(firstName);
		vieja.setApellido(lastname);
	}

	@Override
	public int getEdad() {
		GregorianCalendar c = new GregorianCalendar();
		GregorianCalendar c2 = new GregorianCalendar();
		c2.setTime(vieja.getFechaDeNacimiento());
		return 0;
	}

	@Override
	public void setEdad(int edad) {
		GregorianCalendar c = new GregorianCalendar();
		int anioActual = c.get(1);
		c.set(1, anioActual-edad);		
	}

}
