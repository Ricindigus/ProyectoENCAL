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
public class Fragment1_s400 extends Fragment {
    private CheckBox p401_ck1;
    private CheckBox p401_ck2;
    private CheckBox p401_ck3;
    private CheckBox p401_ck4;
    private CheckBox p401_ck5;

    private RadioGroup p402_rg;
    private CardView p402_card;

    private CheckBox p403_ck1;
    private CheckBox p403_ck2;
    private CheckBox p403_ck3;
    private CheckBox p403_ck4;


    private RadioGroup p404_rg;
    private CardView p404_card;

    private RadioGroup p405_rg;
    private CardView p405_card;

    private EditText p406_edt1;
    private CardView p406_card;

    private CheckBox p407_ck1;
    private CheckBox p407_ck2;
    private CheckBox p407_ck3;
    private CheckBox p407_ck4;
    private CheckBox p407_ck5;
    private CheckBox p407_ck6;
    private CheckBox p407_ck7;
    private EditText p407_edt;
    private CardView p407_card;

    private CheckBox p408_ck1;
    private CheckBox p408_ck2;
    private CheckBox p408_ck3;
    private CheckBox p408_ck4;
    private CheckBox p408_ck5;
    private CheckBox p408_ck6;
    private EditText p408_edt;
    private CardView p408_card;


    public Fragment1_s400() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment1_s400, container, false);
        p401_ck1  = (CheckBox) view.findViewById(R.id.sec400_p401_ck1);
        p401_ck2  = (CheckBox) view.findViewById(R.id.sec400_p401_ck2);
        p401_ck3  = (CheckBox) view.findViewById(R.id.sec400_p401_ck3);
        p401_ck4  = (CheckBox) view.findViewById(R.id.sec400_p401_ck4);
        p401_ck5  = (CheckBox) view.findViewById(R.id.sec400_p401_ck5);

        p402_rg = (RadioGroup) view.findViewById(R.id.sec400_p402_rg);
        p402_card = (CardView) view.findViewById(R.id.p402_card);

        p403_ck1  = (CheckBox) view.findViewById(R.id.sec400_p403_ck1);
        p403_ck2  = (CheckBox) view.findViewById(R.id.sec400_p403_ck2);
        p403_ck3  = (CheckBox) view.findViewById(R.id.sec400_p403_ck3);
        p403_ck4  = (CheckBox) view.findViewById(R.id.sec400_p403_ck4);

        p404_rg = (RadioGroup) view.findViewById(R.id.sec400_p404_rg);
        p404_card = (CardView) view.findViewById(R.id.p404_card);

        p405_rg = (RadioGroup) view.findViewById(R.id.sec400_p405_rg);
        p405_card = (CardView) view.findViewById(R.id.p405_card);

        p406_edt1 = (EditText) view.findViewById(R.id.sec400_p406_edt1);
        p406_card = (CardView) view.findViewById(R.id.p406_card);

        p407_ck1  = (CheckBox) view.findViewById(R.id.sec400_p407_ck1);
        p407_ck2  = (CheckBox) view.findViewById(R.id.sec400_p407_ck2);
        p407_ck3  = (CheckBox) view.findViewById(R.id.sec400_p407_ck3);
        p407_ck4  = (CheckBox) view.findViewById(R.id.sec400_p407_ck4);
        p407_ck5  = (CheckBox) view.findViewById(R.id.sec400_p407_ck5);
        p407_ck6  = (CheckBox) view.findViewById(R.id.sec400_p407_ck6);
        p407_ck7  = (CheckBox) view.findViewById(R.id.sec400_p407_ck7);
        p407_edt = (EditText) view.findViewById(R.id.txtEspecifique_p407);
        p407_card = (CardView) view.findViewById(R.id.p407_card);

        p408_ck1  = (CheckBox) view.findViewById(R.id.sec400_p408_ck1);
        p408_ck2  = (CheckBox) view.findViewById(R.id.sec400_p408_ck2);
        p408_ck3  = (CheckBox) view.findViewById(R.id.sec400_p408_ck3);
        p408_ck4  = (CheckBox) view.findViewById(R.id.sec400_p408_ck4);
        p408_ck5  = (CheckBox) view.findViewById(R.id.sec400_p408_ck5);
        p408_ck6  = (CheckBox) view.findViewById(R.id.sec400_p408_ck6);
        p408_edt = (EditText) view.findViewById(R.id.txtEspecifique_p408);
        p408_card = (CardView) view.findViewById(R.id.p408_card);


        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //----pregunta 401

        if(p401_ck1.isChecked() || p401_ck2.isChecked() || p401_ck3.isChecked()){
            p402_card.setVisibility(View.GONE);
        }else{
            p402_card.setVisibility(View.VISIBLE);
        }

        //----pregunta 403
        p403_ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    p404_card.setVisibility(View.GONE);
                    p405_card.setVisibility(View.GONE);
                    p406_card.setVisibility(View.GONE);
                    p407_card.setVisibility(View.GONE);
                }else{
                    p404_card.setVisibility(View.VISIBLE);
                    p405_card.setVisibility(View.VISIBLE);
                    p406_card.setVisibility(View.VISIBLE);
                    p407_card.setVisibility(View.VISIBLE);
                }

            }
        });

        //----pregunta 407
        p407_ck7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    p407_edt.setVisibility(View.VISIBLE);
                }else{
                    p407_edt.setVisibility(View.GONE);
                }

            }
        });

        //----pregunta 408
        p408_ck6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    p408_edt.setVisibility(View.VISIBLE);
                }else{
                    p408_edt.setVisibility(View.GONE);
                }

            }
        });


    }
}
