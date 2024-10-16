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
        TextView textOBRASA = findViewById(R.id.textOBRASA);

        ImageView imgGO = findViewById(R.id.imgGO);

        ImageButton imgOLHO1 = findViewById(R.id.imgOLHO1);

        final boolean[] controlebtn = {true};
        imgOLHO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(controlebtn[0] == true){
                    controlebtn[0] = false;
                    textBIOA.setText(getResources().getString(R.string.textBIOAstr));
                    textBIOA.setVisibility(View.VISIBLE); // Tornando visível
                }else if(controlebtn[0] == false){
                    controlebtn[0] = true;
                    textBIOA.setText(null);
                    textBIOA.setVisibility(View.INVISIBLE);
                }
            }
        });

        ImageButton imgOLHO2 = findViewById(R.id.imgOLHO2);
        imgOLHO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (controlebtn[0] == true) {
                    controlebtn[0] = false;
                    textOBRASA.setText(getResources().getString(R.string.textOBRAstr));
                    textOBRASA.setVisibility(View.VISIBLE); // Tornando visível
                } else if (controlebtn[0] == false) {
                    controlebtn[0] = true;
                    textOBRASA.setText(null);
                    textOBRASA.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}