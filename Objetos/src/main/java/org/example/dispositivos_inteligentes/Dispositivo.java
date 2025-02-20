package org.example.dispositivos_inteligentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado; //encendido o apagado

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        estado=false;
    }

    public abstract void encender();

    public void apagar(){
        if (estado){
            estado=false;
        } else {
            System.out.println(nombre + " ya está apagado.");
        }
    }

    public void mostrarEstado(){
        if (estado){
            System.out.println(nombre + " está encendido");
        } else {
            System.out.println(nombre + " está apagado.");

        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }




}
