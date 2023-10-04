package com.example.dripdose;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class DogResultActivity extends AppCompatActivity {

    TextView txtquantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog_result);

        txtquantity = findViewById(R.id.txtquantity);

        int mass;

        mass = getIntent().getIntExtra("keymass", 0);

        txtquantity.setText("Ilość kroplówki"+ mass);

    }
}