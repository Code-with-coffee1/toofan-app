package com.example.toofan;

<<<<<<< HEAD
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

=======
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

>>>>>>> origin/master
public class view_cases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cases);
    }
<<<<<<< HEAD

    public void forgot_password(View view){
        Intent intent=new Intent(view.getContext(),ComplaintList.class);
        startActivity(intent);
    }

=======
>>>>>>> origin/master
}