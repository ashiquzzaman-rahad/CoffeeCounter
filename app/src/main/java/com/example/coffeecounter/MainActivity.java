package com.example.coffeecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1;
    private TextView water,coffee;
    private Button gen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.numberOfCup);
        water = (TextView) findViewById(R.id.QOfWater);
        coffee = (TextView) findViewById(R.id.QOfCoffee);
        gen = findViewById(R.id.genCof);

        gen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try {
            String c = editText1.getText().toString();
            double cup = Double.parseDouble(c);
            double coffee1 = cup * 12;
            double water1 = cup * 0.2;
            coffee.setText(""+coffee1);
            water.setText(""+water1);
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
        }

    }
}