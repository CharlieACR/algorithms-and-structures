package com.designpattern.strategy;

import java.util.ArrayList;

public class BuenoNuevoRegularStrategy implements ILibroStrategy{

	@Override
	public Libro findLibro(String titulo) {
		ArrayList<Libro> libros = Biblioteca.getLibros();
		Libro libro = new Libro();
		libro.setEstado("Bueno");
		libro.setTitulo("Don Quixote");
		return libro;
	}
	

}
