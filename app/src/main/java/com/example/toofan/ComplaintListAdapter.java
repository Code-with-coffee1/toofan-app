package com.example.toofan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ComplaintListAdapter extends RecyclerView.Adapter<ComplaintListAdapter.ComplaintViewHolder>{
    Context context;
    ArrayList<ComplaintData> list;
    public class ComplaintViewHolder extends RecyclerView.ViewHolder {
        public TextView job_no;
        public TextView date;
        public TextView time;
        public TextView name;
        public ImageButton edit_detail;
        public ComplaintViewHolder(View view) {
            super(view);
            job_no = (TextView) view.findViewById(R.id.job_no);
            date = (TextView) view.findViewById(R.id.date);
            time = (TextView) view.findViewById(R.id.time);
            name = (TextView) view.findViewById(R.id.name);
            edit_detail = (ImageButton) view.findViewById(R.id.edit_detail);
        }
    }
    public ComplaintListAdapter(Context context, ArrayList<ComplaintData> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public ComplaintViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.complaint_item_list, viewGroup, false);
        return new ComplaintViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull ComplaintViewHolder complaintViewHolder, int i) {
        final ComplaintData myListData = list.get(i);
        complaintViewHolder.job_no.setText(list.get(i).getJob_no());
        complaintViewHolder.date.setText(list.get(i).getDate());
        complaintViewHolder.time.setText(list.get(i).getTime());
        complaintViewHolder.name.setText(list.get(i).getName());
        complaintViewHolder.edit_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Editing Job No : "+myListData.getJob_no(),Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
