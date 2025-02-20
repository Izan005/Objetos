package org.example.herencia_ejemplos.abstract_pokemon;

import org.example.herencia_ejemplos.ejercicicio1_redes_sociales.CosasAgua;

public class Agua extends Pokemon implements AtaquesAgua, CosasAgua {

    public Agua(int nivel, int ps) {
        super(nivel, ps);
    }

    @Override
    public void atacar() {
        System.out.println("PISTOLA AGUAAAAA");
    }

    @Override
    public void hidrobomba() {
        System.out.println("HIDROBOMBAAA");
    }

    @Override
    public void surf() {
        System.out.println("SUUUURF");
    }

    @Override
    public void pistolaAgua() {
        System.out.println("PISTOLA AGUAAAA");
    }

    @Override
    public void salpicar() {
        System.out.println("SALPICAAAAR");
    }

    @Override
    public void aquagym() {
        System.out.println("*Se ahoga y muere*");
    }
}
