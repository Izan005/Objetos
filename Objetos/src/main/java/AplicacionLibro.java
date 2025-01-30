import org.example.biblioteca.Editorial;
import org.example.biblioteca.Libro;

public class AplicacionLibro {

    public static void main(String[] args) {
        Editorial editorial = new Editorial("Papuland", "Perú");
        Libro libro1 = new Libro("Titulo1", "Autor1", editorial);
        Libro libro2 = new Libro("Titulo2", "Autor2", editorial);

        System.out.println(libro1);
        System.out.println(libro2);


        //Mostramos los libros creados
        System.out.println(Libro.getTotalLibros());
        //Mostramos los libros disponibles
        System.out.println(Libro.getLibrosDisponibles());
        //Prestamos el libro1
        //libro1.prestar();
        //Comprobamos si el libro1 está disponible
        libro1.estaDisponible();
        //Mostramos los libros disponibles
        System.out.println(Libro.getLibrosDisponibles());
        //Devolvemos el libro1
        //libro1.devolver();
        //Mostramos los libros disponibles
        System.out.println(Libro.getLibrosDisponibles());
        //Mostramos si el libro1 está disponible
        libro1.estaDisponible();



    }
}
