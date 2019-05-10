package com.designpattern.bridge;

import java.util.Date;
import java.util.GregorianCalendar;

/*
 * 
 * Bridge pattern
 * Description: 
 * 
 * */

public class BridgeDemo {
	
	public static void main(String[] args)
    {
        PersonaVieja don = new PersonaVieja();
        don.setApellido("Perez");
        don.setNombre("Maxi");
        GregorianCalendar g = new GregorianCalendar();
        g.set(2000,01,01);
        Date d = g.getTime();
        
        don.setFechaDeNacimiento(d);
        ViejaToNuevaAdapter millennial = new ViejaToNuevaAdapter(don);

        System.out.println(millennial.getEdad());
        System.out.println(millennial.getNombre());
        System.out.println("--------------------");
        
        millennial.setEdad(10);
        millennial.setNombre("Juan Perez");
        
        System.out.println(millennial.getEdad());
        System.out.println(millennial.getNombre());
        System.out.println("--------------------");
        
        System.out.println(don.getFechaDeNacimiento());
        System.out.println(don.getNombre());
    }

}
