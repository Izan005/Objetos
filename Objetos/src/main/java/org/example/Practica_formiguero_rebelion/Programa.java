package org.example.Practica_formiguero_rebelion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Izan López Mora 1DAM
 * @version 1.0
 * Clase que almacena los datos de un programa en emisión (nombre, cadena, temporadas, lista de empleados que
 * trabajan en el programa, lista de invitados que acuden al programa).
 */
public class Programa {
    static Scanner entrada=new Scanner(System.in);

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    /**
     * Constructor de la clase Programa. Por cada programa existente, agregamos un objeto tipo Empleado llamado director
     * el cual hace referencia al director del programa (Empleado con cargo director). El director, nada más ser creado
     * se agrega a la lista listaEmpleados como un trabajador más.
     * @param nombre
     * @param temporadas
     * @param nombreDir
     */
    public Programa(String nombre, Cadena cadena, int temporadas, String nombreDir){
        this.nombre=nombre;
        this.cadena=cadena;
        this.temporadas=temporadas;
        director = new Empleado(nombreDir, "director");
        listaEmpleados = new ArrayList<>();
        listaEmpleados.add(director);
        listaInvitados = new ArrayList<>();
    }


    /**
     * Getter listaEmpleados
     * @return listaEmpleados
     */
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Setter listaEmpleados
     * @param listaEmpleados
     */
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Getter listaEmpleados
     * @return listaEmpleados
     */
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    /**
     * Setter listaInvitados
     * @param listaInvitados
     */
    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    /**
     * Getter temporadas
     * @return temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * Setter temporadas
     * @param temporadas
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * Getter cadena
     * @return cadena
     */
    public Cadena getCadena() {
        return cadena;
    }

    /**
     * Setter cadena
     * @param cadena
     */
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
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
     * Función con la que podemos agregar un empleado (creando un objeto tipo Empleado) a la lista de empleados.
     * También añade al atributo director del objeto Empleado el valor del director del programa creado mediante
     * el constructor del programa.
     * @param nombre
     * @param cargo
     */
    public void agregarEmpleado(String nombre, String cargo){
        Empleado empleado = new Empleado(nombre, cargo);
        empleado.setDirector(director);
        listaEmpleados.add(empleado);
    }

    /**
     * Función que elimina un empleado de listaEmpleados.
     * @param nombre
     */
    public void eliminarEmpleado(String nombre){

        for (Empleado e : listaEmpleados){
            if(e.getNombre().equals(nombre)){
                listaEmpleados.remove(e);
                break;
            }
        }
    }

    /**
     * Función con la que podemos agregar un invitado (creando un objeto tipo Invitado) a la lista de invitado.
     * @param nombre
     * @param profesion
     * @param temporada
     */
    public void agregarInvitado(String nombre, String profesion, int temporada){
        Invitado invitado = new Invitado(nombre, profesion, temporada, agregarFechaInvitado());
        listaInvitados.add(invitado);
    }

    /**
     * Función que elimina un invitado de listaInvitado.
     * @param nombre
     * @param temporada
     */
    public void eliminarInvitado(String nombre, int temporada){
        for (Invitado inv : listaInvitados) {
            if(inv.getNombre().equals(nombre) && inv.getTemporada() == temporada){
                listaInvitados.remove(inv);
                break;
            }
        }

    }

    /**
     * Función de tipo LocalDate que pregunta al usuario por una fecha de invitación cada vez que se crea un invitado.
     * @return fecha de invitación
     */
    public LocalDate agregarFechaInvitado(){
        System.out.println("Día de invitación:");
        int dia = entrada.nextInt();
        System.out.println("Mes de invitación:");
        int mes = entrada.nextInt();
        System.out.println("Año de invitación:");
        int año = entrada.nextInt();
        LocalDate fecha = LocalDate.of(año, mes, dia);
        return fecha;
    }

    /**
     * Función que calcula cuantos invitados acuden a una temporada y muestra sus nombres y profesiones.
     * @param temporada
     * @return cantidad de invitados que acuden a una temporada
     */
    public int invitadosTemporada(int temporada){

        int contTemp = 0; //Contador que se suma en 1 cuando encuentra un invitado en la temporada introducida.
        System.out.println("Invitados temporada " + temporada + ":");

        for(Invitado inv : listaInvitados){ //Bucle que recorre la lista listaInvitados en busca de la temporada solicitada.
            if (inv.getTemporada() == temporada){
                System.out.println("Nombre: " + inv.getNombre() + ", Profesión: " + inv.getProfesion());
                contTemp++;
            }
        }
        System.out.println("Invitados totales de la temporada " + temporada + ":");
        return contTemp;
    }

