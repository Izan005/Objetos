package org.example.herencia_ejemplos.persona;

public class Persona {
    public static final int EDAD_MINIMA = 18;

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento...");
    }

    public void setEdad(int edad) {

        if (edad >= EDAD_MINIMA ){
            this.edad = edad;
        } else {
            this.edad = edad;
            throw new EdadExcepcion("No puedes asistir al festival si eres menor de edad.");
        }

    }

}
