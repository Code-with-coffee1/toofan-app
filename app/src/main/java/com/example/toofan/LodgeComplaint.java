package com.example.toofan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LodgeComplaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodge_complaint);
    }

    public void forgot_password(View view){
        Intent intent=new Intent(view.getContext(),view_complaint.class);
        startActivity(intent);
    }

}