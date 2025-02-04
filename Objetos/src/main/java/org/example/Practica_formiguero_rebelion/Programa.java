package org.example.Practica_formiguero_rebelion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private char cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, char cadena, int temporadas, String nombreDir){
        this.nombre=nombre;
        this.cadena=cadena;
        this.temporadas=temporadas;
        director = new Empleado(nombreDir, "Director");
        listaEmpleados = new ArrayList<>();
        listaEmpleados.add(director);
        listaInvitados = new ArrayList<>();
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public char getCadena() {
        return cadena;
    }

    public void setCadena(char cadena) {
        this.cadena = cadena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(String nombre, String cargo){
        Empleado empleado = new Empleado(nombre, cargo);
        empleado.setDirector(director);
        listaEmpleados.add(empleado);
    }

        public void agregarInvitado(String nombre, String cargo){
        Empleado empleado = new Empleado(nombre, cargo);
        listaEmpleados.add(empleado);
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}
