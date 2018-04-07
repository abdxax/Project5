package com.example.abdulrahman.project5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_hotel, container, false);
        ListView listView=(ListView) view.findViewById(R.id.listhotels);
        ArrayList<Hotel> hotels=new ArrayList<>();
        hotels.add(new Hotel("Millennium Hotel",R.drawable.hotl1));
        hotels.add(new Hotel("Boudl Hotel",R.drawable.hot2));
        hotels.add(new Hotel("Aronani  Hotel",R.drawable.hot3));
        HotelAdapter hotelAdapter=new HotelAdapter(getContext(),hotels);
        listView.setAdapter(hotelAdapter);
        return view;
    }

}
