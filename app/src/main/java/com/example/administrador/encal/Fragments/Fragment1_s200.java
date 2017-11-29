package com.example.administrador.encal.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.administrador.encal.Modelo.Data;
import com.example.administrador.encal.Pojos.IdentificacionPojo;
import com.example.administrador.encal.Pojos.Sec200PojoF1;
import com.example.administrador.encal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1_s200 extends Fragment {

    private CheckBox p201_ck1;
    private CheckBox p201_ck2;
    private CheckBox p201_ck3;
    private CheckBox p201_ck4;

    private RadioGroup p202_rg;

    private RadioGroup p203_rg;
    private EditText p203_edt;
    private CardView p203_card;

    private EditText p204_edt;
    private CardView p204_card;

    private CheckBox p205_ck1;
    private CheckBox p205_ck2;
    private CheckBox p205_ck3;
    private CheckBox p205_ck4;
    private CheckBox p205_ck5;
    private CheckBox p205_ck6;
    private EditText p205_edt;
    private CardView p205_card;


    private String idempresa;
    private Sec200PojoF1 sec200PojoF1;
    private Context context;
    private Data data;

    //mapeo de variables
    int P_201_1;int P_201_2;int P_201_3;int P_201_4;int P_202;
    int P_203;String P_203_O;String P_204;int P_205_1;int P_205_2;
    int P_205_3;int P_205_4;int P_205_5;int P_205_6;String P_205_6_O;

    public Fragment1_s200() {
        // Required empty public constructor
    }

    @SuppressLint("ValidFragment")
    public Fragment1_s200(String idempresa, Context context) {
        this.idempresa = idempresa;
        this.context = context;
        data = new Data(context);
        data.open();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1_s200, container, false);
        p201_ck1 = (CheckBox) view.findViewById(R.id.sec200_p201_ck1);
        p201_ck2 = (CheckBox) view.findViewById(R.id.sec200_p201_ck2);
        p201_ck3 = (CheckBox) view.findViewById(R.id.sec200_p201_ck3);
        p201_ck4 = (CheckBox) view.findViewById(R.id.sec200_p201_ck4);

        p202_rg =  (RadioGroup) view.findViewById(R.id.sec200_p202_rg);

        p203_rg =  (RadioGroup) view.findViewById(R.id.sec200_p203_rg);
        p203_edt = (EditText) view.findViewById(R.id.edtEspecifique_p203);
        p203_card = (CardView) view.findViewById(R.id.p203_card);

        p204_edt = (EditText) view.findViewById(R.id.sec200_p204_edt1);
        p204_card = (CardView) view.findViewById(R.id.p204_card);


        p205_ck1 = (CheckBox) view.findViewById(R.id.sec200_p205_ck1);
        p205_ck2 = (CheckBox) view.findViewById(R.id.sec200_p205_ck2);
        p205_ck3 = (CheckBox) view.findViewById(R.id.sec200_p205_ck3);
        p205_ck4 = (CheckBox) view.findViewById(R.id.sec200_p205_ck4);
        p205_ck5 = (CheckBox) view.findViewById(R.id.sec200_p205_ck5);
        p205_ck6 = (CheckBox) view.findViewById(R.id.sec200_p205_ck6);
        p205_edt = (EditText) view.findViewById(R.id.txtEspecifique_p205);
        p205_card = (CardView) view.findViewById(R.id.p205_card);


        return view;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //----pregunta202
        p202_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sec200_p202_rb1:   p203_card.setVisibility(View.VISIBLE); p204_card.setVisibility(View.VISIBLE);p205_card.setVisibility(View.VISIBLE);break;
                    case R.id.sec200_p202_rb2:   p203_card.setVisibility(View.GONE); p204_card.setVisibility(View.GONE);p205_card.setVisibility(View.GONE); break;
                }

            }
        });

        //----pregunta203
        p203_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.sec200_p203_rb1:   p203_edt.setVisibility(View.GONE); p203_edt.setText("");break;
                    case R.id.sec200_p203_rb2:   p203_edt.setVisibility(View.GONE);p203_edt.setText("");break;
                    case R.id.sec200_p203_rb3:   p203_edt.setVisibility(View.GONE);p203_edt.setText("");break;
                    case R.id.sec200_p203_rb4:   p203_edt.setVisibility(View.VISIBLE);break;
                }
            }
        });

        //----pregunta 205
        p205_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p205_edt.setVisibility(View.VISIBLE);
                }
                else p205_edt.setVisibility(View.GONE);
            }
        });

    }
}
