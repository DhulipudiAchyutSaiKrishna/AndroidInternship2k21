package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemAdapter.MyInterface {
    RecyclerView rv;
    int totalAmount = 0;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recyclerview);
        button = findViewById(R.id.button);
        int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i};
        String[] itemNames = {"Chicken Biryani", "Chicken Lollipop", "Chicken 65",
                                "Chicken Pakora", "Chicken Curry", "Prawns Curry",
                                "Mutton Curry", "Fish Curry", "Butter Chicken",
                                "Chicken Noodles"};
        String[] itemPrices = {"200", "250", "100", "150", "300",
                                "270", "340", "230", "150", "130"};

        rv.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(this, images, itemNames, itemPrices, this);
        rv.setAdapter(adapter);

    }

    public void submit(View view) {
    }

    @Override
    public void selectedItems(String itemName, String itemPrice, int position, int totalPrice) {
        Toast.makeText(this, ""+totalPrice, Toast.LENGTH_SHORT).show();
        totalAmount += Integer.parseInt(itemPrice);
//        button.setText(totalAmount);
        button.setText(String.valueOf(totalAmount));
    }
}