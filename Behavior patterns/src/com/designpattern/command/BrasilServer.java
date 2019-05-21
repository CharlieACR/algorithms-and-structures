package com.designpattern.command;

public class BrasilServer implements IServe{

	@Override
	public void apagate() {
		System.out.println("Apagando el servidor de Brasil");
		
	}

	@Override
	public void prendete() {
		System.out.println("Cerrando conexion con el servidor de Brasil");
		
	}

	@Override
	public void conectate() {
		System.out.println("Conectando al servidor de Brasil");
		
	}

	@Override
	public void verificaConexion() {
		System.out.println("Verificar conexion de Brasil");
		
	}

	@Override
	public void guardaLog() {
		System.out.println("Guardar Log de Brasil");
		
	}

	@Override
	public void cerrarConexion() {
		System.out.println("Cerrando conexion al servidor de Brasil");
		
	}

}
