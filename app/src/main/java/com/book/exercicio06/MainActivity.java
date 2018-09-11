package com.book.exercicio06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText jo1;
    private EditText jo2;
    private EditText jo3;
    private EditText jo4;
    private EditText jo5;
    private EditText jo6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jo1 = findViewById(R.id.jogador01);
        jo2 = findViewById(R.id.jogador02);
        jo3 = findViewById(R.id.jogador03);
        jo4 = findViewById(R.id.jogador04);
        jo5 = findViewById(R.id.jogador05);
        jo6 = findViewById(R.id.jogador06);

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





    }
}
