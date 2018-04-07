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
public class placeFragment extends Fragment {


    public placeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_place, container, false);
        ListView listView=(ListView) view.findViewById(R.id.listplace);
        ArrayList<Place> placeArrayList=new ArrayList<>();
        placeArrayList.add(new Place("Garden Mall",R.drawable.gardenmall));
        placeArrayList.add(new Place("Salma Mall",R.drawable.salmamall));
        placeArrayList.add(new Place("Grand Mall  Hotel",R.drawable.grandmall));
        PlaceAdapter placeAdapter=new PlaceAdapter(getContext(),placeArrayList);
        listView.setAdapter(placeAdapter);

        return view;
    }

}
