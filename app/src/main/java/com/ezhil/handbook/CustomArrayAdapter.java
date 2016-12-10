package com.ezhil.handbook;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * This file is part of Ezhil-Handbook app
 * (C) 2016 Ezhil Language Foundation
 */

// customize view with font
public class CustomArrayAdapter extends ArrayAdapter<String> {
    public CustomArrayAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position,convertView,parent);

        TextView tv = (TextView) v.findViewById(android.R.id.text1);
        FontCustomizer.update(v.getContext(),tv);

        return v;
    }
}
