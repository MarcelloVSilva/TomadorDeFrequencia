package com.example.marcello.tomadordefrequencia.componentes.telas.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marcello.tomadordefrequencia.R;

public class AindaNaoComecou extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.nao_comecou_fragment, container, false);
        return view;
    }
}


