package com.example.toofan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class view_complaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_complaint);
    }

    public void forgot_password(View view){
        Intent intent=new Intent(view.getContext(),MultiServiceEngineerAcess.class);
        startActivity(intent);
    }

}
