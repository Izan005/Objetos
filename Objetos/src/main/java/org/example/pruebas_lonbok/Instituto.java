package org.example.pruebas_lonbok;

import lombok.*;

import java.util.Objects;

@Getter @Setter
@ToString
@AllArgsConstructor


@Data //Hace los getters, setters, y constructor requerido @RequieredArgsConstructor
public class Instituto {

    @NonNull
    private String nombre;
    private final String poblacion;
    private String direccion;

//    public Instituto (String nombre){
//
//       Objects.requireNonNull(nombre);
//
//    }

}
