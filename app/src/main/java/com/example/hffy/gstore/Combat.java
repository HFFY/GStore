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

public class Combat extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combat);
        ListView lista=(ListView)findViewById(R.id.ListViewCombat);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderCombat);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.dotagrande);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.hearthgrande);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.heroesgrande);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.lolgrande);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.stargrande);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.wargrande);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 123,"Dota 2", "Dota 2 es un juego multijugador de estrategia en tiempo real, distribuido por la plataforma Steam de Valve, en el cual dos equipos de cinco jugadores tienen el objetivo de destruir las estructuras rivales controlando a personajes denominados héroes.", R.drawable.dotapeque,"cSFPIwMEq4", R.drawable.dotagrande,"Dota 2 es un juego multijugador de estrategia en tiempo real, distribuido por la plataforma Steam de Valve, en el cual dos equipos de cinco jugadores tienen el objetivo de destruir las estructuras rivales controlando a personajes denominados héroes. Ellos no pueden controlar las estructuras ni a las unidades que aparecen cada cierto tiempo. Siempre se juega en un mismo mapa que tiene dos lados: Radiant y Dire, cada uno de ellos presenta ventajas y desventajas respecto a la visión, unidades neutrales y posicionamiento. Hay tres líneas donde chocan unidades no controladas: arriba, abajo y medio. Se pueden elegir más de 90 héroes, lo que permite bastante flexibilidad al estilo de juego. Por ello se considera que Dota 2 tiene una curva de aprendizaje bastante alta, debido a todas las mecánicas presentes en los personajes y en el mapa. Asimismo, cada héroe tiene ciertas habilidades y estadísticas (fuerza, agilidad e inteligencia) que modifican su ataque, vida y mana. Cada cierto tiempo, parches buscan balancear el juego para evitar abusos de ciertas estrategias."));
        items.add(new Item(2, 123,"HearthStone", "Hearthstone es un juego de cartas de estrategia online gratuito con el que puede divertirse cualquiera.", R.drawable.hearthpeque,"QdXl3QtutQI", R.drawable.hearthgrande,"Hearthstone es un juego de cartas de estrategia online gratuito con el que puede divertirse cualquiera. Los jugadores eligen entre uno de nueve héroes épicos de Warcraft y luego juegan por turnos usando cartas de su mazo personalizado para lanzar potentes hechizos, usar armas o facultades heroicas, o invocar a poderosos esbirros para aplastar al enemigo.\n" +
                "Hearthstone está disponible para Windows®, Mac®, iPad, tablets Android y Windows 8, y para móviles iOS y Android."));
        items.add(new Item(3, 123,"Heroes of Storm", "Heroes of the Storm (en español Héroes de la tormenta) es un videojuego multijugador masivo en línea.", R.drawable.heroespeque,"0ecv0bT9DEo", R.drawable.heroesgrande,"Heroes of the Storm (en español Héroes de la tormenta) es un videojuego multijugador masivo en línea. El juego ha sido lanzado en un evento Live Stream, el 06.06.2015, (Las grabaciones del evento se pueden encontrar en YouTube) Algunos Códigos Gratuitos fueron distribuidos para las versiones Alpha y Beta. Los servidores están activos y funcionando. Véase la página de server status del juego en las páginas de Blizzard Entertainment para las plataformas de Microsoft Windows y OSX. La compañía Blizzard combina dentro en el videojuego a distintos Heroes de sus principales franquicias de videojuegos: Warcraft, Overwatch, Diablo, StarCraft y The Lost Vikings El videojuego es actualmente un free to play distribuido digitalmente, y se sustenta a través de microtransacciones."));
        items.add(new Item(4, 123,"League of Legends", "League of Legends es un juego competitivo en línea de ritmo frenético, que fusiona la velocidad y la intensidad de la estrategia en tiempo real (ETR) con elementos de juegos de rol.", R.drawable.lolpeque,"vzHrjOMfHPY", R.drawable.lolgrande,"League of Legends es un juego competitivo en línea de ritmo frenético, que fusiona la velocidad y la intensidad de la estrategia en tiempo real (ETR) con elementos de juegos de rol. Dos equipos de poderosos campeones, cada uno con un diseño y estilo de juegos únicos, compiten cara a cara a través de diversos campos de batalla y modos de juego. Con un plantel de campeones en constante expansión, actualizaciones frecuentes y un emocionante panorama competitivo, League of Legends ofrece posibilidades de juego ilimitadas a usuarios de todos los niveles de habilidad."));
        items.add(new Item(5, 123,"Starcraft II", "En los juegos típicos de este género, los jugadores crean ejércitos y luchan por el control del campo de batalla.", R.drawable.starpeque,"M_XwzBMTJaM", R.drawable.stargrande,"En los juegos típicos de este género, los jugadores crean ejércitos y luchan por el control del campo de batalla. Dichos ejércitos pueden ser del tamaño de un escuadrón de Marines, o de una fuerza de invasión planetaria a gran escala. Como comandante tendrás una vista aérea del campo de batallay darás órdenes a tus unidades en tiempo real. Pensar de manera estratégica es la clave para el éxito, ya que deberás obtener información acerca de tus adversarios, anticipar sus movimientos, flanquear sus avances y formular una estrategia vencedora. "));
        items.add(new Item(6, 123,"Warcraft III", "Warcraft III: Reign of Chaos es un videojuego de estrategia creado por Blizzard Entertainment y es la tercera parte de la serie Warcraft.", R.drawable.warpeque,"c2vm-QjK2xQ", R.drawable.wargrande,"Warcraft III: Reign of Chaos es un videojuego de estrategia creado por Blizzard Entertainment y es la tercera parte de la serie Warcraft. Además de continuar la historia del mundo épico medieval de Warcraft se distingue de sus predecesores por incorporar dos importantes cambios: el paso a los gráficos 3D y la aparición de dos nuevas razas. Warcraft III es uno de los juegos de estrategia más laureados por la comunidad de videojugadores, y es reconocido como uno de los mejores en la historia. El juego consiste básicamente en administrar los recursos disponibles (oro, madera y comida) para producir unidades militares y desarrollar un ejército que dirigir en contra de los oponentes hasta destruir todos sus edificios y trabajadores. El juego provee varias estrategias de ataque o defensa, y se ejecutan las tácticas de combate y producción a partir de cuatro diferentes tipos de civilizaciones, llamadas Razas, que protagonizan el juego: humanos, orcos, elfos nocturnos y muertos vivientes. Cada una de estas razas es comandada a su vez por tres clases de héroes que encabezan y apoyan significativamente las batallas ante sus adversarios. Uno de los elementos innovadores del juego son estas unidades tipo héroe, capaces de crecer considerablemente en poder y tomar ítems distribuidos en los escenarios. Con la compra del juego también se incluye un editor de mapas que permite crear nuevos mapas, unidades, estilos de juego, etc. La herramienta permite la creación de mapas ilimitados permitiendo a los jugadores modificar cada aspecto manipulado por los propios diseñadores de Warcraft III. En julio de 2003 Blizzard sacó a la venta la expansión Warcraft III: The Frozen Throne, que continúa la historia e introduce nuevos tipos de unidades y estrategias"));


        AdaptadorItem adaptador=new AdaptadorItem(Combat.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Combat.this,Producto.class);
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
