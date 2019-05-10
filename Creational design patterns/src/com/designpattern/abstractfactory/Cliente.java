package com.designpattern.abstractfactory;

public class Cliente {
	
	public Cliente( Componentes style )
    {
        Boton boton = style.getBoton();
        boton.dibujar();
        Lista lista = style.getLista();
        lista.dibujar();
    }

}
