package com.example.hffy.gstore;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;

import java.util.ArrayList;

public class Apple extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();
    private SliderLayout sliderLayout;
    private Context context;
    private static final int VERSION = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
        ListView lista=(ListView)findViewById(R.id.ListViewApple);

        context=this;
        sliderLayout=(SliderLayout)findViewById(R.id.sliderApple);

        DefaultSliderView slider=new DefaultSliderView(context);
        slider.image(R.drawable.iphonegrande);
        slider.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

            }
        });
        sliderLayout.addSlider(slider);

        DefaultSliderView slider1=new DefaultSliderView(context);
        slider1.image(R.drawable.imac1grande);
        slider1.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

            }
        });
        sliderLayout.addSlider(slider1);

        DefaultSliderView slider2=new DefaultSliderView(context);
        slider2.image(R.drawable.macbookprogrande);
        slider2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

            }
        });
        sliderLayout.addSlider(slider2);

        DefaultSliderView slider3=new DefaultSliderView(context);
        slider3.image(R.drawable.macbookgrande);
        slider3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

            }
        });
        sliderLayout.addSlider(slider3);

        DefaultSliderView slider4=new DefaultSliderView(context);
        slider4.image(R.drawable.ipadminigrande);
        slider4.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

            }
        });
        sliderLayout.addSlider(slider4);

        DefaultSliderView slider5=new DefaultSliderView(context);
        slider5.image(R.drawable.iphone7grande);
        slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

            }
        });
        sliderLayout.addSlider(slider5);

        sliderLayout.startAutoCycle();

        //TODO jalar desde db
        /*
            do{

                final Item producto = new Item(......); // llenear atributos desde db
                items.add(producto);

                DefaultSliderView slider5=new DefaultSliderView(context);
                    slider5.image(R.drawable.appleiphone);
                    slider5.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
                        @Override
                        public void onSliderClick(BaseSliderView baseSliderView) {
                                Item item=producto;
                                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                                Log.e("Item seleccionado", titulo.getText().toString());
                                Intent producto =new Intent(Apple.this,Producto.class);
                                producto.putExtra("videoUrl",item.getLinkVideo());
                                producto.putExtra("imgp",item.getImagen());
                                producto.putExtra("imgg",item.getImageng());
                                producto.putExtra("titulo",item.getTitulo());
                                producto.putExtra("decripcion",item.getDescripciong());
                                producto.putExtra("precio", item.getPrecio());
                                startActivity(producto);
                                //Toast.makeText(context, "Hice click en el slider", Toast.LENGTH_SHORT).show();
                        }
                    });
                    sliderLayout.addSlider(slider5);

                while();
         */

        DatosProductos pro = new DatosProductos(context,"DatosProductos",null, VERSION);
        SQLiteDatabase db = pro.getWritableDatabase();

        ContentValues values = new ContentValues();

       values.put("Name","Iphone");
       values.put("Precio","400");
       values.put("Imagen1",R.drawable.appleiphone);
       values.put("Imagen2",R.drawable.iphonegrande);
       values.put("Desc1","lo ultimo en smart phones de la linea iphone con sistema operativo IO's en su ultima version");
       values.put("Desc2","Descripcion con unboxing del dispositivo Iphone en general en el video (click en la imgen)");
       values.put("Url","DTh-I70X_YU");
       db.insert("DatosProductos",null,values);

       db.close();
      //
      //
      // values.put("Name","Imac");
      // values.put("Precio","1150");
      // values.put("Imagen 1",R.drawable.appleimac);
      // values.put("Imagen 2",R.drawable.imac1grande);
      // values.put("Desc1","Computadora de escritorio de la linea Apple bastante comoda y actual para el uso en casa o oficinas");
      // values.put("Desc2","Descripcion con unboxing del dispositivo Imac en general en el video (click en la imgen)");
      // values.put("Url","yZp1heY3vCY");
      // db.insert("DatosProductos",null,values);
      // db.close();
      //
      // values.put("Name","MacBookpro");
      // values.put("Precio","1300");
      // values.put("Imagen 1",R.drawable.applemacbookpro);
      // values.put("Imagen 2",R.drawable.macbookprogrande);
      // values.put("Desc1","Computadora portátil Apple dirigida especificamente a aquellos que desean un mejor rendimiento y capacidad de procesamiento");
      // values.put("Desc2","Descripcion con unboxing de la MaxbookPro en el video (click en la imgen)");
      // values.put("Url","2GftT2og8Uc");
      // db.insert("DatosProductos",null,values);
      // db.close();
      //
      // values.put("Name","MacBook");
      // values.put("Precio","1200");
      // values.put("Imagen 1",R.drawable.applemabook);
      // values.put("Imagen 2",R.drawable.macbookgrande);
      // values.put("Desc1","Computadora portátil de uso mas casual aunque sin dejar de ser bastante util y moderna");
      // values.put("Desc2","Descripcion con unboxing de la MacBook en general en el video (click en la imgen)");
      // values.put("Url","3OIftOhgTyw");
      // db.insert("DatosProductos",null,values);
      // db.close();
      //
      // values.put("Name","IpadmINI");
      // values.put("Precio","500");
      // values.put("Imagen 1",R.drawable.appleipad);
      // values.put("Imagen 2",R.drawable.ipadminigrande);
      // values.put("Desc1","Computadora de estilo tableta de tamaño mediano con sistema operativo IO's de uso mas familiar o de trabajo");
      // values.put("Desc2","Descripcion con unboxing del IpadMini en el video (click en la imgen)");
      // values.put("Url","VyvfDDSOrao");
      // db.insert("DatosProductos",null,values);
      // db.close();
      //
      // values.put("Name","Iphone 7 plus");
      // values.put("Precio","900");
      // values.put("Imagen 1",R.drawable.appleiphone);
      // values.put("Imagen 2",R.drawable.iphone7grande);
      // values.put("Desc1","Celular de Apple de última generación bastante comodo y tambien  de multiples herramientas");
      // values.put("Desc2","Descripcion con unboxing del iphone 7 en el video (click en la imgen)");
      // values.put("Url","4-4Jz6Lr014");
      // db.insert("DatosProductos",null,values);
      //
      // db.close();






        items.add(new Item(1,400,"Iphone", "lo ultimo en smart phones de la linea iphone con sistema operativo IO's en su ultima version", R.drawable.appleiphone,"DTh-I70X_YU", R.drawable.iphonegrande,"Descripcion con unboxing del dispositivo Iphone en general en el video (click en la imgen) "));
        items.add(new Item(2,1150,"Imac", "Computadora de escritorio de la linea Apple bastante comoda y actual para el uso en casa o oficinas", R.drawable.appleimac,"yZp1heY3vCY", R.drawable.imac1grande," Descripcion con unboxing del dispositivo IMac en el video (click en la imgen)"));
        items.add(new Item(3,1300,"MacBookpro", "Computadora portátil Apple dirigida especificamente a aquellos que desean un mejor rendimiento y capacidad de procesamiento", R.drawable.applemacbookpro,"2GftT2og8Uc", R.drawable.macbookprogrande," Descripcion con unboxing de la MaxbookPro en el video (click en la imgen)"));
        items.add(new Item(4,1200,"MacBook", "Computadora portátil de uso mas casual aunque sin dejar de ser bastante util y moderna", R.drawable.applemabook,"3OIftOhgTyw", R.drawable.macbookgrande,"Descripcion con unboxing de la Macbook en el video (click en la imgen)"));
        items.add(new Item(5,500,"IPadMini", "Computadora de estilo tableta de tamaño mediano con sistema operativo IO's de uso mas familiar o de trabajo", R.drawable.appleipad,"VyvfDDSOrao", R.drawable.ipadminigrande,"Descripcion con unboxing del IpadMini en el video (click en la imgen) "));
        items.add(new Item(6,900,"Iphone 7 Plus", "Celular de Apple de última generación bastante comodo y tambien  de multiples herramientas  ", R.drawable.appleiphone,"4-4Jz6Lr014", R.drawable.iphone7grande,"Descripcion con unboxing del iphone 7 en el video (click en la imgen) "));
        AdaptadorItem adaptador=new AdaptadorItem(Apple.this, items);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                Item item=items.get(posicion);
                TextView titulo=(TextView)vista.findViewById(R.id.titulo);
                Log.e("Item seleccionado", titulo.getText().toString());
                Intent producto =new Intent(Apple.this,Producto.class);
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