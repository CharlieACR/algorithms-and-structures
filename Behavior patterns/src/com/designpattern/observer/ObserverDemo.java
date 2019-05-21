package com.designpattern.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		AlarmaLibro alarma = new AlarmaLibro();
		alarma.attach(new Compras());
		alarma.attach(new Administracion());
		
		Libro libro = new Libro();
		libro.setEstado("MALO");
		
		Biblioteca biblio = new Biblioteca(alarma);
		alarma.attach(new Stock());
		biblio.decuelveLibro(libro);

	}

}
