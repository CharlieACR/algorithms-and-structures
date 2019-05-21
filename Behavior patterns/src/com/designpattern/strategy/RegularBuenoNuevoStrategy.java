package com.designpattern.strategy;

import java.util.ArrayList;

public class RegularBuenoNuevoStrategy implements ILibroStrategy{

	@Override
	public Libro findLibro(String titulo) {
		ArrayList<Libro> libros = Biblioteca.getLibros();
		Libro libro = new Libro();
		libro.setEstado("Regular");
		libro.setTitulo("Crepusculo");
		return libro;
	}

}
