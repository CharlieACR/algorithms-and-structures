package com.listaenlazada.simples;

public class lista {
	Nodo head;
	Nodo listlinked;
	
	public lista()
	{
		listlinked = new Nodo();
		head = listlinked;
	}

	public lista(int dato)
	{
		listlinked = new Nodo(dato);
		head = listlinked;
	}
	
	public void agregarDato(int dato)
	{
		listlinked.setNext(new Nodo(dato));
		listlinked = listlinked.getNext();
	}
	
	public void imprimir()
	{
		Nodo corredor = head;
		System.out.print(corredor.getData());
		while(corredor.getNext()!=null)
		{
			corredor = corredor.getNext();
			System.out.print(", " + corredor.getData());
		}
	}
	
	public Nodo getHead() {
		return head;
	}

	public void setHead(Nodo head) {
		this.head = head;
	}

	public Nodo getListlinked() {
		return listlinked;
	}

	public void setListlinked(Nodo listlinked) {
		this.listlinked = listlinked;
	}

}
