package org.example.practica_lombok;

import lombok.*;

@Getter @Setter @ToString
@RequiredArgsConstructor
@AllArgsConstructor
/**
 * Clase que contiene la información de un curso (nombre (no puede ser null), horas).
 */
public class Curso {
    @NonNull
    private String nombre;
    private int horas;
}
