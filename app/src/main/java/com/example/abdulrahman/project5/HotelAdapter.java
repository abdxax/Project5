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

public class HotelAdapter extends ArrayAdapter<Hotel> {
   ArrayList<Hotel> hotelArrayList;

    public HotelAdapter(@NonNull Context context,  ArrayList<Hotel> hotelArrayList) {
        super(context, 0, hotelArrayList);
        this.hotelArrayList = hotelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        View view=layoutInflater.inflate(R.layout.list_hotel,parent,false);
        ImageView imageView=(ImageView) view.findViewById(R.id.hotel_image);
        TextView textView=(TextView) view.findViewById(R.id.hotel_name);
        imageView.setImageResource(hotelArrayList.get(position).getPath());
        textView.setText(hotelArrayList.get(position).getName());
        return view;
    }
}
