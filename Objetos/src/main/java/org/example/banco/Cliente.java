package org.example.banco;

import java.util.Scanner;

public class Cliente {
    static Scanner entrada = new Scanner(System.in);
    public static int numCli;

    private String id;
    private String nombre;
    private String apellidos;

    public Cliente (){
        id=asignarId(id);
        numCli++;
        nombre=asignarNombre(nombre);
        apellidos=asignarApellido(apellidos);
    }

    public Cliente (String nombre, String apellidos){
        id=asignarId(id);
        numCli++;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public String asignarId(String id){
        return String.format("CLI%03d", numCli);
    }

    public String asignarNombre(String nombre){
        System.out.println("Introduce tu nombre");
        nombre=entrada.nextLine();
        return nombre;
    }

    public String asignarApellido(String apellido){
        System.out.println("Introduce tus apellidos");
        apellido=entrada.nextLine();
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
