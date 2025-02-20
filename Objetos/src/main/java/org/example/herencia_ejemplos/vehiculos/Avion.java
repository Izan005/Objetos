package org.example.herencia_ejemplos.vehiculos;

public class Avion extends Vehiculo {

    private int alas;

    public Avion(String marca, String matricula, int alas) {
        super(marca, matricula);
        this.alas=alas;
    }

    public void ruido (){
        System.out.println("Piiii piiii ");
    }
}
