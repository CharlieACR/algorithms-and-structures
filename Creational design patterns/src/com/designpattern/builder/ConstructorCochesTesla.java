package com.designpattern.builder;

public class ConstructorCochesTesla extends ConstructorCoches{

	
	public ConstructorCochesTesla()
	{
		super();
		this.coche.setMarca("Tesla");
	}
	
	
	public void construirMotor()
    {
            coche.potencia(560);
            System.out.println("Motor listo");
    }

    public void construirCarroceria()
    {
            coche.tipo("Tesla Model S").numAsientos (5);
            System.out.println("Carroceria lista");
            System.out.println("Tesla listo");

    }

}
