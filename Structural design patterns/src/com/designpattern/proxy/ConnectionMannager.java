package com.designpattern.proxy;

public class ConnectionMannager {
	private static boolean hayConexion;
	
	public ConnectionMannager()
	{
		hayConexion = false;
	}
	
	public static void conectate()
	{
		hayConexion = true;
	}
	

	public static void desconectate()
	{
		hayConexion = false;
	}

	public static boolean hayConexion()
	{
		return hayConexion;
	}

}
