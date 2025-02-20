package org.example.herencia_ejemplos.ejercicicio1_redes_sociales;

import org.example.herencia_ejemplos.persona.Persona;

public class Asistente extends Persona {

    protected String entrada;
    public Asistente(String nombre, int edad, String entrada) {
        super(nombre, edad);
        this.entrada=entrada;    }
}
