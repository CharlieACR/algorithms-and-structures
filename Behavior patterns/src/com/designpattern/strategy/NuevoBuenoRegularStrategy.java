package com.designpattern.strategy;

import java.util.ArrayList;

public class NuevoBuenoRegularStrategy implements ILibroStrategy{

	@Override
	public Libro findLibro(String titulo) {
		ArrayList<Libro> libros = Biblioteca.getLibros();
		Libro libro = new Libro();
		libro.setEstado("Nuevo");
		libro.setTitulo("Brief answers to the big questions");
		return libro;
	}

}
