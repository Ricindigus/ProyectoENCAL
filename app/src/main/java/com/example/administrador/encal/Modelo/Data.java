package com.example.administrador.encal.Modelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.administrador.encal.Pojos.BDFragment;
import com.example.administrador.encal.Pojos.CaratulaPojo;
import com.example.administrador.encal.Pojos.IdentificacionPojo;
import com.example.administrador.encal.Pojos.PojoMarco;
import com.example.administrador.encal.Pojos.Ubigeo;
import com.example.administrador.encal.Pojos.Usuario;

import java.util.ArrayList;

/**
 * Created by mcarazas on 27/11/2017.
 */

public class Data {
    Context contexto;
    SQLiteOpenHelper sqLiteOpenHelper;
    SQLiteDatabase sqLiteDatabase;

    public Data(Context contexto) {
        this.contexto = contexto;
        sqLiteOpenHelper = new DBHelper(contexto);
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void open(){
        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
    }

    public void close(){
        sqLiteOpenHelper.close();
    }

    public long getNumeroItemsMarco(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableMarco);
    }
    public long getNumeroItemsUsuario(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableUsuarios);
    }
    public long getNumeroItemsUbigeo(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableUbigeo);
    }
    public long getNumeroItemsVisita(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableVisitas);
    }
    public long getNumeroItemsCaratula(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableCaratulas);
    }
    public long getNumeroItemsIdentificacion(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableIdentificaciones);
    }
    public long getNumeroItemsFragment(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableFragments);
    }
    public long getNumeroItemsModulo1(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo1);
    }
    public long getNumeroItemsModulo2(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo2);
    }
    public long getNumeroItemsModulo3(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo3);
    }
    public long getNumeroItemsModulo4(){
        return DatabaseUtils.queryNumEntries(sqLiteDatabase,SQLConstantes.tableModulo4);
    }


    //----------------------USUARIOS-----------------------------------------------------------------------------------------
    public void insertarUsuario(Usuario usuario){
        ContentValues contentValues = usuario.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableUsuarios,null,contentValues);
    }
    public void insertarUsuarios(ArrayList<Usuario> usuarios){
        long items = getNumeroItemsUsuario();
        if(items == 0){
            for (Usuario usuario : usuarios) {
                try {
                    insertarUsuario(usuario);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public Usuario getUsuario(String idUsuario){
        Usuario usuario = new Usuario();
        String[] whereArgs = new String[]{idUsuario};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableUsuarios,
                    SQLConstantes.ALL_COLUMNS_USUARIOS,SQLConstantes.WHERE_CLAUSE_ID_USUARIO,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                usuario.setUSUARIO_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.USUARIO_ID)));
                usuario.setUSUARIO_PASSWORD(cursor.getString(cursor.getColumnIndex(SQLConstantes.USUARIO_PASSWORD)));
                usuario.setUSUARIO_PERMISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.USUARIO_PERMISO)));
            }
        }finally{
            if(cursor != null) cursor.close();
        }
        return usuario;
    }
    //------------------FIN USUARIO-----------------------------------------------------------------------------------------------------
    //----------------------UBIGEOS-------------------------------------------------------------------------------------------------------
    public void insertarUbigeo(Ubigeo ubigeo){
        ContentValues contentValues = ubigeo.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableUbigeo,null,contentValues);
    }
    public void insertarUbigeos(ArrayList<Ubigeo> ubigeos){
        long items = getNumeroItemsUbigeo();
        if(items == 0){
            for (Ubigeo ubigeo : ubigeos) {
                try {
                    insertarUbigeo(ubigeo);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public ArrayList<String> getUbigeos(String idUbi){
        ArrayList<String> ubigeos = new ArrayList<String>();
        ubigeos.add("Seleccione");
        String[] whereArgs = new String[]{idUbi};
        long items = getNumeroItemsUbigeo();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableUbigeo,
                    SQLConstantes.ALL_COLUMNS_UBIGEOS,SQLConstantes.WHERE_CLAUSE_ID_UBIGEO,whereArgs,null,null,null);
            while(cursor.moveToNext()){
                ubigeos.add(cursor.getString(cursor.getColumnIndex(SQLConstantes.UBIGEO_DISTRITO)));
            }
        }finally{
            if(cursor != null) cursor.close();
        }
        return ubigeos;
    }
    //------------------FIN UBIGEO-----------------------------------------------------------------------------------------------------

    //------------------CARATULA-------------------------------------------------------------------------------------------------------

    public void insertarCaratula(CaratulaPojo caratula){
        ContentValues contentValues = caratula.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableCaratulas,null,contentValues);
    }
    public void InsertarCaratulas(ArrayList<CaratulaPojo> caratulas){
        long items = getNumeroItemsCaratula();
        if(items == 0){
            for (CaratulaPojo caratula : caratulas) {
                try {
                    insertarCaratula(caratula);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void actualizarCaratula(String idEmpresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.update(SQLConstantes.tableCaratulas,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    public boolean existeCaratula(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableCaratulas,
                    SQLConstantes.ALL_COLUMNS_CARATULA,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null)cursor.close();
        }
        return encontrado;
    }
    public CaratulaPojo getCaratula(String idEmpresa){
        CaratulaPojo caratula = new CaratulaPojo();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableCaratulas,
                    SQLConstantes.ALL_COLUMNS_CARATULA,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                caratula.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ID)));
                caratula.setNOMBREDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO)));
                caratula.setCCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO_COD)));
                caratula.setNOMBREPV(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA)));
                caratula.setCCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA_COD)));
                caratula.setNOMBREDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO)));
                caratula.setCCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO_COD)));
                caratula.setGPSLATITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLATITUD)));
                caratula.setGPSLONGITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLONGITUD)));
                caratula.setSECTOR_TR(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_SECTOR)));
                caratula.setARA_TR(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_AREA)));
                caratula.setZONA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ZONA)));
                caratula.setMANZANA_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_MUESTRA)));
                caratula.setFRENTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FRENTE)));
                caratula.setTIPVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_TIPVIA)));
                caratula.setTIPVIA_ESPEC(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_TIPVIA_OTRO)));
                caratula.setTIPVIA_D(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NOMVIA)));
                caratula.setNROPTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NPUERTA)));
                caratula.setBLOCK(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_BLOCK)));
                caratula.setINTERIOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_INTERIOR)));
                caratula.setPISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PISO)));
                caratula.setMZA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_VIA)));
                caratula.setLOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_LOTE)));
                caratula.setKM(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_KM)));
                caratula.setREF_DIREC(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_REFERENCIA)));
            }
        }finally{
            if(cursor != null) cursor.close();
        }
        return caratula;
    }

    public ArrayList<CaratulaPojo> getAllCaratulas(){
        ArrayList<CaratulaPojo> caratulas = new ArrayList<CaratulaPojo>();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableCaratulas,
                    SQLConstantes.ALL_COLUMNS_CARATULA,null,null,null,null,null);
            while(cursor.moveToNext()) {
                CaratulaPojo caratula = new CaratulaPojo();
                caratula.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ID)));
                caratula.setNOMBREDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO)));
                caratula.setCCDD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DEPARTAMENTO_COD)));
                caratula.setNOMBREPV(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA)));
                caratula.setCCPP(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PROVINCIA_COD)));
                caratula.setNOMBREDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO)));
                caratula.setCCDI(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_DISTRITO_COD)));
                caratula.setGPSLATITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLATITUD)));
                caratula.setGPSLONGITUD(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_GPSLONGITUD)));
                caratula.setSECTOR_TR(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_SECTOR)));
                caratula.setARA_TR(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_AREA)));
                caratula.setZONA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_ZONA)));
                caratula.setMANZANA_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_MUESTRA)));
                caratula.setFRENTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_FRENTE)));
                caratula.setTIPVIA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_TIPVIA)));
                caratula.setTIPVIA_ESPEC(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_TIPVIA_OTRO)));
                caratula.setTIPVIA_D(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NOMVIA)));
                caratula.setNROPTA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_NPUERTA)));
                caratula.setBLOCK(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_BLOCK)));
                caratula.setINTERIOR(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_INTERIOR)));
                caratula.setPISO(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_PISO)));
                caratula.setMZA(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_MANZANA_VIA)));
                caratula.setLOTE(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_LOTE)));
                caratula.setKM(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_KM)));
                caratula.setREF_DIREC(cursor.getString(cursor.getColumnIndex(SQLConstantes.CARATULA_REFERENCIA)));
                caratulas.add(caratula);
            }
        }finally {
            if(cursor!=null) cursor.close();
        }
        return caratulas;
    }
    public void deleteCaratula(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableCaratulas,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }

