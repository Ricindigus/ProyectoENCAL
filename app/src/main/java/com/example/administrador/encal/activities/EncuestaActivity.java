package com.example.administrador.encal.activities;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.administrador.encal.Fragments.CaratulaFragment;
import com.example.administrador.encal.Fragments.Fragment1_s100;
import com.example.administrador.encal.Fragments.Fragment1_s200;
import com.example.administrador.encal.Fragments.Fragment1_s300;
import com.example.administrador.encal.Fragments.Fragment1_s400;
import com.example.administrador.encal.Fragments.Fragment2_s100;
import com.example.administrador.encal.Fragments.Fragment2_s400;
import com.example.administrador.encal.Fragments.Fragment3_s100;
import com.example.administrador.encal.Fragments.InicioFragment;
import com.example.administrador.encal.Modelo.Data;
import com.example.administrador.encal.Modelo.SQLConstantes;
import com.example.administrador.encal.Pojos.BDFragment;
import com.example.administrador.encal.R;

import java.util.ArrayList;

public class EncuestaActivity extends AppCompatActivity {
    private CaratulaFragment caratulaFragment;
    private Fragment fragmentActual = new Fragment();
    private InicioFragment inicioFragment;
    private Fragment1_s100 fragment1_s100;
    private Fragment1_s200 fragment1_s200;
    private Fragment1_s300 fragment1_s300;
    private Fragment1_s400 fragment1_s400;
    private Fragment2_s100 fragment2_s100;
    private Fragment2_s400 fragment2_s400;
    private Fragment3_s100 fragment3_s100;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;
    private String idEmpresa = "";
    private Data data;
    private String observaciones = "";

