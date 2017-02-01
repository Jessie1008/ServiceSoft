package com.example.hassan.mainpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
//        Button jobActivityButton = (Button) findViewById(R.id.addJobButton);
//        jobActivityButton.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                Intent newIntent = new Intent(MainActivity.this, JobsActivity.class);
//                startActivity(newIntent);
//            }
//        });
    }

}
