package com.example.administrador.encal.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.administrador.encal.EncuestaActivity;
import com.example.administrador.encal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1_s300 extends Fragment {

    private RadioGroup p301_rg;

    private RadioGroup p302_rg;
    private LinearLayout p302_lyt;
    private EditText p302_masaotro;
    private EditText p302_longotro;
    private EditText p302_presotro;
    private EditText p302_temotro;
    private EditText p302_volotro;
    private EditText p302_ototro;
    private RadioGroup p302_rgM1;
    private RadioGroup p302_rgM2;
    private RadioGroup p302_rgM3;
    private RadioGroup p302_rgM4;
    private RadioGroup p302_rgM5;
    private RadioGroup p302_rgM6;
    private RadioGroup p302_rgM7;
    private RadioGroup p302_rgM8;
    private RadioGroup p302_rgL1;
    private RadioGroup p302_rgL2;
    private RadioGroup p302_rgL3;
    private RadioGroup p302_rgL4;
    private RadioGroup p302_rgL5;
    private RadioGroup p302_rgL6;
    private RadioGroup p302_rgL7;
    private RadioGroup p302_rgL8;
    private RadioGroup p302_rgP1;
    private RadioGroup p302_rgP2;
    private RadioGroup p302_rgP3;
    private RadioGroup p302_rgP4;
    private RadioGroup p302_rgP5;
    private RadioGroup p302_rgP6;
    private RadioGroup p302_rgP7;
    private RadioGroup p302_rgP8;
    private RadioGroup p302_rgP9;
    private RadioGroup p302_rgP10;
    private RadioGroup p302_rgT1;
    private RadioGroup p302_rgT2;
    private RadioGroup p302_rgT3;
    private RadioGroup p302_rgT4;
    private RadioGroup p302_rgT5;
    private RadioGroup p302_rgT6;
    private RadioGroup p302_rgT7;
    private RadioGroup p302_rgT8;
    private RadioGroup p302_rgV1;
    private RadioGroup p302_rgV2;
    private RadioGroup p302_rgV3;
    private RadioGroup p302_rgV4;
    private RadioGroup p302_rgV5;
    private RadioGroup p302_rgV6;
    private RadioGroup p302_rgO1;
    private RadioGroup p302_rgO2;
    private EditText p302_mCant1;
    private EditText p302_mCant2;
    private EditText p302_mCant3;
    private EditText p302_mCant4;
    private EditText p302_lCant1;
    private EditText p302_lCant2;
    private EditText p302_lCant3;
    private EditText p302_lCant4;
    private EditText p302_pCant1;
    private EditText p302_pCant2;
    private EditText p302_pCant3;
    private EditText p302_pCant4;
    private EditText p302_pCant5;
    private EditText p302_tCant1;
    private EditText p302_tCant2;
    private EditText p302_tCant3;
    private EditText p302_tCant4;
    private EditText p302_vCant1;
    private EditText p302_vCant2;
    private EditText p302_vCant3;
    private EditText p302_oCant1;
    private RadioButton p302_rbM9;
    private RadioButton p302_rbM10;
    private RadioButton p302_rbM11;
    private RadioButton p302_rbM12;
    private RadioButton p302_rbM13;
    private RadioButton p302_rbM14;
    private RadioButton p302_rbM15;
    private RadioButton p302_rbM16;




    private CheckBox p303_ck1;
    private CheckBox p303_ck2;
    private CheckBox p303_ck3;
    private CheckBox p303_ck4;
    private CheckBox p303_ck5;
    private CardView p303_card;

    private RadioGroup p304_rg;
    private CardView p304_card;

    private TextInputEditText p305_edt;
    private CardView p305_card;


    public Fragment1_s300() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1_s300, container, false);
        p301_rg = (RadioGroup) view.findViewById(R.id.sec300_p301_rg);

        p302_rg = (RadioGroup) view.findViewById(R.id.sec300_p302_rg);
        p302_masaotro = (EditText) view.findViewById(R.id.sec300_p302_edtotro1);
        p302_longotro = (EditText) view.findViewById(R.id.sec300_p302_edtotro2);
        p302_presotro = (EditText) view.findViewById(R.id.sec300_p302_edtotro3);
        p302_temotro = (EditText) view.findViewById(R.id.sec300_p302_edtotro4);
        p302_volotro = (EditText) view.findViewById(R.id.sec300_p302_edtotro5);
        p302_ototro = (EditText) view.findViewById(R.id.sec300_p302_edtotro6);
        p302_rgM1 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM1);
        p302_rgM2 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM2);
        p302_rgM3 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM3);
        p302_rgM4 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM4);
        p302_rgM5 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM5);
        p302_rgM6 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM6);
        p302_rgM7 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM7);
        p302_rgM8 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgM8);
        p302_rgL1 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL1);
        p302_rgL2 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL2);
        p302_rgL3 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL3);
        p302_rgL4 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL4);
        p302_rgL5 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL5);
        p302_rgL6 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL6);
        p302_rgL7 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL7);
        p302_rgL8 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgL8);
        p302_rgP1 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP1);
        p302_rgP2 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP2);
        p302_rgP3 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP3);
        p302_rgP4 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP4);
        p302_rgP5 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP5);
        p302_rgP6 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP6);
        p302_rgP7 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP7);
        p302_rgP8 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP8);
        p302_rgP9 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP9);
        p302_rgP10 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgP10);
        p302_rgT1 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT1);
        p302_rgT2 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT2);
        p302_rgT3 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT3);
        p302_rgT4 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT4);
        p302_rgT5 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT5);
        p302_rgT6 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT6);
        p302_rgT7 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT7);
        p302_rgT8 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgT8);
        p302_rgV1 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgV1);
        p302_rgV2 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgV2);
        p302_rgV3 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgV3);
        p302_rgV4 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgV4);
        p302_rgV5 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgV5);
        p302_rgV6 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgV6);
        p302_rgO1 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgO1);
        p302_rgO2 = (RadioGroup) view.findViewById(R.id.sec300_p302_rgO2);
        p302_mCant1 = (EditText) view.findViewById(R.id.sec300_p302_edtC1);
        p302_mCant2 = (EditText) view.findViewById(R.id.sec300_p302_edtC2);
        p302_mCant3 = (EditText) view.findViewById(R.id.sec300_p302_edtC3);
        p302_mCant4 = (EditText) view.findViewById(R.id.sec300_p302_edtC4);
        p302_lCant1 = (EditText) view.findViewById(R.id.sec300_p302_edtC5);
        p302_lCant2 = (EditText) view.findViewById(R.id.sec300_p302_edtC6);
        p302_lCant3 = (EditText) view.findViewById(R.id.sec300_p302_edtC7);
        p302_lCant4 = (EditText) view.findViewById(R.id.sec300_p302_edtC8);
        p302_pCant1 = (EditText) view.findViewById(R.id.sec300_p302_edtC9);
        p302_pCant2 = (EditText) view.findViewById(R.id.sec300_p302_edtC10);
        p302_pCant3 = (EditText) view.findViewById(R.id.sec300_p302_edtC11);
        p302_pCant4 = (EditText) view.findViewById(R.id.sec300_p302_edtC12);
        p302_pCant5 = (EditText) view.findViewById(R.id.sec300_p302_edtC13);
        p302_tCant1 = (EditText) view.findViewById(R.id.sec300_p302_edtC14);
        p302_tCant2 = (EditText) view.findViewById(R.id.sec300_p302_edtC15);
        p302_tCant3 = (EditText) view.findViewById(R.id.sec300_p302_edtC16);
        p302_tCant4 = (EditText) view.findViewById(R.id.sec300_p302_edtC17);
        p302_vCant1 = (EditText) view.findViewById(R.id.sec300_p302_edtC18);
        p302_vCant2 = (EditText) view.findViewById(R.id.sec300_p302_edtC19);
        p302_vCant3 = (EditText) view.findViewById(R.id.sec300_p302_edtC20);
        p302_oCant1 = (EditText) view.findViewById(R.id.sec300_p302_edtC21);
        p302_lyt = (LinearLayout) view.findViewById(R.id.sec100_p302_lyt);

        p303_ck1 = (CheckBox) view.findViewById(R.id.sec300_p303_ck1);
        p303_ck2 = (CheckBox) view.findViewById(R.id.sec300_p303_ck2);
        p303_ck3 = (CheckBox) view.findViewById(R.id.sec300_p303_ck3);
        p303_ck4 = (CheckBox) view.findViewById(R.id.sec300_p303_ck4);
        p303_ck5 = (CheckBox) view.findViewById(R.id.sec300_p303_ck5);
        p303_card = (CardView) view.findViewById(R.id.p303_card);

        p304_rg = (RadioGroup) view.findViewById(R.id.sec300_p304_rg);
        p304_card = (CardView) view.findViewById(R.id.p304_card);

        p305_edt = (TextInputEditText) view.findViewById(R.id.sec300_p305_edt1);
        p305_card = (CardView) view.findViewById(R.id.p305_card);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //----pregunta 302
        p302_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sec300_p302_rbSi:   p302_lyt.setVisibility(View.VISIBLE);
                                                 p303_card.setVisibility(View.VISIBLE);
                                                 p304_card.setVisibility(View.VISIBLE);
                                                 p305_card.setVisibility(View.VISIBLE);break;
                    case R.id.sec300_p302_rbNo:   p302_lyt.setVisibility(View.GONE);
                                                 p303_card.setVisibility(View.GONE);
                                                 p304_card.setVisibility(View.GONE);
                                                 p305_card.setVisibility(View.GONE); break;
                }

            }
        });

        p302_rgM1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sec300_p302_rbM1:  p302_rbM9.setEnabled(true);p302_rbM10.setEnabled(true);break;
                    case R.id.sec300_p302_rbM2:  p302_rbM9.setEnabled(false);p302_rbM10.setEnabled(false);break;
                }

            }
        });
        p302_rgM2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sec300_p302_rbM3:  p302_rbM11.setEnabled(true);p302_rbM12.setEnabled(true);break;
                    case R.id.sec300_p302_rbM4:  p302_rbM11.setEnabled(false);p302_rbM12.setEnabled(false);break;
                }

            }
        });

        p302_rgM3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sec300_p302_rbM5:  p302_rbM13.setEnabled(true);p302_rbM14.setEnabled(true);break;
                    case R.id.sec300_p302_rbM6:  p302_rbM13.setEnabled(false);p302_rbM14.setEnabled(false);break;
                }

            }
        });
        p302_rgM4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.sec300_p302_rbM7:  p302_rbM15.setEnabled(true);p302_rbM15.setEnabled(true);break;
                    case R.id.sec300_p302_rbM8:  p302_rbM15.setEnabled(false);p302_rbM15.setEnabled(false);break;
                }

            }
        });

        //----pregunta 303
        final CheckBox[] checkBox = {p303_ck1,p303_ck2,p303_ck3,p303_ck4};

        for(int i=0;i<checkBox.length;i++){
            checkBox[i].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if(b){
                        p304_card.setVisibility(View.GONE);
                    }else{
                        if (checkBox[0].isChecked()||checkBox[1].isChecked()||checkBox[2].isChecked()||checkBox[3].isChecked()){
                            p304_card.setVisibility(View.GONE);
                        }else {
                            p304_card.setVisibility(View.VISIBLE);
                        }

                    }
                }
            });
        }




    }
}
