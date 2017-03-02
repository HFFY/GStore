package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CrearUsuario extends AppCompatActivity {

    private EditText txtNuevaPass;
    private EditText txtNuevoUsuario;
    private EditText txtEmail;
    private EditText txtCelular;
    private Button btnCrear;
    private EditText txtCodigo;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);

        context=this;

        txtNuevoUsuario=(EditText)findViewById(R.id.txtNuevoUsuario);
        txtNuevaPass=(EditText)findViewById(R.id.txtNuevaPass);
        btnCrear=(Button)findViewById(R.id.btnCrear);
        txtCelular=(EditText)findViewById(R.id.txtCelular);
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtCodigo=(EditText)findViewById(R.id.txtCodigo);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View d) {
                String campo_usuario = txtNuevoUsuario.getText().toString();
                String campo_contraseña = txtNuevaPass.getText().toString();
                String campo_email = txtEmail.getText().toString();
                String campo_celular = txtCelular.getText().toString();
                String campo_codigo = txtCodigo.getText().toString();

                //TODO : enviar datos a Datos para ser almacenados mediante Json

                Intent iniciar=new Intent(context,MainActivity.class);
                startActivity(iniciar);
            }
        });


    }
}
