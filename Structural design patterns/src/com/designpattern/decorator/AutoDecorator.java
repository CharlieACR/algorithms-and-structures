package com.designpattern.decorator;

public abstract class AutoDecorator implements IVendible{
	
	private IVendible vendible;
	
	public AutoDecorator(IVendible vendible)
	{
		setVendible(vendible);
	}
	
	public IVendible getVendible()
	{
		return vendible;
	}
	
	public void setVendible(IVendible vendible)
	{
		this.vendible = vendible;
	}

}
