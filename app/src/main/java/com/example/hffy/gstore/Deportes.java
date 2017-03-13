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

public class Deportes extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);
        ListView lista=(ListView)findViewById(R.id.ListViewDeportes);

        items.add(new Item(1, "Fifa 17", "FIFA 17 es un videojuego de fútbol desarrollado por EA Canada y publicado por EA Sports ", R.drawable.fifapeque,"7QQpmwmKh4w", R.drawable.fifagrande,"FIFA 17 es un videojuego de fútbol desarrollado por EA Canada y publicado por EA Sports. Es el 24.º de la serie y salió a la venta el 28 de septiembre del 2016 en Norteamérica y el 29 de septiembre para el resto del mundo. Este será el primer juego de la FIFA en la serie en emplear el motor de juego Frostbite. Además, este será el primer videojuego de la serie que tendrá la aparición e interacción de entrenadores de fútbol.También la incorporación del modo historia con Alex Hunter. El 21 de julio de 2016, Marco Reus fue elegido para ser la imagen de la portada oficial del videojuego"));
        items.add(new Item(2, "Madden NFL 07 ", "Madden NFL 07 es un videojuego de fútbol americano basado en la NFL que fue publicado por EA Sports y desarrollado por EA Tiburon", R.drawable.maddenpeque,"IXaMhAP5jPs", R.drawable.maddengrande,"Madden NFL 07 es un videojuego de fútbol americano basado en la NFL que fue publicado por EA Sports y desarrollado por EA Tiburon. Es el primero de la serie de videojuegos que será lanzado para las consolas PlayStation 3 y Wii y el último en ser lanzado en el Game Boy Advance. Ex Seattle Seahawks corriendo Shaun Alexander está en la portada. Este es el último juego para presentar NFL Europa en la serie."));
        items.add(new Item(3, "NBA Live 08", "NBA Live 08 es la entrega en 2007 de la serie NBA Live de EA Sports.", R.drawable.nbapeque,"-FJt-iaNnFk", R.drawable.nbagrande,"NBA Live 08 es la entrega en 2007 de la serie NBA Live de EA Sports. Fue lanzado para Xbox 360, PlayStation 3, Wii, PlayStation 2, Windows y PlayStation Portable. Este es el primer videojuego de la NBA que incluye las tres consolas de próxima generación. Fue el último juego en vivo de NBA para la plataforma Windows"));
        items.add(new Item(4, "The Golf Club", "The Golf Club es un juego de simulación de golf desarrollado por HB Studios para PlayStation 4, Microsoft Windows y Xbox One en el motor de juego Unity.", R.drawable.golfpeque,"4_ojuE7ykaU", R.drawable.golfgrande,"The Golf Club es un juego de simulación de golf desarrollado por HB Studios para PlayStation 4, Microsoft Windows y Xbox One en el motor de juego Unity. Es un simulador de golf que apunta a las características sociales de la próxima generación de consolas y cuenta con un poderoso creador de cursos basado en la generación de cursos. El creador del curso puede generar un nuevo curso en segundos que se puede compartir y jugar de inmediato en línea con amigos y otros jugadores a través de PlayStation 4, Xbox One y PC. También hay capacidades de edición completa para cursos, torneos y tours."));
        items.add(new Item(5, "Tony Hawk's Pro Skater 3", "Tony Hawk's Pro Skater 3 (comúnmente abreviado como THPS3) es un videojuego de skateboarding que corresponde a la tercera entrega en la serie de Tony Hawk's.", R.drawable.hawkpeque,"ejBtds4duzU", R.drawable.hawkgrande,"Tony Hawk's Pro Skater 3 (comúnmente abreviado como THPS3) es un videojuego de skateboarding que corresponde a la tercera entrega en la serie de Tony Hawk's. Fue desarrollado por Neversoft y publicado por Activision en 2001 para Nintendo GameCube, Game Boy Color, PlayStation 2, y PlayStation. En 2002, fue publicado para Nintendo 64, Xbox, Microsoft Windows y Game Boy Advance. Fue el primer juego lanzado para PlayStation 2 que soportó juego en línea, y el último juego lanzado para Nintendo 64 en los Estados Unidos. Este juego introdujo el revert, un truco que permitió combinar un vert con un manual, apretando un botón al aterrizar en un quarterpipe. Esto permitió combos mucho más largos que en los dos juegos anteriores, donde el aterrizaje en un quarterpipe acabaría un combo. También se agregaron combos ocultos, que eran variaciones en los trucos estándares que se podían realizar, como grab, flip, lip, o grind. Por ejemplo, apretando dos veces el botón de kickflip, se lograba un doble kickflip. Este sistema sería refinado más adelante en Tony Hawk's Pro Skater 4. El juego se destacó también por tener publicidad bajo la forma de carteleras; los juegos anteriores en la serie también ofrecían publicidad, pero ésta fue la primera vez que aparecieron marcas que no tienen que ver con el skateboarding, como McDonald's, Nokia y Jeep."));
        items.add(new Item(6, "Virtua Tennis 4", "Virtua Tennis 4 (Sega Professional Tennis: Power Smash 4 en Japón) es la cuarta secuela (quinto juego) de la franquicia de videojuegos de tenis de Sega, Virtua Tennis.", R.drawable.tenispeque,"KHXHNbbAFWk", R.drawable.tenisgrande,"Virtua Tennis 4 (Sega Professional Tennis: Power Smash 4 en Japón) es la cuarta secuela (quinto juego) de la franquicia de videojuegos de tenis de Sega, Virtua Tennis. Inicialmente anunciado como un juego exclusivo de PlayStation 3, a fin de tomar ventaja del controlador PlayStation Move, el juego también será lanzado para Xbox360 (tomando ventaja de Kinect), Wii (con soporte Wii Motion Plus), Microsoft Windows y PlayStation Vita (como juego de lanzamiento), este último bajo el título Virtua Tennis 4: World Tour Edition. Virtua Tennis 4 es el primer juego numerado de la serie sin un lanzamiento arcade."));

        AdaptadorItem adaptador=new AdaptadorItem(Deportes.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Deportes.this,Producto.class);
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
