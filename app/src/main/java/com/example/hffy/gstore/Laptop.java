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

        items.add(new Item(1, "Chromebook", "Laptop relativamente pequeña recomendada para un uso diario sin mucha exigencia ", R.drawable.lapchromebook," ", R.drawable.lapchromebook," "));
        items.add(new Item(2, "Omen", "Latop dedicada para gamers,con un alto rendimiento en videojuegos", R.drawable.lapomen," ", R.drawable.lapomen," "));
        items.add(new Item(3, "Pavilion", "laptop de buen rendimiento que responde de manera eficiente a varias tareas", R.drawable.lappavilion," ", R.drawable.lappavilion," "));
        items.add(new Item(4, "Spectre", "Lo ultimo en calidad y procesamiento, laptop de ultima tecnología", R.drawable.lapsectre," ", R.drawable.lapsectre," "));
        items.add(new Item(5, "Spectre360", "A diferenia de la spectre normal, esta brinda mas comodidad al poder rotar en 360", R.drawable.lapspectre360," ", R.drawable.lapspectre360," "));
        items.add(new Item(6, "Envy", "Laptop de media calidad recomendable para el uso casual ", R.drawable.laptopenvy," ", R.drawable.laptopenvy," "));

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
                startActivity(producto);
            }
        });

    }
}
