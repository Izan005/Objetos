package org.example.enums;

public class AppSemaforo {
    public static void main(String[] args) {

        Semaforo estado = Semaforo.ROJO;
        for (int i = 0; i < 10; i++) {
            estado = estado.siguiente(estado);
            System.out.println(estado);
        }
    }
}
