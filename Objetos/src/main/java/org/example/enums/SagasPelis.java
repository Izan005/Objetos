package org.example.enums;

public enum SagasPelis {

    HARRY_POTTER(8),CREPUSCULO(4),SPIDERMAN(7),A_TODO_GAS(11),SHREK(5);

    private int numeroPelis;

    SagasPelis(int numeroPelis){
        this.numeroPelis=numeroPelis;
    }

    public int getNumeroPelis() {
        return numeroPelis;
    }
}
