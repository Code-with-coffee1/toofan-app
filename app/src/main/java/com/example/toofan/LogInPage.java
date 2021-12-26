package com.example.toofan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LogInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);
    }
    public void create_new(View view){
        Intent intent=new Intent(view.getContext(),Sign_up_page.class);
        startActivity(intent);
    }
    public void forgot_password(View view){
        Intent intent=new Intent(view.getContext(),Forgot_password.class);
        startActivity(intent);
    }
    public void log_in(View view){
        Intent intent=new Intent(view.getContext(),otp_2.class);
        startActivity(intent);
    }
    public void rember(View view){
        ImageView circle=findViewById(R.id.r_circle);
        circle.setImageResource(R.drawable.ic_remeber);
    }
}