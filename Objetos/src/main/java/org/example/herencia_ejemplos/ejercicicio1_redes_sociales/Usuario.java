package org.example.herencia_ejemplos.ejercicicio1_redes_sociales;

public class Usuario {
    private String nombre;
    private int edad;
    private String nombreUsuario;
    private int seguidores;

    public Usuario(String nombre, int edad, String nombreUsuario, int seguidores){
        this.nombre=nombre;
        this.edad=edad;
        this.nombreUsuario=nombreUsuario;
        this.seguidores=seguidores;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Seguidores: " + seguidores);
    }

}
