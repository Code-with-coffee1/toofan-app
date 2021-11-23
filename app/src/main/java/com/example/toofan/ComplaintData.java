package com.example.toofan;

import android.widget.TextView;

public class ComplaintData {
    private String job_no;
    private String date;
    private String time;
    private String name;
    private int imgId;
    public ComplaintData(String job_no,String date, String time,String name) {
        this.job_no = job_no;
        this.date = date;
        this.time = time;
        this.name = name;
    }

    public String getJob_no() {
        return job_no;
    }

    public void setJob_no(String job_no) {
        this.job_no = job_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
