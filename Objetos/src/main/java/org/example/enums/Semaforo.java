package org.example.enums;

public enum Semaforo {

    AMARILLO,ROJO,VERDE;


    public Semaforo siguiente(Semaforo color){

        switch (color){
            case AMARILLO:
                return Semaforo.ROJO;

            case ROJO:
                return Semaforo.VERDE;

            case VERDE:
                return Semaforo.AMARILLO;

            default:
                return Semaforo.ROJO;

        }
    }
}
