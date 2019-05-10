package com.designpattern.decorator;

public class Gasoil extends AutoDecorator{
	
	public Gasoil(IVendible vendible)
	{
		super(vendible);
	}
	
	public String getDescripcion()
	{
		return getVendible().getDescripcion() + " + Gasoil";
	}
	
	public int getPrecio()
	{
		return getVendible().getPrecio() + 1200;
	}

}
