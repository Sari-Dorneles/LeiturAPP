package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.media.MediaPlayer;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Configuração do VideoView para reproduzir o vídeo a partir de uma URL
        VideoView videoView = findViewById(R.id.videoView);

        // URL do vídeo
        String videoUrl = "https://rr3---sn-bg0s7n7d.googlevideo.com/videoplayback?expire=1728504946&ei=EpAGZ8n9I6yT1d8P8fPl4A4&ip=111.125.106.220&id=o-APM1lvkankhUxqxMWkzqYbzMspL0DnCoiPTXamxWVQw_&itag=136&aitags=134%2C136%2C160%2C243&source=youtube&requiressl=yes&xpc=EgVo2aDSNQ%3D%3D&bui=AXLXGFSgMxDa_Ea0CjZTkUlOmfuJ49KgcTxvpN9ahqkbAU4ZjUufN4MdF-qQjHaWC0SImFKGL3b1eQd_&spc=54MbxUiWjiYlzKH_H1bqiGqRsQebrIbt0X3uGDBi3FssM11OVEa17k8kyg&vprv=1&svpuc=1&mime=video%2Fmp4&ns=rEa9djJZfaibaZ1dxVbRsXsQ&rqh=1&gir=yes&clen=2455907&dur=9.075&lmt=1704791679483544&keepalive=yes&fexp=24350655,51300760&c=WEB&sefc=1&txp=2219224&n=CD01pLCp_KdjCA&sparams=expire%2Cei%2Cip%2Cid%2Caitags%2Csource%2Crequiressl%2Cxpc%2Cbui%2Cspc%2Cvprv%2Csvpuc%2Cmime%2Cns%2Crqh%2Cgir%2Cclen%2Cdur%2Clmt&sig=AJfQdSswRQIhANSzwebgsZsC_9dmkj4meJEQ6ejMz2LJXLeIYTVaevfSAiAzVnEnX1murh0iDPx7zc9Wcb7JOSnFNll06PPSYffNZA%3D%3D&rm=sn-jvhja5g3-hoaek7s,sn-jvhja5g3-hoae77l&rrc=79,79,80&req_id=7716a662b54ea3ee&cmsv=e&redirect_counter=3&cm2rm=sn-hoas7e&cms_redirect=yes&met=1728483363,&mh=FW&mip=191.39.2.76&mm=34&mn=sn-bg0s7n7d&ms=ltu&mt=1728482923&mv=m&mvi=3&pl=20&rms=ltu,au&lsparams=met,mh,mip,mm,mn,ms,mv,mvi,pl,rms&lsig=ACJ0pHgwRQIgYitvwhBRgMnRsydefXeJl8gJdBWnBqx0FjgK37xok6QCIQCr8ktcgdgGhGhpLIpqaSYefUbhJ69BirLiPgDE3N0z0g%3D%3D";  // Substitua com sua URL
        Uri uri = Uri.parse(videoUrl);

        // Configurando o VideoView para a URL
        videoView.setVideoURI(uri);

        // Configurar o listener para quando o vídeo estiver preparado
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                // Habilitar o looping do vídeo
                mp.setLooping(true);
                // Iniciar o vídeo assim que estiver preparado
                videoView.start();
            }
        });

        // Configuração dos botões existentes
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
    }
}
