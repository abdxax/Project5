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

public class MallAdapter extends ArrayAdapter<Shopping>{
    ArrayList <Shopping> shoppings;

    public MallAdapter(@NonNull Context context, ArrayList<Shopping> shoppings) {
        super(context, 0,shoppings);
        this.shoppings=shoppings;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View view=layoutInflater.inflate(R.layout.list_mall,parent,false);
        ImageView imageView=(ImageView) view.findViewById(R.id.mall_image);
        TextView textView=(TextView) view.findViewById(R.id.mall_name);
        imageView.setImageResource(shoppings.get(position).getPath());
        textView.setText(shoppings.get(position).getName());
        return view;
    }
}
