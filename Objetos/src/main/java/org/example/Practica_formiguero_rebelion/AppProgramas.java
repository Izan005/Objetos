package org.example.Practica_formiguero_rebelion;

public class AppProgramas {
    public static void main(String[] args) {


        Programa programa1 = new Programa("El Hormiguero", '2', 2, "Dir1");
        programa1.agregarEmpleado("Pepe", "presentador");
        programa1.agregarEmpleado("Pepo", "presentador");
        System.out.println(programa1);


        /**
         *      TO DO
         *      Añadir asociación bidireccional entre las clases Cadena y Programa.
         */




//        Empleado empleado1 = new Empleado("Alfonso", "presentador");
//        System.out.println(empleado1);
    }
}
