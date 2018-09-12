package com.book.exercicio06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText jo1;
    private EditText jo2;
    private EditText jo3;
    private EditText jo4;
    private EditText jo5;
    private EditText jo6;
    private TextView mediaResultado;
    private TextView desvioResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jo1             = findViewById(R.id.jogador01);
        jo2             = findViewById(R.id.jogador02);
        jo3             = findViewById(R.id.jogador03);
        jo4             = findViewById(R.id.jogador04);
        jo5             = findViewById(R.id.jogador05);
        jo6             = findViewById(R.id.jogador06);
        mediaResultado  = findViewById(R.id.media);
        desvioResultado = findViewById(R.id.desvio);

    }

    public void calculo(View v){

        String varJ1 = jo1.getText().toString();
        String varJ2 = jo1.getText().toString();
        String varJ3 = jo1.getText().toString();
        String varJ4 = jo1.getText().toString();
        String varJ5 = jo1.getText().toString();
        String varJ6 = jo1.getText().toString();

        float var01 = Float.parseFloat(varJ1);
        float var02 = Float.parseFloat(varJ2);
        float var03 = Float.parseFloat(varJ3);
        float var04 = Float.parseFloat(varJ4);
        float var05 = Float.parseFloat(varJ5);
        float var06 = Float.parseFloat(varJ6);

        double var001 = Double.parseDouble(varJ1);
        double var002 = Double.parseDouble(varJ2);
        double var003 = Double.parseDouble(varJ3);
        double var004 = Double.parseDouble(varJ4);
        double var005 = Double.parseDouble(varJ5);
        double var006 = Double.parseDouble(varJ6);

        double media;

        media = (var001 + var002 + var003 + var004 + var005 + var006)/6;

        mediaResultado.setText("Média da altura dos jogadores é: " + media);

        var001 = var001 - media;
        var002 = var002 - media;
        var003 = var003 - media;
        var004 = var004 - media;
        var005 = var005 - media;
        var006 = var006 - media;


        double desvio01 = Math.sqrt(Math.pow(var001,2) + Math.pow(var002,2) + Math.pow(var003,2) + Math.pow(var004,2) + Math.pow(var005,2) + Math.pow(var006,2)/3);


        desvioResultado.setText("Desvio Padrão é de: " + desvio01);


    }
}
