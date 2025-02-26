package org.example.herencia_ejemplos.persona;

public class EdadExcepcion extends RuntimeException{

    public EdadExcepcion(String mensaje){
        super(mensaje);
    }
}
