package com.example.ramish.doitlater;

import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ramish.doitlater.Activity.AddTaskActivity;
import com.example.ramish.doitlater.Fragments.TaskTabsAdapter;
import com.firebase.client.Firebase;


public class MainActivity extends android.support.v4.app.FragmentActivity {

    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    private Button mTodoTaskButton;
    private Button mCompletedTaskButton;
    private Button mAllTaskButton;
    private ImageView mAddTaskButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase.setAndroidContext(MainActivity.this);

        findingViewIds();

        mPagerAdapter=new TaskTabsAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);

        mTodoTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(0);
            }
        });

        mCompletedTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(1);
            }
        });

        mAllTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPager.setCurrentItem(2);
            }
        });


        mAddTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,AddTaskActivity.class);
                startActivity(i);
            }
        });


    }

private void findingViewIds(){
    mPager=(ViewPager)findViewById(R.id.pager);
    mTodoTaskButton=(Button)findViewById(R.id.todoTaskButton);
    mCompletedTaskButton=(Button)findViewById(R.id.completedTaskButton);
    mAllTaskButton=(Button)findViewById(R.id.allTaskButton);
    mAddTaskButton=(ImageView)findViewById(R.id.addTaskButton);
}

}