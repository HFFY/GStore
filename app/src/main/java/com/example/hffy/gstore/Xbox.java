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

public class Xbox extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xbox);
        ListView lista=(ListView)findViewById(R.id.ListViewXbox);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderXbox);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.ashen1);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.below1);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.bramblelash1);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.crackdown2);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.cuphead2);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.gigantic2);
        slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,123, "Ashen", "Ashen es un vide ojuego de supervivencia, combate y exploración de mundo abierto ", R.drawable.ashen,"4iIv0Rh_-q0", R.drawable.ashen1,"Ashen es un videojuego de supervivencia, combate y exploración de mundo abierto ambientado en un entorno de fantasía en desarrollo para la consola Xbox One.\n" +
                "\n" +
                "El juego está ambientado en un mundo sin sol, y cuenta la historia de un personaje que busca un hogar. El juego se describe como incluyendo la exploración del mundo abierto, la cooperación o la terminación con otros jugadores, y combate con en monstruos del mundo. El juego se presenta en una vista de tercera persona, con una presentación de gráficos de sombra de celda enmascarada.\n"));
        items.add(new Item(2,123, "Below", "Below se muestra un videojuego de aventura desarrollado por Capybara Games", R.drawable.below,"yARUhqPCjAw", R.drawable.below1,"Below se muestra un videojuego de aventura desarrollado por Capybara Games. Será publicado por Microsoft Studios para Microsoft Windows y Xbox One.\n" +
                "\n" +
                "Es un juego de aventura visto desde una perspectiva de arriba hacia abajo. El jugador-personaje es un \"guerrero minúsculo que explora las profundidades de una isla remota\". El juego trata sobre la exploración, aunque ese objetivo depende de la supervivencia del personaje\n"));
        items.add(new Item(3,123, "BrambleLash", "Este es un videojuego que cuenta con una propuesta muy interesante.", R.drawable.bramblelash,"ERR9zEZ2R0I", R.drawable.bramblelash1,"BrambleLash está siendo desarrollado por el estudio independiente Byte Sprite Games y saldrá a la venta a principios de 2017 en Steam para PC y en consola saldrá de forma exclusiva para Xbox One. Este es un videojuego que cuenta con una propuesta muy interesante.\n" +
                "A la hora de jugar, sólo podremos acabar con los enemigos que aparezcan en pantalla trabajando en equipo con nuestros compañeros. Aparecerá una especie de conexión a modo de cuerda entre nuestro personaje y uno de nuestros amigos y los enemigos que entren en contacto con esta conexión serán eliminados.\n"));
        items.add(new Item(4,123, "Crackdown 3", "Crackdown 3 es un videojuego de acción y aventura abierto ", R.drawable.crackdown1,"Ge3PQ2nQM4Q", R.drawable.crackdown2,"Crackdown 3 es un videojuego de acción y aventura abierto para Microsoft Windows y Xbox One con desarrollo dirigido por el desarrollador británico Reagent Games, un estudio dirigido por David Jones, director de Realtime Worlds y publicado por Microsoft Studios.\n" +
                "\n" +
                "En gran medida retención de los elementos sandbox de los juegos anteriores, Crackdown 3 contará con ambientes destructibles que pueden ser activados por los jugadores.\n"));
        items.add(new Item(5, 123,"Cuphead", "Cuphead es un juego de carreras y armas. ", R.drawable.cuphead1,"20Rt7NugRMs", R.drawable.cuphead2,"Cuphead es un juego de carreras y armas. Como titular Cuphead, el jugador pierde una apuesta con el diablo y pasa el juego tratando de pagar la apuesta. El juego cuenta con una secuencia de nivel de ramificación  y se basa en torno a peleas continuas de jefe.  Cuphead tiene vidas infinitas y mantiene las armas entre las muertes.  Cuphead tiene una habilidad de parry y parrying varios objetos codificados con colores llenará un medidor especial que permitirá Cuphead para realizar un movimiento especial."));
        items.add(new Item(6, 123,"Gigantic", "un videojuego de acción pura de disparos en tercera persona con enfrentamientos PvP", R.drawable.gigantic1,"u-0addq6n-w", R.drawable.gigantic2,"¿Te gustan los MOBA? De carácter free-to-play, y para PC y Xbox One, se presenta Gigantic, un videojuego de acción pura de disparos en tercera persona con enfrentamientos PvP de cinco contra cinco multijugador. De salida la producción de Motiga cuenta con 16 héroes con armas, habilidades y hechizos únicos garantía de sus propios estilos de combate. ¿Su objetivo diferenciador? El guardián, los usuarios deben controlar el mapa, reunir esferas mágicas, conseguir puntos y generar criaturas para aumentar su potencial y derrotar al enemigo."));

        AdaptadorItem adaptador=new AdaptadorItem(Xbox.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Xbox.this,Producto.class);
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
