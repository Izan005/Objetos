package org.example.Practica_formiguero_rebelion;

import java.util.ArrayList;

public class AppProgramas {
    public static void main(String[] args) {


//        Cadena cadena1 = new Cadena("antena 3");
//        Programa programa1 = new Programa("El Hormiguero", 2,  "Dir1");
//        programa1.setCadena(cadena1);
//        Programa programa2 = new Programa("La Revuelta", 2, "Dir2");
//        programa1.agregarInvitado("José", "Cómico", 2);
//        programa2.agregarInvitado("José", "Cómico", 3);
//        programa1.agregarEmpleado("Pepe", "presentador");
//        programa1.agregarEmpleado("Pepo", "presentador");
//        programa1.agregarInvitado("José", "Cómico", 3);
//        programa1.agregarInvitado("Paco", "Ferralla", 3);
//        programa2.agregarInvitado("Paco", "Ferralla", 3);
//        cadena1.agregarPrograma(programa1);
//        System.out.println(programa1);
//        cadena1.borrarPrograma(programa1);
//        System.out.println(programa1);
//        System.out.println(cadena1);
//        System.out.println(programa1.getListaInvitados());
//        System.out.println(programa1.invitadosTemporada(3));
//        System.out.println(programa1.buscarInvitado("José"));
//        System.out.println(programa2.buscarInvitado("José"));
//        System.out.println(programa1.invitadosTemporada(3));
//        System.out.println(programa1.vecesInvitado("José"));
//        System.out.println(programa1.rastrearInvitado("José"));
//        Programa.invitadoAntes("ppep", programa1, programa2);

/**
 * PRUEBAS
 */

        //Creación de una cadena y de un programa, añadir programa a cadena y eliminar programa de cadena.
//        Cadena antena3 = new Cadena("antena 3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        System.out.println(antena3);
//        System.out.println(el_hormiguero);
//        antena3.agregarPrograma(el_hormiguero);
//        System.out.println(antena3);
//        System.out.println(el_hormiguero);
//        antena3.borrarPrograma(el_hormiguero);
//        System.out.println(antena3);
//        System.out.println(el_hormiguero);


        //Creación de una cadena y un programa, añadir invitados al programa y empleados para después eliminarlos.
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        System.out.println(el_hormiguero);
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        el_hormiguero.agregarEmpleado("Jorge", "técnico");
//        System.out.println(el_hormiguero);
//        el_hormiguero.eliminarEmpleado("Jorge");
//        System.out.println(el_hormiguero);
//        el_hormiguero.eliminarInvitado("Will Smith", 3);
//        System.out.println(el_hormiguero);

        //Creación de una cadena y un programa, añadir un empleado sin un cargo que sea director, técnico,
        // presentador o colaborador
        Cadena antena3 = new Cadena("antena3");
        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
        System.out.println(el_hormiguero);
        el_hormiguero.agregarEmpleado("Jorge", "paco");
        System.out.println(el_hormiguero);

        //Pruebas de la función invitadosTemporada();
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        el_hormiguero.agregarInvitado("Paco", "Cómico", 3);
//        System.out.println(el_hormiguero.invitadosTemporada(3));

        //Pruebas función vecesInvitado();
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 6);
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 2);
//        System.out.println(el_hormiguero.vecesInvitado("Will Smith"));


        //Pruebas función rastrearInvitado();
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 6);
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 2);
//        System.out.println(el_hormiguero.rastrearInvitado("Will Smith"));


        //Pruebas función buscarInvitado();
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        System.out.println(el_hormiguero.buscarInvitado("Will Smith"));
//        System.out.println(el_hormiguero.buscarInvitado("Paco"));

        //Pruebas función invitadoAntes(); (Acude a los 2 programas)
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        Programa la_revuelta = new Programa("La Revuelta", antena3, 3, "David Broncano");
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        la_revuelta.agregarInvitado("Will Smith", "Actor", 1);
//        Programa.invitadoAntes("Will Smith", el_hormiguero, la_revuelta);


        //Pruebas función invitadoAntes(); (Acude solo a 1 programa)
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        Programa la_revuelta = new Programa("La Revuelta", antena3, 3, "David Broncano");
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        Programa.invitadoAntes("Will Smith", el_hormiguero, la_revuelta);

        //Pruebas función invitadoAntes(); (No acude a ningún programa)
//        Cadena antena3 = new Cadena("antena3");
//        Programa el_hormiguero = new Programa("El Hormiguero", antena3, 11, "Pablo Motos");
//        Programa la_revuelta = new Programa("La Revuelta", antena3, 3, "David Broncano");
//        el_hormiguero.agregarInvitado("Will Smith", "Actor", 3);
//        Programa.invitadoAntes("Paco", el_hormiguero, la_revuelta);
    }
}
