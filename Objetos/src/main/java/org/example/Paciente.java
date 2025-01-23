package org.example;

import java.util.Random;

public class Paciente {

    Random random = new Random();
    private final static char DEFAULT_GEN = 'X';

    public final static int INFRAPESO = -1;
    public final static int PESOIDEAL = 0;
    public final static int SOBREPESO = 1;

    private final static int MAYOR_DE_EDAD = 18;

    private String nombre;
    private String dni;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Paciente () {
//        generarDNI();
//        this.sexo = DEFAULT_GEN;
        this("", 0, DEFAULT_GEN, 0, 0);
    }

    public Paciente(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Paciente (String nombre, int edad, char sexo, double peso, double altura) {

        this.nombre=nombre;
        this.edad=edad;
        comprobarSexo(sexo);
        this.peso=peso;
        this.altura=altura;
        generarDNI();
    }

    private void generarDNI() {

        int num = random.nextInt(10000000, 99999999)+1;
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        this.dni = Integer.toString(num) + letras[num%23];
    }

    public void imprimirPaciente() {
        System.out.println("Paciente: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("DNI: " + this.dni);
        System.out.println("Género: " + this.sexo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }


    public int calcularIMC() {
        double imc = peso/(Math.pow(altura,2));

        if (imc < 20) {
            return INFRAPESO;
        } else if (imc >= 20 || imc <= 25) {
            return PESOIDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {

        if(edad >= MAYOR_DE_EDAD) {
            return true;
        } else {
            return false;
        }
    }

    private void comprobarSexo(char sexo) {

        if (sexo != 'H' && sexo != 'M') {
            this.sexo=DEFAULT_GEN;
        } else {
            this.sexo=sexo;
        }
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getDni() {
        return this.dni;
    }
    public char getSexo() {
        return this.sexo;
    }
    public int getEdad() {
        return this.edad;
    }
    public double getPeso() {
        return this.peso;
    }
    public double getAltura() {
        return this.altura;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    public void setSexo(char sexo) {
        comprobarSexo(sexo);
    }
    public void setEdad(int edad) {
        this.edad=edad;
    }
    public void setPeso(double peso) {
        this.peso=peso;
    }
    public void setAltura(double altura) {
        this.altura=altura;
    }

    @Override
    public String toString(){
        return "Persona [nombre=" + nombre + " edad= " + edad + " género= " + sexo + " dni= " + dni + " altura= " + altura + " peso= " + peso +"]";
    }
}
