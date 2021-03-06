package com.example.hffy.gstore;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Celular extends AppCompatActivity {

    private ArrayList<Item> items=new ArrayList<Item>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celular);

        ListView lista=(ListView)findViewById(R.id.listViewCelular);

        items.add(new Item(1, "Huawei 8250", "Versión Android 5.1", R.drawable.hua8150," ",R.drawable.hua8150," "));
        items.add(new Item(2, "Huawei 760", "Versión 4.4.4 - KitKat", R.drawable.huag760," ",R.drawable.huag760," "));
        items.add(new Item(3, "Huawei novapluss", "Versión 6.0 Marshmallow", R.drawable.huanovaplus," ",R.drawable.huanovaplus," "));
        items.add(new Item(4, "Huawei 210", "Versión 4.2.2 – Jelly Bean", R.drawable.huay210," ",R.drawable.huay210," "));
        items.add(new Item(5, "Huawei 560", "Versión 5.1.1 - Lollipop", R.drawable.huay560," ",R.drawable.huay560," "));
        items.add(new Item(6, "Huawei y-ii", "Versión 4.2.2 – Jelly Bean", R.drawable.huayii," ",R.drawable.huayii," "));

        AdaptadorItem adaptador=new AdaptadorItem(Celular.this, items);
        lista.setAdapter(adaptador);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> array, View vista, int posicion,
                                    long id) {
                Item item = items.get(posicion);

            }
        });
    }
}
