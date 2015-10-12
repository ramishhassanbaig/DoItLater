package com.example.ramish.doitlater.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ramish.doitlater.R;

public class AllTaskFragment extends android.support.v4.app.Fragment {


    public AllTaskFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_all_task, container, false);

        // Inflate the layout for this fragment
        return rootView;
    }


}
