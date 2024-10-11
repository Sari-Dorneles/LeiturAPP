package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class telaResenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_resenha);
        TextView textRESENHA = findViewById(R.id.textRESENHA);
        String resenha =
                "A obra 1984 é um romance distópico que mostra uma sociedade controlada por um governo totalitário e opressor. Ao longo das décadas, o livro se estabeleceu como um dos livros mais influentes do século XX, inclusive, foi publicado depois da morte do autor. Eric Arthur Blair, ou George Orwell, foi um escritor e jornalista-britânico-inglês, nasceu na Índia Britânica e foi morar no Reino Unido para começar sua vida. Suas obras de maior destaque foram “A Revolução dos bichos (1945)” e “1984 publicado em 1949”. Infelizmente morreu precocemente de tuberculose em 1949, aos 46 anos. "
                + "<br><br> A história se passa numa sociedade coletivizada coordenada pela autoridade. A narrativa começa com Winston Smith (protagonista) que trabalha para o Ministério da Verdade e vive sobre o domínio sufocador do Partido, um grupo político que possui todo o poder, e de seu líder “O Grande Irmão”. O corpo social é inspecionado pela vigilância de 24 horas por dia, influenciado por falsas informações e excluído de liberdade individual."
                + "<br><br> O protagonista Winston mora na fictícia Oceania, mais precisamente em Londres, como dito anteriormente, ele trabalha no Ministério da Verdade, responsável por alterar a documentos históricos aos modos do Partido. Até que em um certo momento começa a se questionar sobre a opressão sofrida pela sociedade. "
                + "<br><br> O controle da população é feito principalmente por meio do controle do pensamento, a Polícia do Pensamento é responsável por reprimir e monitorar as ideias contrárias ao Partido. É empregado técnicas de tortura e de lavagem cerebral para converter as pessoas a favor do Partido. "
                + "<br><br> De forma resumida, a vigilância é feita por meio das “teletelas”, ou melhor, televisões, que são dispositivos de propaganda que possuem câmeras. O governo influencia a população com uma linguagem manipulada, com o objetivo de reduzir a capacidade de expressar pensamentos transtornados ou rebeldes. "
                + "<br><br> Durante a história, Winston se envolve com Julia, colega do Partido, e juntos iniciam uma aventura de ideias de liberdade e revolucionárias. Em um certo dia, Winston conheceu O’Brien, e se convenceu de que ele possuía os meios ideais rebeldes, porém, mais tarde Winston e Julia são surpreendidos. "
                + "<br><br> Depois de tanto tempo de tortura e detenção, Winston declara seu amor e aceita a autoridade do Partido. Ao final do livro, Winston acredita no Partido e na distorção da realidade, que retrata a vitória de um regime totalitário e opressor. ";
        textRESENHA.setText(Html.fromHtml(resenha, Html.FROM_HTML_MODE_LEGACY));
    }
}