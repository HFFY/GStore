package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Producto extends AppCompatActivity {

    private String url;
    private int imgp;
    private int imgg;
    private int precio;
    private int estrellas;
    private String titulo;
    private String descripcion;

    private ImageView imgGrande;
    private ImageView imgPeque;
    private ImageView imgComunidad;
    private ImageView imgComprar;
    private ImageView imgEstrella1;
    private ImageView imgEstrella2;
    private ImageView imgEstrella3;
    private ImageView imgEstrella4;
    private ImageView imgEstrella5;
    private ImageView imgCarrito;
    private TextView lblTitulo;
    private TextView lblDescripcion;
    private TextView lblPrecio;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        getSupportActionBar().hide();
        context=this;

        //todos los intents para extraer las cosas :v
        Intent intent = getIntent();
        url=intent.getStringExtra("videoUrl");
        precio=intent.getIntExtra("precio",0);
        imgp= intent.getIntExtra("imgp",0);
        imgg= intent.getIntExtra("imgg",0);
        titulo=intent.getStringExtra("titulo");
        descripcion=intent.getStringExtra("decripcion");

        imgGrande=(ImageView)findViewById(R.id.imgGrande);
        imgPeque=(ImageView)findViewById(R.id.imgPeque);
        imgEstrella1=(ImageView)findViewById(R.id.imgEstrella1);
        imgEstrella2=(ImageView)findViewById(R.id.imgEstrella2);
        imgEstrella3=(ImageView)findViewById(R.id.imgEstrella3);
        imgEstrella4=(ImageView)findViewById(R.id.imgEstrella4);
        imgEstrella5=(ImageView)findViewById(R.id.imgEstrella5);
        imgCarrito=(ImageView)findViewById(R.id.imgCarrito);
        lblTitulo=(TextView)findViewById(R.id.lblTitulo);
        lblDescripcion=(TextView)findViewById(R.id.lblDescripcion);

        //Reemplazar imagenes y texto
        imgPeque.setImageResource(imgp);
        imgGrande.setImageResource(imgg);
        lblTitulo.setText(titulo);
        lblDescripcion.setText(descripcion);
        estrellas=(int)(Math.random()*5)+1;
        if(estrellas==1){
            imgEstrella1.setImageResource(R.drawable.estrella);
        } else if(estrellas==2){
            imgEstrella1.setImageResource(R.drawable.estrella);
            imgEstrella2.setImageResource(R.drawable.estrella);
        }else if(estrellas==3){
            imgEstrella1.setImageResource(R.drawable.estrella);
            imgEstrella2.setImageResource(R.drawable.estrella);
            imgEstrella3.setImageResource(R.drawable.estrella);
        }else if(estrellas==4){
            imgEstrella1.setImageResource(R.drawable.estrella);
            imgEstrella2.setImageResource(R.drawable.estrella);
            imgEstrella3.setImageResource(R.drawable.estrella);
            imgEstrella4.setImageResource(R.drawable.estrella);
        }else {
            imgEstrella1.setImageResource(R.drawable.estrella);
            imgEstrella2.setImageResource(R.drawable.estrella);
            imgEstrella3.setImageResource(R.drawable.estrella);
            imgEstrella4.setImageResource(R.drawable.estrella);
            imgEstrella5.setImageResource(R.drawable.estrella);
        }






        imgGrande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pru = new Intent(Producto.this,Youtube.class);
                pru.putExtra("videoUrl",url);
                startActivity(pru);
            }
        });
        imgCarrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pru = new Intent(Producto.this,VEnta.class);
                pru.putExtra("imagen",imgp);
                pru.putExtra("precio",precio);
                pru.putExtra("titulo",titulo);
                startActivity(pru);
            }
        });





    }
}
