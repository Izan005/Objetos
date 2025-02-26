package org.example.cuentabancaria;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException(String message) {
        super(message);
    }
}
