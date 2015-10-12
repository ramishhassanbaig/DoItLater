package com.example.ramish.doitlater.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.ramish.doitlater.Firebase.FirebaseHandler;
import com.example.ramish.doitlater.Firebase.FirebaseListAdapter;
import com.example.ramish.doitlater.MainActivity;
import com.example.ramish.doitlater.R;
import com.example.ramish.doitlater.model.Task;
import com.firebase.client.Firebase;

public class AllTaskFragment extends android.support.v4.app.Fragment {


    private ListView allTaskListView;
    private AllTaskListAdapter allTaskListAdapter;

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

        allTaskListView=(ListView)rootView.findViewById(R.id.allTaskListView);

        Firebase taskRefs= FirebaseHandler.getInstance().getTasksRef();

        allTaskListAdapter=new AllTaskListAdapter(taskRefs, Task.class,R.layout.task_list_item_layout,getActivity());
        allTaskListView.setAdapter(allTaskListAdapter);


        // Inflate the layout for this fragment
        return rootView;
    }


}
