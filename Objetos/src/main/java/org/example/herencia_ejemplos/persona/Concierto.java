package org.example.herencia_ejemplos.persona;

public class Concierto {
    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");
        Organizador org1 = new Organizador("Paco Sanz", 45, "Director");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println();

        System.out.println("Información del organizador:");
        org1.mostrarInfo();

        Persona[] personas = {
                new Asistente("Lucas", 18, "VIP"),
                new Artista("Sofía", 25, "Rock Alternativo"),
                new Organizador("Martín", 30, "Producción")
        };

        //se ejecuta la versión sobrescrita de cada subclase
        for (Persona p : personas) {
            System.out.println();
            p.mostrarInfo();

            if (p instanceof Organizador){
                ((Organizable)p).organizarEvento();
            }

        }

        mostrarAcceso(art1);
        mostrarAcceso(a1);
        mostrarAcceso(org1);


    }

    public static void mostrarAcceso(Persona persona){
        persona.accederEvento();
    }
}
