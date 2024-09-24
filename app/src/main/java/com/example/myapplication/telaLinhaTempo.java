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
        Button btnATO7 = findViewById(R.id.btnATO7);
        btnATO7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup7();
            }
        });
        Button btnATO8 = findViewById(R.id.btnATO8);
        btnATO8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup8();
            }
        });
    }

    private void showPopup1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 1:SEMANA DO ÓDIO")
                .setMessage("Grande Irmão: O livro inicia com Winston subindo as escadas do seu prédio, o elevador nunca funcionava, e a eletricidade estava cortada durante o dia, como “parte do esforço de economia durante os preparativos para a Semana do Ódio”.  A Semana do Ódio era um evento através das Teletelas organizado pelo governo totalitário para incitar ódio e ao mesmo tempo, a total lealdade ao Partido.")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void showPopup2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 2: TELETELAS")
                .setMessage("Eram dispositivos, ou melhor, uma espécie de TV que estava ligada a todo o momento, não podia ser desligada em hipótese alguma. De lá, uma voz trazia informações tais como a taxa de produção de ferro-gusa. \n" +
                        "\n" +
                        "  \n" +
                        "A teletela não só transmitia informações, mas também captava qualquer ruído no apartamento. Permitia não só ouvir Winston, mas também o ver, como todos os outros cidadãos. ")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 3: MINISTÉRIOS")
                .setMessage("Ministério da Verdade era responsável pelas notícias, entretenimento, educação e belas-artes. Em contrapartida disseminava notícias não verídicas e reescrevia a história; \n" +
                        "\n" +
                        "Ministério da Paz era responsável pela guerra; \n" +
                        "\n" +
                        "Ministério do Amor mantinha a lei e a ordem; \n" +
                        "\n" +
                        "Ministério da Pujança cuidava dos assuntos econômicos.")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 4:DOIS MINUTOS DE ÓDIO DIÁRIOS")
                .setMessage("Nessa ocasião, os olhos de Winston se encontraram, por um segundo, com os de O’Brien, membro do Núcleo do Partido e detentor de importante cargo. Essa troca de olhares levou Winston a supor que O’Brien pensava o mesmo que ele.")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 5:POLÍCIA DAS IDEIAS")
                .setMessage("Atuam como uma rígida patrulha do pensamento Relações amorosas estavam entre as muitas proibições.")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup6() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 6: WINSTON E UMA CERTA MULHER")
                .setMessage("Winston passa a se encontrar com Julia com certa dificuldade para não serem desmascarados pelo Partido. Eles ee questionaram sobre a ideia de se rebelar contra o partido, Winston comentou sobre a sensação de que o O’Brien os apoiaria.")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 7: ALIANÇA")
                .setMessage("Julia e Winston acreditaram em que O’Brien fazia parte de uma conspiração contra o Partido, e de certa forma estavam certos.")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
    private void showPopup8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Ato 8: SURPRESA")
                .setMessage("Julia e Winston foram surpreendidos no quarto onde costumavam a se encontrar. Foram levados para a prisão a mandato de uma certa pessoa envolvida.")
                .setPositiveButton("Sair", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}