package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GeekZone extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geek_zone);
        ListView lista=(ListView)findViewById(R.id.ListViewGeekZone);

        items.add(new Item(1, "Baticueva", "Dentro de la oscura y deprabada cueva de nuestro amigo Batman encontrarás todo lo relacionado con comics.", R.drawable.bat," ", R.drawable.bat," "));
        items.add(new Item(2, "Oasis Gamer", "En éste remanso de gamers podrás adquirir todo lo necesario para que tu experiencia durante el juego mejore.", R.drawable.gamer," ", R.drawable.gamer," "));
        items.add(new Item(3, "Aldea Escondida Del Otaku", "Si estás en busca de las esferas del dragon y necesitas provisiones para el camino... éste es el lugar para conseguir todo lo q necesita un otaku menos provisiones.", R.drawable.otaku," ", R.drawable.otaku," "));
        items.add(new Item(4, "Madriguera Del Niño Rata", "... Y como olvidarme del Niño Rata.", R.drawable.ninorata," ", R.drawable.ninorata," "));

        AdaptadorItem adaptador=new AdaptadorItem(GeekZone.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto;
                if(item.getId()==1){
                    producto=new Intent(GeekZone.this,Bat.class);
                } else if(item.getId()==2) {
                    producto=new Intent(GeekZone.this,Gamer.class);
                } else if (item.getId()==3){
                    producto=new Intent(GeekZone.this,Otaku.class);
                } else {
                    producto=new Intent(GeekZone.this,Rata.class);
                }
                producto.putExtra("videoUrl",item.getLinkVideo());
                producto.putExtra("imgp",item.getImagen());
                producto.putExtra("imgg",item.getImageng());
                producto.putExtra("titulo",item.getTitulo());
                producto.putExtra("decripcion",item.getDescripciong());
                startActivity(producto);
            }
        });

    }
}
