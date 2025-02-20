package org.example.herencia_ejemplos.ejercicicio1_redes_sociales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores){
        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public void añadirColaboraciones(String ... nombre){
        colaboraciones.add(Arrays.toString(nombre));
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println(colaboraciones);
    }

    @Override
    public String toString() {
        return
                "Colaboraciones: " + colaboraciones;
    }
}
