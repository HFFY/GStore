package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnEnviar;
    private TextView resultados;
    private TextView txtResultado;
    private TextView lblCrear;
    private Context context;


    //private Datos datos= Datos.getInstance();
    String nombre_ingresado;
    String password_ingresado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);

        //Buscamos el archivo de preferencias llamado MisPreferencias
        SharedPreferences prefs =
                getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        //Se busca los datos almacenados. SI no hay el resultado será no.
        String usuario_almacenado = prefs.getString("txtUsuario","no");
        String password_almacenado = prefs.getString("txtPassword","no");

        //Si hay datos de usuarios almacenados se irá a menu principal.
        if(usuario_almacenado.compareTo("no")!=0 && password_almacenado.compareTo("no")!=0)
        {
            Intent a=new Intent(getApplicationContext(),MenuPrincipal.class);
            finish();
            startActivity(a);
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

                //String campo_usuario = txtUsuario.getText().toString();
                //String campo_password = txtPassword.getText().toString();

                //if(Datos.getInstance().Usuario(campo_usuario,campo_password)){
                //
                //    Intent menu=new Intent(context,MenuPrincipal.class);
                //    startActivity(menu);
                //} else {

                    //TODO: mostrar "Usuario incorrecto"

                //}
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

