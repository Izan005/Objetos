package org.example.herencia_ejemplos.abstract_pokemon;

import org.example.herencia_ejemplos.ejercicicio1_redes_sociales.CosasAgua;

public class AppPokedex {
    public static void main(String[] args) {

        Electrico pikachu = new Electrico(12, 100);
        pikachu.atacar();

        Pokemon pichu = new Electrico(12,12);
        pichu.atacar();

        Agua squirtle = new Agua(12, 123);
        squirtle.atacar();
        squirtle.imprimirDatos();
        squirtle.hidrobomba();

        Pokemon[] pokemons = {
                new Electrico(20,100),
                new Agua(30,120)
        };

        for (Pokemon p : pokemons){
            p.atacar();
            p.imprimirDatos();

            if (p instanceof Agua){
                ((AtaquesAgua) p).hidrobomba();
                ((CosasAgua) p).aquagym();
            }
        }



        //Clase anónima de la clase abstracta Pokemon
        Pokemon jigglipuff = new Pokemon(12, 123){
            @Override
            public void atacar(){
                System.out.println("Canto");
            }
        };

        jigglipuff.atacar();
        jigglipuff.imprimirDatos();


        //Clase anónima de la interfaz AtaquesAgua
        AtaquesAgua ataquesAgua = new AtaquesAgua() {
            @Override
            public void hidrobomba() {
                System.out.println("HIDROBOMBAAAAA");
            }

            @Override
            public void surf() {
                System.out.println("SUUUUUUURF");
            }

            @Override
            public void pistolaAgua() {
                System.out.println("PISTOLA AGUAAA");
            }

            @Override
            public void salpicar() {
                System.out.println("SALPICAAAAR");
            }
        };

        ataquesAgua.hidrobomba();

    }
}
