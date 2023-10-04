package com.example.dripdose;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CatActivity extends AppCompatActivity {
    ImageButton SettingsActivity;
    ImageButton MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        //Settings Activity
        SettingsActivity = findViewById(R.id.btnCatSettings);
        SettingsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_three = new Intent(CatActivity.this, SettingsActivity.class);
                startActivity(intent_three);
            }
        });
        //Exit Activity
        MainActivity = findViewById(R.id.btnCatExit);
        MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_four = new Intent(CatActivity.this, MainActivity.class);
                startActivity(intent_four);
            }
        });

    }
}