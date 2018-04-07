package com.example.abdulrahman.project5;


import android.content.res.Resources;
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
        Resources resources=getResources();
        String []nameHotel=resources.getStringArray(R.array.hotelName);
        int [] images={R.drawable.hotl1,R.drawable.hail2,R.drawable.hot3};
        ArrayList<Hotel> hotels=new ArrayList<>();
       for (int i=0;i<nameHotel.length;i++){
           hotels.add(new Hotel(nameHotel[i],images[i]));
       }
        HotelAdapter hotelAdapter=new HotelAdapter(getContext(),hotels);
        listView.setAdapter(hotelAdapter);
        return view;
    }

}
