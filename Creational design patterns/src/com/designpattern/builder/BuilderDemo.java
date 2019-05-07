package com.designpattern.builder;

import java.util.Scanner;

public class BuilderDemo {

	public static void main(String[] args) {
        Concesionario director = new Concesionario();
        ConstructorCoches constructor = null;
        
        System.out.println("Que auto prefieres?");
        Scanner salida = new Scanner(System.in);
        String auto = salida.nextLine();
        
        if(auto.toLowerCase().equals("audi"))
        {
                constructor = new ConstructorCochesAudi();
        }
        else if(auto.equals("bmw"))
        {
                constructor = new ConstructorCochesBMW();
        }
        else if(auto.equals("tesla"))
        {
                constructor = new ConstructorCochesTesla();
        }
       
        director.establecerConstructor(constructor);
        director.construirCoche();
        Coche producto = director.obtenerCoche();

	}
	
	
	
	//[3,8,4,2,6]



	void orden(int arreglo[])
	{

		
		int size =0;
		int found = 0;
		int aux = 0;

		for(;size!='\0';size++);
		
		for(int piv=0;piv<size;piv++)
		{
			for(int con=0;con<size;con++)
			{
				if(arreglo[con]>arreglo[con+1])
				{
					aux = arreglo[con];
					arreglo[con] = arreglo[con+1];
					arreglo[con+1] = aux;
				}
			}
		}
		

	}
	

}
