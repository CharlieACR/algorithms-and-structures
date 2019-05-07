package com.designpattern.factory;

public class FactoryFacturas {
	
	public static Factura getFactura(String tipo)
	{
		if(tipo.equals("iva"))
		{
			return new FacturaIva();
		}
		else
		{
			return new FacturaIvaReducido();
		}
	}

}
