package com.designpattern.decorator;

public class CdPlayer extends AutoDecorator{
	
	public CdPlayer(IVendible vendible)
	{
		super(vendible);
	}
	
	public String getDescripcion()
	{
		return getVendible().getDescripcion() + " + CD Player";
	}
	
	public int getPrecio()
	{
		return getVendible().getPrecio()+90;
	}

}
