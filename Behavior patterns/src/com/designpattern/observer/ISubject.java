package com.designpattern.observer;

public interface ISubject {
	
	public void attach(ILibroMalEstado observador);
	public void dettach(ILibroMalEstado observador);
	public void notifyObservers();

}
