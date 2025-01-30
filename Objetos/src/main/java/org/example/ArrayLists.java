package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(3);
        listaNumeros.add(17);
        listaNumeros.add(123);
        listaNumeros.add(1, 9);
        System.out.println(listaNumeros.get(0));
        listaNumeros.remove(0);
        System.out.println(listaNumeros.getFirst());
        System.out.println(listaNumeros);
        System.out.println("Posición del número 17: " + listaNumeros.indexOf(17));
        System.out.println("Posición del número 3: " + listaNumeros.indexOf(3));


        for (int i = 0; i < listaNumeros.size(); i++) {

            System.out.println("Número en índice " + i + "= " + listaNumeros.get(i));
        }

        for (int lista : listaNumeros) {
            System.out.println(lista);
        }

        listaNumeros.set(0, 56);
        System.out.println(listaNumeros.get(0));

        Object listaCopia = listaNumeros.clone();


        listaNumeros.clear();

        System.out.println(listaNumeros);
        System.out.println(listaCopia);

        if (listaNumeros.contains(56)) {
            System.out.println("El 56 está en la lista");
        } else {
            System.out.println("El 56 no está en la lista");
        }

        if (listaNumeros.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista no está vacía");
        }

        insertarVarios(listaNumeros, 2,3,4,5,6,7);
        System.out.println(listaNumeros);


    }
    public static void insertarVarios(ArrayList<Integer> lista, Integer... numeros) {
        lista.addAll(Arrays.asList(numeros));
    }
}
