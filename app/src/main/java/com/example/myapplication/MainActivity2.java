package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button autor = findViewById(R.id.btnAutor);

        autor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent autor = new Intent(getApplicationContext(), telaPerfilAutor.class);
                startActivity(autor);
            }
        });

        Button linha = findViewById(R.id.btnLinha);
        linha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linha = new Intent(getApplicationContext(), telaLinhaTempo.class);
                startActivity(linha);
            }
        });
    }
}