package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnEnviar;
    private TextView txtResultado;
    private TextView lblCrear;
    private Context context;
    //private Datos datos= Datos.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        txtUsuario=(EditText)findViewById(R.id.txtUsuario);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
        btnEnviar=(Button)findViewById(R.id.btnEnviar);
        lblCrear=(TextView)findViewById(R.id.lblCrear);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String campo_usuario = txtUsuario.getText().toString();
                String campo_password = txtPassword.getText().toString();

                if(Datos.getInstance().Usuario(campo_usuario,campo_password)){

                    Intent menu=new Intent(context,MenuPrincipal.class);
                    startActivity(menu);
                } else {

                    //TODO: mostrar "Usuario incorrecto"

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
