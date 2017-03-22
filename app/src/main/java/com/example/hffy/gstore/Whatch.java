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
        slider.image(R.drawable.iwapple);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.iwgstek);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.iwsony);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.iwlatec);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.iwhamswan);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.iwsmx);
        slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,123, "IWatch", "Esta es la descripcion del icono", R.drawable.iwapple," ", R.drawable.iwapple," "));
        items.add(new Item(2,123, "Gstek", "Smart Watch de la linea gstek bastante comodo con sistema operativo android", R.drawable.iwgstek," ", R.drawable.iwgstek," "));
        items.add(new Item(3,123, " sony", "Smart Watch de sony con sistema operativo android", R.drawable.iwsony," ", R.drawable.iwsony," "));
        items.add(new Item(4,123, "latec", "Smart Watch de precio mas economico con sistema operativo android", R.drawable.iwlatec," ", R.drawable.iwlatec," "));
        items.add(new Item(5,123, "whamsvan", "Smart Watch dedicado a los que realizan deporte, utiliza android", R.drawable.iwhamswan," ", R.drawable.iwhamswan," "));
        items.add(new Item(6,123, "smx", "Smart Watch parecido al whamsvan dirigido a las personas que realizan actividad física", R.drawable.iwsmx," ", R.drawable.iwsmx," "));

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

