package com.designpattern.builder;

public class Coche {
	private int cilindrada = 0;
    private int potencia = 0;
    private String tipo = "";
    private int num_asientos = 0;
    private String marca;



    public Coche cilindrada(int cilindrada)
    {
            this.cilindrada = cilindrada;
            return this;
    }


    public Coche potencia(int potencia)
    {
            this.potencia = potencia;
            return this;
    }


    public Coche tipo(String tipo)
    {
            this.tipo = tipo;
            return this;
    }


    public Coche numAsientos(int num_asientos)
    {
            this.num_asientos = num_asientos;
            return this;
    }


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}
    
    

}
