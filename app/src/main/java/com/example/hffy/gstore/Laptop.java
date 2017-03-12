package com.example.hffy.gstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Laptop extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        ListView lista=(ListView)findViewById(R.id.listViewLaptop);

        items.add(new Item(1, "Chromebook", "Laptop relativamente pequeña recomendada para un uso diario sin mucha exigencia ", R.drawable.lapchromebook,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(2, "Omen", "Latop dedicada para gamers,con un alto rendimiento en videojuegos", R.drawable.lapomen,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(3, "Pavilion", "laptop de buen rendimiento que responde de manera eficiente a varias tareas", R.drawable.lappavilion,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(4, "Spectre", "Lo ultimo en calidad y procesamiento, laptop de ultima tecnología", R.drawable.lapsectre,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(5, "Spectre360", "A diferenia de la spectre normal, esta brinda mas comodidad al poder rotar en 360", R.drawable.lapspectre360,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(6, "Envy", "Laptop de media calidad recomendable para el uso casual ", R.drawable.laptopenvy,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));

        AdaptadorItem adaptador=new AdaptadorItem(Laptop.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                Item item=items.get(posicion);

                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());

                Intent video=new Intent(Laptop.this,VideoPlayer.class);
                video.putExtra("videoUrl",item.getLinkVideo());
                startActivity(video);
            }
        });

    }
}
