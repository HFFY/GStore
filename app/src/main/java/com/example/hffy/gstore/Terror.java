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

public class Terror extends AppCompatActivity {
    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terror);
        ListView lista=(ListView)findViewById(R.id.ListViewTerror);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderTerror);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.amnesiagrande);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.emilygrande);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider1", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.outlastgrande);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.resgrande);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.wickgrande);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.caseagrande);
        slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {
                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
            }
        });
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1,123, "Amnesia The Dark Descent", "De manera similar a los anteriores juegos desarrollados por la compañía, Amnesia es un juego de aventura basado en la exploración y con una perspectiva en primera persona.", R.drawable.amnesiapeque,"mAgyxK_r2eM", R.drawable.amnesiagrande,"De manera similar a los anteriores juegos desarrollados por la compañía, Amnesia es un juego de aventura basado en la exploración y con una perspectiva en primera persona. El jugador no tiene acceso a armas, y debe utilizar su ingenio para evitar las truculentas criaturas que habitan el castillo de Brennenburg o bien esconderse de ellos. El juego además mantiene la interacción física con objetos utilizada en Penumbra, permitiendo puzles físicos avanzados como apertura de puertas y arreglos de maquinaria. Debido a esto, el jugador debe utilizar su ingenio para escapar y ocultarse de los monstruos hasta que pasen de largo. Se recomienda utilizar la oscuridad para ocultarse. Existen cuatro tipos de criaturas, o enemigos: Los siervos gruñidores, los primeros en aparecer; los siervos brutos, parecidos a los anteriores, pero con partes metálicas en su cuerpo y son más fuertes y peligrosos; los kaernk, son criaturas invisibles que habitan en el agua y se les visualiza al moverse en ella; y la Sombra, el cual persigue a Daniel durante unas zonas específicas del juego. Los tejidos rojos revelan su anterior presencia por el lugar."));
        items.add(new Item(2, 123,"Emily Wants To Play", "Emily Wants To Play es un videojuego de terror de supervivencia creado por el desarrollador indie Shawn Hitchcock.", R.drawable.emilypeque,"IkpiWd3ftGk", R.drawable.emilygrande,"Emily Wants To Play es un videojuego de terror de supervivencia creado por el desarrollador indie Shawn Hitchcock. El juego fue lanzado para Microsoft Windows y OS X el 10 de diciembre de 2015. Luego fue lanzado para iOS y Android el 31 de enero de 2016, PlayStation 4 el 9 de agosto de 2016 y Xbox One el 9 de septiembre de 2016. Emily quiere El juego fue adaptado para jugar en la realidad virtual usando el HTC Vive o Oculus Rift el 25 de agosto de 2016.\n" +
                "\n" +
                "El jugador toma el papel de un repartidor de pizza que ha sido atrapado en una casa por una joven llamada Emily y sus tres muñecas. Cada nivel del juego está representado por una hora diferente de la noche desde las 11pm hasta las 6am. Durante estos niveles, aparecen varias combinaciones de las muñecas y Emily. El jugador debe aprender a interactuar con Emily y sus muñecas para sobrevivir la noche."));
        items.add(new Item(3, 123,"OutLast", "Outlast es un juego de horror diferente, que debe mucho a ese estilo que Amnesia The Dark Descent puso de actualidad hace unos  años y que antes, otros juegos como Call of Cthulhu Dark Corners of the Earth habían explorado en algunas de sus fases, aunque las armas llegaban a hacer aparición en cierto punto, mientras que aquí no las hay.", R.drawable.outlastpeque,"F80Wv66GYSs", R.drawable.outlastgrande,"Outlast es un juego de horror diferente, que debe mucho a ese estilo que Amnesia The Dark Descent puso de actualidad hace unos  años y que antes, otros juegos como Call of Cthulhu Dark Corners of the Earth habían explorado en algunas de sus fases, aunque las armas llegaban a hacer aparición en cierto punto, mientras que aquí no las hay. En Outlast la ambientación lo es casi todo. Su genial diseño de escenarios te lleva en cada momento por donde quiere, de lo que te das cuenta, sí, pero está tan bien medido el desarrollo de la trama, que ni te importa. Lo que empieza como un juego inquietante con pasillos oscuros y sonidos extraños, se descubre a los pocos minutos como un auténtico compendio de horror y gore. Estamos ante un juego que usa con maestría sus recursos. En ciertos momentos, cuando te has acostumbrado a la visión nocturna de tu cámara de vídeo, te deja completamente a oscuras. Cuando sabes cómo moverte por los pasillos, te lanza al exterior de Mount Massive y te saca de la zona de confort. Te retuerce y te aprieta más las clavijas y te lo hace pasar mal. Pero, sobre todo, Outlast es una obra maestra del horror porque no se limita a experimentar, sino que marca el camino a seguir. Por desgracia, es muy corto, pero vale cada euro que cuesta."));
        items.add(new Item(4,123, "Resident Evil 7", "RE 7 es la séptima entrega numérica de la serie Resident Evil (biohazard en Japón). Zombies, personajes conocidos de la franquicia y un regreso a las raíces survival horror de la saga por parte de Capcom.", R.drawable.respeque,"W1OUs3HwIuo", R.drawable.resgrande,"RE 7 es la séptima entrega numérica de la serie Resident Evil (biohazard en Japón). Zombies, personajes conocidos de la franquicia y un regreso a las raíces survival horror de la saga por parte de Capcom. Resident Evil 7 puede jugarse tanto en modo estándar como totalmente en realidad virtual en el caso de la versión de PS4 gracias a las gafas PS VR, ofreciendo en ambos casos una emocionante experiencia de horror inmersiva para los cinco sentidos apoyada en una perspectiva en primera persona y gráficos fotorrealistas. El juego es, así, una apuesta clara por el terror más cercano, que busca una lúgubre ambientación y desarrollo en primera persona en una mansión aparentemente abandonada de una plantación en la América rural de los perdidos pantanos de Luisiana. Allí Capcom desarrolla una trama ubicada tras los dramáticos sucesos de Resident Evil 6, donde el jugador debe medir bien cada paso dado en el lugar y enfrentarse a distintos peligros, entre ellos los miembros de la siniestra familia Baker: unos Jack, Maggie y Lucas que nos ponen las cosas muy difíciles y que actúan a modo de jefes finales para los puntos álgidos y de terror máximo de la campaña."));
        items.add(new Item(5,123, "Wick", "¿Sobrevivirá la noche?\n" +
                "Wick es un juego de terror de supervivencia en el que las historias de fantasmas cobran vida. Explora una leyenda local sobre los niños perdidos en el bosque que todavía se pueden ver, pero sólo por aquellos que se atreven a entrar solos a la luz de las velas.", R.drawable.wickpeque,"v=H_gnFIrzcDM", R.drawable.wickgrande,"¿Sobrevivirá la noche?\n" +
                "Wick es un juego de terror de supervivencia en el que las historias de fantasmas cobran vida. Explora una leyenda local sobre los niños perdidos en el bosque que todavía se pueden ver, pero sólo por aquellos que se atreven a entrar solos a la luz de las velas. Profundamente en la oscuridad sientes que no estás solo. ¿Pero vivirás para contar la historia? Navegue por la oscuridad a la luz de las velas, pero asegúrese de mantener un registro de las velas que encuentre.\n" +
                "Tendrás que permanecer en la luz para mantener tu miedo a raya-- y hay mucho de que temer. Pronto descubrirá que no está solo. Ven cara a cara con una variedad de enemigos a continuación, aprender lo que se necesita para evadir a cada uno, o morir intentando.\n" +
                "CARACTERISTICAS\n" +
                "-Primera exploración y acción\n" +
                "-Candlelight mecánico requiere que usted constantemente buscar nuevas velas para mantenerse en la luz y mantener el miedo a raya\n" +
                "-Muchos enemigos requieren estrategias únicas para evadir\n" +
                "Historia misteriosa reconstruida a través de coleccionables en el juego"));
        items.add(new Item(6,123, "Case Animatronics", "CASE Animatronics (Caso Animatrónicos al español) es un fangame creado por Last Level, Aleson y HypeTrain Digital basado en la saga de Five Nights at Freddy's, creada por Scott Cawthon.", R.drawable.caseapeque,"S1c72DatoQk", R.drawable.caseagrande,"CASE Animatronics (Caso Animatrónicos al español) es un fangame creado por Last Level, Aleson y HypeTrain Digital basado en la saga de Five Nights at Freddy's, creada por Scott Cawthon. John Bishop es un detective que, por estar trabajando hasta tarde en un caso, se queda dormido dentro de la comisaría. Para cuando despierta, el lugar está vacío, en medio de la noche, y es recibido por una llamada de \"un viejo amigo\", quien le indica que está atrapado junto a sus \"juguetes\", los cuales son 4 animatrónicos, gracias a que el logró hackear toda la comisaría. El sujeto desconocido dice que es hora de que John pague por lo que hizo. Ahora Bishop deberá recorrer el lugar en busca de una salida, mientras evita a los animatrónicos que recorren los pasillos en busca del protagonista."));

        AdaptadorItem adaptador=new AdaptadorItem(Terror.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Terror.this,Producto.class);
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
