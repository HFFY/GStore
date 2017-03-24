package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
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

public class Laptop extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop);
        ListView lista=(ListView)findViewById(R.id.listViewLaptop);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderLaptop);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.hpchromegrande);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.hpomengrande);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.hppaviliongrande);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.hpspectre360grande);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.hpspectregrande);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.hpenvygrande);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 450,"Chromebook", "Laptop relativamente pequeña recomendada para un uso diario sin mucha exigencia ", R.drawable.lapchromebook,"-jTD7p2P0_4", R.drawable.hpchromegrande,"El elegante diseño, con un acabado de pintura suave al tacto, te permite destacarte entre la multitud."));
        items.add(new Item(2, 950,"Omen", "Latop dedicada para gamers,con un alto rendimiento en videojuegos", R.drawable.lapomen,"mPFUHsuLfAA", R.drawable.hpomengrande,"La victoria nunca es fácil de conseguir, pero la gaming family de OMEN está lista para el desafío. Consigue el rendimiento que exige la competición con máquinas de innovación, accesorios de nivel profesional y diseños preparados para el campo de batalla"));
        items.add(new Item(3, 550,"Pavilion", "laptop de buen rendimiento que responde de manera eficiente a varias tareas", R.drawable.lappavilion,"CboQj8SlLJk", R.drawable.hppaviliongrande,"Es el momento de repensar cómo usar un ordenador portátil y probar algo totalmente nuevo. Cambia sin problemas entre los cuatro modos para obtener una experiencia de entretenimiento que te acerca a la pantalla más que nunca."));
        items.add(new Item(4, 900,"Spectre", "Lo ultimo en calidad y procesamiento, laptop de ultima tecnología", R.drawable.lapsectre,"JZLEm3o9R5A", R.drawable.hpspectregrande,"Se trata de diseño y tecnología llevados a un nivel completamente nuevo. Materiales artesanales y elaboración sorprendente crean una experiencia distinta a todo lo demás. Con un grosor de 10,4 mm y toda la potencia Intel® Core™ i5 o i7, el lujoso portátil HP Spectre es completamente irresistible"));
        items.add(new Item(5,1000, "Spectre360", "A diferenia de la spectre normal, esta brinda mas comodidad al poder rotar en 360", R.drawable.lapspectre360,"nE-lfsp3yx8hp", R.drawable.hpspectre360grande,"El nuevo Spectre x360 está diseñado para aquellos que buscan una libertad sin límites. Nuestro convertible más fino tiene una potencia fascinante. Hemos creado un dispositivo con el que todo es posible."));
        items.add(new Item(6, 500,"Envy", "Laptop de media calidad recomendable para el uso casual ", R.drawable.laptopenvy,"U3dgZoYRtO4", R.drawable.hpenvygrande,"Supera los límite y adéntrate al futuro con la velocidad y la potencia de los procesadores Intel® Core™ i3 to i7 3, hasta 16 GB de RAM y almacenamiento ultrarrápido basado en PCIe (en modelos determinados)5. Conéctate con Cortana6, tu nuevo asistente personal. Configura avisos, programa reuniones o busca por la web de un modo totalmente nuevo – con la voz."));

        AdaptadorItem adaptador=new AdaptadorItem(Laptop.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                //borrar esta parte cuando se cambie la clase
                Intent producto =new Intent(Laptop.this,Producto.class);
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
