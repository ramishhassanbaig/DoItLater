package com.example.ramish.doitlater.Activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.ramish.doitlater.Firebase.FirebaseArrayListAdapter;
import com.example.ramish.doitlater.Firebase.FirebaseHandler;
import com.example.ramish.doitlater.R;
import com.example.ramish.doitlater.model.Task;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.lang.ref.SoftReference;

public class AddTaskActivity extends ActionBarActivity {

    private ImageView mBackButton;
    private Button mAddTaskButton;
    private EditText mTaskTitle;
    private EditText mTaskDate;
    private EditText mTaskTime;
    private EditText mTaskSummary;

    private String title;
    private String date;
    private String time;
    private String summary;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);


        mBackButton=(ImageView)findViewById(R.id.add_task_back_button);
        mTaskTitle=(EditText)findViewById(R.id.task_title);
        mTaskDate=(EditText)findViewById(R.id.task_date);
        mTaskTime=(EditText)findViewById(R.id.task_time);
        mTaskSummary=(EditText)findViewById(R.id.task_summary);
        mAddTaskButton=(Button)findViewById(R.id.addTodoTaskButton);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        mAddTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title=mTaskTitle.getText().toString();
                date=mTaskDate.getText().toString();
                time=mTaskTime.getText().toString();
                summary=mTaskSummary.getText().toString();

                if (!(title.equals("") && date.equals("") && time.equals("") && summary.equals(""))) {


                    Task newTask = new Task(title, date, time, summary);

                    Firebase taskRef = FirebaseHandler.getInstance().getTasksRef();

                    taskRef.push().setValue(newTask, new Firebase.CompletionListener() {
                        @Override
                        public void onComplete(FirebaseError firebaseError, Firebase firebase) {
                            if (firebaseError == null) {
                                Toast.makeText(getApplicationContext(), "Task Added", Toast.LENGTH_SHORT).show();
                                mTaskTitle.setText("");
                                mTaskTime.setText("");
                                mTaskDate.setText("");
                                mTaskSummary.setText("");
                            } else {
                                Toast.makeText(getApplicationContext(), "Failed to Add Task", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }
                else {
                    Toast.makeText(getApplicationContext(),"Fill all Details",Toast.LENGTH_SHORT).show();
                }




            }


        });



    }



}
