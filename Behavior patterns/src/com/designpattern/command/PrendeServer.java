package com.designpattern.command;

public class PrendeServer implements ICommand{

	private IServe servidor;
	
	public PrendeServer()
	{
		
	}
	
	public PrendeServer(IServe servidor)
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
