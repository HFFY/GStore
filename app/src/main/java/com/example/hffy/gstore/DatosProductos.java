package com.example.hffy.gstore;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sergio on 23/3/2017.
 */

public class DatosProductos extends SQLiteOpenHelper {


    public static final String Db_Productos = "Productos_database.db";

    public DatosProductos(Context context, String Db_Productos, String Datos, int VERSION) {
        super(context, Db_Productos, null, VERSION);
        Log.e("DB", "Constructor");

    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create Table DatosProductos(ID integer primary key,Name text,Precio integer, Imagen1 integer, Imagen2 integer, Desc1 text, Desc2 text, Url text)");
        Log.e("DB", "Creado");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
