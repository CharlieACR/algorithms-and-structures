package com.designpattern.builder;

public class Concesionario {
	
	private ConstructorCoches constructorCoches;


    public void establecerConstructor(ConstructorCoches cc)
    {
    	this.constructorCoches=cc;
    }

    public Coche obtenerCoche()
    {
    	return constructorCoches.obtenerCoche();
    }

    

    public void construirCoche()

    {
            constructorCoches.nuevo();
            constructorCoches.construirMotor();
            constructorCoches.construirCarroceria();
    }

}
