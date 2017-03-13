package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

    private TextView titulo;
    private TextView cerrar;



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
        //imgSamsung=(ImageView)findViewById(R.id.imgSamsung);
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

        titulo=(TextView)findViewById(R.id.Titulo);
        cerrar=(TextView) findViewById(R.id.lblSalir);

        SharedPreferences prefs =
                getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        //Se busca los datos almacenados. SI no hay el resultado será no.
        String usuario_almacenado = prefs.getString("txtUsuario","no");

        titulo.setText("Bienvenido: "+usuario_almacenado);

        cerrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Cerrando sesión.", Toast.LENGTH_SHORT).show();

                SharedPreferences prefs =
                        getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

                SharedPreferences.Editor editor = prefs.edit();
                editor.clear();
                editor.commit();
                Intent a = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(a);
            }
        });

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
                Intent android= new Intent(context,Android.class);
                startActivity(android);

            }
        });
        imgCelular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent celular= new Intent(context,Celular.class);
                startActivity(celular);

            }
        });
        imgWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatch= new Intent(context,Whatch.class);
                startActivity(whatch);

            }
        });
        imgApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apple= new Intent(context,Apple.class);
                startActivity(apple);

            }
        });
        /*
        imgSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent samsung= new Intent(context,Samsung.class);
                startActivity(samsung);

            }
        });
        */
        imgHuawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent huawei= new Intent(context,Huawei.class);
                startActivity(huawei);

            }
        });
        imgOferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oferta= new Intent(context,Oferta.class);
                startActivity(oferta);

            }
        });
        imgComic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comic= new Intent(context,Comic.class);
                startActivity(comic);

            }
        });
        imgManga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manga= new Intent(context,Manga.class);
                startActivity(manga);

            }
        });
        imgPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pc= new Intent(context,Pc.class);
                startActivity(pc);

            }
        });
        imgXbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent xbox= new Intent(context,Xbox.class);
                startActivity(xbox);

            }
        });
        imgNintendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nintendo= new Intent(context,Nintendo.class);
                startActivity(nintendo);

            }
        });
        imgPs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ps= new Intent(context,Ps.class);
                startActivity(ps);

            }
        });
        imgAlien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alien= new Intent(context,Alien.class);
                startActivity(alien);

            }
        });
        imgCombat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent combat= new Intent(context,Combat.class);
                startActivity(combat);

            }
        });
        imgRpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rpg= new Intent(context,Rpg.class);
                startActivity(rpg);

            }
        });
        imgShooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shooter= new Intent(context,Shooter.class);
                startActivity(shooter);

            }
        });
        imgCarrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camera= new Intent(context,Carrera.class);
                startActivity(camera);

            }
        });
        imgFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fight= new Intent(context,Fight.class);
                startActivity(fight);

            }
        });
        imgArcade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arcade= new Intent(context,Arcade.class);
                startActivity(arcade);

            }
        });
        imgTerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent terror= new Intent(context,Terror.class);
                startActivity(terror);

            }
        });
        imgDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deportes = new Intent(context,Deportes.class);
                startActivity(deportes);

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
