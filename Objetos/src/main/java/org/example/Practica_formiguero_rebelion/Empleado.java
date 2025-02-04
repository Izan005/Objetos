package org.example.Practica_formiguero_rebelion;

public class Empleado {
    final String EMP_DEF = "pte";
    public static int numEmpleado = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo){
        id=calcularId();
        numEmpleado++;
        this.nombre=nombre;
        this.cargo=asignarCargo(cargo);
        director = null;
    }

    public String calcularId() {
        return String.format("EP%03d", numEmpleado);
    }

    public void asignarSupervisor(Empleado director){
        this.director=director;
    }

    public String asignarCargo(String cargo){

        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")){
            return cargo;
        } else {
            return EMP_DEF;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
