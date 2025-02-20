package org.example.herencia_ejemplos.ejercicicio1_redes_sociales;

public class RedSocial {
    public static void main(String[] args) {

        Usuario ana = new Usuario("Ana", 30, "@ana", 231);
        Influencer luis = new Influencer("Luis", 25, "@luis_influencer", 50000);

        luis.añadirColaboraciones("MediaMarkt", "Yoigo", "Temu");

        Streamer carlos = new Streamer("Carlos", 27, "@carlos_stream", 20000, 150, 2000);

        Usuario pedro = new Usuario("Pedro", 22, "@pedro123", 433);

        ana.mostrarInfo();
        System.out.println();
        luis.mostrarInfo();
        System.out.println();
        carlos.mostrarInfo();
        System.out.println();
        pedro.mostrarInfo();



    }
}
