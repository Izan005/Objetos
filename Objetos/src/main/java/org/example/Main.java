package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
       Persona persona1 = new Persona("José", "Sanchez", "12345678P", 120, 23, "Alicante", "Herrero");

        System.out.println(persona1);


//        Persona persona2 = new Persona();
//
//        persona1.imprimirPersonas();
//        persona2.imprimirPersonas();
//
//        System.out.println(persona1.getNombre());
//        persona1.setNombre("PEPO");
//        System.out.println(persona1.getNombre());
//
//        System.out.println(persona1.nombreApellido());

//       Paciente paciente_fit = new Paciente("Llados", 40, 'M', 130.0, 1.7);
//
//       Paciente paciente1 = new Paciente();
//
//       Paciente paciente2 = new Paciente("Paco", 17, 'H');
//       paciente2.imprimirPaciente();
//       paciente1.imprimirPaciente();
//       paciente_fit.imprimirPaciente();

//        System.out.println("Introduce un nombre: ");
//        String nombre = entrada.next();
//        System.out.println("Introduce la edad: ");
//        int edad = entrada.nextInt();
//        System.out.println("Introduce el género: ");
//        char sexo = entrada.next().charAt(0);
//        System.out.println("Introduce tu peso: ");
//        double peso = entrada.nextDouble();
//        System.out.println("Introduce la altura: ");
//        double altura = entrada.nextDouble();

        //Paciente por defecto
        Paciente paciente1 = new Paciente();
//        Paciente paciente2 = new Paciente(nombre, edad, sexo);
//        Paciente paciente3 = new Paciente(nombre, edad, sexo, peso, altura);


        paciente1.setNombre("Jorge");
        paciente1.setEdad(12);
        paciente1.setSexo('H');
        paciente1.setPeso(87);
        paciente1.setAltura(1.23);
        paciente1.calcularIMC();

        System.out.println(paciente1);
//
//        System.out.println(paciente3);
//
//        comprobarPeso(paciente1);
//        comprobarPeso(paciente2);
//        comprobarPeso(paciente3);
//
//        comprobarEdad(paciente1);
//        comprobarEdad(paciente2);
//        comprobarEdad(paciente3);

    }

    public static void comprobarPeso(Paciente paciente) {
        int imc = paciente.calcularIMC();


        switch (imc) {
            case Paciente.INFRAPESO:
                System.out.println("La persona está en infrapeso.");
                break;
            case Paciente.PESOIDEAL:
                System.out.println("La persona está en su peso ideal.");
                break;
            case Paciente.SOBREPESO:
                System.out.println("La persona tiene sobrepeso.");
                break;
        }
    }

    public static void comprobarEdad(Paciente paciente) {

        if (paciente.esMayorDeEdad()){
            System.out.println("El paciente " + paciente.getNombre() + " es mayor de edad.");
        } else {
            System.out.println("El paciente " + paciente.getNombre() + " no es mayor de edad.");
        }
    }
}
