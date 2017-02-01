package com.example.hassan.mainpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity{
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private Button listCustomerButton;
    private Button jobButton;
    private Button estimateButton;
    protected static final String ACTIVITY_NAME = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCustomerButton = (Button) findViewById(R.id.customerButton);
        listCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, listsOfCustomers.class);
                startActivity(myIntent);
            }
        });

        jobButton = (Button) findViewById(R.id.jobsbutton);
        jobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JobsActivity.class));
                Log.i(ACTIVITY_NAME, "User clicked Job");
            }
        });

        estimateButton = (Button) findViewById(R.id.estimateButton);
        estimateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EstimateActivity.class));
                Log.i(ACTIVITY_NAME, "User clicked Estimate");
            }
        });
    }

}





