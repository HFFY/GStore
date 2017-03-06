package com.example.hffy.gstore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by HFFY on 2/3/2017.
 */

public class Datos extends SQLiteOpenHelper {

    public static abstract class DatosTabla implements BaseColumns{
        public static final String NOMBRE_TABLA = "Datos de Usuario";
        public static final String CAMPO_USUARIO = "Usuario";
        public static final String CAMPO_CONTRASEÑA = "Contraseña";
        public static final String CAMPO_EMAIL = "Email";
        public static final String CAMPO_CELULAR = "Celular";
        public static final String CAMPO_CODIGO = "Codigo";

        private static final String TEXT_TYPE = " TEXTO";
        private static final String COMMA_SEP = ",";
        private static final String CREAR_TABLA_1 = "Create table "
                + DatosTabla.NOMBRE_TABLA + " ("+
                DatosTabla.CAMPO_USUARIO + TEXT_TYPE + COMMA_SEP +
                DatosTabla.CAMPO_CONTRASEÑA + TEXT_TYPE + COMMA_SEP +
                DatosTabla.CAMPO_EMAIL + TEXT_TYPE + COMMA_SEP +
                DatosTabla.CAMPO_CELULAR + TEXT_TYPE + COMMA_SEP +
                DatosTabla.CAMPO_CODIGO + TEXT_TYPE + " )";
        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + DatosTabla.NOMBRE_TABLA;

    }

    public Datos(Context context){
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    public static final int DATABASE_VERSION= 1;
    public static final String DATABASE_NAME = "Datos.db";

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DatosTabla.CREAR_TABLA_1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatosTabla.SQL_DELETE_ENTRIES);
        onCreate(db);

    }


    public boolean Usuario(String u, String p){
        //TODO Verificar Usuarios Existentes

        return true;
    }

    public boolean Crear(String uss,String pass,String email,String celular,String codigo){
        //TODO Almacenar un nuevo Usuario con todos sus datos
        return true;
    }

    //Singleton pattern
    private static Datos instance = null;
    public static Datos getInstance() {
        if (instance == null) {
            instance = new Datos(null);
        }
        return instance;
    }

}
