package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaCompra {

    public static void main(String[] args) {
        ArrayList<String>listaCompra = new ArrayList<>();
        listaCompra.add("Objeto1");
//        if (listaCompra.isEmpty()) {
//            System.out.println("La lista está vacía");
//        } else {
//            System.out.println("La lista no está vacía");
//        }

        listaCompra.addAll(Arrays.asList("Ajo","Cebolla","Pepino","Aceite","Carne"));
        System.out.println(listaCompra);
        System.out.println(listaCompra.get(3));
        listaCompra.set(1, "Queso");

        if (listaCompra.contains("Leche")) {
            System.out.println("La lista contiene leche");
        } else {
            System.out.println("La lista no contiene leche");
        }



    }

    public static String anyadirYComprobar(ArrayList<String> lista) {

        String valor = "ObjetoRandom";
        if (lista.contains(valor)) {
            System.out.println("El producto ya existe en la lista");
            return "";
        } else {
            //return lista.add("ObjetoRandom");
        }
        return "";
    }

}
