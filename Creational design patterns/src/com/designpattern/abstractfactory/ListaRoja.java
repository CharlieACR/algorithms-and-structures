package com.designpattern.abstractfactory;

public class ListaRoja extends Lista
{
    public ListaRoja()
    {
        this.configurar();
    }
    // ------------------------------
     public void configurar()
    {
        System.out.println("Configurando la LISTA con borde ROJO");
    }

}
