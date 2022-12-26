package com.example.mylocal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.mylocal.advertisement.AdsActivity;
import com.example.mylocal.news.NewsActivity;
import com.example.mylocal.touristGuide.TouristGuideActivity;
import com.example.mylocal.touristGuide.adapter.GuideAdapter;
import com.example.mylocal.transport.TransportActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayoutCompat ads, guide, transport, news;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ads = findViewById(R.id.adsBtn);
        news = findViewById(R.id.newsBtn);
        guide = findViewById(R.id.guideBtn);
        transport = findViewById(R.id.transportBtn);
        imageView = findViewById(R.id.greenWitchImage);

        Glide.with(this)
                .asBitmap()
                .load("https://www.visitgreenwich.org.uk/imageresizer/?image=%2Fdbimgs%2FGRN%20-%20Media%20Gallery%20-%20Ideas%20%26%20Inspo%20-%20WHS.png&action=MediaGallery")
                .into(imageView);


        ads.setOnClickListener(v -> startActivity(new Intent(this, AdsActivity.class)));

        news.setOnClickListener(v -> startActivity(new Intent(this, NewsActivity.class)));

        guide.setOnClickListener(v -> startActivity(new Intent(this, TouristGuideActivity.class)));

        transport.setOnClickListener(v -> startActivity(new Intent(this, TransportActivity.class)));

    }
}