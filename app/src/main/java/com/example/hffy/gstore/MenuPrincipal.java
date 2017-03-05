package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuPrincipal extends AppCompatActivity {

    private Context context;
    private ImageView imgLaptop;
    private ImageView imgAndroid;
    private ImageView imgCelular;
    private ImageView imgWatch;
    private ImageView imgApple;
    private ImageView imgSamsung;
    private ImageView imgHuawei;
    private ImageView imgOferta;
    private ImageView imgComic;
    private ImageView imgManga;
    private ImageView imgPc;
    private ImageView imgXbox;
    private ImageView imgNintendo;
    private ImageView imgPs;
    private ImageView imgAlien;
    private ImageView imgCombat;
    private ImageView imgRpg;
    private ImageView imgShooter;
    private ImageView imgCarrera;
    private ImageView imgFight;
    private ImageView imgArcade;
    private ImageView imgTerror;
    private ImageView imgDeportes;
    private ImageView imgGeekzone;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        context=this;
        imgLaptop=(ImageView)findViewById(R.id.imgLaptop);
        imgAndroid=(ImageView)findViewById(R.id.imgAndroid);
        imgCelular=(ImageView)findViewById(R.id.imgCelular);
        imgWatch=(ImageView)findViewById(R.id.imgWatch);
        imgApple=(ImageView)findViewById(R.id.imgApple);
        imgSamsung=(ImageView)findViewById(R.id.imgSamsung);
        imgHuawei=(ImageView)findViewById(R.id.imgHuawei);
        imgOferta=(ImageView)findViewById(R.id.imgOfertas);
        imgComic=(ImageView)findViewById(R.id.imgComic);
        imgManga=(ImageView)findViewById(R.id.imgManga);
        imgPc=(ImageView)findViewById(R.id.imgPc);
        imgXbox=(ImageView)findViewById(R.id.imgXbox);
        imgNintendo=(ImageView)findViewById(R.id.imgNintendo);
        imgAlien=(ImageView)findViewById(R.id.imgAlien);
        imgPs=(ImageView)findViewById(R.id.imgPs);
        imgCombat=(ImageView)findViewById(R.id.imgCombate);
        imgRpg=(ImageView)findViewById(R.id.imgRpg);
        imgShooter=(ImageView)findViewById(R.id.imgShooter);
        imgCarrera=(ImageView)findViewById(R.id.imgCarrera);
        imgFight=(ImageView)findViewById(R.id.imgFight);
        imgArcade=(ImageView)findViewById(R.id.imgArcade);
        imgTerror=(ImageView)findViewById(R.id.imgTerror);
        imgDeportes=(ImageView)findViewById(R.id.imgDeportes);
        imgGeekzone=(ImageView)findViewById(R.id.imgGeekzone);

        imgLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent laptop= new Intent(context,Laptop.class);
                startActivity(laptop);

            }
        });
        imgAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgCelular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgHuawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgOferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgComic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgManga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgXbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgNintendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgPs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgAlien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgCombat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgRpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgShooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgCarrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgArcade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgTerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgGeekzone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent geekZone= new Intent(context, GeekZone.class);
                startActivity(geekZone);
            }
        });



    }
}
