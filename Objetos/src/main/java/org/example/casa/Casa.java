package org.example.casa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner entrada = new Scanner(System.in);
    private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;


    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        setPropietario();
    }

    public void agregarHabitacion(String nombre, double metros) {

        for (Habitacion hab : habitaciones) {
            if (hab.getNombre().equals(nombre)) {
                System.out.println("La habitación " + nombre + " ya existe");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metros); //solamente la Casa crea las habitaciones
        habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(String nombre){
        for (Habitacion hab : habitaciones) {
            if (hab.getNombre().equals(nombre)) {
                habitaciones.remove(hab);
                System.out.println("La habitación " + nombre + " ha sido eliminada con éxito.");
                break;
            } else {
                System.out.println("La habitación " + nombre + " no existe.");
                break;
            }
        }
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene  " + habitaciones.size() + " habitaciones:");
        for (Habitacion hab : habitaciones) {
            System.out.println(" - " + hab.getNombre() + " (" +  hab.getMetrosCuadrados() + " m2)");
        }
    }

    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = habitaciones.get(0);

        for (Habitacion hab : habitaciones){
            if (hab.getMetrosCuadrados()> mayor.getMetrosCuadrados()){
                mayor=hab;
            }
        }

        return mayor;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("Inserte nombre del propietario:");
        String nombre = entrada.next();
        System.out.println("Inserte edad del propietario:");
        int edad = entrada.nextInt();
        propietario = new Propietario(nombre, edad);
    }


    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", habitaciones=" + habitaciones +
                ", propietario=" + propietario +
                '}';
    }

}

