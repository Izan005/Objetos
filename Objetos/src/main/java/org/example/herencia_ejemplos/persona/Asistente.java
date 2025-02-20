package org.example.herencia_ejemplos.persona;

public class Asistente extends Persona{
    protected String entrada;

    public Asistente(String nombre, int edad, String entrada) {
        super(nombre, edad); //llamamos al constructor de la clase Persona
        this.entrada = entrada;
    }

    public void mostrarInfo() {
        super.mostrarInfo(); //llamamos al método de la clase Persona
        System.out.println("Tipo de entrada: " + entrada);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento...");
        System.out.println("Accediendo como asistente. Buscando asiento.");
    }

}
