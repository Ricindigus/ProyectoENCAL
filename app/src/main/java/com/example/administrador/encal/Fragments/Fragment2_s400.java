package com.example.administrador.encal.Fragments;


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

import com.example.administrador.encal.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2_s400 extends Fragment {
    private CheckBox p409_ck1;
    private CheckBox p409_ck2;
    private CheckBox p409_ck3;
    private CheckBox p409_ck4;
    private CheckBox p409_ck5;
    private EditText p409_edt;
    private CardView p409_card;

    private RadioGroup p410_rg;
    private EditText p410_edt;
    private CardView p410_card;




    public Fragment2_s400() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment2_s400, container, false);
        p409_ck1  = (CheckBox) view.findViewById(R.id.sec400_p409_ck1);
        p409_ck2  = (CheckBox) view.findViewById(R.id.sec400_p409_ck2);
        p409_ck3  = (CheckBox) view.findViewById(R.id.sec400_p409_ck3);
        p409_ck4  = (CheckBox) view.findViewById(R.id.sec400_p409_ck4);
        p409_ck5  = (CheckBox) view.findViewById(R.id.sec400_p409_ck5);
        p409_edt = (EditText) view.findViewById(R.id.txtEspecifique_p409);
        p409_card = (CardView) view.findViewById(R.id.p409_card);


        p410_rg = (RadioGroup) view.findViewById(R.id.sec400_p410_rg);
        p410_edt = (EditText) view.findViewById(R.id.edtEspecifique_p410);
        p410_card = (CardView) view.findViewById(R.id.p410_card);

        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //-----ñpregunta409
        p409_ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p410_card.setVisibility(View.GONE);
                    p409_ck2.setEnabled(false);
                    p409_ck3.setEnabled(false);
                    p409_ck4.setEnabled(false);
                    p409_ck5.setEnabled(false);
                }else{
                    p410_card.setVisibility(View.VISIBLE);
                    p409_ck2.setEnabled(true);
                    p409_ck3.setEnabled(true);
                    p409_ck4.setEnabled(true);
                    p409_ck5.setEnabled(true);

                }
            }
        });

        p409_ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p409_edt.setVisibility(View.VISIBLE);
                }else{
                    p409_edt.setVisibility(View.GONE);
                }
            }
        });

        //-----pregunta410
        p410_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.sec400_p410_rb1: p410_card.setVisibility(View.GONE); break;
                    case R.id.sec400_p410_rb2: break;
                    case R.id.sec400_p410_rb3: break;
                    case R.id.sec400_p410_rb4: break;


                }
            }
        });
    }
}
