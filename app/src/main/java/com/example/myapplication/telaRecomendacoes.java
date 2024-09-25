package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class telaRecomendacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_recomendacoes);
        TextView textRECO = findViewById(R.id.textRECO);

        ImageView imgFILME = findViewById(R.id.imgFILME);
        TextView textFILME2 = findViewById(R.id.textFILME2);
        TextView textFILME3 = findViewById(R.id.textFILME3);

        ImageView imgJOGO = findViewById(R.id.imgJOGO);
        TextView textJOGO2 = findViewById(R.id.textJOGO);
        TextView textJOGO3 = findViewById(R.id.textJOGO2);
        ImageView imgARTIGO = findViewById(R.id.imgARTIGO);

        TextView textLINK = findViewById(R.id.textLINK);
        textLINK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.bbc.com/portuguese/articles/c4n405de6lno");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

    }
}