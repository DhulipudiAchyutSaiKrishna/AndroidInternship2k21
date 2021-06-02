package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ask","Second Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ask","Second Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ask","Second Activity Paused");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Ask","Second Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ask","Second Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ask","Second Activity Destroyed");
    }
}