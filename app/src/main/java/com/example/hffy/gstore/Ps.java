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

public class Ps extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ps);
        ListView lista=(ListView)findViewById(R.id.ListViewPs);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderPs);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.granturismo2);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.hellblade2);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.drawntodeath1);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.automata1);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.yakuza1);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.farpoint2);
        slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, "Gran Turismo Sport", " ", R.drawable.granturismo1,"tj1qCxGH6Kg", R.drawable.granturismo2,"Is an upcoming racing video game developed by Polyphony Digital and published by Sony Interactive Entertainment for the PlayStation 4 video game console.\n" +
                "T Sport will include three game modes: \"Campaign\", \"Sports Mode\" and \"Arcade Mode\". Both offline and online racing will feature in the game..\n"));
        items.add(new Item(2, "Hellblade: Senua’s Sacrfice", " ", R.drawable.hellblade1,"7Yh-zFCILR4", R.drawable.hellblade2,"Hellblade: Sacrificio de Senua es un próximo juego de video británico, que se está desarrollando, así como publicado por Ninja Theory. Programado para su lanzamiento en Microsoft Windows y PlayStation 4 en 2017"));
        items.add(new Item(3, "Drawn to Death", " ", R.drawable.drawntodeath,"WGEOSOn2oKM", R.drawable.drawntodeath1,"Drawn de muerte es un próximo juego de disparos en tercera persona [1] en combinación con un videojuego multijugador arena camorrista desarrollado por el estudio de David Jaffe La Agencia de Detectives Supernatural Bartlet Jones y SIE San Diego de estudio, que se estrenará el 4 de abril de 2017\n" +
                "\n" +
                "El juego es un shooter de arena de cuatro jugadores. Está ambientado en el libro de dibujos de un adolescente, por lo que el mundo y la acción encarnan el tono juvenil de las ilustraciones del niño. Los jugadores eligen un carácter esbozado y los dejan en entornos dibujados en las páginas del libro\n"));
        items.add(new Item(4, "Automata", "La historia de sigue las batallas del androide de combate 2B, su compañero 9S", R.drawable.automata,"StXRi5zPPjk", R.drawable.automata1,"La historia de sigue las batallas del androide de combate 2B, su compañero 9S, y el obsoleto prototipo A2, en una guerra de poder entre las máquinas creadas por invasores de otro mundo y los restos de la humanidad. La producción comenzó en 2014 con su creador Yoko Taro, el productor Yōsuke Saitō y el compositor Keiichi Okabe. El equipo también contó con Atsushi Inaba como coproductor y Akihiko Yoshida, artista regular de Square Enix, como diseñador de personajes. El objetivo principal era crear un videojuego fiel al espíritu del original con una mejor jugabilidad de acción. Siendo un proyecto completamente nuevo para sus desarrolladores, el personal de PlatinumGames se enfrentó a múltiples desafíos al desarrollar el videojuego y un entorno de mundo abierto."));
        items.add(new Item(5, "Yakuza 0", "Es un videojuego de acción-aventura abierto y es también una precuela de la serie de videojuegos Yakuza", R.drawable.yakuza,"PZOMgtMs8ns", R.drawable.yakuza1,"Es un videojuego de acción-aventura abierto y es también una precuela de la serie de videojuegos Yakuza, desarrollada y publicada por Sega. El juego se lleva a cabo en diciembre de 1988 en Kamurocho, una recreación ficticia de las áreas de Kabukicho y Shinjuku Golden Gai de Tokio y Sotenbori, una recreación ficticia del Dotonbori de Osaka. Fue lanzado en Japón para PlayStation 3 y PlayStation 4 en marzo de 2015"));
        items.add(new Item(6, "Farpoint", "En Farpoint nos trasladaremos a un entorno hostil en un mundo totalmente inexplorado", R.drawable.farpoint1,"c18R6Sb97nM", R.drawable.farpoint2,"En Farpoint nos trasladaremos a un entorno hostil en un mundo totalmente inexplorado, con la única ayuda de un equipo básico para mantenerse con vida. Tras un accidente de nuestra nave -La Pilgrim-, deberemos combatir contra las especies alienígenas más agresivas posibles, buscando a los supervivientes y descubrir más de un planeta que hará todo lo posible por arrebatarnos la vida."));

        AdaptadorItem adaptador=new AdaptadorItem(Ps.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Ps.this,Producto.class);
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
