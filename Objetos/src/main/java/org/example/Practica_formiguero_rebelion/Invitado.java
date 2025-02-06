package org.example.Practica_formiguero_rebelion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Locale;

/**
 * @author Izan López Mora 1DAM
 * @version 1.0
 * Clase que almacena los datos de un invitado a un programa de televisión (nombre, profesión, fecha de visita,
 * temporada). Se relaciona mediante composición con la clase Programa.
 */
public class Invitado {

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    /**
     * Constructor de la clase Invitado.
     * @param nombre
     * @param profesion
     * @param temporada
     * @param fecha_visita
     */
    public Invitado(String nombre, String profesion, int temporada, LocalDate fecha_visita){
        this.nombre=nombre;
        this.profesion=profesion;
        this.fecha_visita=fecha_visita;
        this.temporada=temporada;
    }

    /**
     * Getter temporada
     * @return temporada
     */
    public int getTemporada() {
        return temporada;
    }

    /**
     * Setter temporada
     * @param temporada
     */
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    /**
     * Getter fecha visita
     * @return fecha_visita
     */
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    /**
     * Setter fecha visita
     * @param fecha_visita
     */
    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    /**
     * Getter profesion
     * @return profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Setter profesor
     * @param profesion
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
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

    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}