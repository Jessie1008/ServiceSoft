package com.example.hassan.mainpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class listsOfCustomers extends AppCompatActivity {

    private Button listsOfCustomerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists_of_customers);
        listsOfCustomerButton = (Button) findViewById(R.id.addCustomerButton);
        listsOfCustomerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(listsOfCustomers.this, CustomerListActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
