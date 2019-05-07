package com.listaenlazada.simples;

public class Nodo {
	int data;
	Nodo next;
	
	public Nodo()
	{
		data=0;
		next = null;
	}
	
	public Nodo(int dato)
	{
		data = dato;
		next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}

}
