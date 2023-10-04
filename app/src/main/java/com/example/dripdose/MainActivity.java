package com.example.dripdose;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton DogActivity;
    ImageButton CatActivity;
    ImageButton SettingsActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Dog Button
        DogActivity = findViewById(R.id.btnDog);
        DogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_one = new Intent(MainActivity.this, DogActivity.class);
                startActivity(intent_one);
            }
        });

        //Cat Button
        CatActivity = findViewById(R.id.btnCat);
        CatActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_two = new Intent(MainActivity.this, CatActivity.class);
                startActivity(intent_two);
            }
        });

        //Settings Activity
        SettingsActivity = findViewById(R.id.btnSettings);
        SettingsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_three = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent_three);
            }
        });
    }
}