package org.example;

public class Libro {
    public static int numlibro = 0;
    public static int displibro = 0;
    final static String LIB = "LIB";
    private final static boolean DISP_DEF = true;

    private String titulo;
    private String autor;
    private String id; //A modificar
    private boolean disponible=DISP_DEF;
    private Estudiante estudiante_prestado;
    private Editorial editorial;

    public Libro (String titulo, String autor, Editorial editorial) {
        this.titulo=titulo;
        this.autor=autor;
        id=calcularId();
        numlibro++;
        disponible=DISP_DEF;
        displibro++;
        estudiante_prestado=null;
        this.editorial=editorial;
        editorial.añadirLibro(this);
    }


    public static int librosDisponibles() {
        return displibro;
    }
    public static int cantidadLibros() {
        return numlibro;
    }

    public String calcularId() {
        return String.format("LIB%03d",numlibro);
    }

    public Prestamo prestar(Estudiante estudiante) {

        if (disponible && !estudiante.getLibrosPrestados().contains(this)) {
            displibro--;
            disponible = false;
            estudiante_prestado = estudiante;
            estudiante.añadirLibro(this);
            System.out.println("El libro ha sido prestado con éxito a " + estudiante.getNombre());
            Prestamo prestamo = new Prestamo(estudiante, this);
            System.out.println("Se ha generado un prestamo " + prestamo);
            return prestamo;
        } else if (estudiante.getLibrosPrestados().contains(this)) {
            System.out.println("El estudiante " + estudiante.getNombre() + " ya tiene el libro prestado");
        }else {
            System.out.println("El libro no se puede prestar porque no está disponible");
        }
        return null;
    }

//    public Prestamo getPrestamo(Prestamo prestamo) {
//        return prestamo;
//    }

    public void devolver(Estudiante estudiante) {
        if (!disponible) {
            displibro++;
            System.out.println("El libro ha sido devuelto con éxito a " + estudiante_prestado);
            disponible=true;
            estudiante_prestado=null;
            estudiante.borrarLibro(this);
        } else {
            System.out.println("El libro no se puede devolver porque no ha sido prestado");
        }
    }

    public static int getTotalLibros() {
        return numlibro;
    }

    public static int getLibrosDisponibles() {
        return displibro;
    }

    public void estaDisponible() {

        if (disponible==true) {
            System.out.println("El libro está disponible");
        } else {
            System.out.println("El libro no está disponible");
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getId() {
        return id;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public Estudiante getEstudiante_prestado() {
        return estudiante_prestado;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public void setDisponible(boolean disponible){
        this.disponible=disponible;
    }

    public void setEstudiante_prestado(Estudiante estudiante_prestado) {
        this.estudiante_prestado = estudiante_prestado;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }


    @Override
    public String toString(){

        if (estudiante_prestado != null) {
            return "Libro: [Título= " + titulo + " Autor= " + autor + " ID= " + id + " ¿Está disponible? " + disponible + " estudiante= " + estudiante_prestado.getNombre() + "editorial= " + editorial.getNombre() + "]";

        } else {
            return "Libro: [Título= " + titulo + " Autor= " + autor + " ID= " + id + " ¿Está disponible? " + disponible + " editorial= " + editorial.getNombre() + "]";
        }
    }

}



