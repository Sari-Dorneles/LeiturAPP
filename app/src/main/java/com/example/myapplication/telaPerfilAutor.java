package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class telaPerfilAutor extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil_autor);
        TextView textAUTOR1 = findViewById(R.id.textAUTOR1);
        TextView textAUTOR2 = findViewById(R.id.textAUTOR2);
        TextView textBIOA = findViewById(R.id.textBIOA);

        ImageView imgGO = findViewById(R.id.imgGO);

        ImageButton imgbtnOLHO1 = findViewById(R.id.imgOLHO1);
        imgbtnOLHO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textBIOA.setText("lOREM");
            }
        });

    }
}