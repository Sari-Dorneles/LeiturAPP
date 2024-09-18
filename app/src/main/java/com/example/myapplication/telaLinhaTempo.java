package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertDialog;

public class telaLinhaTempo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_linha_tempo);

        Button btnATO1 = findViewById(R.id.btnATO1);
        btnATO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup1();
            }
        });
        Button btnATO2 = findViewById(R.id.btnATO2);
        btnATO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup2();
            }
        });
        Button btnATO3 = findViewById(R.id.btnATO3);
        btnATO3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup3();
            }
        });
        Button btnATO4 = findViewById(R.id.btnATO4);
        btnATO4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup4();
            }
        });
        Button btnATO5 = findViewById(R.id.btnATO5);
        btnATO5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup5();
            }
        });
        Button btnATO6 = findViewById(R.id.btnATO6);
        btnATO6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup6();
            }
        });
    }

    private void showPopup1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Título")
                .setMessage("Olá, o Felipe é doido!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showPopup2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Título")
                .setMessage("Olá, o Felipe é doido!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Título")
                .setMessage("Olá, o Felipe é doido!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Título")
                .setMessage("Olá, o Felipe é doido!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Título")
                .setMessage("Olá, o Felipe é doido!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup6() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Título")
                .setMessage("Olá, o Felipe é doido!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}