    private int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);



        final Bundle recupera=getIntent().getExtras();
        if(recupera != null){
            idEmpresa = recupera.getString("idEmpresa");
        }

        data = new Data(this);
        data.open();
        String idInsertar = idEmpresa+0;
        if(!data.existeFragment(idInsertar)){
            ArrayList<BDFragment> bdFragments = new ArrayList<BDFragment>();
            BDFragment bdFragment = new BDFragment();
            for (int i = 0; i <= 8 ; i++) {
                bdFragment = new BDFragment(idEmpresa+i,"1","0");
                bdFragments.add(bdFragment);
            }
            data.insertarFragments(bdFragments);
        }
        data.close();

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

                if(cont<8){
                    cont++;
                    SetFragment(cont);
                }

                return true;
            case R.id.atras:

                if(cont>0){
                    cont = cont-1;
                    SetFragment(cont);
                }

                return true;
            default:return super.onOptionsItemSelected(item);
        }

    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void guardarObservaciones(int tipo){
        data = new Data(EncuestaActivity.this);
        data.open();
        if(cont >= 3 && cont <= 4){

            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.SECCION100_OBS,observaciones);
            data.actualizarModulo1(idEmpresa,contentValues);

        }
        if(cont >= 6 && cont <= 6){

            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.SECCION200_OBS,observaciones);
            data.actualizarModulo2(idEmpresa,contentValues);

        }
        if(cont >= 7 && cont <= 7){

            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.SECCION300_OBS,observaciones);
            data.actualizarModulo3(idEmpresa,contentValues);

        }
        if(cont >= 8 && cont <= 8){

            ContentValues contentValues = new ContentValues(1);
            contentValues.put(SQLConstantes.SECCION400_OBS,observaciones);
            data.actualizarModulo4(idEmpresa,contentValues);

        }
        data.close();
    }

    public boolean validarFragment(int tipo){
        boolean correcto = false;
        switch (tipo){
            case 0:
                CaratulaFragment caratulaFragment = (CaratulaFragment) fragmentActual;
                //correcto = caratulaFragment.validar();
                break;
            case 1:
                InicioFragment inicioFragment1 = (InicioFragment) fragmentActual;
                //correcto = inicioFragment1.validar();
                break;
            case 2:
                Fragment1_s100 fragment1_s100 = (Fragment1_s100) fragmentActual;
                //correcto = fragment1_s100.validar();
                break;
            case 3:
                Fragment2_s100 fragment2_s100 = (Fragment2_s100) fragmentActual;
                //correcto = fragment2_s100.validar();
                break;
            case 4:
                Fragment3_s100 fragment3_s100= (Fragment3_s100) fragmentActual;
                //correcto = fragment3_s100.validar();
                break;
            case 5:
                Fragment1_s200 fragment1_s200= (Fragment1_s200) fragmentActual;
                //correcto = fragment1_s200.validar();
                break;
            case 6:
                Fragment1_s300 fragment1_s300= (Fragment1_s300) fragmentActual;
                //correcto = fragment1_s300.validar();
                break;
            case 7:
                Fragment1_s400 fragment1_s400 = (Fragment1_s400) fragmentActual;
                //correcto = fragment1_s400.validar();
                break;
            case 8:
                Fragment2_s400 fragment2_s400 = (Fragment2_s400) fragmentActual;
                //correcto = fragment2_s400.validar();
                break;
        }
        return correcto;
    }

    public void guardarFragment(int tipo){
        switch (tipo){
            case 0:
                CaratulaFragment caratulaFragment = (CaratulaFragment) fragmentActual;
                //caratulaFragment.guardarDatos();break;
            case 1:
                InicioFragment inicioFragment1 = (InicioFragment) fragmentActual;
                //inicioFragment1.guardarDatos();break;
            case 2:
                Fragment1_s100 fragment1_s100 = (Fragment1_s100) fragmentActual;
                //fragment1_s100.guardarDatos();break;
            case 3:
                Fragment2_s100 fragment2_s100 = (Fragment2_s100) fragmentActual;
                //fragment2_s100.guardarDatos();break;
            case 4:
                Fragment3_s100 fragment3_s100= (Fragment3_s100) fragmentActual;
                //fragment3_s100.guardarDatos();break;
            case 5:
                Fragment1_s200 fragment1_s200= (Fragment1_s200) fragmentActual;
                //fragment1_s200.guardarDatos();break;
            case 6:
                Fragment1_s300 fragment1_s300= (Fragment1_s300) fragmentActual;
                //fragment1_s300.guardarDatos();break;
            case 7:
                Fragment1_s400 fragment1_s400 = (Fragment1_s400) fragmentActual;
                //fragment1_s400.guardarDatos();break;
            case 8:
                Fragment2_s400 fragment2_s400 = (Fragment2_s400) fragmentActual;
                //fragment2_s400.guardarDatos();break;

        }
    }


    public void SetFragment(int poscicion){
        /*observaciones = "";
        data = new Data(this);
        data.open();
        if(cont >= 3 && cont <= 4){
            observaciones = data.getModulo1(idEmpresa).getOBS();
        }
        if(cont >= 6 && cont <= 6){
            observaciones = data.getModulo2(idEmpresa).getOBS();
        }
        if(cont >= 7 && cont <= 7){
            observaciones = data.getModulo3(idEmpresa).getOBS();
        }
        if(cont >= 8 && cont <= 8){
            observaciones = data.getModulo4(idEmpresa).getOBS();
        }

        data.close();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //if(direccion > 0){
        //    fragmentTransaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left);
        //}else{
        //    fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
        //}*/
        switch (poscicion){
            case 0:
                CaratulaFragment caratulaFragment = new CaratulaFragment(idEmpresa,EncuestaActivity.this);
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,caratulaFragment);
                fragmentTransaction.commit(); break;
            case 1:
                InicioFragment inicioFragment = new InicioFragment();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,inicioFragment);
                fragmentTransaction.commit(); break;
            case 2:
                Fragment1_s100 fragment1_s100 = new Fragment1_s100();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s100);
                fragmentTransaction.commit(); break;
            case 3:
                Fragment2_s100 fragment2_s100 = new Fragment2_s100();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment2_s100);
                fragmentTransaction.commit(); break;
            case 4:
                Fragment3_s100 fragment3_s100 = new Fragment3_s100();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment3_s100);
                fragmentTransaction.commit(); break;
            case 5:
                Fragment1_s200 fragment1_s200 = new Fragment1_s200();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s200);
                fragmentTransaction.commit(); break;
            case 6:
                Fragment1_s300 fragment1_s300 = new Fragment1_s300();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s300);
                fragmentTransaction.commit(); break;

            case 7:
                Fragment1_s400 fragment1_s400 = new Fragment1_s400();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment1_s400);
                fragmentTransaction.commit(); break;
            case 8:
                Fragment2_s400 fragment2_s400 = new Fragment2_s400();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.layout_fragment1,fragment2_s400);
                fragmentTransaction.commit(); break;
        }
    }

    @SuppressLint("NewApi")
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Está seguro que desea volver al marco y salir de la encuesta?")
                    .setTitle("Aviso")
                    .setCancelable(false)
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            })
                    .setPositiveButton("Sí",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    finish();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        return super.onKeyDown(keyCode, event);
    }
}
