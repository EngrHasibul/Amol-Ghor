package com.example.shohihadis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

       private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView6 = findViewById(R.id.cardview6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, NamajActivity.class);
                startActivity(fb);
            }
        });


        cardView4 = findViewById(R.id.cardview4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, DuyaActivity.class);
                startActivity(fb);
            }
        });

        cardView3 = findViewById(R.id.cardview3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, TajbihActivity.class);
                startActivity(fb);
            }
        });

/*
        cardView5 = findViewById(R.id.cardview5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, SunnatActivity.class);
                startActivity(fb);
            }
        }); */

        cardView2 = findViewById(R.id.cardview2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, RujaActivity.class);
                startActivity(fb);
            }
        });

        cardView1 = findViewById(R.id.cardview1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb = new Intent(MainActivity.this, HadisActivity.class);
                startActivity(fb);
            }
        });


    }

    }