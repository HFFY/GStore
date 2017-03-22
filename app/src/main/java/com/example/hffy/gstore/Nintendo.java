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

public class Nintendo extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nintendo);
        ListView lista=(ListView)findViewById(R.id.ListViewNintendo);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderNintendo);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.dungeon2);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.riverside2);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.seasons2);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.switch2);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.tankit1);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.zelda1);
        slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,123, "Dungeon of Zaar ", "El juego cuenta con batallas para un solo jugador", R.drawable.dungeon1,"vNOKjHPtyRE", R.drawable.dungeon2,"El juego cuenta con batallas para un solo jugador, multijugador en línea y juego local. Cada batalla puede durar alrededor de quince minutos, y los jugadores podrán crear objetos con los materiales que ganen en las batallas, tales como nuevas armas."));
        items.add(new Item(2,123, "Riverside", "Riverside más que un juego como tal parece ser una experiencia lúdica", R.drawable.riverside1,"-dviqPJ7W1w", R.drawable.riverside2,"Riverside más que un juego como tal parece ser una experiencia lúdica, de esas tan de moda en los últimos años donde la exploración y la creatividad se entremezclan en una. Aquí deberemos adentrarnos en un mundo pintado y montado a mano en una experiencia única donde además nosotros mismos podremos pintar o implementar lo que hayan pintado nuestros amigos creando así un mundo único, jugando con la texturización, los colores y las formas."));
        items.add(new Item(3,123, "Seasons of Heaven", "Basado en la novela del mismo nombre de Nico Augusto", R.drawable.seasons1,"ExCavQVzNrc", R.drawable.seasons2,"Basado en la novela del mismo nombre de Nico Augusto, este titulo nos transportará a un futuro postapocalíptico, donde la raza humana finalmente logró casi su autodestrucción, permitiendo al planeta regresar a su estado salvaje donde solo unos cuantos humanos, llamados supervivientes, se encuentran luchando por habitar este hostil mundo a la par que aprenden de todos sus errores del pasado."));
        items.add(new Item(4, 123,"switch", "Es un juego de partido que hace uso de los controles de ", R.drawable.switch1,"ydoBmnrleoE", R.drawable.switch2,"Es un juego de partido que hace uso de los controles de movimiento y las características de retroalimentación táctil del Joy-Cons en 28 mini-juegos diferentes que te hacen imitar los movimientos de ordeñar vacas, espadas oscilantes, bebés oscilantes, afeitarse, jugar al vaquero y más."));
        items.add(new Item(5, 123,"Tank it!", "un juego de simulación con el que el equipo pretende mostrar a los jugadores la crudeza de la guerra.", R.drawable.tankit,"Ur1hSM35_sc", R.drawable.tankit1,"El estudio independiente Bplus anuncia Tank it!, un juego de simulación con el que el equipo pretende mostrar a los jugadores la crudeza de la guerra.\n" +
                "En Tank it!, los jugadores tomarán el control remoto de un drone que controla un tanque. Recibirán la misión de viajar entre los diferentes pueblos para encontrar y destruir cualquier campamento militar y eliminar a todos los "));
        items.add(new Item(6,123, "The Legend of Zelda Breath of the Wild", "El juego comienza con un Link que ha perdido la memoria, y que despierta en un misterioso santuario", R.drawable.zelda,"NRto9v9dXno", R.drawable.zelda1,"El juego comienza con un Link que ha perdido la memoria, y que despierta en un misterioso santuario, sin saber cómo ni por qué ha acabado ahí. La única pista sobre su pasado se la dará una vocecilla que le encomienda la misión de acabar con el malvado Calamity Ganon, un ser maligno que aparece desde tiempos inmemoriables y responsable del cataclismo que asoló en el reino de Hyrule hace mucho tiempo. En su aventura, Link conocerá a la princesa Zelda y a la familia real de Hyrule, e irá descubriendo qué fue lo que realmente ocurrió hace 100 años."));

        AdaptadorItem adaptador=new AdaptadorItem(Nintendo.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Nintendo.this,Producto.class);
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
