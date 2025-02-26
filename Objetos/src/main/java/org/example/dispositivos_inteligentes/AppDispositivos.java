package org.example.dispositivos_inteligentes;

import java.util.ArrayList;

public class AppDispositivos {
    public static void main(String[] args) {

        ArrayList<Dispositivo> dispositivos = new ArrayList<>();
        dispositivos.add(new Televisor("Samsung"));
        dispositivos.add(new ParlanteInteligente("Alexa"));
        dispositivos.add(new AireAcondicionado("Siemens"));


        for (Dispositivo d : dispositivos) {
            d.encender();

            if (d instanceof Televisor || d instanceof AireAcondicionado) {
                ((ControlRemoto) d).sincronizar();
            }

            d.mostrarEstado();
            d.apagar();
            System.out.println("------------------------");


            Dispositivo proyector = new Dispositivo("Optoma") {
                @Override
                public void encender() {
                    if (getEstado()) {
                        System.out.println("El proyector ya está encendido.");
                    } else {
                        System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                        setEstado(true);
                    }
                }
            };

            ControlRemoto controlProyector = new ControlRemoto() {
                @Override
                public void sincronizar() {
                    System.out.println("Sincronizando proyector con control remoto de presentación...");
                }
            };

            Dispositivo hornoInteligente = new Dispositivo("Horno") {
                @Override
                public void encender() {
                    if (getEstado()) {
                        System.out.println("El horno ya está encendido.");
                    } else {
                        System.out.println("Calentando horno con ajuste automático de temperatura...");
                        setEstado(true);
                    }
                }
            };

            dispositivos.add(proyector);
            dispositivos.add(hornoInteligente);


            for (Dispositivo di : dispositivos) {
                di.encender();

                if (di instanceof ControlRemoto) {
                    ((ControlRemoto) di).sincronizar();
                } else if (di.getNombre().equals("Optoma")) {
                    controlProyector.sincronizar();
                }

                di.mostrarEstado();
                di.apagar();
                System.out.println("------------------------");


            }
        }
    }
}
