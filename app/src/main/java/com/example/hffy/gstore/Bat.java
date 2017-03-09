package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class Bat extends AppCompatActivity {

    private String url;
    private ImageView imgprueba;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.producto);
        getSupportActionBar().hide();
        context=this;
        imgprueba=(ImageView)findViewById(R.id.imgPruebap);
        Intent intent = getIntent();
        url=intent.getStringExtra("videoUrl");


        imgprueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pru = new Intent(Bat.this,Youtube.class);
                pru.putExtra("videoUrl",url);
                startActivity(pru);
            }
        });

    }

}
