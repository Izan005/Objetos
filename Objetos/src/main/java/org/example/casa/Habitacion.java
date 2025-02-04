package org.example.casa;

import org.example.biblioteca.Estudiante;

import java.util.ArrayList;

public class Habitacion {
    private String nombre;
    private double metrosCuadrados;

    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, double metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados=metrosCuadrados;
        this.electrodomesticos = new ArrayList<>();
    }


    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }


    public String getNombre() {
        return nombre;
    }

    public ArrayList<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }

    public void setElectrodomesticos(ArrayList<Electrodomestico> electrodomesticos) {
        this.electrodomesticos = electrodomesticos;
    }

    public void agregarElectrodomestico(String nombre, double consumo){
        for (Electrodomestico elec : electrodomesticos) {
            if (elec.getNombre().equals(nombre)) {
                System.out.println("El electrodoméstico" + nombre + " ya existe");
                return;
            }
        }

       electrodomesticos.add(new Electrodomestico(nombre, consumo));

    }

    public double calcularConsumo() {

        double calc = 0;
        for (Electrodomestico elec : electrodomesticos) {
            calc+=elec.getConsumo();
        }
        return calc;
    }

    @Override
    public String toString() {
        return "Habitación: [nombre= " + getNombre() + " Metros cuadrados= " + metrosCuadrados + "]";
    }
}
