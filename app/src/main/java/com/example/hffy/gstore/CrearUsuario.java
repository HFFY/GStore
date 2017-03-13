package com.example.hffy.gstore;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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
                Datos admin=new Datos(context,"instituto",null,1);
                SQLiteDatabase db=admin.getWritableDatabase();
                String Usuario=txtNuevoUsuario.getText().toString();
                String Contraseña =txtNuevaPass.getText().toString();
                String Celular =txtCelular.getText().toString();
                String Email =txtEmail.getText().toString();
                String Codigo =txtCodigo.getText().toString();

                ContentValues values =new ContentValues();
                values.put("Username",Usuario);
                values.put("Conntraseña",Contraseña);
                values.put("Celular",Celular);
                values.put("Email",Email);
                values.put("Numero de tarjeta",Codigo);

                db.insert("Usuario",null,values);
                db.close();

                Intent iniciar=new Intent(context,MainActivity.class);
                startActivity(iniciar);


            }
        });


    }
}
