package org.example.documentacion_javadoc_ed;

import lombok.Data;

@Data
/**
 * @author Izan López Mora 1DAM
 * @version 1.0
 * Clase que simula un libro con su autor, título, año de publicación y si está disponible o no en la biblioteca.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean disponible;

    public Libro(String titulo, String autor, int añoPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.añoPublicacion=añoPublicacion;
        disponible=true;
    }

    /**
     * Función que hace que un libro deje de estar disponible (disponible=false)
     */
    public void prestarLibro(){
        disponible=false;
    }

    /**
     * Función que hace que un libro vuelva a estar disponible (disponible=true)
     */
    public void devolverLibro(){
        disponible=true;
    }

    /**
     * Función que sustituye a la función toString(). Muestra la información completa de un libro.
     * @return información completa de un libro (títutlo, autor, año de publicación y disponibilidad).
     */
    public String mostrarInformacion(){
        return "Nombre del libro: " + getTitulo() + "\n Nombre del autor: " + getAutor() + "\n Año de publicación: " +
                getAñoPublicacion() + "\n¿Está disponible? " + this.isDisponible();
    }
}
