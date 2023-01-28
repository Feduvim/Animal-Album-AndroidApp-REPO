package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCao = (Button) findViewById(R.id.btnCao);
        Button btnGato = (Button) findViewById(R.id.btnGato);
        Button btnPassaro = (Button) findViewById(R.id.btnPassaro);
        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        btnCao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.dog);
            }
        });
        btnGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.cat);
            }
        });
        btnPassaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.bird);
            }
        });
    }
}