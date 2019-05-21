package com.designpattern.proxy;

import java.util.ArrayList;

public class ProxyDemo {

	public static void main(String[] args) {
		ArrayList<Integer> datos = new ArrayList();

		datos.add(3);
		datos.add(4);
		datos.add(5);
		
		GuardarDatos proxy = new GuardarDatos();
		try {
			proxy.save(datos);
			datos.clear();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		datos.add(12);
		datos.add(45);
		datos.add(90);
		
		try {
			proxy.save(datos);
			datos.clear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		datos.add(3212);
		datos.add(4521);
		datos.add(9012);
		
		try {
			proxy.save(datos);
			datos.clear();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
