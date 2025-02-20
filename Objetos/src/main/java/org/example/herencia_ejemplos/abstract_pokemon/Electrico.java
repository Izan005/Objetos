package org.example.herencia_ejemplos.abstract_pokemon;

import org.example.herencia_ejemplos.empleados_tareas.Empleado;

public class Electrico extends Pokemon{


    public Electrico(int nivel, int ps) {
        super(nivel, ps);

    }

    @Override
    public void atacar() {
        System.out.println("IMPACTRUENOOOOOOOOOO");
    }

}
