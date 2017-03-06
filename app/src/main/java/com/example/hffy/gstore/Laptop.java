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

        items.add(new Item(1, "Icono", "Esta es la descripcion del icono", R.drawable.bat,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(2, "Play", "Esta es la descripcion de Play", android.R.drawable.ic_media_play,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(3, "Galeria", "Esta es la descripcion de Galeria", android.R.drawable.ic_menu_gallery,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));
        items.add(new Item(4, "Nuevo", "Esta es la descripcion de Nuevo", android.R.drawable.ic_menu_more,"http://clips.vorwaerts-gmbh.de/VfE_html5.mp4"));

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
