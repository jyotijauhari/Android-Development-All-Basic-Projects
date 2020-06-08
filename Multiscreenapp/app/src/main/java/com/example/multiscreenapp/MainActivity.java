package com.example.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MSG = "com.example.multiscreenapp.ORDER";

    public void placeOrder(View view){
        //We will handle the click on the button here
        //Intent

        Intent intent=new Intent(this, OrderActivity.class);
        EditText editText1= findViewById(R.id.editText1);
        EditText editText2= findViewById(R.id.editText2);
        EditText editText3= findViewById(R.id.editText3);

        String message = "Order for " + editText1.getText().toString()+ " , "
                         + editText2.getText().toString()+ " & "
                         + editText3.getText().toString()+ " is successfully placed.";
        intent.putExtra(MSG,message);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
