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
public class ResturantFragment extends Fragment {


    public ResturantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_resturant, container, false);
        ListView listView=(ListView) view.findViewById(R.id.listresturant);
        ArrayList<Resturant> resturantArrayList=new ArrayList<>();
        resturantArrayList.add(new Resturant("Millennium Hotel",R.drawable.hotl1));
        resturantArrayList.add(new Resturant("Boudl Hotel",R.drawable.hot2));
        resturantArrayList.add(new Resturant("Aronani  Hotel",R.drawable.hot3));
        resturantArrayList.add(new Resturant("Aronani  Hotel",R.drawable.hot3));
        ResturantAdapter resturantAdapter=new ResturantAdapter(getContext(),resturantArrayList);
        listView.setAdapter(resturantAdapter);
        return view;
    }

}
