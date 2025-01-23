package org.example;

public class Televisor {

    private int canal = 1;
    private int volumen = 5;

    public Televisor() {

    }
    public Televisor (int canal, int volumen) {
        this.canal=canal;
        this.volumen=volumen;
    }

    public void subirCanal() {
        if (this.canal != 99) {
            this.canal++;
            System.out.println("Canal: " + this.canal);
        }

    }
    public void bajarCanal() {
        if (this.canal != 1 ) {
            this.canal--;
            System.out.println("Canal: " + this.canal);
        }

    }

    public void subirVolumen() {
        if (this.volumen >= 99 || this.volumen <= 1 ) {
            this.volumen++;
            System.out.println("Volumen: " + this.volumen);
        }

    }
    public void bajarVolumen() {
        if (this.volumen <= 99 && this.volumen >=  1 ) {
            this.volumen--;
            System.out.println("Volumen: " + this.volumen);
        }

    }
    public int getCanal() {
        return this.canal;
    }
    public void setCanal(int canal) {
        if (canal <100 && canal > 0) {
            this.canal=canal;
            System.out.println("Canal: " + canal);
        }

    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen <100 && volumen > 0) {
            this.volumen=volumen;
            System.out.println("Volumen: " + volumen);
        }


    }

}
