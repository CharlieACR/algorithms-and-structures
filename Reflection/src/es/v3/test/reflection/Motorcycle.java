package es.v3.test.reflection;

public class Motorcycle extends Vehicle {
 
    @Override
    public void speedUp() {
        System.out.println("Me llamo " + this.name + " y soy una moto que est� acelerando");
    }
 
    @Override
    public void brake() {
        System.out.println("Me llamo " + this.name + " y soy una moto que est� frenando");
    }

}
