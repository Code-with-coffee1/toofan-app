package com.example.toofan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class edit_case extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_case);
    }

    public void search(View view){
        Intent intent=new Intent(view.getContext(),dashboard_Service_engineer2.class);
        startActivity(intent);
    }

}