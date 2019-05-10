package com.designpattern.adapter;

/*
 * 
 * Adapter pattern
 * Description: It is an object that links to incompatible interface.
 * 
 * */

public class AdapterDemo {

	public static void main(String[] args) {
		
		Adaptador conversor = new Adaptador();
        conversor.ingresarPesetas( 2000 );
        conversor.ingresarPesetas( 5000 );
        conversor.ingresarPesetas( 1000 );
        System.out.println( "Total euros: " + conversor.getSaldo() );

	}

}
