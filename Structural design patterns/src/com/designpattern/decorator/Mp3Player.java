package com.designpattern.decorator;

public class Mp3Player extends AutoDecorator{
	
	public Mp3Player(IVendible vendible)
	{
		super(vendible);
	}
	
	public String getDescripcion()
	{
		return getVendible().getDescripcion() + " + MP3 Player";
	}
	
	public int getPrecio()
	{
		return getVendible().getPrecio() + 250;
	}

}