    /**
     * Función que calcula cuantas veces se ha invitado a alguien a un programa.
     * @param nombre
     * @return veces que se ha invitado a alguien a un programa.
     */
    public int vecesInvitado(String nombre){
        int contVez = 0; //Contador que se suma en 1 cada vez que se encuentra el nombre introducido en listaInvitados

        for (Invitado inv : listaInvitados){ //Bucle que recorre la lista listaInvitados en busca del nombre solicitado.
            if (inv.getNombre().equals(nombre)){
                contVez++;
            }
        }

        System.out.println("Veces que el invitado " + nombre + " ha acudido al programa:");
        return contVez;
    }

    /**
     * Función que muestra al usuario las temporadas visitadas por un invitado y las fechas en las que este ha acudido
     * al programa. También acude a la función vecesInvitado() para comprobar las veces que se le ha invitado al programa.
     * @param nombre
     * @return String con las temporadas visitadas y las fechas de visita.
     */
    public String rastrearInvitado(String nombre){
        System.out.println(vecesInvitado(nombre)); //Se imprime la función vecesInvitado que recibe el nombre del invitado.
        ArrayList<Integer> temporadas = new ArrayList<>(); //Lista que almacenará las temporadas visitadas.
        ArrayList<LocalDate> fechas = new ArrayList<>(); //Lista que almacena las fechas de visita.
        for (Invitado inv : listaInvitados){ //Bucle que recorre la lista listaInvitados.
            if (inv.getNombre().equals(nombre)){ //Condicional que comprueba la existencia del invitado mediante su nombre.
               fechas.add(inv.getFecha_visita()); //Añade la fecha de visita a la lista fechas
               temporadas.add(inv.getTemporada()); //Añade la temporada visitada a la lista temporadas.
            }
        }
        return "Temporadas visitadas: " + temporadas + " Fechas de visita: " + fechas;
    }

    /**
     * Función que recibe un nombre y comprueba si el invitado ha acudido a un programa.
     * @param nombre
     * @return true si ha acudido / false si no ha acudido.
     */
    public boolean buscarInvitado(String nombre){

        for (Invitado inv : listaInvitados){ //Bucle que recorre la lista listaInvitados
            if (inv.getNombre().equals(nombre)){ //Si el nombre se ha encontrado, devuelve true. Si no, false.
                return true;
            }
        }
        return false;
    }

    /**
     * Función que recibe un invitado y 2 objetos tipo Programa para comparar las fechas a las que ha acudido y,
     * en caso de que la función buscarInvitado() devuelva true, muestra el programa al que ha acudido el invitado.
     * En caso de que buscarInvitado() devuelva false el programa dirá que el invitado no ha acudido a ese programa.
     * @param nombre
     * @param programa1
     * @param programa2
     */
    public static void invitadoAntes(String nombre, Programa programa1, Programa programa2){


        LocalDate fecha1 = null; //Creamos 2 objetos tipo LocalDate para almacenar las fechas a las que el invitado ha acudido a los 2 programas.
        //Por defecto, las estableceré en null.
        LocalDate fecha2 = null;

        for (Invitado inv : programa1.listaInvitados) { //Bucle que recorre la listaInvitados del programa1.
            if (programa1.buscarInvitado(nombre)) { //Si se encuentra que el invitado ha acudido al programa1 mediante la función buscarInvitado(),
                // establecemos como fecha1 la fecha de visita al programa
                if (inv.getNombre().equals(nombre)) {
                    fecha1 = programa1.listaInvitados.getFirst().getFecha_visita();
                }
            }
        }

        for (Invitado inv : programa2.listaInvitados) { //Bucle que recorre la listaInvitados del programa1.
            if (programa2.buscarInvitado(nombre)) { //Si se encuentra que el invitado ha acudido al programa2 mediante la función buscarInvitado(),
                // establecemos como fecha2 la fecha de visita al programa.
                if (inv.getNombre().equals(nombre)) {
                    fecha2 = programa2.listaInvitados.getFirst().getFecha_visita();
                }
            }
        }

        if (fecha1 == null || fecha2 == null){ //Si cualquiera de las fechas es null imprimimos por pantalla que el invitado no ha asistido a un programa
            //y salimos del bucle sin cambiar el valor de fecha2.
            System.out.println("El invitado " + nombre + " no ha acudido a algún programa");
        } else { //Si las 2 fechas no son null, se comparan las fechas y se imprime por pantalla la fecha más antigua.
            if (fecha1.isBefore(fecha2)) {
                System.out.println("El invitado " + nombre + " ha acudido antes al programa " + programa1.getNombre() + " que al programa " + programa2.getNombre());
            } else {
                System.out.println("El invitado " + nombre + " ha acudido antes al programa " + programa2.getNombre() + " que al programa " + programa1.getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                ", director=" + director +
                '}';
    }
}