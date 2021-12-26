package com.example.toofan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard_Service_engineer2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_service_engineer2);
    }

    public void submit(View view){
        Intent intent=new Intent(view.getContext(),view_cases.class);
        startActivity(intent);
    }

}