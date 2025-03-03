package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {

    public static int contadorEstudiantes = 0;
    final static String CORREO_FORMAT = "@alu.edu.gva.es";

    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

    public Estudiante (String nombre) {
        this.nombre=nombre;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante (String nombre, String curso, String email) {
        this.nombre=nombre;
        this.curso=curso;
        this.email=email;
        contadorEstudiantes++;
        nia=contadorEstudiantes;
        librosPrestados = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public String getCurso(){
        return curso;
    }
    public int getNia(){
        return nia;
    }
    public String getEmail(){
        return email;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setCurso(String curso) {
        this.curso=curso;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void añadirLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void borrarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    @Override
    public String toString(){

        if (!librosPrestados.isEmpty()) {
            return "Alumno: [nombre= " + nombre + " curso= " + curso + " NIA= " + nia + " email= " + email + "libro prestado= " + librosPrestados + "]";
        } else {
            return "Alumno: [nombre= " + nombre + " curso= " + curso + " NIA= " + nia + " email= " + email + "]";
        }

    }

    public static int obtenerTotalEstudiantes() {
        return contadorEstudiantes;
    }


}
