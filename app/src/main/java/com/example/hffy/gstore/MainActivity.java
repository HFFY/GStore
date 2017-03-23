package com.example.hffy.gstore;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnEnviar;
    private TextView resultados;
    private TextView txtResultado;
    private TextView lblCrear;
    private Context context;

    private SQLiteDatabase db;

    public static final int VERSION = 1;
    private Usuario usuario;
    private String activeUser[] = new String[2];



    //private Datos datos= Datos.getInstance();
    String nombre_ingresado;
    String password_ingresado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Datos datos = new Datos(this,"registros",null,VERSION);

        db = datos.getWritableDatabase();
        ContentValues values = new ContentValues();
        //Buscamos el archivo de preferencias llamado MisPreferencias
        SharedPreferences prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
        //Si hay datos de usuarios almacenados se irá a menu principal.
        activeUser[0] = prefs.getString("Usuario", "");
        activeUser[1] = prefs.getString("Contraseña", "");
        if(!(activeUser[0].matches("") || activeUser[1].matches(""))){
            Intent a=new Intent(getApplicationContext(),MenuPrincipal.class);
            startActivity(a);
            finish();
        }
        try{
            Intent intent = getIntent();
            String userString = intent.getStringExtra("user");
            boolean ver = intent.getBooleanExtra("ver", false);
            if(ver){
                Log.e("intent", "working");
                Gson gson = new Gson();
                usuario = gson.fromJson(userString, Usuario.class);
                values.put("Usuario",usuario.getUser_Name());
                values.put("Contraseña",usuario.getPass());
                values.put("Email",usuario.getEmail());
                values.put("Celular",usuario.getCelular());
                db.insert("registros", null, values);
                db.close();
            }
        }catch(Exception e){
        }
        context=this;
        txtUsuario=(EditText)findViewById(R.id.txtUsuario);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
        btnEnviar=(Button)findViewById(R.id.btnEnviar);
        lblCrear=(TextView)findViewById(R.id.lblCrear);

        resultados=(TextView)findViewById(R.id.txtresultados);

        btnEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                nombre_ingresado = txtUsuario.getText().toString();
                password_ingresado = txtPassword.getText().toString();


                if (nombre_ingresado.matches("") || password_ingresado.matches("")) {
                    Toast.makeText(getApplicationContext(),"Error deebe introducir Usuario y contraseña",Toast.LENGTH_LONG).show();

                }else{

                    db = datos.getReadableDatabase();

                    //Querry para SQL
                    Cursor users_existing=db.rawQuery("SELECT Contraseñas FROM registros WHERE Usuario =" + " '"+
                            txtUsuario.getText().toString()+ "'", null);


                    //Verificación real en la base de datos
                    if(users_existing.moveToFirst()) {
                        if(users_existing.getString(0).equals(password_ingresado)){
                            users_existing.close();
                            //Abrimos el archivo de preferencias
                            SharedPreferences prefs =
                                    getSharedPreferences("MisPreferencias",Context.MODE_PRIVATE);
                            //Editamos los campos existentes
                            SharedPreferences.Editor editor = prefs.edit();
                            editor.putString("txtUsuario", nombre_ingresado);
                            editor.putString("txtPassword", password_ingresado);
                            //Concretamos la edicion
                            editor.commit();
                            Toast.makeText(getApplicationContext(), "Usuario: " + nombre_ingresado + ", Password: " + password_ingresado, Toast.LENGTH_SHORT).show();

                            Intent a=new Intent(getApplicationContext(),MenuPrincipal.class);
                            startActivity(a);
                            finish();

                        }else{
                            Toast.makeText(context,"Usuario o contraseña incorrectos.", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(context,"Usuario inexistente.", Toast.LENGTH_SHORT).show();
                    }



                }


            }
        });

        lblCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                Intent crear =new Intent(context,CrearUsuario.class);
                startActivity(crear);

            }
        });


    }



}