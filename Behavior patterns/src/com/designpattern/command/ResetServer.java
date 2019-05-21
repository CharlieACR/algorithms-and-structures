package com.designpattern.command;

public class ResetServer implements ICommand{

	private IServe servidor;
	
	public ResetServer()
	{
		
	}
	
	public ResetServer(IServe servidor)
	{
		this.servidor = servidor;
	}
	
	@Override
	public void execute() {
		servidor.conectate();
		servidor.verificaConexion();
		servidor.guardaLog();
		servidor.apagate();
		servidor.cerrarConexion();
		
	}

}
