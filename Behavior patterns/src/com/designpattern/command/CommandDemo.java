package com.designpattern.command;

public class CommandDemo {

	public static void main(String[] args) {
		ICommand command = new PrendeServer(new ArgentinaServer());
		Invoker serverAdmin = new Invoker(command);
		serverAdmin.run();
	}

}
