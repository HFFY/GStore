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

public class Carrera extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrera);
        ListView lista=(ListView)findViewById(R.id.ListViewCarrera);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderCarrera);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.revoltgrande);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.crashgrande);
        sliderLayout.addSlider(slider1);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 123,"Crash Team Racing", "Crash Team Racing (abreviado a veces en forma de siglas, CTR) es un juego de carreras para la consola PlayStation de la serie de videojuegos Crash Bandicoot, desarrollado por la compañía Naughty Dog.", R.drawable.crashpeque,"LPAnYGGWaBw", R.drawable.crashgrande,"Crash Team Racing (abreviado a veces en forma de siglas, CTR) es un juego de carreras para la consola PlayStation de la serie de videojuegos Crash Bandicoot, desarrollado por la compañía Naughty Dog. Fue lanzado al mercado en el año 1999, posiblemente en respuesta al gran éxito de la serie Mario Kart de Nintendo. Fue el último juego de Crash Bandicoot creado por Naughty Dog. La dinámica del juego consiste en disputar carreras junto a una serie de contrincantes a los que se puede atacar mediante diversas armas (ver más adelante). El objetivo del juego es vencer al malvado enemigo Nitrous Oxide, el cual ha retado a los personajes en un juego de carreras. Si él gana se apoderará de la isla, y si no se retirará. La historia del juego gira en torno a un malvado extraterrestre llamado Nitrous Oxide, el cual ha viajado por toda la galaxia pregonándose a sí mismo como el corredor más rápido. Al llegar a la Tierra exige a nuestros personajes que se enfrenten entre sí para hallar a alguien que pueda desafiarlo. Finalmente añade que si un corredor gana, se irá del planeta para siempre, pero que si el gana se apoderará de la Tierra. Así todos se incorporan a una batalla contra Oxide y los clásicos rivales del juego tradicional pueden ser seleccionados."));
        items.add(new Item(2,123, "Re-Volt", "Re-Volt es un juego de carreras de radio de control de carreras de videojuegos lanzado por Acclaim Entertainment en 1999.", R.drawable.revoltpeque,"LTBQ3gjp6Ek", R.drawable.revoltgrande,"Re-Volt es un juego de carreras de radio de control de carreras de videojuegos lanzado por Acclaim Entertainment en 1999. Hizo apariciones en PlayStation, PC, Nintendo 64 y Dreamcast, con una secuela: RC Revenge para PlayStation y un puerto mejorado llamado RC Revenge Pro para PlayStation 2. La versión para PC del juego incluyó 28 coches de stock y 14 pistas, incluyendo un estadio de truco para roaming libre. Los coches vienen en tres variantes de combustible; Eléctrico, resplandor (combustión interna) y especial. La capacidad de conducción de los jugadores los colocará en varias categorías para que compitan con otros coches de capacidades similares. Estas capacidades se clasifican en categorías que son: Rookie, Amateur, Advanced, Semi-Pro y Pro. Las pistas también se clasifican en función de su dificultad para dominar y ganar. Estas categorías son: Fácil, Medio, Duro y Extremo. Los coches y las pistas se desbloquean a través del éxito en los modos de torneo del juego. Single Race permite que 2-4 jugadores en las versiones de la consola y 2-12 jugadores en la versión para PC compitan con las pistas normales de un solo jugador. Dentro de cada carrera, los competidores corren para ser los primeros en completar un número preestablecido de vueltas del circuito. Para ayudarles en esto hay una variedad de relámpagos en forma de pick-ups que mienten alrededor de la pista. La recolección de uno de estos proporciona al jugador un arma al azar que varía de manchas de aceite a los fuegos artificiales y las baterías que aumentan su velocidad por un período corto de tiempo. Cuanto peor un jugador está haciendo en la carrera, más probable es que una de las mejores armas se obtendrá, y viceversa."));
        items.add(new Item(3,123,"Asphalt 8","Al igual que Asphalt 7, es posible configurar por giroscopio o pantalla táctil en 4 esquemas para dispositivos móviles y tabletas, por teclas del téclado en caso de PC con Windows 8 o superior, o controles como gamepads o volantes.",R.drawable.asphaltpeque,"jpSGZsgga_I",R.drawable.asphaltgrande1,"Al igual que Asphalt 7, es posible configurar por giroscopio o pantalla táctil en 4 esquemas para dispositivos móviles y tabletas, por teclas del téclado en caso de PC con Windows 8 o superior, o controles como gamepads o volantes. Como su nombre lo indica, deja atrás las persecuciones para entrar a los saltos, de manera normal (si se usa una rampa recta), en helicóptero (si derrapa antes de usar una rampa) o en tonel (si se usa una rampa curva). Estos 2 últimos tipos de salto y el tiempo en el aire aumentan el nitro, lo mismo ocurre con una sección perfecta (sin accidentes), derribando enemigos u obstáculos y derrapando, además de recarga de nitro en la pista. Además, si el nitro se activa y llega a la zona roja, se acciona de nuevo para activar el \"nitro perfecto\", sustituyendo al modo \"adrenalina\" usado en Asphalt 6 y 7. El nitro deja de funcionar si se le acaba el nitro, frena, choca, sale de la pista o usa la rampa. Con la excepción del modo Carrera rápida, se incrementa la posibilidad de ganar créditos al azar, ya sea por maniobras, derribos o destrucción. También se puede comprar créditos, fichas y paquetes de coches mediante tarjetas de crédito y débito (requiere conexión a Internet)."));
        items.add(new Item(4,123,"Need for Speed","Need for Speed (Necesidad de Velocidad en español), también conocido por sus iniciales NFS, es una franquicia de videojuego de carreras de acción creada por Electronic Arts y actualmente desarrollada por Ghost Games.",R.drawable.needspeedpeque,"Y5wssYZHVWc",R.drawable.needspeedgrande,"Need for Speed (Necesidad de Velocidad en español), también conocido por sus iniciales NFS, es una franquicia de videojuego de carreras de acción creada por Electronic Arts y actualmente desarrollada por Ghost Games. La serie se centra en las carreras callejeras ilícitas y, en general, les da el papel a los jugadores de completar varios tipos de carreras, infringiendo en más de una ocasión la ley local en persecuciones policiales. La serie lanzó su primer título, The Need for Speed en 1994. El título proviene de una famosa cita de la película de 1986 Top Gun. Desde Need for Speed: High Stakes, la serie también ha integrado la personalización de los vehículos en el juego. Need for Speed ??ha sido elogiado por sus emocionantes persecuciones policiales y es la serie de videojuegos de carreras más exitosa del mundo. También es una de las franquicias de videojuegos más exitosas de todos los tiempos, vendiendo más de 150 millones de copias de juegos de la serie hasta la fecha. Debido a sus ventas, la propia franquicia también se ha expandido a otras formas de medios, incluyendo una adaptación cinematográfica1 realizada por DreamWorks y juguetes con licencia de Hot Wheels. La serie en sí ha sido supervisada y tuvo juegos desarrollados por varios equipos notables a través de los años, incluyendo EA Black Box y Criterion Games, los creadores de la franquicia Burnout . Sin embargo, en agosto de 2013, tras la reducción de Criterion Games, se anunció que el desarrollador sueco Ghost Games obtendría el control total de la franquicia Need for Speed ??y supervisaría todo el desarrollo futuro de la serie principal4 . En ese momento, el 80% de los miembros de Ghost Games eran empleados de Criterion Games."));
        items.add(new Item(5,123,"Real Racing 3","Real Racing 3 es un juego de carreras 2013, desarrollado por Firemonkeys Studios y publicado por Electronic Arts para iOS, Android, Nvidia Shield y BlackBerry 10 dispositivos.",R.drawable.racingpeque,"nRZ9S9UmEgk",R.drawable.racinggrande,"Real Racing 3 es un juego de carreras 2013, desarrollado por Firemonkeys Studios y publicado por Electronic Arts para iOS, Android, Nvidia Shield y BlackBerry 10 dispositivos. Fue lanzado en iOS y Android el 28 de febrero de 2013 bajo el modelo de negocio freemium; Era gratuito para descargar, con mejoras disponibles a través de compras en la aplicación. El juego es la secuela del Real Racing de 2009 y del Real Racing de 2010. Principalmente debido a la naturaleza freemium del juego, recibió críticas menos favorables que sus predecesores, aunque el juego permanece generalmente elogiado. Las características del juego incluyen 18 pistas de carreras del mundo real, una cuadrícula de 22 coches y 179 coches con licencia oficial de 30 fabricantes como Audi, Porsche, Lamborghini, Bugatti, Ford, Ferrari, McLaren y Koenigsegg. A diferencia de los anteriores juegos de Real Racing, los jugadores deben mantener y mantener sus vehículos, requiriendo dinero en el juego y tiempo real."));
        items.add(new Item(6,123,"S.C.A.R","S.C.A.R.S. (De pie para Super Computer Animal Racing Simulator, aunque no se menciona) es un juego de carreras de coches que tienen la forma de animales. Fue lanzado en la Nintendo 64, PlayStation y para Microsoft Windows.",R.drawable.scarpeque,"Nwo0Bdeht4s",R.drawable.scargrande,"S.C.A.R.S. (De pie para Super Computer Animal Racing Simulator, aunque no se menciona) es un juego de carreras de coches que tienen la forma de animales. Fue lanzado en la Nintendo 64, PlayStation y para Microsoft Windows.\n" +
                "IGN calificó la versión PS1 en 1998, diciendo (de 10) 8,0 para la presentación, 9,0 para los gráficos, 8,0 para el sonido, 7,0 para el juego, 6,0 para el atractivo duradero y una puntuación total de 6,5 de 10. The Sports Gaming Network revisado El juego en 1999, calificándolo (sobre 100) los Gráficos 84, Sonido 58, Interfaz 72, Jugabilidad 80, Dificultad 88, y en general, 76. Alegaba que los gráficos eran agudos y coloridos, el sonido era aburrido y 'muerto ', El gameplay que es algo ecléctico con el ajuste futuro y el armamento y los gráficos del dibujo animado-ish. Computer & Video Games calificó la versión de Windows en 2001, dándole una puntuación total de 4.9 sobre 10, alegando que las armas en el juego son frescas, pero un poco molesto."));


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
                producto.putExtra("precio", item.getPrecio());
                startActivity(producto);
            }
        });
    }
}
