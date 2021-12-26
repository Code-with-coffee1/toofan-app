package com.example.toofan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp);
    }

    public void verify(View view){
        Intent intent=new Intent(view.getContext(),reset_password.class);
        startActivity(intent);
    }

}
