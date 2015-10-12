package com.example.ramish.doitlater.Fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramish on 9/18/2015.
 */
public class TaskTabsAdapter extends FragmentStatePagerAdapter {

    private static final int TABS_COUNT=3;

    List<Fragment> tabsList=new ArrayList<>();


    public TaskTabsAdapter(android.support.v4.app.FragmentManager fm){
        super(fm);

        tabsList.add(new TodoTaskFragment());
        tabsList.add(new CompletedTaskFragment());
        tabsList.add(new AllTaskFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return tabsList.get(position);
    }

    @Override
    public int getCount() {
        return TABS_COUNT;
    }
}
