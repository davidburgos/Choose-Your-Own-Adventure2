package com.example.user.ownadventure2;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class RoomFragment extends Fragment {


    public RoomFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_room,container,false);
        return  rootView;

    }


}
