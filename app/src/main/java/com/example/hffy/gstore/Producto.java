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
    private String titulo;
    private String descripcion;

    private ImageView imgGrande;
    private ImageView imgPeque;
    private ImageView imgEstrella1;
    private ImageView imgEstrella2;
    private ImageView imgEstrella3;
    private ImageView imgEstrella4;
    private ImageView imgEstrella5;
    private TextView lblTitulo;
    private TextView lblDescripcion;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        getSupportActionBar().hide();
        context=this;

        //todos los intents para extraer las imagenes
        Intent intent = getIntent();
        url=intent.getStringExtra("videoUrl");
        imgp= intent.getIntExtra("imgp",0);
        imgg= intent.getIntExtra("imgg",0);
        titulo=intent.getStringExtra("titulo");
        descripcion=intent.getStringExtra("descripcion");

        imgGrande=(ImageView)findViewById(R.id.imgGrande);
        imgPeque=(ImageView)findViewById(R.id.imgPeque);
        imgEstrella1=(ImageView)findViewById(R.id.imgEstrella1);
        imgEstrella2=(ImageView)findViewById(R.id.imgEstrella2);
        imgEstrella3=(ImageView)findViewById(R.id.imgEstrella3);
        imgEstrella4=(ImageView)findViewById(R.id.imgEstrella4);
        imgEstrella5=(ImageView)findViewById(R.id.imgEstrella5);
        lblTitulo=(TextView)findViewById(R.id.lblTitulo);
        lblDescripcion=(TextView)findViewById(R.id.lblDescripcion);

        //Reemplazar imagenes y texto
        imgPeque.setImageResource(imgp);
        imgGrande.setImageResource(imgg);
        lblTitulo.setText(titulo);
        lblDescripcion.setText(descripcion);




        imgGrande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pru = new Intent(Producto.this,Youtube.class);
                pru.putExtra("videoUrl",url);
                startActivity(pru);
            }
        });
    }
}
