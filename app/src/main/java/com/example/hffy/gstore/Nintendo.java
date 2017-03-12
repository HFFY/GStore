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

public class Nintendo extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nintendo);
        ListView lista=(ListView)findViewById(R.id.ListViewNintendo);

        items.add(new Item(1, " ", " ", R.drawable.appleiphone," ", R.drawable.appleiphone," "));

        AdaptadorItem adaptador=new AdaptadorItem(Nintendo.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Nintendo.this,Producto.class);
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
