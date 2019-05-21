package com.designpattern.command;

public class USAServer implements IServe{

	@Override
	public void apagate() {
		System.out.println("Apagando el servidor de USA");
		
	}

	@Override
	public void conectate() {
		System.out.println("Conectando al servidor de USA");
		
	}

	@Override
	public void cerrarConexion() {
		System.out.println("Desconectando al servidor de USA");
		
	}

	@Override
	public void prendete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verificaConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardaLog() {
		// TODO Auto-generated method stub
		
	}

}
