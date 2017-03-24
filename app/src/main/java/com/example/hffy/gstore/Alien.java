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

public class Alien extends AppCompatActivity {

    private ArrayList<Item> items = new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alien);
        ListView lista = (ListView) findViewById(R.id.ListViewAlien);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderAlien);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.alienlap1);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.aurora1);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.area512);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.graphicsamplifier2);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.steammachine2);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.alpha1);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,1250,"Laptop", "Diseñado para la mejor experiencia de realidad virtual", R.drawable.alienlap, "9WLI9Hf5r0A", R.drawable.alienlap1, " Diseñado para la mejor experiencia de realidad virtual con tecnología tobi\n" +
                " Intel® Core™ i7-7820HK\n"));
        items.add(new Item(2,1100,"Aurora", "Diseñada para realidad virtual y con sistema de enfriamiento liquido", R.drawable.aurora, "Oc6tSuwPQW0", R.drawable.aurora1, " Diseñada para realidad virtual y con sistema de enfriamiento liquido\n" +
                "\n" +
                " Intel® Core™ i7 Processor (4-core)\n"));
        items.add(new Item(3, 1300," Area 51", "Innovadora con diseño único y bastante poderosa para el procesamiento de juegos", R.drawable.area51, "dTiX8AeG8Ng", R.drawable.area512, "Innovadora con diseño único y bastante poderosa para el procesamiento de juegos\n" +
                "Intel® Core™ i7 Processor (10-core)\n "));
        items.add(new Item(4, 1400,"Alpha", "Ultimo en productos alienware", R.drawable.alpha, "KHrJ9IA60MI", R.drawable.alpha1, " Ultimo en productos alienware, básicamente no existe nada que no pueda correr a máxima calidad\n" +
                " Intel® Core™ i7 Processor (4-core)\n"));
        items.add(new Item(5, 250,"Amplificador", "Juegos amplificados para un desempeño excelente", R.drawable.graphicsamplifier1, "ZRGrbTJ8k2k", R.drawable.graphicsamplifier2, "Todos tus juegos amplificados para un desempeño excelente compatible con alienware laptops y desktops"));
        items.add(new Item(6, 500,"Steam Machine", "Al puro estilo alienware", R.drawable.steammachine1, "XXmBCP-fLuU", R.drawable.steammachine2, "Steam machine re diseñada al puro estilo alienware para poder disfrutar de todos tus juegos"));


        AdaptadorItem adaptador = new AdaptadorItem(Alien.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item = items.get(posicion);
                TextView titulo = (TextView) vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto = new Intent(Alien.this, Producto.class);
                producto.putExtra("videoUrl", item.getLinkVideo());
                producto.putExtra("imgp", item.getImagen());
                producto.putExtra("imgg", item.getImageng());
                producto.putExtra("titulo", item.getTitulo());
                producto.putExtra("decripcion", item.getDescripciong());
                producto.putExtra("precio", item.getPrecio());
                startActivity(producto);
            }
        });

    }
}
