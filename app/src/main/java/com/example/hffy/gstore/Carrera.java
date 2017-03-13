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

public class Carrera extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrera);
        ListView lista=(ListView)findViewById(R.id.ListViewCarrera);

        items.add(new Item(1, "Crash Team Racing", "Crash Team Racing (abreviado a veces en forma de siglas, CTR) es un juego de carreras para la consola PlayStation de la serie de videojuegos Crash Bandicoot, desarrollado por la compañía Naughty Dog.", R.drawable.crashpeque,"LPAnYGGWaBw", R.drawable.crashgrande,"Crash Team Racing (abreviado a veces en forma de siglas, CTR) es un juego de carreras para la consola PlayStation de la serie de videojuegos Crash Bandicoot, desarrollado por la compañía Naughty Dog. Fue lanzado al mercado en el año 1999, posiblemente en respuesta al gran éxito de la serie Mario Kart de Nintendo. Fue el último juego de Crash Bandicoot creado por Naughty Dog. La dinámica del juego consiste en disputar carreras junto a una serie de contrincantes a los que se puede atacar mediante diversas armas (ver más adelante). El objetivo del juego es vencer al malvado enemigo Nitrous Oxide, el cual ha retado a los personajes en un juego de carreras. Si él gana se apoderará de la isla, y si no se retirará. La historia del juego gira en torno a un malvado extraterrestre llamado Nitrous Oxide, el cual ha viajado por toda la galaxia pregonándose a sí mismo como el corredor más rápido. Al llegar a la Tierra exige a nuestros personajes que se enfrenten entre sí para hallar a alguien que pueda desafiarlo. Finalmente añade que si un corredor gana, se irá del planeta para siempre, pero que si el gana se apoderará de la Tierra. Así todos se incorporan a una batalla contra Oxide y los clásicos rivales del juego tradicional pueden ser seleccionados."));
        items.add(new Item(2, "Re-Volt", "Re-Volt es un juego de carreras de radio de control de carreras de videojuegos lanzado por Acclaim Entertainment en 1999.", R.drawable.revoltpeque,"LTBQ3gjp6Ek", R.drawable.revoltgrande,"Re-Volt es un juego de carreras de radio de control de carreras de videojuegos lanzado por Acclaim Entertainment en 1999. Hizo apariciones en PlayStation, PC, Nintendo 64 y Dreamcast, con una secuela: RC Revenge para PlayStation y un puerto mejorado llamado RC Revenge Pro para PlayStation 2. La versión para PC del juego incluyó 28 coches de stock y 14 pistas, incluyendo un estadio de truco para roaming libre. Los coches vienen en tres variantes de combustible; Eléctrico, resplandor (combustión interna) y especial. La capacidad de conducción de los jugadores los colocará en varias categorías para que compitan con otros coches de capacidades similares. Estas capacidades se clasifican en categorías que son: Rookie, Amateur, Advanced, Semi-Pro y Pro. Las pistas también se clasifican en función de su dificultad para dominar y ganar. Estas categorías son: Fácil, Medio, Duro y Extremo. Los coches y las pistas se desbloquean a través del éxito en los modos de torneo del juego. Single Race permite que 2-4 jugadores en las versiones de la consola y 2-12 jugadores en la versión para PC compitan con las pistas normales de un solo jugador. Dentro de cada carrera, los competidores corren para ser los primeros en completar un número preestablecido de vueltas del circuito. Para ayudarles en esto hay una variedad de relámpagos en forma de pick-ups que mienten alrededor de la pista. La recolección de uno de estos proporciona al jugador un arma al azar que varía de manchas de aceite a los fuegos artificiales y las baterías que aumentan su velocidad por un período corto de tiempo. Cuanto peor un jugador está haciendo en la carrera, más probable es que una de las mejores armas se obtendrá, y viceversa."));

        AdaptadorItem adaptador=new AdaptadorItem(Carrera.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Carrera.this,Producto.class);
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
