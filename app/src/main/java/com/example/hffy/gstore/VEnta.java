package com.example.hffy.gstore;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class VEnta extends AppCompatActivity {

    private ImageView imgCompra;
    private ImageView imgCompra2;
    private ImageView imgPago;
    private Button btnComprar;
    private Context context;
    private TextView lblTitulo;
    private TextView lblCantidad;
    private int imgp;
    private int precio;
    private String titulo;
    private Spinner spinner;
    private String[] opciones;
    private RadioGroup grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);

        spinner=(Spinner)findViewById(R.id.spinner);
        imgCompra=(ImageView)findViewById(R.id.imgCompra);
        imgCompra2=(ImageView)findViewById(R.id.imgCompra2);
        imgPago=(ImageView)findViewById(R.id.imgPago);
        lblTitulo=(TextView)findViewById(R.id.lblProducto);
        lblCantidad=(TextView)findViewById(R.id.lblCantidad);
        btnComprar=(Button)findViewById(R.id.btnComprar);
        grupo=(RadioGroup)findViewById(R.id.grupo);


        context=this;
        Intent intent = getIntent();
        imgp= intent.getIntExtra("imagen",0);
        titulo=intent.getStringExtra("titulo");
        precio= intent.getIntExtra("precio",0);

        imgCompra.setImageResource(imgp);
        lblTitulo.setText(titulo);
        lblCantidad.setText(String.valueOf(precio));

        opciones=new String[]{"1","2","3","4","5","6","7"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones);

        spinner.setAdapter(adaptador);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> array, View vista,
                                       int posicion, long id) {
                lblCantidad.setText(String.valueOf(precio));
            }

            public void onNothingSelected(AdapterView<?> array) {
            }
        });

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton seleccionado = (RadioButton) findViewById(checkedId);

            }
        });


        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder Dialogo = new AlertDialog.Builder(VEnta.this);

                Dialogo.setTitle("¿Comprar Producto?");
                Dialogo.setMessage("¿Estás serguro que deseas comprar este producto?\n"+
                "");


                Dialogo.setPositiveButton("Si",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),
                                        "Gracias Por Su Compra", Toast.LENGTH_LONG).show();
                                Intent a = new Intent(getApplicationContext(), MenuPrincipal.class);
                                startActivity(a);
                            }
                        });

                Dialogo.setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                Dialogo.show();
            }
        });
    }
}
