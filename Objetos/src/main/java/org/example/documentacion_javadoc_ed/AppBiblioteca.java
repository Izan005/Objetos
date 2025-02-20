package org.example.documentacion_javadoc_ed;

public class AppBiblioteca {
    public static void main(String[] args) {

        Libro libro = new Libro("Manifiesto comunista", "Karl Marx", 1899);
        Usuario usuario1 = new Usuario("Pol", 123);
//        System.out.println(libro.mostrarInformacion());
//        libro.prestarLibro();
//        System.out.println(libro.mostrarInformacion());
//        libro.devolverLibro();
//        System.out.println(libro.mostrarInformacion());
//        usuario1.prestarLibro(libro);
//        System.out.println(usuario1);
//        usuario1.devolverLibro(libro);
//        System.out.println(usuario1);
//        usuario1.listaLibrosPrestados();

        Biblioteca biblioteca = new Biblioteca();
        Libro libro2 = new Libro("Libro sin nombre", "Yo", 1290);
        biblioteca.agregarLibro(libro);
        System.out.println(biblioteca);
        biblioteca.registrarUsuario(usuario1);
        System.out.println(biblioteca);
        biblioteca.registrarUsuario(usuario1);
        System.out.println(biblioteca);
        //Libro que existe
        biblioteca.buscarLibro("Manifiesto comunista");
        //Libro que no existe
        biblioteca.buscarLibro("Libro sin nombre");
        biblioteca.mostrarCatalogo();


    }
}
