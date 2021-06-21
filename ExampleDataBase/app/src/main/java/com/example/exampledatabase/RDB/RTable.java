package com.example.exampledatabase.RDB;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class RTable {

    @NonNull
    @PrimaryKey
    String sroll;

    String sname, snumber;

//    public RTable(@NonNull String sroll, String sname, String snumber) {
//        this.sroll = sroll;
//        this.sname = sname;
//        this.snumber = snumber;
//    }

    public void setSroll(@NonNull String sroll) {
        this.sroll = sroll;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }
}
