package org.example.banco;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * TO DO
 * Seguir con la función añadirCliente()
 */


public class BancMutxamel {
    static Scanner entrada = new Scanner(System.in);

    static ArrayList<Cliente> listaClientes = new ArrayList<>();
    static ArrayList<Cuenta> listaCuentas = new ArrayList<>();

    public static void main(String[] args) {


        Cuenta cuenta1 = new Cuenta();

        cuenta1.setTitular("Jose");
        System.out.println(cuenta1);
        Cuenta cuenta2 = new Cuenta();
        System.out.println(cuenta2);

        Cliente cliente1 = new Cliente();
        System.out.println(cliente1);

        menuPrincipal();

    }

    public static void menuPrincipal(){
        System.out.println("MENÚ PRINCIPAL:");
        System.out.println("\t[1] Mantenimiento de Clientes");
        System.out.println("\t[2] Mantenimiento de Cuentas");
        System.out.println("\t[X] Salir");
        String opc = entrada.next();


        switch (opc.toUpperCase()){
            case "1":
                menuClientes();
                break;
            case "2":
                menuCuentas();
                break;
            case "X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                menuPrincipal();
        }
    }

    public static void menuClientes(){
        System.out.println("CLIENTES:");
        System.out.println("\t[1] Altas");
        System.out.println("\t[2] Bajas");
        System.out.println("\t[3] Modificaciones");
        System.out.println("\t[4] Listado de clientes");
        System.out.println("\t[X] Volver al menú principal");
        String opc = entrada.next();

        switch (opc.toUpperCase()){
            case "1":
                añadirClientes();
                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;
            case "X":
                System.out.println("Volviendo al menú principal");
                menuPrincipal();
                break;
            default:
                System.out.println("Opción no válida.");
                menuClientes();
        }
    }

    public static void añadirClientes(){
        System.out.println("Introduce el nombre del cliente:");
        String nombre = entrada.next();
        System.out.println("Introduce los apellidos del cliente:");
        String apellidos = entrada.next();

        for (Cliente c : listaClientes){
            if(c.getNombre().equals(nombre) && c.getApellidos().equals(apellidos)){
                System.out.println("Este usuario ya está registrado. Volviendo al menú CLIENTES...");
                menuClientes();
            }
        }
        Cliente cli = new Cliente( nombre, apellidos);
        listaClientes.add(cli);
    }

    public static void menuCuentas(){
        System.out.println("Menú cuentas");
    }

}
