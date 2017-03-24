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

public class Pc extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc);
        ListView lista=(ListView)findViewById(R.id.ListViewPc);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderPc);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.mass2);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.quake2);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.war2);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.star2);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.resident1);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.mount2);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,60, "Mass Effect Andromeda", " Nos permitirá explorar una nueva galaxia", R.drawable.mass1,"X6PJEmEHIaY", R.drawable.mass2,"Por fin se pondrá a la venta en primavera de 2017 tras varios retrasos y lo hará en PC, PS4 y Xbox One. Recientemente, y aprovechando la gala de The Game Awards, BioWare presentó el primer gameplay de esta nueva entrega de Mass Effect que nos permitirá explorar una nueva galaxia, disfrutar de nuevos personajes y enfrentarnos a nuevos y peligrosos enemigos. "));
        items.add(new Item(2,60, "Quake Champions ", "videojuego de disparos en primera persona", R.drawable.quake1,"-UhHcEiegb8", R.drawable.quake2,"es un FPS  exclusivo para PC que promete recuperar la esencia de la franquicia, pero incorporando nuevos elementos. El juego está siendo desarrollado por id Software, responsables de DOOM, y, aunque todavía no cuenta con una fecha de lanzamiento concreta, se le espera para 2017. "));
        items.add(new Item(3,50,"Dawn of War 3", "Entre las novedades de esta nueva entrega se encuentran la posibilidad de controlar unidades aún más grandes ", R.drawable.war1,"gN8geCTlZOo", R.drawable.war2,"El universo de Warhammer no podía faltar en este reportaje con los mejores juegos de PC de 2017. En una fecha aún por concretar del próximo año se pondrá a la venta de forma exclusiva para PC Warhammer 40.000 Dawn of War 3, una nuevo juego de estrategia en tiempo real desarrollado or Relic Entertainment. \n" +
                "Entre las novedades de esta nueva entrega se encuentran la posibilidad de controlar unidades aún más grandes y la incorporación de nuevas habilidades en batalla.\n"));
        items.add(new Item(4,50, "Star Citizen", "Star Citizen incluirá elementos de rol y MMO", R.drawable.star1,"pFSnSuV9jz8", R.drawable.star2,"Star Citizen incluirá elementos de rol y MMO, con múltiples opciones para comerciar con jugadores y la posibilidad de explorar el espacio pilotando todo tipo de naves. Además, el juego contará con un reparto de lujo, con actores como Gary Oldman, Andy Serkis y Mark Hamill, Gillian Anderson y Mark Strong, que darán vida a los principales personajes del modo para un jugador de Star Citizen"));
        items.add(new Item(5,60, "Resident evil 7", "Una verdadera experiencia de terror y survival horror", R.drawable.resident,"W1OUs3HwIuo", R.drawable.resident1,"Capcom promete que Resident Evil 7 regresará a los orígenes de la saga ofreciendo una verdadera experiencia de terror y survival horror, alejada de las últimas entregas de la franquicia más enfocadas a la acción. Si queréis conocer más detalles, no os perdáis nuestro completo avance de Resident Evil 7. Además, os recordamos que el título contará con una edición para coleccionistas cargada de contenidos, aunque, lamentablemente, no incluirá el juego. "));
        items.add(new Item(6,50, "Mount and blade 2", "Mount & Blade fue un juego adictivo y que sentó cátedra, ", R.drawable.mount1,"M_PSRDwORDQ", R.drawable.mount2,"Mount & Blade fue un juego adictivo y que sentó cátedra, pero también de presupuesto reducido y algo mal acabado. Nuevos gráficos, IA, animaciones y sistemas de jugabilidad que hacen de Bannerlord una secuela de lo más prometedora."));

        AdaptadorItem adaptador=new AdaptadorItem(Pc.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Pc.this,Producto.class);
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
