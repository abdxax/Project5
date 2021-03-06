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
        Resources resources=getResources();
        String []resourcesStringArray=resources.getStringArray(R.array.resturantName);
        int [] images={R.drawable.hotl1,R.drawable.hail2,R.drawable.hot3};
        for (int i=0;i<resourcesStringArray.length;i++){
            resturantArrayList.add(new Resturant(resourcesStringArray[i],images[i]));
        }
        ResturantAdapter resturantAdapter=new ResturantAdapter(getContext(),resturantArrayList);
        listView.setAdapter(resturantAdapter);
        return view;
    }

}
