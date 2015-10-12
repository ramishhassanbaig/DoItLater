package com.example.ramish.doitlater.model;

/**
 * Created by ramish on 9/20/2015.
 */
public class Task {

    private String title;
    private String date;
    private String time;
    private String summary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public  Task(){}

    public Task(String title,String date,String time,String summary){
        this.title=title;
        this.date=date;
        this.time=time;
        this.summary=summary;
    }

}
