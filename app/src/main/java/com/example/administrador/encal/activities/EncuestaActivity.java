package com.example.administrador.encal.activities;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrador.encal.Fragments.CaratulaFragment;
import com.example.administrador.encal.Fragments.Fragment1_s100;
import com.example.administrador.encal.Fragments.Fragment1_s200;
import com.example.administrador.encal.Fragments.Fragment1_s300;
import com.example.administrador.encal.Fragments.Fragment1_s400;
import com.example.administrador.encal.Fragments.Fragment2_s100;
import com.example.administrador.encal.Fragments.Fragment2_s400;
import com.example.administrador.encal.Fragments.Fragment3_s100;
import com.example.administrador.encal.Fragments.InicioFragment;
import com.example.administrador.encal.R;

public class EncuestaActivity extends AppCompatActivity {
    private CaratulaFragment caratulaFragment;
    private InicioFragment inicioFragment;
    private Fragment1_s100 fragment1_s100;
    private Fragment1_s200 fragment1_s200;
    private Fragment1_s300 fragment1_s300;
    private Fragment1_s400 fragment1_s400;
    private Fragment2_s100 fragment2_s100;
    private Fragment2_s400 fragment2_s400;
    private Fragment3_s100 fragment3_s100;
    private String idEmpresa;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    private int cont=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        final Bundle recupera=getIntent().getExtras();
        if(recupera != null){
            idEmpresa = recupera.getString("idEmpresa");
        }

        Toolbar toolbar = (Toolbar)findViewById(R.id.encuesta_toolbar);
        setSupportActionBar(toolbar);
        caratulaFragment = new CaratulaFragment(idEmpresa,this);
        inicioFragment = new InicioFragment();
        fragment1_s100 = new Fragment1_s100();
        fragment1_s200 = new Fragment1_s200();
        fragment1_s300 = new Fragment1_s300();
        fragment1_s400 = new Fragment1_s400();
        fragment2_s100 = new Fragment2_s100();
        fragment2_s400 = new Fragment2_s400();
        fragment3_s100 = new Fragment3_s100();

        fragmentManager = getSupportFragmentManager();

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.layout_fragment1,caratulaFragment);
        fragmentTransaction.commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_control,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId() ){
            case R.id.adelante:

                if(cont<9){
                    cont++;
                    NumeroFragment(cont);
                }

                return true;
            case R.id.atras:

                if(cont>1){
                    cont = cont-1;
                    NumeroFragment(cont);
                }

                return true;
            default:return super.onOptionsItemSelected(item);
        }

    }


    public void NumeroFragment(int poscicion){
        switch (poscicion){
            case 1:
                CaratulaFragment caratulaFragment = new CaratulaFragment(idEmpresa,EncuestaActivity.this);
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,caratulaFragment);
                fragmentTransaction.commit(); break;
            case 2:
                InicioFragment inicioFragment = new InicioFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,inicioFragment);
                fragmentTransaction.commit(); break;
            case 3:
                Fragment1_s100 fragment1_s100 = new Fragment1_s100();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s100);
                fragmentTransaction.commit(); break;
            case 4:
                Fragment2_s100 fragment2_s100 = new Fragment2_s100();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment2_s100);
                fragmentTransaction.commit(); break;
            case 5:
                Fragment3_s100 fragment3_s100 = new Fragment3_s100();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment3_s100);
                fragmentTransaction.commit(); break;
            case 6:
                Fragment1_s200 fragment1_s200 = new Fragment1_s200();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s200);
                fragmentTransaction.commit(); break;
            case 7:
                Fragment1_s300 fragment1_s300 = new Fragment1_s300();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s300);
                fragmentTransaction.commit(); break;

            case 8:
                Fragment1_s400 fragment1_s400 = new Fragment1_s400();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s400);
                fragmentTransaction.commit(); break;
            case 9:
                Fragment2_s400 fragment2_s400 = new Fragment2_s400();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment2_s400);
                fragmentTransaction.commit(); break;
        }
    }
}
