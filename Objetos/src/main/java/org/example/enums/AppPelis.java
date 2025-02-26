package org.example.enums;

import java.util.Arrays;
import java.util.Scanner;

public class AppPelis {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {



        SagasPelis peli = SagasPelis.SHREK;
        System.out.println(peli);

        for (SagasPelis pelis : SagasPelis.values()){
            System.out.println("Peli: " + pelis + " con " + pelis.getNumeroPelis() + " pelis en total.");
        }

        System.out.println("Introduce una saga" + Arrays.toString(SagasPelis.values()));
        String saga = entrada.next();

        SagasPelis saga_enum = SagasPelis.valueOf(saga);
        System.out.println("La saga escogida es " + saga_enum + " que tiene " + saga_enum.getNumeroPelis() + " pelis.");

        int posicion = saga_enum.ordinal();
        System.out.println("La saga consultada está en la posición " + posicion);

        String saga_peli = SagasPelis.CREPUSCULO.name();
        System.out.println(saga_peli);
    }

}
