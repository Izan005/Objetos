package org.example.casa;

public class AppCasa {
    public static void main(String[] args) {

        Casa casa = new Casa("Calle Mayor 123");

        casa.agregarHabitacion("Dormitorio", 40);
        casa.agregarHabitacion("Cocina", 35);
        casa.agregarHabitacion("Baño", 10);
        casa.agregarHabitacion("Baño", 20);
        casa.agregarHabitacion("Garaje", 30);

        casa.mostrarHabitaciones();
        casa.mostrarHabitaciones();
        System.out.println(casa.getHabitacionMasGrande());
        System.out.println(casa);


        casa.getHabitaciones().get(0).agregarElectrodomestico("Microondas", 10);
        casa.getHabitaciones().get(0).agregarElectrodomestico("Nevera", 100);
        System.out.println("La habitación consume: " + casa.getHabitaciones().get(0).calcularConsumo());



    }
}
