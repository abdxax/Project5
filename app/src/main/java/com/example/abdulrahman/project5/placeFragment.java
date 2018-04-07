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
        Resources resources=getResources();
        String []nameplace=resources.getStringArray(R.array.placeName);
        int[] images={R.drawable.barzan_palace_2,R.drawable.qishlah_palace};
        for (int i=0;i<nameplace.length;i++){
            placeArrayList.add(new Place(nameplace[i],images[i]));
        }
        PlaceAdapter placeAdapter=new PlaceAdapter(getContext(),placeArrayList);
        listView.setAdapter(placeAdapter);

        return view;
    }

}
