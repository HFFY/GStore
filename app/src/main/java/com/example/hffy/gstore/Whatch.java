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

public class Whatch extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whatch);

        ListView lista=(ListView)findViewById(R.id.ListViewWhatch);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderWhatch);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.watchnike);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.watchsam);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.watchsony);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.latecgrande);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.watchhua);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.watchmotorola);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,300, "Apple watch nike", "Nacido para correr", R.drawable.iwapple,"V5Ck1ntZbiM", R.drawable.watchnike,"Motivación en estado puro. Una fuente inagotable de diversión. El Apple Watch Nike+ es la última novedad de una larga colaboración entre dos de las marcas más vanguardistas del mundo. Desde su asombrosa comodidad hasta su forma de conectarte con otros corredores mediante la app Nike+ Run Club, cada detalle suma. Cada detalle hace de él tu compañero de running perfecto."));
        items.add(new Item(2,250, "samsung gear g2", "pretende revolucionar el mercado de los wearables", R.drawable.iwgstek,"cjWzYrJWWig", R.drawable.watchsam,"El Gear S2 Classic presenta una pantalla circular Super AMOLED de 1.2 con un cuerpo de acero inoxidable de larga duración que le proporciona un aspecto refinado y elegante. El diseño de la esfera viene de la mano de Alessandro Mendini y sus correas son fácilmente intercambiables, adaptándose a tu estilo en todo momento. Girando suavemente el bisel podrás desplazarte fácilmente por sus aplicaciones, hacer zoom en un mapa o reproducir tu música preferida."));
        items.add(new Item(3,240, " sony", "Smart Watch de sony con sistema operativo android", R.drawable.iwsony,"rWu7itQpDxs", R.drawable.watchsony,"Llena tu SmartWatch 3 de música y sal a correr. La batería de dos días de duración* te permite registrar tus actividades y movimientos sin que tengas que preocuparte de cargarla. Y, cuando llegues a casa, sincronízalos con una aplicación de ejercicio físico, como Lifelog."));
        items.add(new Item(4,240, "Intex irits", "Smart Watch de precio mas economico con sistema operativo android", R.drawable.watchintex,"E0zYOKgTZxQ", R.drawable.latecgrande,"El dispositivo INTEX iRist Watchphone mejorará tu forma de vida y la manera de disfrutar, de la más avanzada tecnología. Un concepto tecnológico totalmente nuevo, todo un sueño, que INTEX ha hecho realidad para que lo tengas todo, por muy poco."));
        items.add(new Item(5,180, "Huawei", "Smart watch huawei que  utiliza android", R.drawable.iwhamswan,"nVo00EvNd7Q", R.drawable.watchhua,"Clásico por fuera. Inteligente por dentro. Así es el Huawei Watch Classic, un reloj inteligente que te permitirá gestionar tu día a día desde la muñeca. Desde coger llamadas hasta contestar sms, escuchar música, consultar los resultados de tu actividad física diaria y mucho más."));
        items.add(new Item(6,185, "Motorola 360", "Smart Watch Motorola dirigido a las personas que realizan actividad física y no pierden el estilo", R.drawable.iwsmx,"t5LdGSvidvc", R.drawable.watchmotorola,"Entrena hasta el límite sin preocuparte por tu reloj. El smartwatch Moto 360 Sport está hecho para soportar las sesiones de entrenamiento más agotadoras gracias a un diseño a la vez cómodo y duradero. Estructura de silicona resistente que no absorbe el sudor y evita las manchas y la decoloración, mientras que los canales de ventilación lateral te ayudan a mantenerte fresco."));

        AdaptadorItem adaptador=new AdaptadorItem(Whatch.this, items);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Whatch.this,Producto.class);
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

