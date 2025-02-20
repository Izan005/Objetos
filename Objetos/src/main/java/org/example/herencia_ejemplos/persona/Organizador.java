package org.example.herencia_ejemplos.persona;

public class Organizador extends Persona implements Organizable{
    private String rol;

    public Organizador(String nombre, int edad, String rol) {
        super(nombre, edad);
        this.rol=rol;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Rol del organizador: " + rol);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento...");
        System.out.println("Accediendo como organizador: Coordinando el evento.");
    }

    @Override
    public void organizarEvento() {
        System.out.println("Organizando...");
    }
}
