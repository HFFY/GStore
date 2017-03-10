package com.example.hffy.gstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Apple extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
        ListView lista=(ListView)findViewById(R.id.ListViewApple);

        items.add(new Item(1, "Iphone", "lo ultimo en smart phones de la linea iphone con sistema operativo IO's en su ultima version", R.drawable.appleiphone,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(2, "Imac", "Computadora de escritorio de la linea Apple bastante comoda y actual para el uso en casa o oficinas", R.drawable.appleimac,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(3, "MacBookpro", "Computadora portátil Apple dirigida especificamente a aquellos que desean un mejor rendimiento y capacidad de procesamiento", R.drawable.applemacbookpro,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(4, "MacBook", "Computadora portátil de uso mas casual aunque sin dejar de ser bastante util y moderna", R.drawable.applemabook,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(5, "IPadMini", "Computadora de estilo tableta de tamaño mediano con sistema operativo IO's de uso mas familiar o de trabajo", R.drawable.appleipad,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(6, "Iphone 7 Plus", "Celular de Apple de última generación bastante comodo y de multiples herramientas  ", R.drawable.appleiphone,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));

        AdaptadorItem adaptador=new AdaptadorItem(Apple.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                Item item=items.get(posicion);

                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());

                Intent video=new Intent(Apple.this,VideoPlayer.class);
                video.putExtra("videoUrl",item.getLinkVideo());
                startActivity(video);

            }
        });

    }
}