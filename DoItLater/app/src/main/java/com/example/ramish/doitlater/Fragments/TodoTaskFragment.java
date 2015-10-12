package com.example.ramish.doitlater.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ramish.doitlater.R;


public class TodoTaskFragment extends android.support.v4.app.Fragment {



    public TodoTaskFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment_todo_task, container, false);

        // Inflate the layout for this fragment
        return rootView;
    }



}
