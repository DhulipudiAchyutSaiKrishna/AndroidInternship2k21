package com.example.exampledatabase.RDB;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface RDao {
    //Data Access Operations  ----> CRUD
    @Insert //Create
    void insert(RTable rTable);

    @Query("Select * from RTable")
    LiveData<List<RTable>> readAl();   //Read

    @Update
    void update(RTable rTable);

    @Delete
    void delete(RTable rTable);
}
