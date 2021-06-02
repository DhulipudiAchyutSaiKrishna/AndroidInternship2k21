package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Ask","First Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ask","First ctivity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ask","First Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ask","First Activity Paused");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Ask","First Activity Stopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ask","First Activity Restarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ask","First Activity Destroyed");
    }

    public void next(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}