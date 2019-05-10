package com.designpattern.facade;

/*
 * 
 *  Facade pattern
 *  Description: It is an object that manages several subsystems.
 * 
 * */

public class FacadeDemo {

	public static void main(String[] args) {
		Facade fachada = new Facade();
        fachada.arrancarCoche();
        System.out.println("\nProceso finalizado.");

	}

}
