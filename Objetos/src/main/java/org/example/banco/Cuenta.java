package org.example.banco;

import java.util.ArrayList;

public class Cuenta {
    public static int numCuenta;

    private String iban;
    private int saldo;
    private String titular;


    public Cuenta () {
        iban=asignarIban(iban);
        numCuenta++;
        saldo=0;
        titular=null;

    }

    public String getIban() {
        return iban;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String asignarIban(String iban){
        return String.format("ES%03d", numCuenta);
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "iban='" + iban + '\'' +
                ", saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
