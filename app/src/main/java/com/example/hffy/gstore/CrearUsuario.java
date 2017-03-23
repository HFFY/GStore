package com.example.hffy.gstore;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;

public class CrearUsuario extends AppCompatActivity {

    private EditText txtNuevaPass;
    private EditText txtNuevoUsuario;
    private EditText txtVerificarPass;
    private EditText txtEmail;
    private EditText txtCelular;
    private Button btnCrear;
    private Context context;
    private static final int VERSION=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);

        context=this;

        txtNuevoUsuario=(EditText)findViewById(R.id.txtNuevoUsuario);
        txtNuevaPass=(EditText)findViewById(R.id.txtNuevaPass);
        txtVerificarPass=(EditText)findViewById(R.id.txtVerificarPass);
        btnCrear=(Button)findViewById(R.id.btnCrear);
        txtCelular=(EditText)findViewById(R.id.txtCelular);
        txtEmail=(EditText)findViewById(R.id.txtEmail);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View d) {
                if(txtNuevaPass.getText().toString().equals("")&&
                        txtNuevoUsuario.getText().toString().equals("")&&
                        txtCelular.getText().toString().equals("")&&
                        txtEmail.getText().toString().equals("")){
                    Toast.makeText(context, "Llene las casillas", Toast.LENGTH_LONG).show();


                }else{
                    if(txtEmail.getText().toString().contains("@")&& txtEmail.getText().toString().contains(".")){
                        if(txtNuevaPass.getText().toString().equals(txtVerificarPass .getText().toString())){
                            Datos admin=new Datos(context,"registros",null,VERSION);
                            SQLiteDatabase db=admin.getWritableDatabase();

                            String Usuario=txtNuevoUsuario.getText().toString();
                            String Contraseña =txtNuevaPass.getText().toString();
                            String Celular =txtCelular.getText().toString();
                            String Email =txtEmail.getText().toString();

                            ContentValues values =new ContentValues();
                            values.put("Usuario",Usuario);
                            values.put("Contraseñas",Contraseña);
                            values.put("Celular",Celular);
                            values.put("Email",Email);
                            db.insert("registros",null,values);
                            db.close();



                            Intent intent=new Intent(context,MainActivity.class);
                            Gson gson = new Gson();
                            Usuario usuario = new Usuario(new String[]{txtNuevoUsuario.getText().toString(), txtNuevaPass.getText().toString(),
                                    txtEmail.getText().toString(), txtCelular.getText().toString()});
                            String userString = gson.toJson(usuario);
                            intent.putExtra("registros", userString);
                            intent.putExtra("ver", true);

                            startActivity(intent);
                            finish();

                        }else{
                            Toast.makeText(context, "Verifique que las contraseñas sean iguales", Toast.LENGTH_LONG).show();
                        }

                    } else {
                        Toast.makeText(context, "Verifique que sea un correo", Toast.LENGTH_LONG).show();
                    }





                }



            }
        });


    }

 // Prueba de login con listas
