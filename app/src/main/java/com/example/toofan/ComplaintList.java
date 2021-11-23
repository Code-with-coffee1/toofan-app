package com.example.toofan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class ComplaintList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_list);

        ArrayList<ComplaintData> list = new ArrayList<>();
        list.add(new ComplaintData("1","aa/aa/aaaa","aa:aa","aaaa aaaa"));
        list.add(new ComplaintData("2","bb/bb/bbbb","bb:bb","bbbb bbbb"));
        list.add(new ComplaintData("3","cc/cc/cccc","cc:cc","cccc cccc"));
        list.add(new ComplaintData("4","dd/dd/dddd","dd:dd","dddd dddd"));
        list.add(new ComplaintData("5","ee/ee/eeee","ee:ee","eeee eeee"));
        list.add(new ComplaintData("6","ff/ff/ffff","ff:ff","ffff ffff"));
        list.add(new ComplaintData("7","gg/gg/gggg","gg:gg","gggg gggg"));

        RecyclerView rv = (RecyclerView)findViewById(R.id.recycler_view);
        ComplaintListAdapter ca = new ComplaintListAdapter(this,list);
        rv.setAdapter(ca);
        rv.setHasFixedSize(false);
        int gap = 30;
        while(gap-->0)
            rv.addItemDecoration(new DividerItemDecoration(rv.getContext(), DividerItemDecoration.VERTICAL));
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}