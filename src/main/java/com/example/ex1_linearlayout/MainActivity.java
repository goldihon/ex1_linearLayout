package com.example.ex1_linearlayout;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int counter;
    LinearLayout myLinearLayout;
    Button myButton;
    Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        myLinearLayout = findViewById(R.id.main);

        showButton = findViewById(R.id.show);
        showButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Handle button click
                Toast.makeText(MainActivity.this, "You have clicked " + counter + "times!", Toast.LENGTH_SHORT).show();
            }
        });
        myButton = findViewById(R.id.increase_button);
        counter = 0;
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Handle button click
                counter ++;
                TextView thecounter_view = findViewById(R.id.counter);
                thecounter_view.setText(""+ counter);
            }
        });
    }
}