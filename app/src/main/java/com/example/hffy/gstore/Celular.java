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

public class Celular extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celular);

        ListView lista=(ListView)findViewById(R.id.listViewCelular);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderCelular);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.hua8grande);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.hua760grande);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.huanovagrande);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.hua210grande);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.hua560grande);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.huay2grande);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 300, "Huawei 8250", "Versión Android 5.1", R.drawable.hua8150,"etrdxzmR0Sg", R.drawable.hua8grande,"El Huawei P8 Lite tiene una superficie lisa y es delgado, tan solo 7.7 mm de grosor. Además, tiene un diseño minimalista sin muchos componentes curvos. Este Smartphone te proporciona una descarga de 150 Mbps gracias a su conexión a la exclusiva red 4G. Por otro lado, te sorprenderá el altavoz de audio del Huawei P8 Lite, gracias a su sistema de amplificación de audio inteligente que evita cortes de sonido. La pantalla es de 5 pulgadas y tiene una resolución de 1280 x 720 píxeles."));
        items.add(new Item(2, 350,"Huawei 760", "Versión 4.4.4 - KitKat", R.drawable.huag760,"sZ7sW24RVo0", R.drawable.hua760grande,"El Huawei 760 ha sido creado por algunos de los mejores diseñadores industriales del mundo con el objetivo de obtener un diseño único y elegante. Demostrando la mejor calidad, elegancia y estilo. Este Smartphone es fabricado en una pieza única de aluminio de resistencia alta, con una pantalla de cristal de 5.2’’ con resolución 1080 x 1920 pixels para que disfrutes de unos colores vividos y una saturación del color del 96% y de alto contraste."));
        items.add(new Item(3, 650,"Huawei novapluss", "Versión 6.0 Marshmallow", R.drawable.huanovaplus," ", R.drawable.huanovagrande,"El Huawei Nova Plus tiene un diseño exquisito y minimalista, con curvas que se amoldan a la palma de tu mano, es elegante desde el ángulo que lo veas. Su cuerpo es metálico y su vidrio es de 2.5D de 151.8 mm de alto por 75.7 mm de ancho y 7.3 mm de espesor. Su pantalla es de 5.5’’ con resolución 1080 x 1920 pixeles para que disfrutes de todo el contenido que desees con nitidez y colores inigualables. "));
        items.add(new Item(4, 400, "Huawei 210", "Versión 4.2.2 – Jelly Bean", R.drawable.huay210,"Vb-tXjtmHF0", R.drawable.hua210grande,"El Huawei 210 ha sido creado por algunos de los mejores diseñadores industriales del mundo con el objetivo de obtener un diseño único y elegante. Demostrando la mejor calidad, elegancia y estilo. Este Smartphone es fabricado en una pieza única de aluminio de resistencia alta, con una pantalla de cristal de 5.2’’ con resolución 1080 x 1920 pixels para que disfrutes de unos colores vividos y una saturación del color del 96% y de alto contraste."));
        items.add(new Item(5, 350,"Huawei 560", "Versión 5.1.1 - Lollipop", R.drawable.huay560,"xswls-mdUr8", R.drawable.hua560grande,"El Huawei 560 es un Smartphone con un estilo nuevo, posee un procesador de 8 núcleos, 4 de 2.0 GHz y 4 de 1.7 GHz para una respuesta rápida y un hardware mejorado que incorpora soluciones innovadoras integradas en un elegante diseño de vanguardia. Posee 2 GB de memoria RAM y un almacenamiento interno de 16 GB, expandibles hasta 128 GB con tarjetas microSD. Además viene con el sistema operativo, con el que podrás descargar gran variedad de aplicaciones."));
        items.add(new Item(6, 380,"Huawei y-ii", "Versión 4.2.2 – Jelly Bean", R.drawable.huayii,"gKTaJiWEnHY", R.drawable.huay2grande,"El Huawei Y II es un celular ligero que pesa 135 gr. Y sus medidas son 123.8 mm de alto por 72 mm de ancho y 8.9 mm de espesor. La pantalla táctil es de 5 pulgadas con resolución de 1280x720, en la cual podrás ver disfrutar de todo tu contenido favorito con una experiencia fluida y colores nítidos. Además, podrás navegar a gran velocidad ya que es compatible con la tecnología 4G."));

        AdaptadorItem adaptador=new AdaptadorItem(Celular.this, items);
        lista.setAdapter(adaptador);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Celular.this,Producto.class);
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
