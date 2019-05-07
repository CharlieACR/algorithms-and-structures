package com.designpattern.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "MitoCode");

		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorator(cuenta);

		cuentaBlindada.abrirCuenta(c);
	}

}
