package com.example.administrador.encal.Fragments;


import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.InputFilter;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.administrador.encal.Modelo.Data;
import com.example.administrador.encal.Pojos.CaratulaPojo;
import com.example.administrador.encal.Pojos.Marco;
import com.example.administrador.encal.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CaratulaFragment extends Fragment {

    private LinearLayout lytCaratula;
    private LinearLayout lytUbicacion;
    private LinearLayout lytDireccion;


    private Spinner spDepartamento;
    private Spinner spProvincia;
    private Spinner spDistrito;

    private TextView txtLatitud;
    private TextView txtLongitud;

    private EditText edtSector;
    private EditText edtArea;
    private EditText edtZona;
    private EditText edtManzana;
    private EditText edtFrente;
    private EditText edtNombreVia;
    private EditText edtNPuerta;
    private EditText edtInterior;
    private EditText edtBlock;
    private EditText edtPiso;
    private EditText edtManzanaVia;
    private EditText edtLote;
    private EditText edtKm;
    private EditText edtReferencia;

    private Button btnGPS;
    LocationManager locationManager;

    double longitudeGPS, latitudeGPS, altitudGPS;


    private Spinner spTipoVia;
    private String idCaratula;
    private CaratulaPojo caratula;
    private Context context;
    private Data data;
    private int[] arreglosDepartamentos  = {
            R.array.D_AMAZONAS, R.array.D_ANCASH, R.array.D_APURIMAC, R.array.D_AREQUIPA,
            R.array.D_AYACUCHO, R.array.D_CAJAMARCA, R.array.D_CALLAO, R.array.D_CUSCO,
            R.array.D_HUANCAVELICA, R.array.D_HUANUCO, R.array.D_ICA, R.array.D_JUNIN,
            R.array.D_LA_LIBERTAD, R.array.D_LAMBAYEQUE, R.array.D_LIMA, R.array.D_LORETO,
            R.array.D_MADRE_DE_DIOS, R.array.D_MOQUEGUA, R.array.D_PASCO, R.array.D_PIURA,
            R.array.D_PUNO, R.array.D_SAN_MARTIN, R.array.D_TACNA, R.array.D_TUMBES, R.array.D_UCAYALI
    };

    //mapa de variables
    private int CAMBIO;
    private String CCDD;
    private String CCPP;
    private String CCDI;
    private String NOMBREDD;
    private String NOMBREPV;
    private String NOMBREDI;
    private String GPSLATITUD;
    private String GPSALTITUD;
    private String GPSLONGITUD;
    private String CCST;
    private String CCAT;
    private String ZON_NUM;
    private String MZ_ID;
    private String FRENTE;
    private int TIPVIA;
    private String NOMVIA;
    private String NROPTA;
    private String BLOCK;
    private String INT;
    private String PISO;
    private String MZA;
    private String LOTE;
    private String KM;
    private String REF_DIREC;

    public CaratulaFragment() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public CaratulaFragment(String idCaratula, Context context) {
        this.idCaratula = idCaratula;
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_caratula, container, false);
        lytCaratula = rootView.findViewById(R.id.layout_caratulaFragment);
        lytDireccion = rootView.findViewById(R.id.caratula_lytDireccion);
        lytUbicacion = rootView.findViewById(R.id.caratula_lytUbicacion);

        locationManager = (LocationManager) getActivity().getSystemService(Context.LOCATION_SERVICE);

        spDepartamento = (Spinner) rootView.findViewById(R.id.caratula_spDepartamento);
        spProvincia = (Spinner) rootView.findViewById(R.id.caratula_spProvincia);
        spDistrito = (Spinner) rootView.findViewById(R.id.caratula_spDistrito);
        txtLatitud = (TextView) rootView.findViewById(R.id.caratula_txtLatitud);
        txtLongitud = (TextView) rootView.findViewById(R.id.caratula_txtLongitud);
        edtSector = (EditText) rootView.findViewById(R.id.caratula_edtSector);
        edtArea = (EditText) rootView.findViewById(R.id.caratula_edtArea);
        edtZona = (EditText) rootView.findViewById(R.id.caratula_edtZona);
        edtManzana = (EditText) rootView.findViewById(R.id.caratula_edtManzana);
        edtFrente = (EditText) rootView.findViewById(R.id.caratula_edtFrente);
        edtNombreVia = (EditText) rootView.findViewById(R.id.caratula_edtNombreVia);
        edtNPuerta = (EditText) rootView.findViewById(R.id.caratula_edtNPuerta);
        edtInterior = (EditText) rootView.findViewById(R.id.caratula_edtInterior);
        edtBlock = (EditText) rootView.findViewById(R.id.caratula_edtBlock);
        edtPiso = (EditText) rootView.findViewById(R.id.caratula_edtPiso);
        edtManzanaVia = (EditText) rootView.findViewById(R.id.caratula_edtManzanaVia);
        edtLote = (EditText) rootView.findViewById(R.id.caratula_edtLote);
        edtKm = (EditText) rootView.findViewById(R.id.caratula_edtKm);
        edtReferencia = (EditText) rootView.findViewById(R.id.caratula_edtReferencia);
        spTipoVia = (Spinner) rootView.findViewById(R.id.caratula_spTipoVia);
        btnGPS = (Button) rootView.findViewById(R.id.caratula_btnGPS);
        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lytCaratula.requestFocus();

        spDepartamento.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    spDepartamento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, final int pos, long l) {
                            if(pos != 0){
                                final String[] provincias = context.getResources().getStringArray(arreglosDepartamentos[pos-1]);
                                cargarSpinerProvincias(provincias);
                            }
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {}
                    });

                    spProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, final int pos, long l) {
                            data = new Data(context);
                            data.open();
                            String idUbi = checkDigito(spDepartamento.getSelectedItemPosition()) + checkDigito(pos);
                            final ArrayList<String> ubis = data.getUbigeos(idUbi);
                            data.close();
                            cargarSpinerDistritos(ubis);
                        }
                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {}
                    });
                }
                return false;
            }
        });


        spProvincia.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    spProvincia.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, final int pos, long l) {
                            data = new Data(context);
                            data.open();
                            String idUbi = checkDigito(spDepartamento.getSelectedItemPosition()) + checkDigito(pos);
                            final ArrayList<String> ubis = data.getUbigeos(idUbi);
                            data.close();
                            cargarSpinerDistritos(ubis);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {}
                    });
                }
                return false;
            }
        });

        btnGPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!checkLocation())
                    return;
                if (btnGPS.getText().equals(getResources().getString(R.string.cancelar_gps))) {
                    locationManager.removeUpdates(locationListenerGPS);
                    txtLongitud.setText("99,99999999");
                    txtLatitud.setText("99,99999999");
                    btnGPS.setText(getResources().getString(R.string.capturar_gps));
                } else {
                    txtLatitud.setText("Buscando, puede tardar 1 min...");
                    txtLongitud.setText("Buscando, puede tardar 1 min...");
                    if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                    }
                    locationManager.requestLocationUpdates(
                            LocationManager.GPS_PROVIDER, 2 * 20 * 1000, 10, locationListenerGPS);
                    btnGPS.setText(getResources().getString(R.string.cancelar_gps));
                }
            }
        });
        edtFrente.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtFrente);
                    lytUbicacion.requestFocus();
                    return true;
                }
                return false;
            }
        });
        edtNombreVia.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtNombreVia);
                    lytDireccion.requestFocus();
                    return true;
                }
                return false;
            }
        });


        EditText[] editTexts = {edtSector,edtArea,edtZona,
                edtManzana,edtFrente,edtNombreVia,edtNPuerta,edtBlock,edtInterior,edtPiso,
                edtManzanaVia,edtLote,edtKm,edtReferencia};

        for (int i = 0; i <editTexts.length ; i++) {
            EditText editText = editTexts[i];
            editText.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        }
        cargarCaratula();
        cargarDatosIniciales();

    }

    public void cargarCaratula(){
        Context contexto2 = context;
        Context contexto3 = context;
        data = new Data(contexto3);
        data.open();
        caratula = data.getCaratula(idCaratula);
        if(caratula.getID().equals("")){
            Marco marco = data.getMarco(idCaratula);
            caratula.setID(marco.getID());
            caratula.setCCDD(marco.getCCDD());
            caratula.setNOMBREDD(marco.getDEPARTAMENTO());
            caratula.setCCPP(marco.getCCPP());
            caratula.setNOMBREPV(marco.getPROVINCIA());
            caratula.setCCDI(marco.getCCDI());
            caratula.setNOMBREDI(marco.getDISTRITO());
            caratula.setARA_TR("001");
            caratula.setSECTOR_TR("001");
            caratula.setFRENTE(marco.getFRENTE());
            caratula.setZONA(marco.getZONA());
            caratula.setMANZANA_ID(marco.getMANZANA());
        }
        data.close();
    }

    public void cargarDatosIniciales(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                final String[] departamentos = context.getResources().getStringArray(R.array.DEPARTAMENTOS);
                data = new Data(context);
                data.open();
                final String[] provincias = context.getResources().getStringArray(arreglosDepartamentos[Integer.parseInt(caratula.getCCDD())-1]);
                final String idUbi = checkDigito(Integer.parseInt(caratula.getCCDD())) + checkDigito(Integer.parseInt(caratula.getCCPP()));
                final ArrayList<String> distritos = data.getUbigeos(idUbi);
                data.close();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        cargarSpinerDepartamentos(departamentos);
                        cargarSpinerProvincias(provincias);
                        cargarSpinerDistritos(distritos);
                        spDepartamento.setSelection(Integer.parseInt(caratula.getCCDD()));
                        spProvincia.setSelection(Integer.parseInt(caratula.getCCPP()));
                        spDistrito.setSelection(obtenerPosDistrito(idUbi,Integer.parseInt(caratula.getCCDI())));
                        cargarDatos();
                    }
                });
            }
        };
        thread.start();
    }

    public void cargarDatos(){
        txtLatitud.setText(caratula.getGPSLATITUD());
        txtLongitud.setText(caratula.getGPSLONGITUD());
        edtSector.setText(caratula.getSECTOR_TR());
        edtArea.setText(caratula.getARA_TR());
        edtZona.setText(caratula.getZONA());
        edtManzana.setText(caratula.getMANZANA_ID());
        edtFrente.setText(caratula.getFRENTE());
        if(!caratula.getTIPVIA().equals("")) spTipoVia.setSelection(Integer.parseInt(caratula.getTIPVIA()));
        edtNombreVia.setText(caratula.getTIPVIA_D());
        edtNPuerta.setText(caratula.getNROPTA());
        edtBlock.setText(caratula.getBLOCK());
        edtInterior.setText(caratula.getINTERIOR());
        edtPiso.setText(caratula.getPISO());
        edtManzanaVia.setText(caratula.getMZA());
        edtLote.setText(caratula.getLOTE());
        edtKm.setText(caratula.getKM());
        edtReferencia.setText(caratula.getREF_DIREC());
    }
    public void cargarUbigeoInicial(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                final String[] departamentos = context.getResources().getStringArray(R.array.DEPARTAMENTOS);
                data = new Data(context);
                data.open();
                final Marco marco = data.getMarco(idCaratula);
                final String[] provincias = context.getResources().getStringArray(arreglosDepartamentos[Integer.parseInt(marco.getCCDD())-1]);
                final String idUbi = checkDigito(Integer.parseInt(marco.getCCDD())) + checkDigito(Integer.parseInt(marco.getCCPP()));
                final ArrayList<String> distritos = data.getUbigeos(idUbi);
                data.close();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        cargarSpinerDepartamentos(departamentos);
                        cargarSpinerProvincias(provincias);
                        cargarSpinerDistritos(distritos);
                        spDepartamento.setSelection(Integer.parseInt(marco.getCCDD()));
                        spProvincia.setSelection(Integer.parseInt(marco.getCCPP()));
                        spDistrito.setSelection(obtenerPosDistrito(idUbi,Integer.parseInt(marco.getCCDI())));
                    }
                });
            }
        };
        thread.start();
    }
    public void cargarSpinerDepartamentos(String[] datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDepartamento.setAdapter(adapter);
    }

    public void cargarSpinerProvincias(String[] datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spProvincia.setAdapter(adapter);
    }

    public void cargarSpinerDistritos(ArrayList<String> datos){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, android.R.layout.simple_spinner_item,datos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spDistrito.setAdapter(adapter);
    }
    public String obtenerCCDI(int pos, String ubi){
        String codigo = "";
        if(ubi.equals("0907")){
            int[] codigos = {1 ,2 , 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
            codigo = checkDigito(codigos[pos-1]);
        }else if(ubi.equals("1003")){
            int[] codigos = {1, 7, 11, 13, 16, 17, 21, 22, 23};
            codigo = checkDigito(codigos[pos-1]);
        }else if(ubi.equals("1201")){
            int[] codigos = {1, 4, 5, 6, 7, 8, 11, 12, 13, 14, 16, 17, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36};
            codigo = checkDigito(codigos[pos-1]);
        }else if(ubi.equals("1206")){
            int[] codigos = {1, 2,3,5,7,8,9,99};
            codigo = checkDigito(codigos[pos-1]);
        }else if(ubi.equals("1306")){
            int[] codigos = {1,2,4,5,6,8,10,11,13,14};
            codigo = checkDigito(codigos[pos-1]);
        }else  if(ubi.equals("1601")){
            int[] codigos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14};
            codigo = checkDigito(codigos[pos-1]);
        }else if(ubi.equals("1602")){
            int[] codigos = {1, 2, 5, 6, 10, 11};
            codigo = checkDigito(codigos[pos-1]);
        }else if(ubi.equals("2001")){
            int[] codigos = {1,4,5,7,8,9,10,11,14,15};
            codigo = checkDigito(codigos[pos-1]);
        }else{
            codigo = checkDigito(pos);
        }
        return codigo;
    }
    public String checkDigito (int number) {
        return number <= 9 ? "0" + number : String.valueOf(number);
    }
    public int obtenerPosDistrito(String ubi, int cod){
        int posicion = 0;
        if(ubi.equals("0907")){
            int[] codigos = {1 ,2 , 3, 4, 5, 6, 7, 9, 10, 11, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i + 1;break;}
            }
        }else if(ubi.equals("1003")){
            int[] codigos = {1, 7, 11, 13, 16, 17, 21, 22, 23};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i+ 1;break;}
            }
        }else if(ubi.equals("1201")){
            int[] codigos = {1, 4, 5, 6, 7, 8, 11, 12, 13, 14, 16, 17, 19, 20, 21, 22, 24, 25, 26, 27, 28, 29, 30, 32, 33, 34, 35, 36};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i+ 1;break;}
            }
        }else if(ubi.equals("1206")){
            int[] codigos = {1, 2,3,5,7,8,9,99};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i+ 1;break;}
            }
        }else if(ubi.equals("1306")){
            int[] codigos = {1,2,4,5,6,8,10,11,13,14};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i+ 1;break;}
            }
        }else  if(ubi.equals("1601")){
            int[] codigos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i+ 1;break;}
            }
        }else if(ubi.equals("1602")){
            int[] codigos = {1, 2, 5, 6, 10, 11};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i+ 1;break;}
            }
        }else if(ubi.equals("2001")){
            int[] codigos = {1,4,5,7,8,9,10,11,14,15};
            for (int i = 0; i < codigos.length; i++) {
                if(codigos[i] == cod){ posicion = i+ 1;break;}
            }
        }else{
            posicion = cod;
        }
        return posicion;
    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    private boolean checkLocation() {
        if (!isLocationEnabled())
            showAlert();
        return isLocationEnabled();
    }

    private void showAlert() {
        final AlertDialog.Builder dialog = new AlertDialog.Builder(context);
        dialog.setTitle("Enable Location")
                .setMessage("Su ubicación esta desactivada.\npor favor active su ubicación " +
                        "usa esta app")
                .setPositiveButton("Configuración de ubicación", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                        Intent myIntent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(myIntent);
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface paramDialogInterface, int paramInt) {
                    }
                });
        dialog.show();
    }

    private boolean isLocationEnabled() {
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
    }
    private final LocationListener locationListenerGPS = new LocationListener() {
        public void onLocationChanged(Location location) {
            try{
                longitudeGPS = location.getLongitude();
                latitudeGPS = location.getLatitude();
                altitudGPS = location.getAltitude();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        txtLongitud.setText(longitudeGPS + "");
                        txtLatitud.setText(latitudeGPS + "");
                        btnGPS.setText("LISTO");
                        btnGPS.setEnabled(false);
                    }
                });
            }catch (Exception e){
            }finally{
            }
        }
        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {
        }

        @Override
        public void onProviderEnabled(String s) {
        }
        @Override
        public void onProviderDisabled(String s) {
        }
    };
}
