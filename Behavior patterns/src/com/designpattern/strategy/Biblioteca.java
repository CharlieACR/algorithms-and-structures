package com.designpattern.strategy;

import java.util.ArrayList;

public class Biblioteca {
	private static ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public Biblioteca()
	{
		Libro libro = new Libro();
		libro.setEstado("Bueno");
		libro.setTitulo("Un titulo");
		libros.add(libro);
	}
	
	public static ArrayList<Libro> getLibros()
	{
		return libros;
	}

}
