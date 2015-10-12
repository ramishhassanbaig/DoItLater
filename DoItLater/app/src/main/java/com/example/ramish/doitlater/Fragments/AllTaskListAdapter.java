package com.example.ramish.doitlater.Fragments;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.ramish.doitlater.Firebase.FirebaseArrayListAdapter;
import com.example.ramish.doitlater.Firebase.FirebaseListAdapter;
import com.example.ramish.doitlater.R;
import com.example.ramish.doitlater.model.Task;
import com.firebase.client.Query;

/**
 * Created by ramish on 10/12/2015.
 */
public class AllTaskListAdapter extends FirebaseArrayListAdapter<Task> {

    private TextView taskTitleView;
    private TextView taskDateView;
    private TextView taskTimeView;
    private CheckBox taskCompleteCheck;

    public AllTaskListAdapter(Query mRef, Class<Task> mModelClass, int mLayout, Activity activity){
        super(mRef, mModelClass, mLayout, activity);
    }


    @Override
    protected void populateView(View v, Task model) {
        initView(v);
        taskTitleView.setText(model.getTitle());

    }

    public void initView(View v){
        taskTitleView=(TextView)v.findViewById(R.id.taskTitle);
        taskDateView=(TextView)v.findViewById(R.id.taskDateView);
        taskTimeView=(TextView)v.findViewById(R.id.taskTimeView);
        taskCompleteCheck=(CheckBox)v.findViewById(R.id.taskCheck);
    }
}
