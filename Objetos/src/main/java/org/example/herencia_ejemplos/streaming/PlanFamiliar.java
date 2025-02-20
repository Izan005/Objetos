package org.example.herencia_ejemplos.streaming;

public class PlanFamiliar extends Suscripcion{
    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición");
    }

    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 7 días de prueba para cuentas nuevas");
    }
}
