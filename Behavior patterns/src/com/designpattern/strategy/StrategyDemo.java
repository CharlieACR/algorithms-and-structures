package com.designpattern.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		Socio socio = new Socio();
		Libro libro = LibroFinder.findLibro(socio, "Brief");
		System.out.println("Titulo: " + libro.getTitulo());
		System.out.println("Estado: " + libro.getEstado());

	}

}
