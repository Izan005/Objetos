package org.example.practica_lombok;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;

@Getter @ToString
@RequiredArgsConstructor
@AllArgsConstructor
/**
 * Clase que contiene la información de un instituto (nombre (no puede ser null), población, lista de estudiantes,
 * lista de cursos.
 */
public class Instituto {
    @NonNull
    private String nombre;
    @Setter
    private String poblacion;
    @Setter
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    @Setter
    private ArrayList<Curso> listaCursos = new ArrayList<>();

    public Instituto(String nombre, String poblacion){
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.poblacion=poblacion;
    }

    /**
     * Función que añade un estudiante a la lista de estudiantes. Si el estudiante es null, no se agrega a la
     * lista de estudiantes
     * @param estudiante
     */
    public void añadirEstudiante(Estudiante estudiante){
        if (estudiante == null){
            System.out.println("No se puede agregar un curso nulo");
        } else {
            listaEstudiantes.add(estudiante);
        }
    }

    /**
     * Función que añade un estudiante a la lista de cursos. Si el cursos es null, no se agrega a la
     * lista de cursos.
     * @param curso
     */
    public void añadirCurso(Curso curso){
        if (curso != null){
            listaCursos.add(curso);
        } else {
            System.out.println("No se puede agregar un curso nulo");
        }

    }
}
