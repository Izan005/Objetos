package org.example.herencia_ejemplos.streaming;

public class PlataformaStreaming {
    public static void main(String[] args) {

        Suscripcion[] suscripciones = {
                new PlanGratis("Gratis", 0.0),
                new PlanBasico("Básico", 9.99),
                new PlanPremium("Premium", 14.99),
                new PlanFamiliar("Familiar", 19.99)
        };

        for (Suscripcion s : suscripciones){
            s.mostrarInfo();
            s.obtenerBeneficios();
            s.obtenerPeriodoPrueba();
        }


    }
}
