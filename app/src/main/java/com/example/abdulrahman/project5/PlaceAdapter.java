package com.example.abdulrahman.project5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abdulrahman on 07/04/18.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    ArrayList<Place> placeArrayList;

    public PlaceAdapter(@NonNull Context context,  ArrayList<Place> placeArrayList) {
        super(context, 0,placeArrayList);
        this.placeArrayList=placeArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View view=layoutInflater.inflate(R.layout.list_place,parent,false);
        ImageView imageView=(ImageView) view.findViewById(R.id.place_image);
        TextView textView=(TextView) view.findViewById(R.id.place_name);
        imageView.setImageResource(placeArrayList.get(position).getPath());
        textView.setText(placeArrayList.get(position).getName());
        return view;
    }
}
