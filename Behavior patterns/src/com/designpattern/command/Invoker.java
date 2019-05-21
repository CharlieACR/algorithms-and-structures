package com.designpattern.command;

public class Invoker {
	private ICommand command;
	
	public Invoker()
	{
		
	}
	
	public Invoker(ICommand command)
	{
		this.command = command;
	}
	
	public void run() 
	{
		command.execute();
	}

}
