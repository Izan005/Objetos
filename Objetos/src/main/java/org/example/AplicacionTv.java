package org.example;

public class AplicacionTv {

    public static void main (String[] args) {

        Televisor televisor = new Televisor();
        televisor.bajarVolumen();
        televisor.bajarCanal();
        televisor.subirVolumen();
        televisor.subirCanal();
        televisor.setCanal(40);
        televisor.setVolumen(100);
    }
}
