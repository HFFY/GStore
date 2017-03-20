package com.example.hffy.gstore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Sergio on 2/3/2017.
 */

public class Datos extends SQLiteOpenHelper{
    public static final String DB_NAME = "Usuario_database.db";

    public Datos(Context context, int VERSION) {

        super(context, DB_NAME, null, VERSION);
        Log.e("DB","Constructor");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table registros(id integer primary key,Usuario text,Contraseñas integer,Celular integer, Email text )");
        Log.e("DB","Creado");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
