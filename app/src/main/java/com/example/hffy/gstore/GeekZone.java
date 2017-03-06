package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class GeekZone extends AppCompatActivity {

    private Context context;
    private ImageView imgBat;
    private ImageView imgGamer;
    private ImageView imgOtaku;
    private ImageView imgRata;
    private TextView lblBat;
    private TextView lblGamer;
    private TextView lblOtaku;
    private TextView lblRata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geek_zone);

        context=this;
        imgBat=(ImageView)findViewById(R.id.imgBat);
        imgGamer=(ImageView)findViewById(R.id.imgGamer);
        imgOtaku=(ImageView)findViewById(R.id.imgOtaku);
        imgRata=(ImageView)findViewById(R.id.imgRata);
        lblBat=(TextView)findViewById(R.id.lblBat);
        lblGamer=(TextView)findViewById(R.id.lblGamer);
        lblOtaku=(TextView)findViewById(R.id.lblOtaku);
        lblRata=(TextView)findViewById(R.id.lblRata);

        imgBat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bat= new Intent(context,Bat.class);
                startActivity(bat);

            }
        });
        imgGamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gamer= new Intent(context,Gamer.class);
                startActivity(gamer);

            }
        });
        imgOtaku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otaku= new Intent(context,Otaku.class);
                startActivity(otaku);

            }
        });
        imgRata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rata= new Intent(context,Rata.class);
                startActivity(rata);

            }
        });


    }
}
