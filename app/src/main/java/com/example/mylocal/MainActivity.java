package com.example.mylocal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.mylocal.advertisement.AdsActivity;
import com.example.mylocal.news.NewsActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayoutCompat ads,guide,transport,news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ads = findViewById(R.id.adsBtn);
        news = findViewById(R.id.newsBtn);

        ads.setOnClickListener(v -> {
            startActivity(new Intent(this, AdsActivity.class));
        });

        news.setOnClickListener(v -> {
            startActivity(new Intent(this, NewsActivity.class));
        });

    }
}