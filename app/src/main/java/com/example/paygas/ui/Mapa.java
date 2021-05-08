package com.example.paygas.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.paygas.MapaActivity;
import com.example.paygas.MenuUser;
import com.example.paygas.R;

public class Mapa extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_mapa, container, false);
        final TextView textView = root.findViewById(R.id.text_home);

        Button btnMapa = (Button) root.findViewById(R.id.btnMapa);
        btnMapa.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent h = new Intent(getActivity(), MapaActivity.class);
                startActivity(h);
            }
        });

        return root;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent h = new Intent(getActivity(), MapaActivity.class);
        startActivity(h);
    }
}