//    //variables locales
//    private EditText et1,et2,et3,et4,et5,et6;
//    private Cursor fila;
//    ListView listaView;
//
//    DbHelper admin;
//    SQLiteDatabase db;
//    @Override    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_principal);
////instancia
//        et1= (EditText) findViewById(R.id.et1);
//        et2= (EditText) findViewById(R.id.et2);
//        et3= (EditText) findViewById(R.id.et3);
//        et4= (EditText) findViewById(R.id.et4);
//        et5= (EditText) findViewById(R.id.et5);
//        et6= (EditText) findViewById(R.id.et6);
//        listaView = (ListView) findViewById(R.id.lista);
//
////para que el campo promedio no pueda ser editado
//
//        et6.setEnabled(false);
////llamamos al metodo getAllRegistros que lista
////todos lo datos registrados de la base de datos.
//        admin = new DbHelper(this, "instituto", null, 1);
//        ArrayList array_list = admin.getAllRegistros();
//        ArrayAdapter<String> arrayAdapter=
//                new ArrayAdapter<String>(
//                        this,android.R.layout.simple_list_item_1, array_list);
//        listaView.setAdapter(arrayAdapter);
//    }
//    //metodo guardar
//    public void Alta(View view) {
//        admin = new DbHelper(this, "instituto", null, 1);
//        db = admin.getWritableDatabase();
//        String codigo = et1.getText().toString();
//        String curso = et2.getText().toString();
//        String nota1 = et3.getText().toString();
//        String nota2 = et4.getText().toString();
//        String nota3 = et5.getText().toString();
////calculamos el promedio
//        int promedioope=0;
//        promedioope=Integer.parseInt(et3.getText().toString());
//        promedioope=promedioope+Integer.parseInt(et4.getText().toString());
//        promedioope=promedioope+Integer.parseInt(et5.getText().toString());
//        promedioope=promedioope/3;
////covertir a string
//        String promedio=String.valueOf(promedioope);
////insertamos en la db
//        ContentValues registro = new ContentValues();
//        registro.put("codigo", codigo);
//        registro.put("curso", curso);
//        registro.put("nota1", nota1);
//        registro.put("nota2", nota2);
//        registro.put("nota3", nota3);
//        registro.put("promedio", promedio);
//        db.insert("registro", null, registro);
//        db.close();
//        ArrayList array_list = admin.getAllRegistros();
//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(
//                this,android.R.layout.simple_list_item_1, array_list);
//        listaView.setAdapter(arrayAdapter);
//
//        et1.setText("");
//        et2.setText("");
//        et3.setText("");
//        et4.setText("");
//        et5.setText("");
//        et6.setText("");
//        Toast.makeText(this, "se cargaron los datos ",
//                Toast.LENGTH_SHORT).show();
//    }
//    //metodo consultar
//    public void consulta(View v) {
//        admin = new DbHelper(this, "instituto", null, 1);
//        db = admin.getWritableDatabase();
//        String codigo = et1.getText().toString();
//        fila = db.rawQuery("select curso,nota1,nota2,nota3,
//                promedio  from registro where codigo=" + codigo, null);
//
//        if (fila.moveToFirst()) {
//            et2.setText(fila.getString(0));
//            et3.setText(fila.getString(1));
//            et4.setText(fila.getString(2));
//            et5.setText(fila.getString(3));
//            et6.setText(fila.getString(4));
//        }
//        else
//            Toast.makeText(this, "no existe un registro con dicho codigo",
//                    Toast.LENGTH_SHORT).show();
//        db.close();}
//    //metodo eliminar
//    public void baja(View v) {
//        admin = new DbHelper(this, "instituto", null, 1);
//        db = admin.getWritableDatabase();
//        String codigo = et1.getText().toString();
//        int cant = db.delete("registro", "codigo=" + codigo, null);
//        db.close();
//        ArrayList array_list = admin.getAllRegistros();
//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(
//                this,android.R.layout.simple_list_item_1, array_list);
//        listaView.setAdapter(arrayAdapter);
//        et1.setText("");
//        et2.setText("");
//        et3.setText("");
//        et4.setText("");
//        et5.setText("");
//        et6.setText("");
//        if (cant == 1)
//            Toast.makeText(this, "se borró el registro con dicho documento",
//                    Toast.LENGTH_SHORT).show();
//        else
//            Toast.makeText(this, "no existe un registro con dicho documento",
//                    Toast.LENGTH_SHORT).show();
//    }
//    //metodo modificar
//    public void modificacion(View v) {
//        admin = new DbHelper(this, "instituto", null, 1);
//        db = admin.getWritableDatabase();
//        String codigo = et1.getText().toString();
//        String curso = et2.getText().toString();
//        String nota1 = et3.getText().toString();
//        String nota2 = et4.getText().toString();
//        String nota3 = et5.getText().toString();
////calculamos el promedio
//        int promedioope=0;
//        promedioope=Integer.parseInt(et3.getText().toString());
//        promedioope=promedioope+Integer.parseInt(et4.getText().toString());
//        promedioope=promedioope+Integer.parseInt(et5.getText().toString());
//        promedioope=promedioope/3;
////covertir a string
//        String promedio=String.valueOf(promedioope);
//        ContentValues registro = new ContentValues();
//        registro.put("codigo", codigo);
//        registro.put("curso", curso);
//        registro.put("nota1", nota1);
//        registro.put("nota2", nota2);
//        registro.put("nota3", nota3);
//        registro.put("promedio", promedio);
//        int cant = db.update("registro", registro, "codigo=" + codigo, null);
//        db.close();
//        ArrayList array_list = admin.getAllRegistros();
//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(
//                this,android.R.layout.simple_list_item_1, array_list);
//        listaView.setAdapter(arrayAdapter);
//        et1.setText("");
//        et2.setText("");
//        et3.setText("");
//        et4.setText("");
//        et5.setText("");
//        et6.setText("");
//        if (cant == 1)
//            Toast.makeText(this,"se modificaron los datos",Toast.LENGTH_SHORT)
//                    .show();
//        elseToast.makeText(this,"no existe un registro con dicho documento",
//                Toast.LENGTH_SHORT).show();
}
