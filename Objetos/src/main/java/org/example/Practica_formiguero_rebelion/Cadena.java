package org.example.Practica_formiguero_rebelion;

import java.util.ArrayList;

/**
 * @author Izan López Mora 1DAM
 * @version 1.0
 * Clase que almacena un canal de televisión y sus atributos (nombre y lista de programas).
 * Se relaciona mediante agregación bidireccional con la clase Programa (listaProgramas).
 */
public class Cadena {
    private String nombre;
    private ArrayList<Programa> listaProgramas;


    /**
     * Constructor para crear un programa con el nombre. Crea también el ArrayList
     * que almacena los programas que esta misma contiene.
     * @param nombre
     */
    public Cadena(String nombre){
        this.nombre=nombre;
        listaProgramas = new ArrayList<>();
    }

    /**
     * Constructor vacío que únicamente crea el ArrayList que almacena los programas.
     */
    public Cadena(){
        listaProgramas = new ArrayList<>();
    }

    /**
     * Getter listaProgramas
     * @return listaProgramas
     */
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    /**
     * Setter listaProgramas
     * @param listaProgramas
     */
    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    /**
     * Getter nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Función utilizada para agregar un objeto Programa al ArrayList listaProgramas
     * @param programa
     */
    public void agregarPrograma(Programa programa) {
        listaProgramas.add(programa);
        programa.setCadena(this);
    }

    /**
     * Función utilizada para eliminar un objeto Programa del ArrayList listaProgramas
     * @param programa
     */
    public void borrarPrograma(Programa programa){
        listaProgramas.remove(programa);
        programa.setCadena(new Cadena());
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}