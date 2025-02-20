package org.example.documentacion_javadoc_ed;

import lombok.Data;

import javax.swing.plaf.basic.BasicBorders;
import java.util.ArrayList;
import java.util.Random;

@Data
/**
 * @author Izan López Mora 1DAM
 * @version 1.0
 * Clase que simula el funcionamiento de una biblioteca. Contiene una lista de libros disponibles (catálogo)
 * en la biblioteca y una lista de usuarios registrados en esta.
 */
public class Biblioteca {
    private ArrayList<Libro> catalogo = new ArrayList<>();
    private ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();

    /**
     * Función a la que le pasamos un objeto tipo libro y comprueba que este no exista en el catáligo y, si no existe,
     * lo agrega a este.
     * @param libro
     */
    public void agregarLibro(Libro libro){
        for (Libro l : catalogo){
            if (l.getTitulo().equals(libro.getTitulo())){
                System.out.println("El libro ya existe en el catálogo");
                return;
            }
        }
        catalogo.add(libro);
        System.out.println("Libro añadidio con éxito");
    }

    /**
     * Función que comprueba que un usuario esté registrado en la biblioteca pasándole un objeto tipo usuario.
     * Si no lo está, lo añade a la lista de usuarios.
     * @param usuario
     */
    public void registrarUsuario(Usuario usuario){
        for (Usuario u : usuariosRegistrados){
            if(u.getIdUsuario()==usuario.getIdUsuario()){
                System.out.println("El usuario ya está registrado");
                return;
            }
        }
        usuariosRegistrados.add(usuario);
        System.out.println("Usuario registrado con éxito");
        Random r = new Random();
    }

    /**
     * Función a la que le pasamos el título de un libro y comprueba que este exista en el catálogo.
     * @param titulo
     */
    public void buscarLibro(String titulo) {
        for (Libro l : catalogo) {
            if (l.getTitulo().equals(titulo)) {
                System.out.println(l);
            } else {
                System.out.println("Libro no encontrado");
            }
        }
    }

    /**
     * Función que muestra el catálogo.
     */
    public void mostrarCatalogo(){
        System.out.println(catalogo);
    }
}