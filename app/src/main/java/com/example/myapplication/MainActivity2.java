package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.media.MediaPlayer;
import android.net.Uri;
import android.media.AudioManager;
import android.widget.SeekBar;
import android.content.Context;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        VideoView videoView = findViewById(R.id.videoPROGRAMACAO);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_sem_ar);

        videoView.setVideoURI(uri);

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
                videoView.start();
            }
        });

        Button autor = findViewById(R.id.btnAUTOR);
        autor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent autor = new Intent(getApplicationContext(), telaPerfilAutor.class);
                startActivity(autor);
            }
        });
        Button linha = findViewById(R.id.btnLINHA);
        linha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linha = new Intent(getApplicationContext(), telaLinhaTempo.class);
                startActivity(linha);
            }
        });

        Button btnRECO = findViewById(R.id.btnRECO);
        btnRECO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reco = new Intent(getApplicationContext(), telaRecomendacoes.class);
                startActivity(reco);
            }
        });

        Button btnPERSO = findViewById(R.id.btnPERSO);
        btnPERSO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent perso = new Intent(getApplicationContext(), telaPerfilPersonagens.class);
                startActivity(perso);
            }
        });

        Button btnRESENHA = findViewById(R.id.btnRESENHA);
        btnRESENHA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resenha = new Intent(getApplicationContext(), telaResenha.class);
                startActivity(resenha);
            }
        });
        Button btnSAIR = findViewById(R.id.btnSAIR);
        btnSAIR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
