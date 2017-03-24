package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;

import java.util.ArrayList;

public class Rpg extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpg);
        ListView lista=(ListView)findViewById(R.id.ListViewRpg);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderRpg);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.diablogrande);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);
        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.wargrande);

        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,123, "Diablo 3", "Diablo III es un videojuego de rol de acción (RPG) también conocidos como Hack'n'Slash, desarrollado por Blizzard Entertainment.", R.drawable.diablopeque,"M2TpNQhfkp4", R.drawable.diablogrande,"Diablo III es un videojuego de rol de acción (RPG) también conocidos como Hack'n'Slash, desarrollado por Blizzard Entertainment. Ésta es la continuación de Diablo II y la tercera parte de la serie que fue creada por la compañía estadounidense Blizzard. Su temática es de fantasía oscura y terrorífica. Su aparición fue anunciada el 28 de junio de 2008 en el Blizzard Entertainment Worldwide Invitational en París, Francia. Blizzard anunció que el lanzamiento se realizaría el 15 de mayo de 2012. Fue uno de los lanzamientos más importantes de un videojuego en la historia, vendiendo una cifra de 3.5 millones de copias en 24 horas y 6.3 millones en una semana."));
        items.add(new Item(2,123, "World of Warcraft", "World of Warcraft (WoW) es un videojuego de rol multijugador masivo en línea desarrollado por Blizzard Entertainment.", R.drawable.warpeque,"vlVSJ0AvZe0", R.drawable.wargrande,"World of Warcraft (WoW) es un videojuego de rol multijugador masivo en línea desarrollado por Blizzard Entertainment. Es el cuarto juego lanzado establecido en el universo fantástico de Warcraft, el cual fue introducido por primera vez por Warcraft: Orcs & Humans en 1994. World of Warcraft transcurre dentro del mundo de Azeroth, cuatro años después de los sucesos finales de la anterior entrega de Warcraft, Warcraft III: The Frozen Throne. Blizzard Entertainment anunció World of Warcraft el 2 de septiembre de 2001. El juego fue lanzado el 23 de noviembre de 2004, celebrando el décimo aniversario de la franquicia Warcraft. La primera expansión del juego The Burning Crusade fue lanzada el 16 de enero del 2007. La segunda expansión, Wrath of the Lich King, fue lanzada el 13 de noviembre de 2008.8 La tercera expansión del juego World of Warcraft: Cataclysm fue anunciada en el BlizzCon 2009 y fue lanzada el 7 de diciembre de 2010. La cuarta expansión, World of Warcraft: Mists of Pandaria fue anunciada en el BlizzCon 2011 y fue lanzada el 25 de septiembre del 2012. Blizzard ha hecho oficial el lanzamiento de la quinta expansión del juego, World of Warcraft: Warlords of Draenor el 13 de noviembre de 2014. Recientemente Blizzard ha anunciado en la BlizzCon 2015 el lanzamiento de la sexta expansión del juego, World of Warcraft: Legion para el 30 de agosto de 2016."));
        items.add(new Item(3, 123,"Guild Wars 2", "Guild Wars 2, es el nombre oficial de la secuela del videojuego de rol multijugador Guild Wars, desarrollado por ArenaNet, filial de NCsoft. La historia empezará 250 años después de la última expansión de la primera parte, Eye of the North.", R.drawable.wars2peque,"Em0Sd60iI2w", R.drawable.wars2grande,"Guild Wars 2, es el nombre oficial de la secuela del videojuego de rol multijugador Guild Wars, desarrollado por ArenaNet, filial de NCsoft. La historia empezará 250 años después de la última expansión de la primera parte, Eye of the North. Los personajes de Guild Wars no se podrán transferir a Guild Wars 2, pero sí los títulos conseguidos y se reservarán los nombres de los personajes de aquellas cuentas vinculadas a la página de NCsoft. Además se podrán conseguir títulos y objetos completando el \"Hall of Monuments\" (Museo de monumentos) de Guild Wars, aunque estos objetos no darán ninguna ventaja respecto a los nuevos jugadores, ya que tendrán una finalidad meramente estética. No habrá esbirros (ni tampoco héroes) como en la entrega anterior. El 20 de agosto de 2009 fue presentado el video introductorio del juego. En su última expansión, Guild Wars Eye of the North, se puede ver a varios de los dragones que serían los antagonistas de Guild Wars 2, aunque en estado «durmiente». Al final de esta expansión, se puede ver como uno de ellos, conocido como Primordus, abre uno de sus ojos."));
        items.add(new Item(4, 123,"Legend of Zelda Breath of the Wild", "Es un videojuego de acción y aventura desarrollado y publicado por Nintendo para las consolas Nintendo Switch y Wii U. Es la 19ª versión en la serie principal de The Legend of Zelda.", R.drawable.zeldapeque,"EIoNn7tG_8o", R.drawable.zeldagrande,"Es un videojuego de acción y aventura desarrollado y publicado por Nintendo para las consolas Nintendo Switch y Wii U. Es la 19ª versión en la serie principal de The Legend of Zelda. La historia está ambientada en Hyrule y sigue protagonista amnésico Link, que despierta de un sueño de 100 años a una misteriosa voz que lo guía a derrotar a Calamity Ganon. El juego y la mecánica del título constituyen una desviación de las convenciones de la serie, con un entorno de mundo abierto, un motor de física detallado, imágenes de alta definición, actuación de voz y la capacidad de jugar a través de las mazmorras del juego en cualquier orden o no en absoluto . Anunciado en 2013, el juego estaba previsto inicialmente para ser lanzado como Wii U exclusivo en 2015, pero se retrasó dos veces antes de su lanzamiento el 3 de marzo de 2017. Breath of the Wild fue un título de lanzamiento para el Switch, y el final producido por Nintendo Juego para la Wii U. Breath of the Wild recibió elogios de los críticos, que lo consideraron uno de los mejores videojuegos de todos los tiempos. Los críticos elogiaron el modo de juego abierto y físico que anima la experimentación de los jugadores, muchos de los cuales lo llaman un título histórico en el diseño de juegos al aire libre, aunque se impusieron críticas menores al rendimiento técnico del juego."));
        items.add(new Item(5, 123,"Lineage", "Es un juego de fantasía medieval del tipo MMORPG (juego de rol multijugador masivo online) para PC diseñado en 1998 por el desarrollador de videojuegos de la empresa surcoreana NCsoft, Jake Song, que previamente había diseñado Nexus: The Kingdom of the Winds, otro MMORPG.", R.drawable.lineagepeque,"HDCmLGIEjSg", R.drawable.lineagegrande,"Es un juego de fantasía medieval del tipo MMORPG (juego de rol multijugador masivo online) para PC diseñado en 1998 por el desarrollador de videojuegos de la empresa surcoreana NCsoft, Jake Song, que previamente había diseñado Nexus: The Kingdom of the Winds, otro MMORPG. Éste es el juego en su tipo más popular en Corea y el número 3 en el mundo1 estando disponible en los idiomas chino, japonés e inglés. Debido a su gran éxito NCsoft ha desarrollado paralelamente la protosecuela Lineage II en el 2003, y el 1 de enero de 2008 se dio inicio al proyecto Lineage III, cuyo lanzamiento es por el momento incierto. Lineage utiliza una interfaz gráfica 2D con perspectiva isométrica similar al utilizado por juegos como Ultima Online, Baldur's Gate y Diablo II."));
        items.add(new Item(6, 123,"Skyrim", "Es un videojuego de rol de acción del tipo mundo abierto desarrollado por Bethesda Game Studios y publicado por Bethesda Softworks. Es la quinta entrega de videojuegos de acción y fantasía de la serie The Elder Scrolls y es posterior a The Elder Scrolls IV: Oblivion y predecesor de The Elder Scrolls Online.", R.drawable.skyrimpeque,"QpvM9uwOcUc", R.drawable.skyrimgrande,"Es un videojuego de rol de acción del tipo mundo abierto desarrollado por Bethesda Game Studios y publicado por Bethesda Softworks. Es la quinta entrega de videojuegos de acción y fantasía de la serie The Elder Scrolls y es posterior a The Elder Scrolls IV: Oblivion y predecesor de The Elder Scrolls Online. Skyrim salió a la venta el 11 de noviembre de 20111 para las plataformas: Microsoft Windows, Xbox 360 y PlayStation 3. El 26 de julio de 2012 fueron lanzados al mercado tres expansiones que son descargables: Dawnguard, Hearthfire y Dragonborn. El 28 de octubre de 2016 fue lanzada una remasterización llamada: Skyrim Special Edition HD. Incluye el juego original y los complementos, así como nuevas características: gráficos y efectos renovados. La historia de Skyrim se centra en los esfuerzos del personaje del jugador para derrotar a Alduin, un dragón que, según la profecía, destruirá el mundo. La trama está fechada doscientos años después de los sucesos de Oblivion y tiene lugar en la provincia ficticia de Skyrim. En el transcurso de la partida, el jugador completa misiones y hace evolucionar a su personaje gracias a la mejora de sus habilidades. A diferencia de los juegos anteriores de Elder Scrolls, en Skyrim no se requiere que el usuario seleccione un tipo de personaje al inicio del juego, resolviendo así el problema que el equipo de desarrolladores veía desde versiones anteriores: la necesidad de tener que forzar al usuario a un estilo rígido de juego. Skyrim continúa con la tradición de mundo abierto al permitir que el jugador viaje a cualquier parte del mapa del juego en cualquier momento y posponer indefinidamente u omitir parcial o totalmente la historia principal."));

        AdaptadorItem adaptador=new AdaptadorItem(Rpg.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Rpg.this,Producto.class);
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
