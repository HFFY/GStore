package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;

import java.util.ArrayList;

public class Fight extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        ListView lista=(ListView)findViewById(R.id.ListViewFight);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderFight);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.honorgrande);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.mortalgrande);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.narutogrande);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.streetgrande);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.smashgrande);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.tekkengrande);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 123,"For Honor", "El mundo de For Honor es duro, pero repleto de hermosas zonas vírgenes, lugares emblemáticos y majestuosas ruinas.", R.drawable.honorpeque,"y1HkuGUaNBY", R.drawable.honorgrande,"El mundo de For Honor es duro, pero repleto de hermosas zonas vírgenes, lugares emblemáticos y majestuosas ruinas. Sus habitantes subsisten como pueden, ya que viven en un estado de guerra casi perpetuo. Hace mil años, un cataclismo estuvo a punto de destruir todas las civilizaciones. Se hundieron patrias, ardieron imperios y naciones enteras marcharon al exilio. Pero los caballeros, los vikingos y los samuráis resurgieron de las cenizas de esta catástrofe. Se esforzaron por reconstruir sus naciones, y trataron de recuperar la gloria de sus ancestros. Forja un camino de destrucción en campos de batalla intensos y exhuberantes en For Honor, un nuevo y revolucionario juego de acción desarrollado por Ubisoft Montreal en colaboración con otros estudios de Ubisoft. For Honor saldrá a la venta el 14 de febrero de 2017 para el sistema PlayStation®4, Xbox One y PC. Atraviesa la niebla de la batalla y únete a valientes caballeros, brutales vikingos y mortíferos samuráis mientras combaten en increíbles y fascinantes mapas que te pondrán a prueba. Domina armas medievales y participa en un combate cuerpo a cuerpo rápido y brutal en una absorbente campaña con historia y en novedosos modos multijugador. El innovador sistema de control de For Honor, «The Art of Battle», te permite controlar por completo a tus héroes, que disponen de habilidades y armas exclusivas cuerpo a cuerpo. El combate, diseñado para ofrecer una sensación de duelo real sin sacrificar la accesibilidad y la simplicidad, se ha creado capturando el movimiento real de maestros de las artes marciales y dobles profesionales para dar vida a la acción como nunca antes."));
        items.add(new Item(2, 123,"Mortal Kombat X", "Mortal Kombat X (abreviado MKX) es un videojuego de pelea creado por Ed Boon, desarrollado por NetherRealm Studios y publicado por Warner Bros.", R.drawable.mortalpeque,"jSi2LDkyKmI", R.drawable.mortalgrande,"Mortal Kombat X (abreviado MKX) es un videojuego de pelea creado por Ed Boon, desarrollado por NetherRealm Studios y publicado por Warner Bros. Interactive Entertainment, fue anunciado en junio de 2014, mediante un vídeo que mostraba a Sub-Zero y Scorpion peleando entre sí. Está disponible para PlayStation 4, Xbox One y PC desde el 14 de abril de 2015; para iOS desde el 7 de abril de 2015 y para el Android desde el 21 de abril de 2015. El eslogan oficial es: \"Who's next?\" (lit. ¿Quién sigue?). Es el décimo videojuego de la serie, sin contar expansiones, crossovers y juegos de aventura. El juego también se encontraba en desarrollo para las consolas Xbox 360 y PlayStation 3, pero su desarrollo fue eventualmente cancelado por Netherrealm."));
        items.add(new Item(3, 123,"Naruto Shippūden Ultimate Ninja Storm 4", "Naruto Shippuden: Ultimate Ninja Storm 4 es el sexto y último videojuego de la serie Ultimate Ninja Storm que fue desarrollado por CyberConnect2 para las consolas de nueva generación PlayStation 4, Xbox One y para PC.", R.drawable.narutopeque,"T2mqnUrQCzA", R.drawable.narutogrande,"Naruto Shippuden: Ultimate Ninja Storm 4 es el sexto y último videojuego de la serie Ultimate Ninja Storm que fue desarrollado por CyberConnect2 para las consolas de nueva generación PlayStation 4, Xbox One y para PC. El juego tiene una demo para PlayStation 4 y Xbox One que esta para todo el mundo. También se sabe acerca de los nuevos eventos de tiempo limitado online y un modo aventura.\n" +
                "Ultimate Ninja Storm 4 cuenta con un modo de juego similar al de los juegos anteriores de la serie, en el que los jugadores luchan entre sí en arenas 3D. Una característica de regreso que fue omissed desde la tormenta de Ninja Ultimate original es la capacidad de Wall Run. Los jugadores podrán tomar dinámicamente a la batalla a los lados de las arenas, y la batalla en las paredes de cada etapa. Un cambio importante en la característica es la capacidad de tener un carácter en la pared, mientras que el otro permanece en el campo. Originalmente el segundo jugador fue movido automáticamente a la pared, para mantener la batalla fluyendo y el sistema bajo control. La opción de seleccionar uno de los tres diferentes tipos de lucha ha sido eliminado, que fue introducido en Naruto Shippuden: Ultimate Ninja Storm Revolution, restaurando el sistema anterior de Ultimate Jutsu y Awakenings visto en el resto de la serie. Otra nueva característica es la capacidad de intercambiar personajes durante la batalla, similar a juegos como Marvel vs. Capcom 3. Los despertares y jutsus últimos de los juegos anteriores también regresan, y ahora se pueden compartir entre los personajes conmutables, lo que significa que los jugadores pueden acumular su medidor con Un carácter, cambiar al otro y utilizar dichas habilidades con el otro personaje. Sin embargo, los personajes ahora comparten la misma barra de vida. También es nuevo en la franquicia la capacidad de romper armas y armaduras, tanto en la batalla libre como en las batallas de los jefes. Para apoyar esto, han añadido la capacidad de crear daño elemental; Por ejemplo, el fuego puede quemar la ropa. Sin embargo, los jugadores pueden deshacerse del fuego moviéndose rápidamente por toda la zona o recibiendo ataques con agua."));
        items.add(new Item(4, 123,"Street Fighter V", "Street Fighter V es un juego de peleas publicado por Capcom, quien co-desarrollo el juego con Dimps.", R.drawable.streetpeque,"fJAuNd7cuu4", R.drawable.streetgrande,"Street Fighter V es un juego de peleas publicado por Capcom, quien co-desarrollo el juego con Dimps. Es el quinto título de la serie principal de juegos de Street Fighter. El juego fue lanzado en febrero de 2016 para PlayStation 4 y Microsoft Windows, con un lanzamiento posterior en Linux, y tendrá la posibilidad de funcionar como juego multiplataforma entre las versiones de Windows y PlayStation 4. Similar a las anteriores entregas de la serie, Street Fighter posee un sistema de pelea de desplazamiento lateral. El juego también introduce el \"V-Gauge\", el cual se incrementa a medida que el personaje reciba daño de su enemigo y le adhiere 3 nuevas habilidades. El juego contiene 16 personajes jugables en su lanzamiento, siendo 4 de ellos completamente nuevos en la serie. Un modo historia y personajes adicionales serán añadidos en el futuro a través de actualizaciones y contenido descargable. Teniendo como dato a destacar la completa ausencia de Akuma en esta entrega después de ininterrumpidas presencias desde la salida de Super Street Fighter II Turbo. Según Capcom, el juego iba a ser una exclusiva de la consola PlayStation 4 ya que tanto Sony como Capcom tenían \"la misma visión para el crecimiento del potencial en el espacio de los juegos de peleas\". El juego posee el motor Unreal Engine 4 y tuvo una beta de prueba antes del lanzamiento. Además se transmitió una mini-serie web llamada Street Fighter: Resurrection que servia de prólogo para los hechos que acontecían en el juego, esto fue hecho para los fans de la franquicia mientras se aguardaba el lanzamiento de la quinta entrega de la saga."));
        items.add(new Item(5, 123,"Super Smash Bros. Brawl", "Super Smash Bros. Brawl, acortado comúnmente como SSBB o Brawl, es el tercer juego de la serie Super Smash Bros., siendo lanzado para la consola Nintendo Wii.", R.drawable.smashpeque,"JV5nH1kToa8", R.drawable.smashgrande,"Super Smash Bros. Brawl, acortado comúnmente como SSBB o Brawl, es el tercer juego de la serie Super Smash Bros., siendo lanzado para la consola Nintendo Wii. Fue publicado por Nintendo y diseñado por Masahiro Sakurai, creador de las anteriores entregas, desarrollado también por diferentes equipos como Sora, Game Arts y otros desarrolladores a partir de Octubre de 2005. El objetivo de una batalla en Brawl es, al igual que anteriores entregas, noquear al oponente sacándolo fuera de la pantalla mientras desaparece en una explosión. El sistema de juego se ha mantenido, aunque se ha simplificado un poco y dando la opción al jugador de elegir entre cuatro diferentes mandos: Wiimote solo de forma horizontal, Wiimote con Nunchuck, Control Clásico o Control Nintendo GameCube. Hasta cuatro jugadores pueden jugar de forma simultánea local, además de poder jugarse en línea con otros jugadores mediante la conexión Wi-Fi de Nintendo, siendo el primer juego de la serie que tiene esta opción."));
        items.add(new Item(6, 123,"Tekken Tag Tournament 2", "Tekken Tag Tournament 2 es un videojuego de lucha de la saga Tekken, ya lanzada en arcades y para consolas.", R.drawable.tekkenpeque,"hkzZm1U9Q48", R.drawable.tekkengrande,"Tekken Tag Tournament 2 es un videojuego de lucha de la saga Tekken, ya lanzada en arcades y para consolas. Es la esperada secuela del primer Tekken Tag Tournament, lanzado originalmente en 1999. Tekken Tag Tournament 2 fue anunciado en el Tokyo Game Show de 2010 y fue lanzada en verano de 2011 en su versión arcade en Japón. Más tarde, en marzo de 2012 salió en arcades una actualización del juego renombrado como Tekken Unlimited. En septiembre de 2012 fue lanzada para las consolas PlayStation 3 y Xbox 360 y en noviembre del mismo año fue lanzado para la consola Wii U."));

        AdaptadorItem adaptador=new AdaptadorItem(Fight.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Fight.this,Producto.class);
                producto.putExtra("videoUrl",item.getLinkVideo());
                producto.putExtra("imgp",item.getImagen());
                producto.putExtra("imgg",item.getImageng());
                producto.putExtra("titulo",item.getTitulo());
                producto.putExtra("decripcion",item.getDescripciong());
                producto.putExtra("precio", item.getPrecio());
                startActivity(producto);
            }
        });
    }
}
