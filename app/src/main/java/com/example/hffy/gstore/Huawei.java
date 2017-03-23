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

public class Huawei extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huawei);
        ListView lista=(ListView)findViewById(R.id.ListViewHuawei);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderHuawei);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.hua8150);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.huag760);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.huanovaplus);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.huay210);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.huay560);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.huayii);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,123, "Huawei 8250", "Versión Android 5.1", R.drawable.hua8150," ", R.drawable.hua8150," "));
        items.add(new Item(2, 123,"Huawei 760", "Versión 4.4.4 - KitKat", R.drawable.huag760," ", R.drawable.huag760," "));
        items.add(new Item(3,123, "Huawei novapluss", "Versión 6.0 Marshmallow", R.drawable.huanovaplus," ", R.drawable.huanovaplus," "));
        items.add(new Item(4, 123,"Huawei 210", "Versión 4.2.2 – Jelly Bean", R.drawable.huay210," ", R.drawable.huay210," "));
        items.add(new Item(5, 123,"Huawei 560", "Versión 5.1.1 - Lollipop", R.drawable.huay560," ", R.drawable.huay560," "));
        items.add(new Item(6,123, "Huawei y-ii", "Versión 4.2.2 – Jelly Bean", R.drawable.huayii," ", R.drawable.huayii," "));

        AdaptadorItem adaptador=new AdaptadorItem(Huawei.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Huawei.this,Producto.class);
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
