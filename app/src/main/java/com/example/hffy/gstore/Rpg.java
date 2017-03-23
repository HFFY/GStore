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
