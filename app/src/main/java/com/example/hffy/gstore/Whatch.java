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
        slider.image("https://userscontent2.emaze.com/images/8afd9e47-33b2-4a4e-843a-53c4af41a296/c7bff681-2555-4f43-9871-0ab383b0008b.jpg");
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);
        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image("http://www.objetoslujosos.com/i/Resort-Cove-Atlantis.jpg");

        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, "IWatch", "Esta es la descripcion del icono", R.drawable.iwapple," ", R.drawable.iwapple," "));
        items.add(new Item(2, "Gstek", "Smart Watch de la linea gstek bastante comodo con sistema operativo android", R.drawable.iwgstek," ", R.drawable.iwgstek," "));
        items.add(new Item(3, " sony", "Smart Watch de sony con sistema operativo android", R.drawable.iwsony," ", R.drawable.iwsony," "));
        items.add(new Item(4, "latec", "Smart Watch de precio mas economico con sistema operativo android", R.drawable.iwlatec," ", R.drawable.iwlatec," "));
        items.add(new Item(5, "whamsvan", "Smart Watch dedicado a los que realizan deporte, utiliza android", R.drawable.iwhamswan," ", R.drawable.iwhamswan," "));
        items.add(new Item(6, "smx", "Smart Watch parecido al whamsvan dirigido a las personas que realizan actividad física", R.drawable.iwsmx," ", R.drawable.iwsmx," "));

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
                startActivity(producto);

            }
        });
    }
}

