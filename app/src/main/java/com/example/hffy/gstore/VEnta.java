package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
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

public class VEnta extends AppCompatActivity {

    private ImageView imgCompra;
    private ImageView imgCompra2;
    private ImageView imgPago;
    private Button btnComprar;
    private Context context;
    private TextView lblTitulo;
    private TextView lblCantidad;
    private int imgp;
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

        imgCompra.setImageResource(imgp);
        lblTitulo.setText(titulo);

        opciones=new String[]{"1","2","3","4","5","6","7"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, opciones);

        spinner.setAdapter(adaptador);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> array, View vista,
                                       int posicion, long id) {
                //Log.e("Cantidad Seleccionada", (String) array.getItemAtPosition(posicion));
                //TODO: que multiplique el precio por la cantidad seleccionada
            }

            public void onNothingSelected(AdapterView<?> array) {
            }
        });

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton seleccionado = (RadioButton) findViewById(checkedId);
                //TODO: q cambie la imagen de batman de acuerdo al metodo de pago
            }
        });


        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),MenuPrincipal.class);
                //TODO: mostrar mensaje de felicidades por la compra :v
                startActivity(a);
            }
        });
    }
}
