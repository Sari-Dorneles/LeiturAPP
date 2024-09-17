package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textAUTOR1 = findViewById(R.id.textAUTOR1);
        TextView textAUTOR2 = findViewById(R.id.textAUTOR2);

    }
}