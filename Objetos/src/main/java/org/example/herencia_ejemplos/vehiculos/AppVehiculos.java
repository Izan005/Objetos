package org.example.herencia_ejemplos.vehiculos;

public class AppVehiculos {
    public static void main(String[] args) {
        Avion airbus = new Avion("airbus", "1234dkf", 2);
        Tren ave = new Tren("Renfe", "1234HTE", 8);

        airbus.imprimirInfo();
        ave.imprimirInfo();
        airbus.ruido();
        ave.ruido();
    }
}
