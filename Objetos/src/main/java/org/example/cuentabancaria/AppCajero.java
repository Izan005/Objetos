package org.example.cuentabancaria;

import java.util.Scanner;

public class AppCajero {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){
        CuentaBancaria cuenta = new CuentaBancaria(0);
        menuCajero(cuenta);
    }

    public static void menuCajero(CuentaBancaria cuentaBancaria){

        System.out.println("=== Cajero Automático ===");
        System.out.println("\t[1]. Consultar saldo");
        System.out.println("\t[2]. Ingresar dinero");
        System.out.println("\t[3]. Retirar dinero");
        System.out.println("\t[X]. Salir");
        System.out.println();
        System.out.println("\tSelecciona una opción:");

        String opc = entrada.next();
        switch (opc.toUpperCase()){
            case "1":
                cuentaBancaria.consultarSaldo();
                menuCajero(cuentaBancaria);
            case "2":
                cuentaBancaria.ingresarDinero();
                menuCajero(cuentaBancaria);
            case "3":
                cuentaBancaria.retirarDinero();
                menuCajero(cuentaBancaria);
            case "X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción incorrecta. Saliendo...");
                menuCajero(cuentaBancaria);
        }
    }
}
