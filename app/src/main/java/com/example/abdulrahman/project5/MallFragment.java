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
public class MallFragment extends Fragment {


    public MallFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_place, container, false);
        ListView listView=(ListView) view.findViewById(R.id.listplace);
        ArrayList<Shopping> malleArrayList=new ArrayList<>();
        Resources resources=getResources();
        String []resourcesStringArray=resources.getStringArray(R.array.mallName);
        int [] images={R.drawable.gardenmall,R.drawable.salmamall,R.drawable.grandmall};
        for (int i=0;i<resourcesStringArray.length;i++){
            malleArrayList.add(new Shopping(resourcesStringArray[i],images[i]));
        }
        MallAdapter mallAdapter=new MallAdapter(getContext(),malleArrayList);
        listView.setAdapter(mallAdapter);

        return view;
    }

}
