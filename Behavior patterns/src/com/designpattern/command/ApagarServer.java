package com.designpattern.command;

public class ApagarServer implements ICommand{

	private IServe servidor;
	
	public ApagarServer()
	{
		
	}
	
	public ApagarServer(IServe servidor)
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
