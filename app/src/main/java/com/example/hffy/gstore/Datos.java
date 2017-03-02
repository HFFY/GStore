package com.example.hffy.gstore;

/**
 * Created by HFFY on 2/3/2017.
 */

public class Datos {

    // TODO: crear una forma de almacenar datos enviados por Json

    public boolean usuario(String u, String p){
        //TODO Verificar Usuarios Existentes

        return true;
    }

    public boolean crear(String uss,String pass,String email,String celular,String codigo){
        //TODO Almacenar un nuevo Usuario con todos sus datos

        return true;
    }

    //Singleton pattern
    private static Datos instance = null;
    public static Datos getInstance() {
        if (instance == null) {
            instance = new Datos();
        }
        return instance;
    }

    private Datos(){};

}
