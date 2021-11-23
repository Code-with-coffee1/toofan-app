package com.example.toofan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sign_up_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
    }
    public void log_in(View view){
        Intent intent= new Intent(view.getContext(),LogInPage.class);
        startActivity(intent);
    }
}