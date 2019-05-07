package com.designpattern.builder;

public class ConstructorCochesBMW extends ConstructorCoches{
	

	public void construirMotor()
    {
            coche.cilindrada(4395).potencia(560);
            System.out.println("Motor listo");
    }

    public void construirCarroceria()

    {
            coche.tipo("BMW Serie 5 2016").numAsientos(5);
            System.out.println("Carroceria lista");
            System.out.println("BMW listo");
    }

}
