package org.example.Practica_formiguero_rebelion;

/**
 * @author Izan López Mora 1DAM
 * @version 1.0
 * Clase que contiene toda la información de un empleado que trabaja en un programa (id, nombre, cargo y director).
 * Se relaciona mediante composición con la clase Programa (clase padre).
 */
public class Empleado {
    final String EMP_DEF = "pte"; //Constante que establece un valor por defecto al cargo de los empleados.
    public static int numEmpleado = 0; //Variable global que se suma en 1 cada vez que se crea un empleado.

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    /**
     * Constructor de Empleado al que le pasamos el nombre y el cargo. El id del empleado se calcula automáticamente
     * gracias al método calcularId(). Cada vez que un empleado se crea, numEmpleado se suma en 1.
     * El cargo se asigna tras pasar por la función asignarCargo(). El director se establece automáticamente
     * tomando como referencia el programa en el que se crea un empleado ya que, al crearse un programa, se establece
     * el director de este mismo.
     * @param nombre
     * @param cargo
     */
    public Empleado(String nombre, String cargo){
        id=calcularId();
        numEmpleado++;
        this.nombre=nombre;
        this.cargo=asignarCargo(cargo);
        director = null;
    }

    /**
     * Función que asigna un ID según el número del empleado con un formato establecido. Por ejemplo,
     * si el empleado es el primero en ser creado, su ID será EP000.
     * @return Id del empleado (EP + numEmpleado).
     */
    public String calcularId() {
        return String.format("EP%03d", numEmpleado);
    }

    /**
     * Función que recibe el cargo establecido en el constructor y comprueba que sea director, técnico, presentador
     * o colaborador. Si el cargo es uno de los mencionados, se le asignará el cargo al empleado pero, si no lo es
     * se le asignará el valor de la constante EMP_DEF: pte.
     * @param cargo
     * @return cargo ya filtrado.
     */
    public String asignarCargo(String cargo){

        if (cargo.equalsIgnoreCase("director") || cargo.equalsIgnoreCase("técnico") ||
                cargo.equalsIgnoreCase("presentador") || cargo.equalsIgnoreCase("colaborador")) {
            return cargo;
        } else {
            return EMP_DEF;

        }
    }

    /**
     * Getter Id
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter id
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter cargo
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Setter cargo
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Getter director
     * @return director
     */
    public Empleado getDirector() {
        return director;
    }

    /**
     * Setter director
     * @param director
     */
    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return
                "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}