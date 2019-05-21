package com.designpattern.command;

public class ArgentinaServer implements IServe{

	@Override
	public void apagate() {
		System.out.println("Apagando el servidor de Argentina");
		
	}

	@Override
	public void prendete() {
		System.out.println("Cerrando conexion con el servidor de Argentina");
		
	}

	@Override
	public void conectate() {
		System.out.println("Conectando al servidor de Argentina");
		
	}

	@Override
	public void verificaConexion() {
		System.out.println("Verificar conexion de Argentina");
		
	}

	@Override
	public void guardaLog() {
		System.out.println("Guardar Log de Argentina");
		
	}

	@Override
	public void cerrarConexion() {
		System.out.println("Cerrando conexion al servidor de Argentina");
		
	}

}
