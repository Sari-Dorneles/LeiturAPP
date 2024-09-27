package com.example.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
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
      String text = "Clique aqui para acessar o artigo de opinião";

        SpannableString spannableString = new SpannableString(text);
        ClickableSpan siteSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/portuguese/articles/c4n405de6lno"));
                startActivity(browserIntent);
            }
        };
        ClickableSpan googleSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(browserIntent);
            }
        };
        spannableString.setSpan(siteSpan, 6, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(googleSpan, 39, 43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textLINK.setText(spannableString);
        textLINK.setMovementMethod(LinkMovementMethod.getInstance());


    }
}