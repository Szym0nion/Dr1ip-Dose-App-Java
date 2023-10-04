package com.example.dripdose;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DogActivity extends AppCompatActivity {

    ImageButton SettingsActivity;
    ImageButton MainActivity;
    EditText edtDogMass;
    Button btnResultDog;

    private CheckBox AnesthesiaCheckBoxDog;
    private TextView txtNoAnesthesiaDog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);
        //Settings Activity
        SettingsActivity = findViewById(R.id.btnDogSettings);
        SettingsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_three = new Intent(DogActivity.this, SettingsActivity.class);
                startActivity(intent_three);
            }
        });

        //Exit Activity
        MainActivity = findViewById(R.id.btnDogExit);
        MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_four = new Intent(DogActivity.this, MainActivity.class);
                startActivity(intent_four);
            }
        });

        //Dog Mass
        edtDogMass = findViewById(R.id.edtDogMass);
        btnResultDog = findViewById(R.id.btnResultDog);

        btnResultDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mass = Integer.parseInt(edtDogMass.getText().toString());

                Intent intent = new Intent(DogActivity.this, DogResultActivity.class);
                intent.putExtra("keymass", mass);

                startActivity(intent);
            }
        });

        //Health CheckBox
        AnesthesiaCheckBoxDog = findViewById(R.id.checkBoxAnesthesiaDog);
        txtNoAnesthesiaDog = findViewById(R.id.txtNoAnesthesiaDog);

        boolean isChecked = AnesthesiaCheckBoxDog.isChecked();

        AnesthesiaTextVisibility(isChecked);

        AnesthesiaCheckBoxDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                boolean isChecked = ((CheckBox)v).isChecked();
                AnesthesiaTextVisibility(isChecked);
            }
        });
    }

    private void AnesthesiaTextVisibility(boolean isChecked) {
        if (isChecked){
            txtNoAnesthesiaDog.setVisibility(View.VISIBLE);
        }else{
            txtNoAnesthesiaDog.setVisibility(View.INVISIBLE);
        }
    }


}