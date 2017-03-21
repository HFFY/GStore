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

public class Shooter extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shooter);
        ListView lista=(ListView)findViewById(R.id.ListViewShooter);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderShooter);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.csgrande);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.fargrande);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.deadgrande);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.overgrande);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.pointgrande);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.callgrande);
        slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, "Counter Strike Global Offensive", "Counter-Strike cogió la industria de los videojuegos por sorpresa cuando, contra todo pronóstico, el MOD se convirtió en el juego de acción online para PC", R.drawable.cspeque,"edYCtaNueQY", R.drawable.csgrande,"Counter-Strike cogió la industria de los videojuegos por sorpresa cuando, contra todo pronóstico, el MOD se convirtió en el juego de acción online para PC más jugado del mundo tras su lanzamiento en agosto de 1999, dijo Doug Lombardi de Valve. “En los últimos 12 años, ha continuado siendo uno de los juegos más jugados del mundo, el protagonista de los torneos de videojuegos competitivos y se han vendido más de 25 millones de copias por todo el mundo."));
        items.add(new Item(2, "FarCry 4", "El comienzo de Far Cry 4 es en sí mismo una buena metáfora de a lo que aspira el juego. Atentos, que así abre la historia", R.drawable.farpeque,"6d60v1OErEY", R.drawable.fargrande,"El comienzo de Far Cry 4 es en sí mismo una buena metáfora de a lo que aspira el juego. Atentos, que así abre la historia. Tu personaje, Ajay Ghale, recorre sus primeros minutos en Kyrat, esa región ficticia que recuerda mucho al Himalaya, en autobús. Sus padres eran de ahí, pero Ajay se ha criado en los Estados Unidos. Unos soldados examinan el vehículo y de repente algo va mal, empiezan a volar balas y te secuestran. Pagan Min, el villano de la aventura, te destripa rápidamente parte del argumento -pero cuesta seguirlo, no sabes qué está pasando. Casi ni te cuentan por qué estás en Kyrat. Sabemos, por los miles de tráilers que ha lanzado Ubisoft, que queremos esparcir las cenizas de nuestra madre. Pero no queda claro en ningún momento."));
        items.add(new Item(3, "Left 4 Dead 2", "Left 4 Dead 2 es un videojuego de disparos en primera persona de tipo acción creado por la compañía Valve Software.", R.drawable.deadpeque,"UkFZBOE04eM", R.drawable.deadgrande,"Left 4 Dead 2 es un videojuego de disparos en primera persona de tipo acción creado por la compañía Valve Software. Corresponde a la secuela de Left 4 Dead y se lanzó al mercado el 17 de noviembre de 2009 en Estados Unidos y Latinoamérica. En Europa llegó tres días después, el 20 de noviembre. Esta secuela, al igual que su predecesor, está disponible para PC y para la consola Xbox 360. El 14 de diciembre de 2009 fue anunciado el primer contenido descargable para esta secuela: una nueva campaña llamada The Passing, que se desarrolla entre las dos primeras campañas del juego. Aquí se reúnen los protagonistas del primer Left 4 Dead (Francis, Louis y Zoey) con los supervivientes de esta secuela. Bill no aparece con vida, ya que se sacrificó para que los demás siguieran a salvo. Salió a la luz el 22 de abril de 2010."));
        items.add(new Item(4, "OVERWATCH", "Blizzard ha vuelto a hacerlo. Dentro del marco de la Blizzcon 2014 y con un tráiler espectacular la compañía ha anunciado Overwatch, su nueva franquicia", R.drawable.overpeque,"FqnKB22pOC0", R.drawable.overgrande,"Blizzard ha vuelto a hacerlo. Dentro del marco de la Blizzcon 2014 y con un tráiler espectacular la compañía ha anunciado Overwatch, su nueva franquicia. Será un multiplayer cooperativo que recuerda muchísimo a Team Fortress 2 y que supone a su vez una adaptación de Titan, el MMO que cancelaron hace unos meses. Overwatch es, simplemente, un concepto que une lo mejor del juego en equipo y la estrategia necesaria para ganar de los MOBA (como League of Legends) con la personalización, el estilo de juego y las características de shooters como Team Fortress 2 o incluso el clásico Commandos."));
        items.add(new Item(5, "Point Blank", "Point Blank es un rápido juego de disparos en primera persona en línea, que es muy similar en términos de juego a Counter-Strike. También cuenta con entornos destructibles y dinámicos, así como características más profundas de personalización de caracteres y habilidades.", R.drawable.pointpeque,"l5F1q2z8HkY", R.drawable.pointgrande,"Point Blank es un rápido juego de disparos en primera persona en línea, que es muy similar en términos de juego a Counter-Strike. También cuenta con entornos destructibles y dinámicos, así como características más profundas de personalización de caracteres y habilidades. En Point Blank, los jugadores se unen al equipo Free Rebels o CT-Force (los Free Rebels están basados \u200B\u200Ben los terroristas de Counter-Strike, mientras que CT-Force se basa en los Counter-Terrorists). Cada equipo intenta completar su objetivo de misión y / o eliminar al equipo contrario. Cada ronda comienza con los dos equipos de desove simultáneamente, generalmente en los extremos opuestos del mapa entre sí. Un jugador puede elegir jugar como uno de cuatro diferentes modelos de personajes predeterminados (Acid and Keen Eyes para CT-Force y Red Bull y Tarantula para los Rebeldes Libres). Hay cuatro modelos de personajes de lujo compradores: Fennec y Pit Viper para CT-Force o Cheshire y Shadow para los Rebeldes Gratuitos. Los jugadores generalmente reciben unos segundos antes de que empiece la ronda, o antes de reaparecer, para cambiar las armas y / o el equipo. Puntos de juego y la experiencia se conceden para ganar una ronda, perder una ronda, matando a los enemigos, y completar mini misiones."));
        items.add(new Item(6, "Call of Duty Moern Warfare", "Call of Duty: Modern Warfare 3 (abreviado oficialmente como Call of Duty: MW3 o Modern Warfare 3) es un videojuego de disparos en primera persona desarrollado por Infinity Ward y Sledgehammer Games, con el trabajo adicional de Raven Software, y distribuido por Activision.", R.drawable.callpeque,"1xjCdN_rWCE", R.drawable.callgrande,"Call of Duty: Modern Warfare 3 (abreviado oficialmente como Call of Duty: MW3 o Modern Warfare 3) es un videojuego de disparos en primera persona desarrollado por Infinity Ward y Sledgehammer Games, con el trabajo adicional de Raven Software, y distribuido por Activision. El videojuego, precedido por Call of Duty: Black Ops y secuela directa de Call of Duty: Modern Warfare 2, es el octavo título principal de la serie Call of Duty. Fue lanzado para PlayStation 3, Xbox 360, Microsoft Windows, Wii y Nintendo DS. La versión internacional fue lanzada el 8 de noviembre de 2011, a excepción de la versión de Wii en la zona australiana, donde su lanzamiento fue el 17 de noviembre. Las versiones doblada y subtitulada de Japón fueron publicadas el 17 y 22 de noviembre de 2011, respectivamente.\n"));

        AdaptadorItem adaptador=new AdaptadorItem(Shooter.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Shooter.this,Producto.class);
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
