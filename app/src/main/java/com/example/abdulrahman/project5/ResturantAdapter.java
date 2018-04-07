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

public class ResturantAdapter extends ArrayAdapter<Resturant> {
    ArrayList <Resturant> resturants;

    public ResturantAdapter(@NonNull Context context,  ArrayList<Resturant> resturants) {
        super(context, 0, resturants);
        this.resturants = resturants;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View view=layoutInflater.inflate(R.layout.list_restur,parent,false);
        ImageView imageView=(ImageView) view.findViewById(R.id.rest_image);
        TextView textView=(TextView) view.findViewById(R.id.rest_name);
        imageView.setImageResource(resturants.get(position).getPath());
        textView.setText(resturants.get(position).getName());
        return view;
    }
}
