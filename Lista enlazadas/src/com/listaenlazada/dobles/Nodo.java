package com.listaenlazada.dobles;

public class Nodo {
	int data;
	Nodo next;
	Nodo prev;
	
	public Nodo()
	{
		data = 0;
		next = null;
		prev = null;
	}
	
	public Nodo(int dato)
	{
		data = dato;
		next = null;
		prev = null;
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

	public Nodo getPrev() {
		return prev;
	}

	public void setPrev(Nodo prev) {
		this.prev = prev;
	}
	
	

}
