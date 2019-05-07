package com.designpattern.builder;

public class ConstructorCochesAudi extends ConstructorCoches{
	
	public void construirMotor()

    {
            coche.cilindrada(2995).potencia(300);
            System.out.println("Motor listo");
    }

    public void construirCarroceria()

    {
            coche.tipo("udi A7 Sportback 3.0 TFSI quattro S tronic 7 vel.").numAsientos (5);
            System.out.println("Carroceria lista");
            System.out.println("Audi listo");
    }

}
