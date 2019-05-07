package com.arbolesbinarios;

public class Nodo {
	private int data;
	private Nodo left;
	private Nodo right;
	
	public Nodo()
	{
		data = 0;
		left = null;
		right = null;
	}
	
	public Nodo(int dato)
	{
		data = dato;
		left = null;
		right = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Nodo getLeft() {
		return left;
	}

	public void setLeft(Nodo left) {
		this.left = left;
	}

	public Nodo getRight() {
		return right;
	}

	public void setRight(Nodo right) {
		this.right = right;
	}

}
