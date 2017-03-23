package com.example.hffy.gstore;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mikepenz.iconics.typeface.FontAwesome;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeader;
import com.mikepenz.materialdrawer.accountswitcher.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MenuPrincipal extends AppCompatActivity {

    private ImageView imgLaptop;
    private ImageView imgCelular;
    private ImageView imgWatch;
    private ImageView imgApple;
    private ImageView imgHuawei;
    private ImageView imgOferta;
    private ImageView imgComic;
    private ImageView imgManga;
    private ImageView imgPc;
    private ImageView imgXbox;
    private ImageView imgNintendo;
    private ImageView imgPs;
    private ImageView imgAlien;
    private ImageView imgCombat;
    private ImageView imgRpg;
    private ImageView imgShooter;
    private ImageView imgCarrera;
    private ImageView imgFight;
    private ImageView imgArcade;
    private ImageView imgTerror;
    private ImageView imgDeportes;
    private ImageView imgGeekzone;

    private TextView titulo;
    private TextView cerrar;

    private static final int DRAWER_ITEM_UNO = 1;
    private static final int DRAWER_ITEM_DOS = 2;
    private static final int DRAWER_ITEM_TRES = 3;
    private static final int DRAWER_ITEM_CUATRO = 4;

    //Definimos el entorno
    private Drawer drawer;
    private Context context;
    private FrameLayout contenedor;

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        context=this;
        imgLaptop=(ImageView)findViewById(R.id.imgLaptop);
        imgCelular=(ImageView)findViewById(R.id.imgCelular);
        imgWatch=(ImageView)findViewById(R.id.imgWatch);
        imgApple=(ImageView)findViewById(R.id.imgApple);
        //imgSamsung=(ImageView)findViewById(R.id.imgSamsung);
        imgHuawei=(ImageView)findViewById(R.id.imgHuawei);
        imgOferta=(ImageView)findViewById(R.id.imgOfertas);
        imgComic=(ImageView)findViewById(R.id.imgComic);
        imgManga=(ImageView)findViewById(R.id.imgManga);
        imgPc=(ImageView)findViewById(R.id.imgPc);
        imgXbox=(ImageView)findViewById(R.id.imgXbox);
        imgNintendo=(ImageView)findViewById(R.id.imgNintendo);
        imgAlien=(ImageView)findViewById(R.id.imgAlien);
        imgPs=(ImageView)findViewById(R.id.imgPs);
        imgCombat=(ImageView)findViewById(R.id.imgCombate);
        imgRpg=(ImageView)findViewById(R.id.imgRpg);
        imgShooter=(ImageView)findViewById(R.id.imgShooter);
        imgCarrera=(ImageView)findViewById(R.id.imgCarrera);
        imgFight=(ImageView)findViewById(R.id.imgFight);
        imgArcade=(ImageView)findViewById(R.id.imgArcade);
        imgTerror=(ImageView)findViewById(R.id.imgTerror);
        imgDeportes=(ImageView)findViewById(R.id.imgDeportes);

        titulo=(TextView)findViewById(R.id.Titulo);

        SharedPreferences prefs =
                getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        //Se busca los datos almacenados. SI no hay el resultado será no.
        String usuario_almacenado = prefs.getString("txtUsuario","no");

        titulo.setText("Bienvenido: "+usuario_almacenado);

        //DESDE

        // Handle Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        //Contenedor es el espacio central
        contenedor=(FrameLayout)findViewById(R.id.contenedor);

        //Header
        AccountHeader headerResult = new AccountHeaderBuilder()
                .withActivity(this)
                .withHeaderBackground(R.drawable.androidrec)
                .addProfiles(
                        new ProfileDrawerItem().
                                withName("Dev Fest 2015").
                                withEmail("info@devfest.xyz")
                )
                .build();

        //Navigacion Drawer
        drawer = new DrawerBuilder(this)
                .withToolbar(toolbar)
                .withAccountHeader(headerResult)
                .addDrawerItems(
                        new DividerDrawerItem(),
                        //Items de navegacion
                        new PrimaryDrawerItem().
                                withIdentifier(DRAWER_ITEM_UNO).
                                withName("DAtos de Usuario").
                                withTextColor(getResources().getColor(R.color.primary)).
                                withIconColor(getResources().getColor(R.color.primary)).
                                withSelectedTextColor(getResources().getColor(R.color.colorAccent)).
                                withSelectedIconColor(getResources().getColor(R.color.colorAccent)).
                                withIcon(FontAwesome.Icon.faw_home),
                        new PrimaryDrawerItem().
                                withIdentifier(DRAWER_ITEM_DOS).
                                withName("En duda").
                                withTextColor(getResources().getColor(R.color.primary)).
                                withIconColor(getResources().getColor(R.color.primary)).
                                withSelectedTextColor(getResources().getColor(R.color.colorAccent)).
                                withSelectedIconColor(getResources().getColor(R.color.colorAccent)).
                                withIcon(FontAwesome.Icon.faw_mars_stroke_v),
                        new PrimaryDrawerItem().
                                withIdentifier(DRAWER_ITEM_TRES).
                                withName("About").
                                withTextColor(getResources().getColor(R.color.primary)).
                                withIconColor(getResources().getColor(R.color.primary)).
                                withSelectedTextColor(getResources().getColor(R.color.colorAccent)).
                                withSelectedIconColor(getResources().getColor(R.color.colorAccent)).
                                withIcon(FontAwesome.Icon.faw_newspaper_o)
                ).addStickyDrawerItems(
                        //Parte inferior
                        new SecondaryDrawerItem()
                                .withName("Cerrar Secion")
                                .withIdentifier(DRAWER_ITEM_CUATRO)
                                .withIcon(FontAwesome.Icon.faw_info)
                                .withTextColor(getResources().getColor(R.color.primary))
                                .withIconColor(getResources().getColor(R.color.primary))
                                .withSelectedTextColor(getResources().getColor(R.color.colorAccent))
                                .withSelectedIconColor(getResources().getColor(R.color.colorAccent))
                                .withCheckable(false)
                )
                //Accion Click sobre los items de menu

                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener()
                {
                    @Override
                    public boolean onItemClick(AdapterView<?> adapterView, View view, int i, long l, IDrawerItem drawerItem) {
                        seleccionartItem(drawerItem.getIdentifier());
                        return false;
                    }
                })
                .withSelectedItem(0)
                .withSavedInstance(savedInstanceState)
                .build();
        //Hasta

        imgLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent laptop= new Intent(context,Laptop.class);
                startActivity(laptop);

            }
        });
        imgCelular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent celular= new Intent(context,Celular.class);
                startActivity(celular);

            }
        });
        imgWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatch= new Intent(context,Whatch.class);
                startActivity(whatch);

            }
        });
        imgApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent apple= new Intent(context,Apple.class);
                startActivity(apple);

            }
        });

        imgHuawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent huawei= new Intent(context,Huawei.class);
                startActivity(huawei);

            }
        });
        imgOferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oferta= new Intent(context,Oferta.class);
                startActivity(oferta);

            }
        });
        imgComic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent comic= new Intent(context,Comic.class);
                startActivity(comic);

            }
        });
        imgManga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manga= new Intent(context,Manga.class);
                startActivity(manga);

            }
        });
        imgPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pc= new Intent(context,Pc.class);
                startActivity(pc);

            }
        });
        imgXbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent xbox= new Intent(context,Xbox.class);
                startActivity(xbox);

            }
        });
        imgNintendo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nintendo= new Intent(context,Nintendo.class);
                startActivity(nintendo);

            }
        });
        imgPs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ps= new Intent(context,Ps.class);
                startActivity(ps);

            }
        });
        imgAlien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alien= new Intent(context,Alien.class);
                startActivity(alien);

            }
        });
        imgCombat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent combat= new Intent(context,Combat.class);
                startActivity(combat);

            }
        });
        imgRpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rpg= new Intent(context,Rpg.class);
                startActivity(rpg);

            }
        });
        imgShooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shooter= new Intent(context,Shooter.class);
                startActivity(shooter);

            }
        });
        imgCarrera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camera= new Intent(context,Carrera.class);
                startActivity(camera);

            }
        });
        imgFight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fight= new Intent(context,Fight.class);
                startActivity(fight);

            }
        });
        imgArcade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arcade= new Intent(context,Arcade.class);
                startActivity(arcade);

            }
        });
        imgTerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent terror= new Intent(context,Terror.class);
                startActivity(terror);

            }
        });
        imgDeportes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deportes = new Intent(context,Deportes.class);
                startActivity(deportes);

            }
        });
    }

    private void logOut() {
        AlertDialog.Builder Dialogo = new AlertDialog.Builder(MenuPrincipal.this);

        Dialogo.setTitle("!ADVERTENCIA!");
        Dialogo.setMessage("¿Estas serguro que deseas salir?");


        Dialogo.setPositiveButton("Si",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),
                                "Cerrando sesión.", Toast.LENGTH_SHORT).show();
                        Intent a = new Intent(getApplicationContext(), MainActivity.class);
                        finish();
                        startActivity(a);
                    }
                });

        Dialogo.setNegativeButton("No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        Dialogo.show();



        SharedPreferences prefs =
                getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
    }

    //Desde
    //Funcion de seleccion de item
    private void seleccionartItem(int identificador)
    {
        switch (identificador){
            case DRAWER_ITEM_UNO:

                break;
            case DRAWER_ITEM_DOS:

                break;
            case DRAWER_ITEM_TRES:
                AlertDialog dialogo;
                AlertDialog.Builder builder = new AlertDialog.Builder(MenuPrincipal.this);

                builder.setTitle("G-Store V2.0 Creada Por:");
                builder.setMessage("Hugo Flores\n" +
                "Sergio Bellot\n"+
                "Matheus Garcia Mesa");
                dialogo = builder.create();
                dialogo.getWindow().getAttributes().windowAnimations = R.style.transicion;
                dialogo.show();
                dialogo.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    public void onCancel(DialogInterface dialog) {
                        dialog.dismiss();
                    }
                });

                break;
            case DRAWER_ITEM_CUATRO:
                logOut();
                break;
            default:
                break;
        }

       // Toast.makeText(context,"Selecciono el item N "+identificador,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //Guardamos la info del drawer
        if (drawer != null) {
            outState = drawer.saveInstanceState(outState);
        }
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Boton hamburguesa en el ActionBar para Abrir y Cerrar el Navigation Drawer
        if(item.getItemId()==android.R.id.home) {
            if (drawer.isDrawerOpen())
                drawer.closeDrawer();
            else
                drawer.openDrawer();
        }
        return super.onOptionsItemSelected(item);
    }
    //Hasta
}
