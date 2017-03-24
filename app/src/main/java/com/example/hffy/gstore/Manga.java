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

public class Manga extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga);
        ListView lista=(ListView)findViewById(R.id.ListViewManga);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderManga);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.dragonball2);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.naruto2);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.digimon2);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.onepunch2);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.hunter2);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.samura1);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 20, "Dragon ball", "saga completa de los guerreros z desde que goku era pequeño", R.drawable.dragonball1," ", R.drawable.dragonball2,"saga completa de los guerreros z desde que goku era pequeño"));
        items.add(new Item(2, 20,"Naruto Shipuden", "Naruto ya no es un niño ", R.drawable.naruto1,"ehAny9zDrRQ", R.drawable.naruto2,"Naruto ya no es un niño y ahora debe salvar a sus amigos y su aldea de sasuke e itachi quienes se volvieron malos"));
        items.add(new Item(3, 20,"Digimon", "Historias particulares que pasan en el digimundo", R.drawable.digimon1,"cpsrFBbWE4w", R.drawable.digimon2,"Historias particulares que pasan en el digimundo donde solamente los digimons son los protagonistas "));
        items.add(new Item(4, 20,"Onepunch", "Saitama", R.drawable.onepunch1,"nOdl5eR9MeQ", R.drawable.onepunch2,"La historia se centra en Saitama, un superhéroe calvo y extremadamente fuerte que se muestra abrumado por la ausencia de un verdadero desafío, y que continuamente busca a un oponente digno de su poder."));
        items.add(new Item(5, 20,"Hunter x hunter", "serie de manga escrita e ilustrada por Yoshihiro Togashi", R.drawable.hunter1,"ryFbXyvSBP8", R.drawable.hunter2,"serie de manga escrita e ilustrada por Yoshihiro Togashi. La historia tiene como protagonista a Gon Freecss, un niño de doce años que desea encontrar a su padre a toda costa, por lo que decide convertirse en cazador"));
        items.add(new Item(6, 20,"Samuraix", "Está basado en el personaje histórico de Kawakami Gensai", R.drawable.samurai," ", R.drawable.samura1,"Himura Kenshin es el personaje principal que da nombre a la serie. Está basado en el personaje histórico de Kawakami Gensai y en otros personajes históricos como el rōnin Musashi Miyamoto."));

        AdaptadorItem adaptador=new AdaptadorItem(Manga.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Manga.this,Producto.class);
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
