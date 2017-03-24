package com.example.hffy.gstore;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;

import java.util.ArrayList;

public class Arcade extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arcade);
        ListView lista=(ListView)findViewById(R.id.ListViewArcade);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderDeportes);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.duckgrande);
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.mariogrande);
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.pacmangrande);
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.ponggrande);
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.princegrande);
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.tetrisgrande);
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        items.add(new Item(1, 123,"Duck Hunt", "Duck Hunt (lit. cacería de patos) es un videojuego creado y desarrollado por Nintendo para la Nintendo Entertainment System (NES). También fue publicado en los arcades en el año 1984 bajo el nombre Vs. Duck Hunt.", R.drawable.duckpeque,"-1zrj4n7qio", R.drawable.duckgrande,"Duck Hunt (lit. cacería de patos) es un videojuego creado y desarrollado por Nintendo para la Nintendo Entertainment System (NES). También fue publicado en los arcades en el año 1984 bajo el nombre Vs. Duck Hunt. El título fue uno de los dos juegos incluidos con el primer lanzamiento de la consola. El jugador debe utilizar una pistola de luz, normalmente la Nintendo Zapper, para disparar a los patos que vuelan por la pantalla, obteniendo puntos y avanzando niveles conforme acierta a los objetivos. Existe un modo adicional en el que los objetivos a impactar se cambian por discos. El juego inicialmente no fue frecuentemente revisado por la crítica, pero obtuvo calificaciones positivas de parte de los jugadores. Antes de lanzar la versión de NES, Nintendo había creado otro juego de cacería de patos basado en el sistema Laser Clay Shooting System, que fue lanzado en 1976."));
        items.add(new Item(2, 123,"Mario Bros", "Mario Bros. es un videojuego de arcade desarrollado por Nintendo en el año 1983. Fue creado por Shigeru Miyamoto. Ha sido presentado como un minijuego en la serie de Super Mario Advance y otros juegos. Mario Bros.", R.drawable.mariopeque,"CujSHJ3QkdQ", R.drawable.mariogrande,"Mario Bros. es un videojuego de arcade desarrollado por Nintendo en el año 1983. Fue creado por Shigeru Miyamoto. Ha sido presentado como un minijuego en la serie de Super Mario Advance y otros juegos. Mario Bros. ha sido relanzado para Wii, Nintendo 3DS y Wii U en los servicios de Consola Virtual en Japón, Norteamérica, Europa y Australia. Fue la tercera aparición de Mario, y la primera que aparece con su nombre definitivo, ya que en Donkey Kong (1981) aparecía bajo el seudónimo de Jumpman (‘saltador’). En el juego, Mario es retratado como un fontanero italo-estadounidense que, junto con su hermano menor Luigi, tiene que derrotar a las criaturas que han venido de las alcantarillas debajo de Nueva York. El juego se centra en la exterminación de ellos, volteándolos sobre sus espaldas y pateándolos. Las versiones originales de Mario Bros. -la versión de arcade y la versión de Family Computer/Nintendo Entertainment System (FC/NES)- fueron recibidas positivamente por los críticos."));
        items.add(new Item(3, 123,"Pacman", "Pac-Man, también conocido como Comecocos en España, es un videojuego arcade creado por el diseñador de videojuegos Toru Iwatani de la empresa Namco (basado supuestamente en la forma de una pizza con un trozo faltante), y distribuido por Midway Games al mercado estadounidense a principios de los años 1980.", R.drawable.pacmanpeque,"ZbjTqkSuHeo", R.drawable.pacmangrande,"Pac-Man, también conocido como Comecocos en España, es un videojuego arcade creado por el diseñador de videojuegos Toru Iwatani de la empresa Namco (basado supuestamente en la forma de una pizza con un trozo faltante), y distribuido por Midway Games al mercado estadounidense a principios de los años 1980. Desde que Pac-Man fue lanzado el 21 de mayo de 1980, fue un éxito. Se convirtió en un fenómeno mundial en la industria de los videojuegos, llegó a tener el récord Guiness del videojuego de arcade más exitoso de todos los tiempos con un total de 293 822 máquinas vendidas desde 1981 hasta 1987 y acabó con el dominio de Space Invaders, donde la acción predominante era shoot 'em up (disparar a todos) para reemplazarla por un formato único, más humorístico y poco violento que gustó a muchísimas personas."));
        items.add(new Item(4, 123,"Pong", "Pong (o Tele-Pong) fue un videojuego de la primera generación de videoconsolas publicado por Atari, creado por Nolan Bushnell y lanzado el 29 de noviembre de 1972. Pong está basado en el deporte de tenis de mesa (o ping pong). La palabra Pong es una marca registrada por Atari Interactive, mientras que la palabra genérica «pong» es usada para describir el género de videojuegos «bate y bola».", R.drawable.pongpeque,"LrexonjB1w8", R.drawable.ponggrande,"Pong (o Tele-Pong) fue un videojuego de la primera generación de videoconsolas publicado por Atari, creado por Nolan Bushnell y lanzado el 29 de noviembre de 1972. Pong está basado en el deporte de tenis de mesa (o ping pong). La palabra Pong es una marca registrada por Atari Interactive, mientras que la palabra genérica «pong» es usada para describir el género de videojuegos «bate y bola». La popularidad de Pong dio lugar a una demanda de infracción de patentes y ganada por parte de los fabricantes de Magnavox Odyssey, que poseía un juego similar.Pong es un juego de deportes en dos dimensiones que simula un tenis de mesa. El jugador controla en el juego una paleta moviéndola verticalmente en la parte izquierda de la pantalla, y puede competir tanto contra un oponente controlado por computadora, como con otro jugador humano que controla una segunda paleta en la parte opuesta. Los jugadores pueden usar las paletas para pegarle a la pelota hacia un lado u otro. El objetivo consiste en que uno de los jugadores consiga más puntos que el oponente al finalizar el juego. Estos puntos se obtienen cuando el jugador adversario falla al devolver la pelota"));
        items.add(new Item(5, 123,"Prince of Persia", "Prince of Persia (traducido como «Príncipe de Persia») es una serie de videojuegos de plataformas iniciada en 1989. Su éxito se debe a la notable fluidez de animación lograda en el protagonista, no vista hasta entonces. Su autor, Jordan Mechner, estudió durante varias horas filmaciones de su hermano corriendo y saltando con ropa blanca. Así se aseguró de que todos los movimientos resultasen realistas, en un proceso que se denomina rotoscopia.", R.drawable.princepeque,"Vzo2rUKzSQo", R.drawable.princegrande,"Prince of Persia (traducido como «Príncipe de Persia») es una serie de videojuegos de plataformas iniciada en 1989. Su éxito se debe a la notable fluidez de animación lograda en el protagonista, no vista hasta entonces. Su autor, Jordan Mechner, estudió durante varias horas filmaciones de su hermano corriendo y saltando con ropa blanca. Así se aseguró de que todos los movimientos resultasen realistas, en un proceso que se denomina rotoscopia. En Prince of Persia, el personaje se desplaza por varios niveles saltando, corriendo, aferrándose a salientes y caminando con cautela, evadiendo trampas que abundan en los escenarios. También debe enfrentarse a distintos enemigos que se interponen en su camino mediante golpes de su alfanje (un tipo de espada). El juego no estipula un límite de vidas pero sí de tiempo, debiéndose completar sus 12 niveles (en la versión original de PC) en menos de 60 minutos porque de otro modo la partida finaliza automáticamente. Por lo general, la pérdida de una vida conlleva el reinicio del nivel (aunque hay escasas excepciones), y aquí se produce la más saliente pérdida de los valiosos minutos que el juego otorga para culminarlo. La dificultad de Prince of Persia es de media a alta; el jugador debe conocer casi a la perfección los escenarios y dominar los movimientos del personaje para dar con el final. En el juego original, el personaje mostraba unos movimientos absolutamente fluidos, lejos de los tradicionales sprites que animaban un personaje mediante unas pocas posturas predefinidas que se sucedían a mayor o menor velocidad. Los controles también resultaban excepcionales. El personaje podía correr, saltar, caminar de puntillas, descolgarse por cornisas, etc. Este concepto de animación fluida y realista empezó a ser imitada en otros juegos, como Another World, dando origen a un nuevo estándar en la industria del videojuego. Hoy en día, las técnicas de animación han evolucionado, gracias sobre todo a la tecnología de captura de movimientos."));
        items.add(new Item(6, 123,"Tetris", "Tetris es un videojuego de puzzle originalmente diseñado y programado por Alekséi Pázhitnov en la Unión Soviética. Fue lanzado el 6 de junio de 1984, mientras trabajaba para el Centro de Computación Dorodnitsyn de la Academia de Ciencias de la Unión Soviética en Moscú, RSFS de Rusia.", R.drawable.tetrispeque,"Ad51_Kv90HU", R.drawable.tetrisgrande,"Tetris es un videojuego de puzzle originalmente diseñado y programado por Alekséi Pázhitnov en la Unión Soviética. Fue lanzado el 6 de junio de 1984, mientras trabajaba para el Centro de Computación Dorodnitsyn de la Academia de Ciencias de la Unión Soviética en Moscú, RSFS de Rusia. Su nombre deriva del prefijo numérico griego tetra- (todas las piezas del juego, conocidas como Tetrominós que contienen cuatro segmentos) y del tenis, el deporte favorito de Pázhitnov. En el Tetris se juega con los tetrominós, el caso especial de cuatro elementos de poliominós. Los poliominós se han utilizado en los rompecabezas populares por lo menos desde 1907, y el nombre fue dado por el matemático Solomon W. Golomb en 1953. Sin embargo, incluso la enumeración de los pentominós data de la antigüedad. El juego (o una de sus muchas variantes) está disponible para casi cada consola de videojuegos y sistemas operativos de PC, así como en dispositivos tales como las calculadoras gráficas, teléfonos móviles, reproductores de multimedia portátiles, PDAs, reproductores de música en red e incluso como huevo de pascua en productos no mediáticos como los osciloscopios. También ha inspirado servicios de mesa y ha sido jugado en los costados de varios edificios, manteniendo el récord de ser el juego completamente funcional más grande del mundo gracias al esfuerzo de estudiantes holandeses en 1995 que iluminaron 15 pisos del Departamento de Ingeniería Eléctrica en la Universidad Técnica de Delft."));

        AdaptadorItem adaptador=new AdaptadorItem(Arcade.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {

                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto=new Intent(Arcade.this,Producto.class);
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
