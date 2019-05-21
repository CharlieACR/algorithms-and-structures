package com.designpattern.strategy;

public class LibroFinder {
	
	public static Libro findLibro(Persona persona, String titulo)
	{
		ILibroStrategy strategy = null;
		if(persona instanceof Socio)
		{
			strategy = new NuevoBuenoRegularStrategy();
		}
		else if(persona instanceof Profesor)
		{
			strategy = new BuenoNuevoRegularStrategy();
		}
		else if(persona instanceof Alumno)
		{
			strategy = new RegularBuenoNuevoStrategy();
		}
		return strategy.findLibro(titulo);
	}

}