//-----------------------------------------FIN CARATULA-------------------------------------------------------------------------------

    //----------------------------------------IDENTIFICACION---------------------------------------------------------------------------
    public void insertarIdentificacion(IdentificacionPojo identificacion){
        ContentValues contentValues = identificacion.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableIdentificaciones,null,contentValues);
    }

    public void InsertarIdentificaciones(ArrayList<IdentificacionPojo> identificaciones){
        long items = getNumeroItemsIdentificacion();
        if(items == 0){
            for (IdentificacionPojo identificacion : identificaciones) {
                try {
                    insertarIdentificacion(identificacion);
                }catch (SQLiteException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean existeIdentificacion(String idEmpresa){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableIdentificaciones,
                    SQLConstantes.ALL_COLUMNS_IDENTIFICACIONES,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null)cursor.close();
        }
        return encontrado;
    }

    public void actualizarIdentificacion(String idEmpresa, ContentValues contentValues){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.update(SQLConstantes.tableIdentificaciones,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }

    public IdentificacionPojo getIdentificacion(String idEmpresa){
        IdentificacionPojo identificacion = new IdentificacionPojo();
        String[] whereArgs = new String[]{idEmpresa};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableIdentificaciones,
                    SQLConstantes.ALL_COLUMNS_IDENTIFICACIONES,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1){
                cursor.moveToFirst();
                identificacion.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ID)));
                identificacion.setNUM_RUC(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RUC)));
                identificacion.setRAZON_SOCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RAZON)));
                identificacion.setNOM_COMER_MYPE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_NOMBRE)));
                identificacion.setANO_INI(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ANIO_FUNCIONAMIENTO)));
                identificacion.setPAGWEB_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEBNO)));
                identificacion.setPAGWEB(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEB)));
                identificacion.setCORREO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREONO)));
                identificacion.setCORREO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREO)));
                identificacion.setTELFIJO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJONO)));
                identificacion.setTELFIJO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJO)));
                identificacion.setTELMOVIL_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVILNO)));
                identificacion.setTELMOVIL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVIL)));
                identificacion.setCOND_APEL_NOM(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_NOMBRE)));
                identificacion.setCOND_SEXO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_SEXO)));
                identificacion.setCOND_EDAD(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_EDAD)));
                identificacion.setCOND_NEST(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_ESTUDIOS)));
                identificacion.setINFOR_CARGO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO)));
                identificacion.setINFOR_CARGO_O(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO_ESP)));
                identificacion.setINFOR_APEL_NOM(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_APEYNOM)));
                identificacion.setCONOCE_INACAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CONOCE_INACAL)));
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return identificacion;
    }

    public ArrayList<IdentificacionPojo> getAllIdentificaciones(){
        ArrayList<IdentificacionPojo> identificaciones = new ArrayList<>();
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableIdentificaciones,
                    SQLConstantes.ALL_COLUMNS_IDENTIFICACIONES,null,null,null,null,null);
            while(cursor.moveToNext()){
                IdentificacionPojo identificacion = new IdentificacionPojo();
                identificacion.setID(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ID)));
                identificacion.setNUM_RUC(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RUC)));
                identificacion.setRAZON_SOCIAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_RAZON)));
                identificacion.setNOM_COMER_MYPE(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_NOMBRE)));
                identificacion.setANO_INI(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_ANIO_FUNCIONAMIENTO)));
                identificacion.setPAGWEB_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEBNO)));
                identificacion.setPAGWEB(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_WEB)));
                identificacion.setCORREO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREONO)));
                identificacion.setCORREO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CORREO)));
                identificacion.setTELFIJO_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJONO)));
                identificacion.setTELFIJO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_FIJO)));
                identificacion.setTELMOVIL_NO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVILNO)));
                identificacion.setTELMOVIL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_MOVIL)));
                identificacion.setCOND_APEL_NOM(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_NOMBRE)));
                identificacion.setCOND_SEXO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_SEXO)));
                identificacion.setCOND_EDAD(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_EDAD)));
                identificacion.setCOND_NEST(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_ESTUDIOS)));
                identificacion.setINFOR_CARGO(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO)));
                identificacion.setINFOR_CARGO_O(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CARGO_ESP)));
                identificacion.setINFOR_APEL_NOM(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_APEYNOM)));
                identificacion.setCONOCE_INACAL(cursor.getString(cursor.getColumnIndex(SQLConstantes.IDENTIFICACION_CONDUCTOR_CONOCE_INACAL)));
                identificaciones.add(identificacion);
            }
        }finally {
            if(cursor != null) cursor.close();
        }
        return identificaciones;
    }
    public void deleteIdentificacion(String idEmpresa){
        String[] whereArgs = new String[]{idEmpresa};
        sqLiteDatabase.delete(SQLConstantes.tableIdentificaciones,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
    //-----------------FIN IDENTIFICACION----------------------------------------------------------------------------------------------
    //----------------FRAGMENTS-----------------------------------------------------------------------------------------------
    public BDFragment getFragment(String idFragment){
        BDFragment bdFragment = new BDFragment();
        String[] whereArgs = new String[]{idFragment};
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.query(SQLConstantes.tableFragments,
                    SQLConstantes.ALL_COLUMNS_FRAGMENTS, SQLConstantes.WHERE_CLAUSE_ID_EMPRESA, whereArgs, null, null, null);
            if (cursor.getCount() == 1) {
                cursor.moveToFirst();
                bdFragment.setFRAGMENT_ID(cursor.getString(cursor.getColumnIndex(SQLConstantes.FRAGMENT_ID)));
                bdFragment.setFRAGMENT_HABILITADO(cursor.getString(cursor.getColumnIndex(SQLConstantes.FRAGMENT_HABILITADO)));
                bdFragment.setFRAGMENT_AVANCE(cursor.getString(cursor.getColumnIndex(SQLConstantes.FRAGMENT_AVANCE)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(cursor != null) cursor.close();
        }
        return bdFragment;
    }

    public boolean existeFragment(String idFragment){
        boolean encontrado = false;
        String[] whereArgs = new String[]{idFragment};
        Cursor cursor = null;
        try{
            cursor = sqLiteDatabase.query(SQLConstantes.tableFragments,
                    SQLConstantes.ALL_COLUMNS_FRAGMENTS,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs,null,null,null);
            if(cursor.getCount() == 1) encontrado = true;
        }finally {
            if(cursor != null){
                cursor.close();
            }
        }
        return encontrado;
    }

    public void insertarFragment(BDFragment bdFragment){
        ContentValues contentValues = bdFragment.toValues();
        sqLiteDatabase.insert(SQLConstantes.tableFragments,null,contentValues);
    }

    public void insertarFragments(ArrayList<BDFragment> bdFragments){
        long items = getNumeroItemsFragment();
        for (BDFragment bdFragment : bdFragments) {
            try {
                insertarFragment(bdFragment);
            }catch (SQLiteException e){
                e.printStackTrace();
            }

        }

    }
    public void actualizarFragment(String idFragment, ContentValues contentValues){
        String[] whereArgs = new String[]{idFragment};
        sqLiteDatabase.update(SQLConstantes.tableFragments,contentValues,SQLConstantes.WHERE_CLAUSE_ID_EMPRESA,whereArgs);
    }
//------------------------------------------FIN FRAGMENTS--------------------------------------------------------------------------


}
