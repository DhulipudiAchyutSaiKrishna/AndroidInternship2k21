package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //
    EditText name, number, link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        link = findViewById(R.id.link);
    }

    public void next(View view) {
        //Here we will work with the explicit intent
        String n = name.getText().toString();
        //Intent is a class name so it needs a object
        Intent i = new Intent(this, SecondActivity.class);
        //to carry the content to intent
        i.putExtra("key", n); //put hold the text
        startActivity(i);
    }

    public void dial(View view) {
        //Here we will work with Implicit Intent
        String n = number.getText().toString();
        //Uri Unified Resource Identifier
        // identify a phone number - tel, web page - https://loc, location- geo:lat, lon,....
        Uri uri = Uri.parse("tel:" + n);
        Intent i = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(i);
    }

    public void search(View view) {
        String n = link.getText().toString();
        Uri uri = Uri.parse("https://" + n);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }
}