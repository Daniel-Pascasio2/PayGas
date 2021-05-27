package com.example.paygas.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paygas.R;

public class ArrayAdapterConsejos extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] consejos;
    private final String[] todoconsejo;
    private final Integer[] imagenes;


    public ArrayAdapterConsejos(Activity context, String[] consejos, String[] todoconsejo, Integer[] imagenes) {
        super(context, R.layout.fragment_consejos, consejos);
        this.context = context;
        this.consejos = consejos;
        this.todoconsejo = todoconsejo;
        this.imagenes = imagenes;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.fragment_consejos, null);
        TextView txConsejo = (TextView) rowView.findViewById(R.id.txConsejo);
        TextView txTodoconsejo = (TextView) rowView.findViewById(R.id.txTodoconsejo);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imacon);
        txConsejo.setText(consejos[position]);
        txTodoconsejo.setText(todoconsejo[position]);
        imageView.setImageResource(imagenes[position]);
        return rowView;
    }
}
