package com.example.user.shop_navigationview;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    // Instancia del Drawer
    private DrawerLayout drawerLayout;

    //Titulo del drawer
    private String drawerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setear Toolbar
        setToolbar();

        //Binding DrawerLayout
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        //Binding NavigationView
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        if(navigationView != null)
        {
            //Añadimos las caracteristicas
        }

        //Obtenemos el titulo del Drawer
        drawerTitle = getResources().getString(R.string.principal_item);
        if(savedInstanceState == null)
        {
            //Seleccionamos un item
        }
    }

    //Metodo de setear el toolbar
    private void setToolbar() {
        //Binding del toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();

        if(ab != null)
        {
            //Ubicamos el icono
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        if(!drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
