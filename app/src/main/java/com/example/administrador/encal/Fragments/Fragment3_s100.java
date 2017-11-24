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
public class Fragment3_s100 extends Fragment {

    private RadioGroup p111_rg;

    private RadioGroup  p112_rg;
    private EditText p112_edt;
    private CardView p112_card;

    private CheckBox p113_ck1;
    private CheckBox p113_ck2;
    private CheckBox p113_ck3;
    private CheckBox p113_ck4;
    private CheckBox p113_ck5;
    private EditText p113_edt;
    private CardView p113_card;


    private CheckBox p114_ck1;
    private CheckBox p114_ck2;
    private CheckBox p114_ck3;
    private CheckBox p114_ck4;
    private CheckBox p114_ck5;
    private CheckBox p114_ck6;
    private CheckBox p114_ck7;
    private EditText p114_edt;
    private CardView p114_card;




    public Fragment3_s100() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment3_s100, container, false);
        p111_rg = (RadioGroup) view.findViewById(R.id.sec100_p111_rg);

        p112_rg = (RadioGroup) view.findViewById(R.id.sec100_p112_rg);
        p112_edt = (EditText) view.findViewById(R.id.edtEspecifique_p112);
        p112_card = (CardView) view.findViewById(R.id.p112_card);

        p113_ck1 = (CheckBox) view.findViewById(R.id.sec100_p113_ck1);
        p113_ck2 = (CheckBox) view.findViewById(R.id.sec100_p113_ck2);
        p113_ck3 = (CheckBox) view.findViewById(R.id.sec100_p113_ck3);
        p113_ck4 = (CheckBox) view.findViewById(R.id.sec100_p113_ck4);
        p113_ck5 = (CheckBox) view.findViewById(R.id.sec100_p113_ck5);
        p113_edt = (EditText) view.findViewById(R.id.txtEspecifique_p113);
        p113_card = (CardView) view.findViewById(R.id.p113_card);

        p114_ck1 = (CheckBox) view.findViewById(R.id.sec100_p114_ck1);
        p114_ck2 = (CheckBox) view.findViewById(R.id.sec100_p114_ck2);
        p114_ck3 = (CheckBox) view.findViewById(R.id.sec100_p114_ck3);
        p114_ck4 = (CheckBox) view.findViewById(R.id.sec100_p114_ck4);
        p114_ck5 = (CheckBox) view.findViewById(R.id.sec100_p114_ck5);
        p114_ck6 = (CheckBox) view.findViewById(R.id.sec100_p114_ck6);
        p114_ck7 = (CheckBox) view.findViewById(R.id.sec100_p114_ck7);
        p114_edt = (EditText) view.findViewById(R.id.txtEspecifique_p114);
        p114_card = (CardView) view.findViewById(R.id.p114_card);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //----pregunta 111
        p111_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.sec100_p111_rb1:   p112_card.setVisibility(View.VISIBLE); p113_card.setVisibility(View.VISIBLE);p114_card.setVisibility(View.GONE);break;
                    case R.id.sec100_p111_rb2:   p112_card.setVisibility(View.GONE); p113_card.setVisibility(View.GONE);p114_card.setVisibility(View.VISIBLE); break;
                }
            }
        });

        //----pregunta 112
        p112_rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.sec100_p112_rb1:   p112_edt.setVisibility(View.GONE);break;
                    case R.id.sec100_p112_rb2:   p112_edt.setVisibility(View.GONE);break;
                    case R.id.sec100_p112_rb3:   p112_edt.setVisibility(View.GONE);break;
                    case R.id.sec100_p112_rb4:   p112_edt.setVisibility(View.GONE);break;
                    case R.id.sec100_p112_rb5:   p112_edt.setVisibility(View.VISIBLE);break;
                }
            }
        });

        //----pregunta 113
        p113_ck5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p113_edt.setVisibility(View.VISIBLE);
                }
                else p113_edt.setVisibility(View.GONE);
            }
        });

        //-----pregunta 114

        p114_ck7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    p114_edt.setVisibility(View.VISIBLE);
                }
                else p114_edt.setVisibility(View.GONE);
            }
        });

    }
}