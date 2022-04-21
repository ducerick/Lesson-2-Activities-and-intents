package com.example.codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView textOne;
    private TextView textTwo;
    private TextView textThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textOne = findViewById(R.id.TextView_textOne);
        textTwo = findViewById(R.id.TextView_textTwo);
        textThree = findViewById(R.id.TextView_textThree);


        Intent intent = getIntent();

        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE).equals("1")) {
            textOne.setVisibility(View.VISIBLE);
            textTwo.setVisibility(View.INVISIBLE);
            textThree.setVisibility(View.INVISIBLE);
        }
        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE).equals("2")) {
            textOne.setVisibility(View.INVISIBLE);
            textTwo.setVisibility(View.VISIBLE);
            textThree.setVisibility(View.INVISIBLE);
        }
        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE).equals("3")){
            textOne.setVisibility(View.INVISIBLE);
            textTwo.setVisibility(View.INVISIBLE);
            textThree.setVisibility(View.VISIBLE);
        }

    }
}