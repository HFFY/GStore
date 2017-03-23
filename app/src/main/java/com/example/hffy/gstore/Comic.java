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

public class Comic extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comic);
        ListView lista=(ListView)findViewById(R.id.ListViewComic);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderComic);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.deadgrande);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.starwars1);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.doompatrol1);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.flash1);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.batman1);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider4);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 123,"Deadpool", "Deadpool entra en una reflexión sobre su vida de mercenario...", R.drawable.deadpoolpeque,"z-jAiWgZbcg", R.drawable.deadgrande,"Deadpool entra en una reflexión sobre su vida de mercenario y empieza a pensar de forma distinta y como usará sus poderes"));
        items.add(new Item(2, 123,"StarWars", "La Saga de Star Wars en la vida real", R.drawable.starwars,"YWNvdoRnNv8", R.drawable.starwars1,"La Saga de Star Wars en la vida real, ampliamente ilustrada y completamente actualizada."));
        items.add(new Item(3, 123,"Doompatrol", " Robot futurista", R.drawable.doompatrol,"dP3jwjnvf4A", R.drawable.doompatrol1," Robot futurista creado para mantener el orden de la humanidad"));
        items.add(new Item(4, 123,"Flash", "El hombre mas rápido en el planeta", R.drawable.flash,"-FHexSN5n-I", R.drawable.flash1,"El hombre mas rápido en el planeta enfocado en ayudar y salvar vidas utilizando su velocidad de muchas formas."));
        items.add(new Item(5, 123,"Batman", " Historias peculiares de batman  ", R.drawable.batman,"PfEXKi83glA", R.drawable.batman1,"Historias peculiares de batman contra enemigos no muy conocidos pero que son un problema para gotham "));
        //items.add(new Item(6, "Guardianes de la galaxia", "los guardianes de la galaxia se reúnen para derrotar a un enemigo que secuestro a groot llamado el leviathan ", R.drawable.guar," ", R.drawable.appleiphone,"los guardianes de la galaxia se reúnen para derrotar a un enemigo que secuestro a groot llamado el leviathan "));

        AdaptadorItem adaptador=new AdaptadorItem(Comic.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Comic.this,Producto.class);
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
