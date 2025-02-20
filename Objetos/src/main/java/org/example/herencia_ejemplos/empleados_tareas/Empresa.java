package org.example.herencia_ejemplos.empleados_tareas;

public class Empresa {
    public static void main(String[] args) {


        Empleado des1 = new Desarrollador();
        Empleado ger1 = new Gerente();

        Empleado[] empleados = {
            new Desarrollador(),
            new Diseñador(),
            new Gerente()
        };

        System.out.println("=== Usando el array polimórfico ===");
        for (Empleado e : empleados){
            e.realizarTarea();
        }
        System.out.println();

//        asignarTarea(empleados[0]);
//        asignarTarea(empleados[1]);
//        asignarTarea(empleados[2]);

        asignarTarea(des1);
        asignarTarea(ger1);

    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
