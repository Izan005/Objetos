package org.example.biblioteca;

public class Persona {

    private String  nombre;
    private String apellido;
    private String dni;
    private int peso;
    private int edad;
    private String ciudad;
    private String profesion;
    public Persona() {

    }

    public Persona(String nombre, String apellido, String dni, int peso, int edad, String ciudad, String profesion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.peso = peso;
        this.edad = edad;
        this.ciudad=ciudad;
        this.profesion=profesion;
    }

    public String getNombre(){

        return this.nombre;
    }

    public String getApellido() {

        return this.apellido;
    }

    public String getDni() {

        return this.dni;
    }

    public int getPeso() {

        return this.peso;
    }

    public int getEdad() {

        return this.edad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public void setNombre(String nombre) {

        if (nombre.equalsIgnoreCase("messi")) {
            this.nombre=nombre;
        }

    }

    public void setApellido(String apellido) {

        this.apellido=apellido;
    }

    public void setDni(String dni) {

        this.dni=dni;
    }

    public void setPeso(int peso) {

        this.peso=peso;
    }

    public void setEdad(int edad) {

        this.edad=edad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad=ciudad;
    }

    public void setProfesion(String profesion) {
        this.profesion=profesion;
    }

    public String nombreApellido() {

        return this.nombre + " " + this.apellido;

    }
    public void imprimirPersonas() {
        System.out.println(this.nombre + " " + this.apellido + " tiene el DNI " + this.dni + ", pesa " + this.peso + " Kg, tiene " + this.edad + " años, vive en " + this.ciudad + " y trabaja como " + this.profesion);
    }

    @Override
    public String toString(){
        return "Persona [nombre=" + getNombre() + " apellido= " + getApellido()+ " edad= " + getEdad() + " ciudad= " + getEdad() + " dni= " + getDni() + " profesión= " + getProfesion() + " peso= " + getPeso() +"]";
    }
}
