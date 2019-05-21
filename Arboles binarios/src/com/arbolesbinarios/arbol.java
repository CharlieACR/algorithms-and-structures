package com.arbolesbinarios;

public class arbol {
	private Nodo raiz;
	
	public arbol()
	{
		raiz = null;
	}
	
	public arbol(int dato)
	{
		raiz = new Nodo(dato);
	}
	
	public void insertNode(int value)
	{
		if(raiz==null)
		{
			raiz = new Nodo();
		}
		else
		{
			raiz.insert(value);
		}
	}
	
	
	
	public void nuevoArbol(Nodo izq, int dato, Nodo der)
	{
		raiz = new Nodo(dato);
		if(izq!=null)
		{
			raiz.setLeft(izq);	
		}
		if(der!=null)
		{
			raiz.setRight(der);
		}
	}
}
