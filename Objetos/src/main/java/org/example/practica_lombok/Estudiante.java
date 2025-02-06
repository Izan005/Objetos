package org.example.practica_lombok;

import lombok.*;


@Getter @ToString
@RequiredArgsConstructor
@AllArgsConstructor
/**
 * Clase que contiene la información de un estudiante (nombre (no puede ser null), edad y curso).
 */
public class Estudiante {
    @NonNull
    @Setter
    private String nombre;
    @Setter
    private int edad;
    private Curso curso;
}
