package com.example.administrador.encal.activities;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrador.encal.Adapters.AdapterMarco;
import com.example.administrador.encal.Pojos.PojoMarco;
import com.example.administrador.encal.R;

import java.util.ArrayList;

public class MarcoActivity extends AppCompatActivity {
    private ArrayList<PojoMarco> pojoMarcos;
    private RecyclerView recyclerMarco;
    private LinearLayoutManager managerMarco;
    private AdapterMarco adapterMarco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marco);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.marco_toolbar);
        setSupportActionBar(myToolbar);

        recyclerMarco = (RecyclerView) findViewById(R.id.marco_recycler);
        recyclerMarco.setHasFixedSize(true);
        managerMarco = new LinearLayoutManager(MarcoActivity.this);
        recyclerMarco.setLayoutManager(managerMarco);
        cargarData();
        adapterMarco = new AdapterMarco(pojoMarcos,new AdapterMarco.OnItemClickListener() {
            @Override
            public void onItemClick(PojoMarco item) {
                Intent intent = new Intent(MarcoActivity.this,EncuestaActivity.class);
                startActivity(intent);
            }
        });
        recyclerMarco.setAdapter(adapterMarco);
    }

    public void cargarData(){
        pojoMarcos = new ArrayList<PojoMarco>();
        pojoMarcos.add(new PojoMarco("001","12345678","petroperu","lima"));
        pojoMarcos.add(new PojoMarco("001","12345678","petroperu","lima"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.marco_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_importar:
                return true;
            case R.id.menu_exportar:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
