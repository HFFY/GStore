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

public class Comic extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic);
        ListView lista=(ListView)findViewById(R.id.ListViewComic);

        items.add(new Item(1, "Deadpool", "Deadpool entra en una reflexión sobre su vida de mercenario...", R.drawable.deadpoolpeque,"z-jAiWgZbcg", R.drawable.deadgrande,"Deadpool entra en una reflexión sobre su vida de mercenario y empieza a pensar de forma distinta y como usará sus poderes"));
        items.add(new Item(2, "StarWars", "La Saga de Star Wars en la vida real, ampliamente ilustrada y completamente actualizada.", R.drawable.starwars,"YWNvdoRnNv8", R.drawable.starwars1,"La Saga de Star Wars en la vida real, ampliamente ilustrada y completamente actualizada."));
        items.add(new Item(3, "Doompatrol", " Robot futurista creado para mantener el orden de la humanidad", R.drawable.doompatrol,"dP3jwjnvf4A", R.drawable.doompatrol1," Robot futurista creado para mantener el orden de la humanidad"));
        items.add(new Item(4, "Falsh", "El hombre mas rápido en el planeta", R.drawable.flash,"-FHexSN5n-I", R.drawable.flash1,"El hombre mas rápido en el planeta enfocado en ayudar y salvar vidas utilizando su velocidad de muchas formas."));
        items.add(new Item(5, "Batman", " Historias peculiares de batman contra enemigos no muy conocidos pero que son un problema para gotham ", R.drawable.batman,"PfEXKi83glA", R.drawable.batman1,"Historias peculiares de batman contra enemigos no muy conocidos pero que son un problema para gotham "));
        //items.add(new Item(6, "Guardianes de la galaxia", "los guardianes de la galaxia se reúnen para derrotar a un enemigo que secuestro a groot llamado el leviathan ", R.drawable.guar," ", R.drawable.appleiphone,"los guardianes de la galaxia se reúnen para derrotar a un enemigo que secuestro a groot llamado el leviathan "));

        AdaptadorItem adaptador=new AdaptadorItem(Comic.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Comic.this,Producto.class);
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
