package com.listaenlazada.dobles;

public class main {

	public static void main(String[] args) {
		lista ejemplo2 = new lista(7);
		ejemplo2.agregar(3);
		ejemplo2.agregar(31);
		System.out.println(ejemplo2.getListlinked().getData());
		System.out.println(ejemplo2.getListlinked().getPrev().getData());
		

	}

}
