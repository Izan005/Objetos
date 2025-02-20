package org.example.documentacion_javadoc_ed;

import lombok.Data;

import java.util.ArrayList;

@Data
/**
 * @author Izan López Mora 1DAM
 * @version 1.0
 * Clase que simula un usuario de una biblioteca con su nombre, id y una lista de libros que se le han prestado.
 */
public class Usuario {
    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados;

    public Usuario (String nombre, int idUsuario){
        this.nombre=nombre;
        this.idUsuario=idUsuario;
        librosPrestados = new ArrayList<>();
    }

    /**
     * Función que hace que un libro deje de estár disponible llamando a la función prestarLibro() de la clase Libro.
     * Seguidamente, este libro (si está disponible) se agrega a la lista librosPrestados del usuario.
     * @param libro
     */
    public void prestarLibro(Libro libro){
            if (libro.isDisponible()){
                System.out.println("Libro prestado con éxito");
                librosPrestados.add(libro);
                libro.prestarLibro();
            } else {
                System.out.println("El libro no está disponible");
        }
    }

    /**
     * Función que hace que un libro vuelva a estár disponible llamando a la función devolverLibro() de la clase Libro.
     * Seguidamente, este libro (si no está disponible) se elimina a la lista librosPrestados del usuario.
     * @param libro
     */
    public void devolverLibro(Libro libro){

        if (libro.isDisponible()){
            System.out.println("Este libro ya está devuelto");

        } else {
            System.out.println("El libro se ha devuelto con éxito");
            librosPrestados.remove(libro);
            libro.devolverLibro();
        }
    }

    /**
     * Función que muestra la lista librosPrestados de un usuario
     */
    public void listaLibrosPrestados(){
        System.out.println(librosPrestados);
    }
}
