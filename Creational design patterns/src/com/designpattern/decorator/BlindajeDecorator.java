package com.designpattern.decorator;

public class BlindajeDecorator extends CuentaDecorator{

	public BlindajeDecorator(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
	}
	
	public void agregarBlindaje(Cuenta c)
	{
		System.out.println("Se agrego blindaje a la cuenta del cliente "+ c.getCliente());
	}

}
