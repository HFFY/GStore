package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);

        imgCompra=(ImageView)findViewById(R.id.imgCompra);
        imgCompra2=(ImageView)findViewById(R.id.imgCompra2);
        imgPago=(ImageView)findViewById(R.id.imgPago);
        lblTitulo=(TextView)findViewById(R.id.lblProducto);
        lblCantidad=(TextView)findViewById(R.id.lblCantidad);
        btnComprar=(Button)findViewById(R.id.btnComprar);


        context=this;
        Intent intent = getIntent();
        imgp= intent.getIntExtra("imagen",0);
        titulo=intent.getStringExtra("titulo");

        imgCompra.setImageResource(imgp);
        lblTitulo.setText(titulo);


        btnComprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(getApplicationContext(),MenuPrincipal.class);
                startActivity(a);
            }
        });
    }
}
