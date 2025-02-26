package org.example.cuentabancaria;

import java.util.Scanner;

public class CuentaBancaria {

    static Scanner entrada = new Scanner(System.in);

    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo=saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(){
        System.out.println("Introduce cantidad a ingresar:");
        double importe = entrada.nextDouble();

        if (importe > 3000){
            throw new DepositoMaximoException("El límite diario a ingresar son 3.000€");
        } else if (importe < 0) {
            System.out.println("El importe a ingresar no puede ser menor que 0.");
        } else {
            saldo += importe;
            System.out.println("Cantidad ingresada con éxito");
        }
    }

    public void retirarDinero(){
        System.out.println("Introduce cantidad a retirar:");
        double importe = entrada.nextDouble();
        if (saldo < importe){
            throw new SaldoInsuficienteException("No puedes retirar más dinero del disponible.");
        } else if (importe > 600) {
            throw new LimiteDiarioException("El límite diario a retirar son 600€.");
        } else if (importe < 0) {
            System.out.println("El importe a retirar no puede ser menor que 0.");
        } else {
            saldo -= importe;
            System.out.println("Cantidad retirada con éxito");
        }
    }

    public void consultarSaldo(){
        System.out.println("Tienes " + saldo + "€ en tu cuenta.");
    }
}
