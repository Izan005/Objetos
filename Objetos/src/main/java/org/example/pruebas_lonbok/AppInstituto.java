package org.example.pruebas_lonbok;

public class AppInstituto {

    public static void main(String[] args) {
        Instituto ies_alluser = new Instituto("IES ALLUSER", "Mutxamel", "calle falsa 1");
        System.out.println(ies_alluser);

        Instituto iesmutxamel = null;
        try{
            iesmutxamel = new Instituto(null, "mutxamel", "calle falsa 2");
        }catch (NullPointerException e){
            System.out.println("El nombre no puede ser nulo");
        }

        System.out.println(iesmutxamel);


    }



}
