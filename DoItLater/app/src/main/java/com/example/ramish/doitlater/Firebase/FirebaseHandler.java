package com.example.ramish.doitlater.Firebase;

import com.firebase.client.Firebase;

/**
 * Created by ramish on 9/19/2015.
 */
public class FirebaseHandler {

    private static FirebaseHandler instance;
    private Firebase tasksRef;
    private Firebase taskTitleRef;
    private Firebase taskDateRef;
    private Firebase taskTimeRef;
    private Firebase taskSummaryRef;

//    Firebase ref=new Firebase("https://mrhbtodo.firebaseio.com/");

    public static FirebaseHandler getInstance(){
        if(instance == null){
            instance = new FirebaseHandler();
        }
        return instance;
    }

    public Firebase getTasksRef() {
        tasksRef=getRootRef().child("tasks");
        return tasksRef;
    }

    public Firebase getTaskTitleRef() {
        taskTitleRef=getTasksRef().child("title");
        return taskTitleRef;
    }

    public Firebase getTaskTimeRef() {
        taskTimeRef=getTasksRef().child("time");
        return taskTimeRef;
    }

    public Firebase getTaskDateRef() {
        taskDateRef=getTasksRef().child("date");
        return taskDateRef;
    }

    public Firebase getTaskSummaryRef() {
        taskSummaryRef=getTasksRef().child("summary");
        return taskSummaryRef;
    }

    public Firebase getRootRef(){
        return new Firebase("https://mrhbtodo.firebaseio.com/");
    }
}
