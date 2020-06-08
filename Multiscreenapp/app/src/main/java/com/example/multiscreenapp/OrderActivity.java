package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent=getIntent();
        String message = intent.getStringExtra(MainActivity.MSG);

        //Set received text in text view
        TextView textView = findViewById(R.id.orderText);
        textView.setText(message);
    }
}
