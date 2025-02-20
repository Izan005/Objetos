package org.example.herencia_ejemplos.vehiculos;

public class Tren extends Vehiculo{

    private int vagones;
    public Tren(String marca, String matricula, int vagones) {
        super(marca, matricula);
        this.vagones=vagones;
    }


    public void ruido(){
        System.out.println("Chucu chucu");
    }
}
