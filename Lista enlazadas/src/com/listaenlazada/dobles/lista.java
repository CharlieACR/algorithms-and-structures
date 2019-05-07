package com.listaenlazada.dobles;

public class lista {
	private Nodo head;
	private Nodo listlinked;
	
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
	
	public void agregar(int dato)
	{
		listlinked.setNext(new Nodo(dato));
		listlinked.getNext().setPrev(listlinked);
		listlinked = listlinked.getNext();
	}
	
	public void imprimir()
	{
		Nodo corredor = head;
		System.out.println(corredor.getData());
		while(corredor.getNext()!=null)
		{
			corredor = corredor.getNext();
			System.out.println(corredor.getData());
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
